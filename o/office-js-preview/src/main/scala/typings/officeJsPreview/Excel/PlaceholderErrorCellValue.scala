package typings.officeJsPreview.Excel

import typings.officeJsPreview.Excel.ErrorCellValueType.placeholder
import typings.officeJsPreview.Excel.RangeValueType.error
import typings.officeJsPreview.officeJsPreviewStrings.Error
import typings.officeJsPreview.officeJsPreviewStrings.NumbersignBUSYExclamationmark
import typings.officeJsPreview.officeJsPreviewStrings.Placeholder
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Represents the value of a cell containing a #BUSY! error.
  * This type of error is used as a placeholder while the value of a cell is downloaded.
  *
  * @remarks
  * [Api set: ExcelApi 1.16]
  */
trait PlaceholderErrorCellValue
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
  var basicValue: js.UndefOr[NumbersignBUSYExclamationmark | String] = js.undefined
  
  /**
    * Represents the type of `ErrorCellValue`.
    *
    * @remarks
    * [Api set: ExcelApi 1.16]
    */
  var errorType: js.UndefOr[placeholder | Placeholder] = js.undefined
  
  /**
    * `PlaceholderErrorCellValue` is used during processing, while data is downloaded. The `target` property represents the data that is downloading, the data for which the `PlaceholderErrorCellValue` object is a placeholder.
    *
    * @remarks
    * [Api set: ExcelApi 1.16]
    */
  var target: LinkedEntityCellValue | WebImageCellValue
  
  /**
    * Represents the type of this cell value.
    *
    * @remarks
    * [Api set: ExcelApi 1.16]
    */
  var `type`: typings.officeJsPreview.Excel.CellValueType.error | Error
}
object PlaceholderErrorCellValue {
  
  inline def apply(
    target: LinkedEntityCellValue | WebImageCellValue,
    `type`: typings.officeJsPreview.Excel.CellValueType.error | Error
  ): PlaceholderErrorCellValue = {
    val __obj = js.Dynamic.literal(target = target.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[PlaceholderErrorCellValue]
  }
  
  extension [Self <: PlaceholderErrorCellValue](x: Self) {
    
    inline def setBasicType(value: error | Error): Self = StObject.set(x, "basicType", value.asInstanceOf[js.Any])
    
    inline def setBasicTypeUndefined: Self = StObject.set(x, "basicType", js.undefined)
    
    inline def setBasicValue(value: NumbersignBUSYExclamationmark | String): Self = StObject.set(x, "basicValue", value.asInstanceOf[js.Any])
    
    inline def setBasicValueUndefined: Self = StObject.set(x, "basicValue", js.undefined)
    
    inline def setErrorType(value: placeholder | Placeholder): Self = StObject.set(x, "errorType", value.asInstanceOf[js.Any])
    
    inline def setErrorTypeUndefined: Self = StObject.set(x, "errorType", js.undefined)
    
    inline def setTarget(value: LinkedEntityCellValue | WebImageCellValue): Self = StObject.set(x, "target", value.asInstanceOf[js.Any])
    
    inline def setType(value: typings.officeJsPreview.Excel.CellValueType.error | Error): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
  }
}
