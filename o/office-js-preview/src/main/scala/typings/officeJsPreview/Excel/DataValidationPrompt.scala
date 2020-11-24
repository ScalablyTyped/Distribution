package typings.officeJsPreview.Excel

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  *
  * Represents the user prompt properties for the data validation.
  *
  * [Api set: ExcelApi 1.8]
  */
@js.native
trait DataValidationPrompt extends js.Object {
  
  /**
    *
    * Specifies the message of the prompt.
    *
    * [Api set: ExcelApi 1.8]
    */
  var message: String = js.native
  
  /**
    *
    * Specifies if a prompt is shown when a user selects a cell with data validation.
    *
    * [Api set: ExcelApi 1.8]
    */
  var showPrompt: Boolean = js.native
  
  /**
    *
    * Specifies the title for the prompt.
    *
    * [Api set: ExcelApi 1.8]
    */
  var title: String = js.native
}
object DataValidationPrompt {
  
  @scala.inline
  def apply(message: String, showPrompt: Boolean, title: String): DataValidationPrompt = {
    val __obj = js.Dynamic.literal(message = message.asInstanceOf[js.Any], showPrompt = showPrompt.asInstanceOf[js.Any], title = title.asInstanceOf[js.Any])
    __obj.asInstanceOf[DataValidationPrompt]
  }
  
  @scala.inline
  implicit class DataValidationPromptOps[Self <: DataValidationPrompt] (val x: Self) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setMessage(value: String): Self = this.set("message", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setShowPrompt(value: Boolean): Self = this.set("showPrompt", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTitle(value: String): Self = this.set("title", value.asInstanceOf[js.Any])
  }
}
