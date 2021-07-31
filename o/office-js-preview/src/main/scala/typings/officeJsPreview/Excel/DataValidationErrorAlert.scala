package typings.officeJsPreview.Excel

import typings.officeJsPreview.officeJsPreviewStrings.Information
import typings.officeJsPreview.officeJsPreviewStrings.Stop
import typings.officeJsPreview.officeJsPreviewStrings.Warning
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  *
  * Represents the error alert properties for the data validation.
  *
  * [Api set: ExcelApi 1.8]
  */
trait DataValidationErrorAlert extends StObject {
  
  /**
    *
    * Represents error alert message.
    *
    * [Api set: ExcelApi 1.8]
    */
  var message: String
  
  /**
    *
    * Specifies whether to show an error alert dialog when a user enters invalid data. The default is true.
    *
    * [Api set: ExcelApi 1.8]
    */
  var showAlert: Boolean
  
  /**
    *
    * The data validation alert type, please see Excel.DataValidationAlertStyle for details.
    *
    * [Api set: ExcelApi 1.8]
    */
  var style: DataValidationAlertStyle | Stop | Warning | Information
  
  /**
    *
    * Represents error alert dialog title.
    *
    * [Api set: ExcelApi 1.8]
    */
  var title: String
}
object DataValidationErrorAlert {
  
  @scala.inline
  def apply(
    message: String,
    showAlert: Boolean,
    style: DataValidationAlertStyle | Stop | Warning | Information,
    title: String
  ): DataValidationErrorAlert = {
    val __obj = js.Dynamic.literal(message = message.asInstanceOf[js.Any], showAlert = showAlert.asInstanceOf[js.Any], style = style.asInstanceOf[js.Any], title = title.asInstanceOf[js.Any])
    __obj.asInstanceOf[DataValidationErrorAlert]
  }
  
  @scala.inline
  implicit class DataValidationErrorAlertMutableBuilder[Self <: DataValidationErrorAlert] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setMessage(value: String): Self = StObject.set(x, "message", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setShowAlert(value: Boolean): Self = StObject.set(x, "showAlert", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStyle(value: DataValidationAlertStyle | Stop | Warning | Information): Self = StObject.set(x, "style", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTitle(value: String): Self = StObject.set(x, "title", value.asInstanceOf[js.Any])
  }
}
