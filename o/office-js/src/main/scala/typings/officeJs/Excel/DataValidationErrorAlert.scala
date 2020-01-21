package typings.officeJs.Excel

import typings.officeJs.officeJsStrings.Information
import typings.officeJs.officeJsStrings.Stop
import typings.officeJs.officeJsStrings.Warning
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  *
  * Represents the error alert properties for the data validation.
  *
  * [Api set: ExcelApi 1.8]
  */
trait DataValidationErrorAlert extends js.Object {
  /**
    *
    * Represents error alert message.
    *
    * [Api set: ExcelApi 1.8]
    */
  var message: String
  /**
    *
    * Determines whether to show an error alert dialog or not when a user enters invalid data. The default is true.
    *
    * [Api set: ExcelApi 1.8]
    */
  var showAlert: Boolean
  /**
    *
    * Represents data validation alert type, please see Excel.DataValidationAlertStyle for details.
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
}

