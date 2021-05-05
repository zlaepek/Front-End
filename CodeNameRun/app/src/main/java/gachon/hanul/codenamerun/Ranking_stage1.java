package gachon.hanul.codenamerun;

import android.content.Context;
import android.os.Bundle;

import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ListView;


public class Ranking_stage1 extends Fragment {


    Home home;

    //OnAttach는 fragment를 붙일 때 호출, getActivity로  액티비티를 찾아준다.
    @Override
    public void onAttach(Context context){
        super.onAttach(context);
        home =(Home)getActivity();
    }
    @Override
    public void onDetach(){
        super.onDetach();
        home = null;
    }


    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        ViewGroup view=(ViewGroup)inflater.inflate(R.layout.fragment_ranking_stage1, container, false);
        //ListView생성
        ListView listView=(ListView) view.findViewById(R.id.listView);



        /*여기 이제 랭킹 스트링으로 받아오고 리스트뷰에 보이게 채워야함*/

        // 임시 스트링
        String[] nameArray = {"1이름 1","1이름 2","1이름 3","1이름 4","1이름 5","1이름 6" };
        String[] recordArray = {"100", "80", "70", "60", "50", "40"};


        CustomListAdapter whatever = new CustomListAdapter(getActivity(), nameArray, recordArray);
        listView.setAdapter(whatever);

        return view;
    }
}