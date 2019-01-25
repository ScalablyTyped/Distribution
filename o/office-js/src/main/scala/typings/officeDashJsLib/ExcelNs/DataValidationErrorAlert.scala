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

