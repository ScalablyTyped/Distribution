package typings
package officeDashJsLib.ExcelNs

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
  var message: java.lang.String
  /**
    *
    * Determines whether to show an error alert dialog or not when a user enters invalid data. The default is true.
    *
    * [Api set: ExcelApi 1.8]
    */
  var showAlert: scala.Boolean
  /**
    *
    * Represents data validation alert type, please see Excel.DataValidationAlertStyle for details.
    *
    * [Api set: ExcelApi 1.8]
    */
  var style: DataValidationAlertStyle | officeDashJsLib.officeDashJsLibStrings.Stop | officeDashJsLib.officeDashJsLibStrings.Warning | officeDashJsLib.officeDashJsLibStrings.Information
  /**
    *
    * Represents error alert dialog title.
    *
    * [Api set: ExcelApi 1.8]
    */
  var title: java.lang.String
}

object DataValidationErrorAlert {
  @scala.inline
  def apply(
    message: java.lang.String,
    showAlert: scala.Boolean,
    style: DataValidationAlertStyle | officeDashJsLib.officeDashJsLibStrings.Stop | officeDashJsLib.officeDashJsLibStrings.Warning | officeDashJsLib.officeDashJsLibStrings.Information,
    title: java.lang.String
  ): DataValidationErrorAlert = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("message")(message)
    __obj.updateDynamic("showAlert")(showAlert)
    __obj.updateDynamic("style")(style.asInstanceOf[js.Any])
    __obj.updateDynamic("title")(title)
    __obj.asInstanceOf[DataValidationErrorAlert]
  }
}

