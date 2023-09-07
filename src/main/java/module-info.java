module com.example.calu3 {
    requires javafx.controls;
    requires javafx.fxml;


    opens com.example.calu3 to javafx.fxml;
    exports com.example.calu3;
}