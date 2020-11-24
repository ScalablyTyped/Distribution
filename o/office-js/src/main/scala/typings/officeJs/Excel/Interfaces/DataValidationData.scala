package typings.officeJs.Excel.Interfaces

import typings.officeJs.Excel.DataValidationErrorAlert
import typings.officeJs.Excel.DataValidationPrompt
import typings.officeJs.Excel.DataValidationRule
import typings.officeJs.Excel.DataValidationType
import typings.officeJs.officeJsStrings.Custom
import typings.officeJs.officeJsStrings.Date
import typings.officeJs.officeJsStrings.Decimal
import typings.officeJs.officeJsStrings.Inconsistent
import typings.officeJs.officeJsStrings.List
import typings.officeJs.officeJsStrings.MixedCriteria
import typings.officeJs.officeJsStrings.None
import typings.officeJs.officeJsStrings.TextLength
import typings.officeJs.officeJsStrings.Time
import typings.officeJs.officeJsStrings.WholeNumber
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** An interface describing the data returned by calling `dataValidation.toJSON()`. */
@js.native
trait DataValidationData extends js.Object {
  
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
  
  /**
    *
    * Type of the data validation, see Excel.DataValidationType for details.
    *
    * [Api set: ExcelApi 1.8]
    */
  var `type`: js.UndefOr[
    DataValidationType | None | WholeNumber | Decimal | List | Date | Time | TextLength | Custom | Inconsistent | MixedCriteria
  ] = js.native
  
  /**
    *
    * Represents if all cell values are valid according to the data validation rules.
    Returns true if all cell values are valid, or false if all cell values are invalid.
    Returns null if there are both valid and invalid cell values within the range.
    *
    * [Api set: ExcelApi 1.8]
    */
  var valid: js.UndefOr[Boolean] = js.native
}
object DataValidationData {
  
  @scala.inline
  def apply(): DataValidationData = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DataValidationData]
  }
  
  @scala.inline
  implicit class DataValidationDataOps[Self <: DataValidationData] (val x: Self) extends AnyVal {
    
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
    
    @scala.inline
    def setType(
      value: DataValidationType | None | WholeNumber | Decimal | List | Date | Time | TextLength | Custom | Inconsistent | MixedCriteria
    ): Self = this.set("type", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteType: Self = this.set("type", js.undefined)
    
    @scala.inline
    def setValid(value: Boolean): Self = this.set("valid", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteValid: Self = this.set("valid", js.undefined)
  }
}
