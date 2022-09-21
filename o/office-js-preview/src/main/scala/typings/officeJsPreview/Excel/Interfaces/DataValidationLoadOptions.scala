package typings.officeJsPreview.Excel.Interfaces

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Represents the data validation applied to the current range.
  To learn more about the data validation object model, read {@link https://docs.microsoft.com/office/dev/add-ins/excel/excel-add-ins-data-validation | Add data validation to Excel ranges}.
  *
  * @remarks
  * [Api set: ExcelApi 1.8]
  */
trait DataValidationLoadOptions extends StObject {
  
  /**
    Specifying `$all` for the LoadOptions loads all the scalar properties (e.g.: `Range.address`) but not the navigational properties (e.g.: `Range.format.fill.color`).
    */
  @JSName("$all")
  var $all: js.UndefOr[Boolean] = js.undefined
  
  /**
    * Error alert when user enters invalid data.
    *
    * @remarks
    * [Api set: ExcelApi 1.8]
    */
  var errorAlert: js.UndefOr[Boolean] = js.undefined
  
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
  var prompt: js.UndefOr[Boolean] = js.undefined
  
  /**
    * Data validation rule that contains different type of data validation criteria.
    *
    * @remarks
    * [Api set: ExcelApi 1.8]
    */
  var rule: js.UndefOr[Boolean] = js.undefined
  
  /**
    * Type of the data validation, see `Excel.DataValidationType` for details.
    *
    * @remarks
    * [Api set: ExcelApi 1.8]
    */
  var `type`: js.UndefOr[Boolean] = js.undefined
  
  /**
    * Represents if all cell values are valid according to the data validation rules.
    Returns `true` if all cell values are valid, or `false` if all cell values are invalid.
    Returns `null` if there are both valid and invalid cell values within the range.
    *
    * @remarks
    * [Api set: ExcelApi 1.8]
    */
  var valid: js.UndefOr[Boolean] = js.undefined
}
object DataValidationLoadOptions {
  
  inline def apply(): DataValidationLoadOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DataValidationLoadOptions]
  }
  
  extension [Self <: DataValidationLoadOptions](x: Self) {
    
    inline def set$all(value: Boolean): Self = StObject.set(x, "$all", value.asInstanceOf[js.Any])
    
    inline def set$allUndefined: Self = StObject.set(x, "$all", js.undefined)
    
    inline def setErrorAlert(value: Boolean): Self = StObject.set(x, "errorAlert", value.asInstanceOf[js.Any])
    
    inline def setErrorAlertUndefined: Self = StObject.set(x, "errorAlert", js.undefined)
    
    inline def setIgnoreBlanks(value: Boolean): Self = StObject.set(x, "ignoreBlanks", value.asInstanceOf[js.Any])
    
    inline def setIgnoreBlanksUndefined: Self = StObject.set(x, "ignoreBlanks", js.undefined)
    
    inline def setPrompt(value: Boolean): Self = StObject.set(x, "prompt", value.asInstanceOf[js.Any])
    
    inline def setPromptUndefined: Self = StObject.set(x, "prompt", js.undefined)
    
    inline def setRule(value: Boolean): Self = StObject.set(x, "rule", value.asInstanceOf[js.Any])
    
    inline def setRuleUndefined: Self = StObject.set(x, "rule", js.undefined)
    
    inline def setType(value: Boolean): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    
    inline def setTypeUndefined: Self = StObject.set(x, "type", js.undefined)
    
    inline def setValid(value: Boolean): Self = StObject.set(x, "valid", value.asInstanceOf[js.Any])
    
    inline def setValidUndefined: Self = StObject.set(x, "valid", js.undefined)
  }
}
