package typings.officeDashJsDashPreview.Excel

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
  var message: String
  /**
    *
    * Determines whether or not to show the prompt when user selects a cell with data validation.
    *
    * [Api set: ExcelApi 1.8]
    */
  var showPrompt: Boolean
  /**
    *
    * Represents the title for the prompt.
    *
    * [Api set: ExcelApi 1.8]
    */
  var title: String
}

object DataValidationPrompt {
  @scala.inline
  def apply(message: String, showPrompt: Boolean, title: String): DataValidationPrompt = {
    val __obj = js.Dynamic.literal(message = message, showPrompt = showPrompt, title = title)
  
    __obj.asInstanceOf[DataValidationPrompt]
  }
}

