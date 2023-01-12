package typings.officeJs.Excel

import typings.officeJs.Excel.ErrorCellValueType.value
import typings.officeJs.Excel.RangeValueType.error
import typings.officeJs.officeJsStrings.CoerceStringToBoolInvalid
import typings.officeJs.officeJsStrings.CoerceStringToInvalidType
import typings.officeJs.officeJsStrings.CoerceStringToNumberInvalid
import typings.officeJs.officeJsStrings.Error
import typings.officeJs.officeJsStrings.HlookupResultNotFound
import typings.officeJs.officeJsStrings.HlookupRowIndexLessThanOne
import typings.officeJs.officeJsStrings.InvalidImageUrl
import typings.officeJs.officeJsStrings.LambdaWrongParamCount
import typings.officeJs.officeJsStrings.NumbersignVALUEExclamationmark
import typings.officeJs.officeJsStrings.StockHistoryEndBeforeStart
import typings.officeJs.officeJsStrings.StockHistoryInvalidDate
import typings.officeJs.officeJsStrings.StockHistoryInvalidEnum
import typings.officeJs.officeJsStrings.StockHistoryNonTradingDays
import typings.officeJs.officeJsStrings.StockHistoryNotAStock
import typings.officeJs.officeJsStrings.StockHistoryNotFound
import typings.officeJs.officeJsStrings.StockHistoryOnlyDateRequested
import typings.officeJs.officeJsStrings.StockHistoryStartInFuture
import typings.officeJs.officeJsStrings.SubArrayStartColumnMissingEndColumnNot
import typings.officeJs.officeJsStrings.SubArrayStartRowMissingEndRowNot
import typings.officeJs.officeJsStrings.Unknown_
import typings.officeJs.officeJsStrings.Value
import typings.officeJs.officeJsStrings.VlookupColumnIndexLessThanOne
import typings.officeJs.officeJsStrings.VlookupResultNotFound
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
  var `type`: typings.officeJs.Excel.CellValueType.error | Error
}
object ValueErrorCellValue {
  
  inline def apply(`type`: typings.officeJs.Excel.CellValueType.error | Error): ValueErrorCellValue = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[ValueErrorCellValue]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: ValueErrorCellValue] (val x: Self) extends AnyVal {
    
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
    
    inline def setType(value: typings.officeJs.Excel.CellValueType.error | Error): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
  }
}
