package typings.officeJs.Excel.Interfaces

import typings.officeJs.Excel.DataValidationErrorAlert
import typings.officeJs.Excel.DataValidationPrompt
import typings.officeJs.Excel.DataValidationRule
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** An interface for updating data on the DataValidation object, for use in `dataValidation.set({ ... })`. */
@js.native
trait DataValidationUpdateData extends StObject {
  
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
  implicit class DataValidationUpdateDataMutableBuilder[Self <: DataValidationUpdateData] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setErrorAlert(value: DataValidationErrorAlert): Self = StObject.set(x, "errorAlert", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setErrorAlertUndefined: Self = StObject.set(x, "errorAlert", js.undefined)
    
    @scala.inline
    def setIgnoreBlanks(value: Boolean): Self = StObject.set(x, "ignoreBlanks", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIgnoreBlanksUndefined: Self = StObject.set(x, "ignoreBlanks", js.undefined)
    
    @scala.inline
    def setPrompt(value: DataValidationPrompt): Self = StObject.set(x, "prompt", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPromptUndefined: Self = StObject.set(x, "prompt", js.undefined)
    
    @scala.inline
    def setRule(value: DataValidationRule): Self = StObject.set(x, "rule", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRuleUndefined: Self = StObject.set(x, "rule", js.undefined)
  }
}
