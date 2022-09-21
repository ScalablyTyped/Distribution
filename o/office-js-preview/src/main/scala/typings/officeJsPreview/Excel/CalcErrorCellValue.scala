package typings.officeJsPreview.Excel

import typings.officeJsPreview.Excel.ErrorCellValueType.calc
import typings.officeJsPreview.Excel.RangeValueType.error
import typings.officeJsPreview.officeJsPreviewStrings.ArrayOfArrays
import typings.officeJsPreview.officeJsPreviewStrings.ArrayOfRanges
import typings.officeJsPreview.officeJsPreviewStrings.Calc
import typings.officeJsPreview.officeJsPreviewStrings.DataTableReferencedPendingFormula
import typings.officeJsPreview.officeJsPreviewStrings.EmptyArray
import typings.officeJsPreview.officeJsPreviewStrings.Error
import typings.officeJsPreview.officeJsPreviewStrings.LambdaInCell
import typings.officeJsPreview.officeJsPreviewStrings.NumbersignCALCExclamationmark
import typings.officeJsPreview.officeJsPreviewStrings.TextOverflow
import typings.officeJsPreview.officeJsPreviewStrings.TooDeeplyNested
import typings.officeJsPreview.officeJsPreviewStrings.TooManyCells
import typings.officeJsPreview.officeJsPreviewStrings.Unknown_
import typings.officeJsPreview.officeJsPreviewStrings.UnsupportedLifting
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Represents the value of a cell containing a #CALC! error.
  *
  * @remarks
  * [Api set: ExcelApi BETA (PREVIEW ONLY)]
  * @beta
  */
trait CalcErrorCellValue
  extends StObject
     with ErrorCellValue {
  
  /**
    * Represents the value that would be returned by `Range.valueTypes` for a cell with this value.
    *
    * @remarks
    * [Api set: ExcelApi BETA (PREVIEW ONLY)]
    * @beta
    */
  var basicType: js.UndefOr[error | Error] = js.undefined
  
  /**
    * Represents the value that would be returned by `Range.values` for a cell with this value.
    * When accessed through a `valuesAsJson` property, this string value aligns with the en-US locale.
    * When accessed through a `valuesAsJsonLocal` property, this string value aligns with the user's display locale.
    *
    * @remarks
    * [Api set: ExcelApi BETA (PREVIEW ONLY)]
    * @beta
    */
  var basicValue: js.UndefOr[NumbersignCALCExclamationmark | String] = js.undefined
  
  /**
    * Represents the type of `CalcErrorCellValue`.
    *
    * @remarks
    * [Api set: ExcelApi BETA (PREVIEW ONLY)]
    * @beta
    */
  var errorSubType: js.UndefOr[
    CalcErrorCellValueSubType | Unknown_ | ArrayOfArrays | ArrayOfRanges | EmptyArray | UnsupportedLifting | DataTableReferencedPendingFormula | TooManyCells | LambdaInCell | TooDeeplyNested | TextOverflow
  ] = js.undefined
  
  /**
    * Represents the type of `ErrorCellValue`.
    *
    * @remarks
    * [Api set: ExcelApi BETA (PREVIEW ONLY)]
    * @beta
    */
  var errorType: js.UndefOr[calc | Calc] = js.undefined
  
  /**
    * Represents the name of the function causing the error.
    *
    * @remarks
    * [Api set: ExcelApi BETA (PREVIEW ONLY)]
    * @beta
    */
  var functionName: js.UndefOr[String] = js.undefined
  
  /**
    * Represents the type of this cell value.
    *
    * @remarks
    * [Api set: ExcelApi BETA (PREVIEW ONLY)]
    * @beta
    */
  var `type`: typings.officeJsPreview.Excel.CellValueType.error | Error
}
object CalcErrorCellValue {
  
  inline def apply(`type`: typings.officeJsPreview.Excel.CellValueType.error | Error): CalcErrorCellValue = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[CalcErrorCellValue]
  }
  
  extension [Self <: CalcErrorCellValue](x: Self) {
    
    inline def setBasicType(value: error | Error): Self = StObject.set(x, "basicType", value.asInstanceOf[js.Any])
    
    inline def setBasicTypeUndefined: Self = StObject.set(x, "basicType", js.undefined)
    
    inline def setBasicValue(value: NumbersignCALCExclamationmark | String): Self = StObject.set(x, "basicValue", value.asInstanceOf[js.Any])
    
    inline def setBasicValueUndefined: Self = StObject.set(x, "basicValue", js.undefined)
    
    inline def setErrorSubType(
      value: CalcErrorCellValueSubType | Unknown_ | ArrayOfArrays | ArrayOfRanges | EmptyArray | UnsupportedLifting | DataTableReferencedPendingFormula | TooManyCells | LambdaInCell | TooDeeplyNested | TextOverflow
    ): Self = StObject.set(x, "errorSubType", value.asInstanceOf[js.Any])
    
    inline def setErrorSubTypeUndefined: Self = StObject.set(x, "errorSubType", js.undefined)
    
    inline def setErrorType(value: calc | Calc): Self = StObject.set(x, "errorType", value.asInstanceOf[js.Any])
    
    inline def setErrorTypeUndefined: Self = StObject.set(x, "errorType", js.undefined)
    
    inline def setFunctionName(value: String): Self = StObject.set(x, "functionName", value.asInstanceOf[js.Any])
    
    inline def setFunctionNameUndefined: Self = StObject.set(x, "functionName", js.undefined)
    
    inline def setType(value: typings.officeJsPreview.Excel.CellValueType.error | Error): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
  }
}
