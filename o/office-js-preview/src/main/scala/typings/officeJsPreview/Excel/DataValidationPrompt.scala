package typings.officeJsPreview.Excel

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
    * Specifies the message of the prompt.
    *
    * [Api set: ExcelApi 1.8]
    */
  var message: String
  /**
    *
    * Specifies if a prompt is shown when a user selects a cell with data validation.
    *
    * [Api set: ExcelApi 1.8]
    */
  var showPrompt: Boolean
  /**
    *
    * Specifies the title for the prompt.
    *
    * [Api set: ExcelApi 1.8]
    */
  var title: String
}

object DataValidationPrompt {
  @scala.inline
  def apply(message: String, showPrompt: Boolean, title: String): DataValidationPrompt = {
    val __obj = js.Dynamic.literal(message = message.asInstanceOf[js.Any], showPrompt = showPrompt.asInstanceOf[js.Any], title = title.asInstanceOf[js.Any])
    __obj.asInstanceOf[DataValidationPrompt]
  }
}

