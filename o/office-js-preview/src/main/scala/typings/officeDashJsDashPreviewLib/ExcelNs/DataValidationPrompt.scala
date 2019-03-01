package typings
package officeDashJsDashPreviewLib.ExcelNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  *
  * Represents the user prompt properties for the data validation.
  *
  * [Api set: ExcelApi 1.8]
  */
trait DataValidationPrompt extends js.Object {
  /**
    *
    * Represents the message of the prompt.
    *
    * [Api set: ExcelApi 1.8]
    */
  var message: java.lang.String
  /**
    *
    * Determines whether or not to show the prompt when user selects a cell with data validation.
    *
    * [Api set: ExcelApi 1.8]
    */
  var showPrompt: scala.Boolean
  /**
    *
    * Represents the title for the prompt.
    *
    * [Api set: ExcelApi 1.8]
    */
  var title: java.lang.String
}

object DataValidationPrompt {
  @scala.inline
  def apply(message: java.lang.String, showPrompt: scala.Boolean, title: java.lang.String): DataValidationPrompt = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("message")(message)
    __obj.updateDynamic("showPrompt")(showPrompt)
    __obj.updateDynamic("title")(title)
    __obj.asInstanceOf[DataValidationPrompt]
  }
}

