package typings.officeJsPreview.Excel.Interfaces

import typings.officeJsPreview.Excel.DataValidationErrorAlert
import typings.officeJsPreview.Excel.DataValidationPrompt
import typings.officeJsPreview.Excel.DataValidationRule
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** An interface for updating data on the DataValidation object, for use in `dataValidation.set({ ... })`. */
@js.native
trait DataValidationUpdateData extends js.Object {
  
  /**
    *
    * Error alert when user enters invalid data.
    *
    * [Api set: ExcelApi 1.8]
    */
  var errorAlert: js.UndefOr[DataValidationErrorAlert] = js.native
  
  /**
    *
    * Specifies if data validation will be performed on blank cells, it defaults to true.
    *
    * [Api set: ExcelApi 1.8]
    */
  var ignoreBlanks: js.UndefOr[Boolean] = js.native
  
  /**
    *
    * Prompt when users select a cell.
    *
    * [Api set: ExcelApi 1.8]
    */
  var prompt: js.UndefOr[DataValidationPrompt] = js.native
  
  /**
    *
    * Data validation rule that contains different type of data validation criteria.
    *
    * [Api set: ExcelApi 1.8]
    */
  var rule: js.UndefOr[DataValidationRule] = js.native
}
object DataValidationUpdateData {
  
  @scala.inline
  def apply(): DataValidationUpdateData = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DataValidationUpdateData]
  }
  
  @scala.inline
  implicit class DataValidationUpdateDataOps[Self <: DataValidationUpdateData] (val x: Self) extends AnyVal {
    
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
    def setErrorAlert(value: DataValidationErrorAlert): Self = this.set("errorAlert", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteErrorAlert: Self = this.set("errorAlert", js.undefined)
    
    @scala.inline
    def setIgnoreBlanks(value: Boolean): Self = this.set("ignoreBlanks", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteIgnoreBlanks: Self = this.set("ignoreBlanks", js.undefined)
    
    @scala.inline
    def setPrompt(value: DataValidationPrompt): Self = this.set("prompt", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deletePrompt: Self = this.set("prompt", js.undefined)
    
    @scala.inline
    def setRule(value: DataValidationRule): Self = this.set("rule", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteRule: Self = this.set("rule", js.undefined)
  }
}
