package typings.officeJsPreview.Excel

import typings.officeJsPreview.Excel.ErrorCellValueType.value
import typings.officeJsPreview.Excel.RangeValueType.error
import typings.officeJsPreview.officeJsPreviewStrings.CoerceStringToBoolInvalid
import typings.officeJsPreview.officeJsPreviewStrings.CoerceStringToInvalidType
import typings.officeJsPreview.officeJsPreviewStrings.CoerceStringToNumberInvalid
import typings.officeJsPreview.officeJsPreviewStrings.Error
import typings.officeJsPreview.officeJsPreviewStrings.HlookupResultNotFound
import typings.officeJsPreview.officeJsPreviewStrings.HlookupRowIndexLessThanOne
import typings.officeJsPreview.officeJsPreviewStrings.InvalidImageUrl
import typings.officeJsPreview.officeJsPreviewStrings.LambdaWrongParamCount
import typings.officeJsPreview.officeJsPreviewStrings.NumbersignVALUEExclamationmark
import typings.officeJsPreview.officeJsPreviewStrings.StockHistoryEndBeforeStart
import typings.officeJsPreview.officeJsPreviewStrings.StockHistoryInvalidDate
import typings.officeJsPreview.officeJsPreviewStrings.StockHistoryInvalidEnum
import typings.officeJsPreview.officeJsPreviewStrings.StockHistoryNonTradingDays
import typings.officeJsPreview.officeJsPreviewStrings.StockHistoryNotAStock
import typings.officeJsPreview.officeJsPreviewStrings.StockHistoryNotFound
import typings.officeJsPreview.officeJsPreviewStrings.StockHistoryOnlyDateRequested
import typings.officeJsPreview.officeJsPreviewStrings.StockHistoryStartInFuture
import typings.officeJsPreview.officeJsPreviewStrings.SubArrayStartColumnMissingEndColumnNot
import typings.officeJsPreview.officeJsPreviewStrings.SubArrayStartRowMissingEndRowNot
import typings.officeJsPreview.officeJsPreviewStrings.Unknown_
import typings.officeJsPreview.officeJsPreviewStrings.Value
import typings.officeJsPreview.officeJsPreviewStrings.VlookupColumnIndexLessThanOne
import typings.officeJsPreview.officeJsPreviewStrings.VlookupResultNotFound
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Represents the value of a cell containing a #VALUE! error.
  *
  * @remarks
  * [Api set: ExcelApi 1.16]
  */
trait ValueErrorCellValue
  extends StObject
     with ErrorCellValue {
  
  /**
    * Represents the value that would be returned by `Range.valueTypes` for a cell with this value.
    *
    * @remarks
    * [Api set: ExcelApi 1.16]
    */
  var basicType: js.UndefOr[error | Error] = js.undefined
  
  /**
    * Represents the value that would be returned by `Range.values` for a cell with this value.
    * When accessed through a `valuesAsJson` property, this string value aligns with the en-US locale.
    * When accessed through a `valuesAsJsonLocal` property, this string value aligns with the user's display locale.
    *
    * @remarks
    * [Api set: ExcelApi 1.16]
    */
  var basicValue: js.UndefOr[NumbersignVALUEExclamationmark | String] = js.undefined
  
  /**
    * Represents the type of `ValueErrorCellValue`.
    *
    * @remarks
    * [Api set: ExcelApi 1.16]
    */
  var errorSubType: js.UndefOr[
    ValueErrorCellValueSubType | Unknown_ | VlookupColumnIndexLessThanOne | VlookupResultNotFound | HlookupRowIndexLessThanOne | HlookupResultNotFound | CoerceStringToNumberInvalid | CoerceStringToBoolInvalid | CoerceStringToInvalidType | SubArrayStartRowMissingEndRowNot | SubArrayStartColumnMissingEndColumnNot | InvalidImageUrl | StockHistoryNonTradingDays | StockHistoryNotAStock | StockHistoryInvalidDate | StockHistoryEndBeforeStart | StockHistoryStartInFuture | StockHistoryInvalidEnum | StockHistoryOnlyDateRequested | StockHistoryNotFound | LambdaWrongParamCount
  ] = js.undefined
  
  /**
    * Represents the type of `ErrorCellValue`.
    *
    * @remarks
    * [Api set: ExcelApi 1.16]
    */
  var errorType: js.UndefOr[value | Value] = js.undefined
  
  /**
    * Represents the type of this cell value.
    *
    * @remarks
    * [Api set: ExcelApi 1.16]
    */
  var `type`: typings.officeJsPreview.Excel.CellValueType.error | Error
}
object ValueErrorCellValue {
  
  inline def apply(`type`: typings.officeJsPreview.Excel.CellValueType.error | Error): ValueErrorCellValue = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[ValueErrorCellValue]
  }
  
  extension [Self <: ValueErrorCellValue](x: Self) {
    
    inline def setBasicType(value: error | Error): Self = StObject.set(x, "basicType", value.asInstanceOf[js.Any])
    
    inline def setBasicTypeUndefined: Self = StObject.set(x, "basicType", js.undefined)
    
    inline def setBasicValue(value: NumbersignVALUEExclamationmark | String): Self = StObject.set(x, "basicValue", value.asInstanceOf[js.Any])
    
    inline def setBasicValueUndefined: Self = StObject.set(x, "basicValue", js.undefined)
    
    inline def setErrorSubType(
      value: ValueErrorCellValueSubType | Unknown_ | VlookupColumnIndexLessThanOne | VlookupResultNotFound | HlookupRowIndexLessThanOne | HlookupResultNotFound | CoerceStringToNumberInvalid | CoerceStringToBoolInvalid | CoerceStringToInvalidType | SubArrayStartRowMissingEndRowNot | SubArrayStartColumnMissingEndColumnNot | InvalidImageUrl | StockHistoryNonTradingDays | StockHistoryNotAStock | StockHistoryInvalidDate | StockHistoryEndBeforeStart | StockHistoryStartInFuture | StockHistoryInvalidEnum | StockHistoryOnlyDateRequested | StockHistoryNotFound | LambdaWrongParamCount
    ): Self = StObject.set(x, "errorSubType", value.asInstanceOf[js.Any])
    
    inline def setErrorSubTypeUndefined: Self = StObject.set(x, "errorSubType", js.undefined)
    
    inline def setErrorType(value: value | Value): Self = StObject.set(x, "errorType", value.asInstanceOf[js.Any])
    
    inline def setErrorTypeUndefined: Self = StObject.set(x, "errorType", js.undefined)
    
    inline def setType(value: typings.officeJsPreview.Excel.CellValueType.error | Error): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
  }
}
