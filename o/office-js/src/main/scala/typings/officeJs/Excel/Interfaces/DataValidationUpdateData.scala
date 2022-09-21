package typings.officeJs.Excel.Interfaces

import typings.officeJs.Excel.DataValidationErrorAlert
import typings.officeJs.Excel.DataValidationPrompt
import typings.officeJs.Excel.DataValidationRule
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** An interface for updating data on the DataValidation object, for use in `dataValidation.set({ ... })`. */
trait DataValidationUpdateData extends StObject {
  
  /**
    * Error alert when user enters invalid data.
    *
    * @remarks
    * [Api set: ExcelApi 1.8]
    */
  var errorAlert: js.UndefOr[DataValidationErrorAlert] = js.undefined
  
  /**
    * Specifies if data validation will be performed on blank cells. Default is `true`.
    *
    * @remarks
    * [Api set: ExcelApi 1.8]
    */
  var ignoreBlanks: js.UndefOr[Boolean] = js.undefined
  
  /**
    * Prompt when users select a cell.
    *
    * @remarks
    * [Api set: ExcelApi 1.8]
    */
  var prompt: js.UndefOr[DataValidationPrompt] = js.undefined
  
  /**
    * Data validation rule that contains different type of data validation criteria.
    *
    * @remarks
    * [Api set: ExcelApi 1.8]
    */
  var rule: js.UndefOr[DataValidationRule] = js.undefined
}
object DataValidationUpdateData {
  
  inline def apply(): DataValidationUpdateData = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DataValidationUpdateData]
  }
  
  extension [Self <: DataValidationUpdateData](x: Self) {
    
    inline def setErrorAlert(value: DataValidationErrorAlert): Self = StObject.set(x, "errorAlert", value.asInstanceOf[js.Any])
    
    inline def setErrorAlertUndefined: Self = StObject.set(x, "errorAlert", js.undefined)
    
    inline def setIgnoreBlanks(value: Boolean): Self = StObject.set(x, "ignoreBlanks", value.asInstanceOf[js.Any])
    
    inline def setIgnoreBlanksUndefined: Self = StObject.set(x, "ignoreBlanks", js.undefined)
    
    inline def setPrompt(value: DataValidationPrompt): Self = StObject.set(x, "prompt", value.asInstanceOf[js.Any])
    
    inline def setPromptUndefined: Self = StObject.set(x, "prompt", js.undefined)
    
    inline def setRule(value: DataValidationRule): Self = StObject.set(x, "rule", value.asInstanceOf[js.Any])
    
    inline def setRuleUndefined: Self = StObject.set(x, "rule", js.undefined)
  }
}
