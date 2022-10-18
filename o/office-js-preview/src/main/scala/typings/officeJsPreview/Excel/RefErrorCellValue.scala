package typings.officeJsPreview.Excel

import typings.officeJsPreview.Excel.ErrorCellValueType.ref
import typings.officeJsPreview.Excel.RangeValueType.error
import typings.officeJsPreview.officeJsPreviewStrings.Error
import typings.officeJsPreview.officeJsPreviewStrings.ExternalLinksCalculatedRef
import typings.officeJsPreview.officeJsPreviewStrings.ExternalLinksStructuredRef
import typings.officeJsPreview.officeJsPreviewStrings.NumbersignREFExclamationmark
import typings.officeJsPreview.officeJsPreviewStrings.Ref
import typings.officeJsPreview.officeJsPreviewStrings.Unknown_
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Represents the value of a cell containing a #REF! error.
  *
  * @remarks
  * [Api set: ExcelApi 1.16]
  */
trait RefErrorCellValue
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
  var basicValue: js.UndefOr[NumbersignREFExclamationmark | String] = js.undefined
  
  /**
    * Represents the type of `RefErrorCellValue`.
    *
    * @remarks
    * [Api set: ExcelApi 1.16]
    */
  var errorSubType: js.UndefOr[
    RefErrorCellValueSubType | Unknown_ | ExternalLinksStructuredRef | ExternalLinksCalculatedRef
  ] = js.undefined
  
  /**
    * Represents the type of `ErrorCellValue`.
    *
    * @remarks
    * [Api set: ExcelApi 1.16]
    */
  var errorType: js.UndefOr[ref | Ref] = js.undefined
  
  /**
    * Represents the type of this cell value.
    *
    * @remarks
    * [Api set: ExcelApi 1.16]
    */
  var `type`: typings.officeJsPreview.Excel.CellValueType.error | Error
}
object RefErrorCellValue {
  
  inline def apply(`type`: typings.officeJsPreview.Excel.CellValueType.error | Error): RefErrorCellValue = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[RefErrorCellValue]
  }
  
  extension [Self <: RefErrorCellValue](x: Self) {
    
    inline def setBasicType(value: error | Error): Self = StObject.set(x, "basicType", value.asInstanceOf[js.Any])
    
    inline def setBasicTypeUndefined: Self = StObject.set(x, "basicType", js.undefined)
    
    inline def setBasicValue(value: NumbersignREFExclamationmark | String): Self = StObject.set(x, "basicValue", value.asInstanceOf[js.Any])
    
    inline def setBasicValueUndefined: Self = StObject.set(x, "basicValue", js.undefined)
    
    inline def setErrorSubType(
      value: RefErrorCellValueSubType | Unknown_ | ExternalLinksStructuredRef | ExternalLinksCalculatedRef
    ): Self = StObject.set(x, "errorSubType", value.asInstanceOf[js.Any])
    
    inline def setErrorSubTypeUndefined: Self = StObject.set(x, "errorSubType", js.undefined)
    
    inline def setErrorType(value: ref | Ref): Self = StObject.set(x, "errorType", value.asInstanceOf[js.Any])
    
    inline def setErrorTypeUndefined: Self = StObject.set(x, "errorType", js.undefined)
    
    inline def setType(value: typings.officeJsPreview.Excel.CellValueType.error | Error): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
  }
}
