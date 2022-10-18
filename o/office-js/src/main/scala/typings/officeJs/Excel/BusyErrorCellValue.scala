package typings.officeJs.Excel

import typings.officeJs.Excel.ErrorCellValueType.busy
import typings.officeJs.Excel.RangeValueType.error
import typings.officeJs.officeJsStrings.Busy
import typings.officeJs.officeJsStrings.Error
import typings.officeJs.officeJsStrings.ExternalLinksGeneric
import typings.officeJs.officeJsStrings.LoadingImage
import typings.officeJs.officeJsStrings.NumbersignBUSYExclamationmark
import typings.officeJs.officeJsStrings.Unknown_
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Represents the value of a cell containing a #BUSY! error.
  *
  * @remarks
  * [Api set: ExcelApi 1.16]
  */
trait BusyErrorCellValue
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
    * Represents the type of `BusyErrorCellValue`.
    *
    * @remarks
    * [Api set: ExcelApi 1.16]
    */
  var errorSubType: js.UndefOr[BusyErrorCellValueSubType | Unknown_ | ExternalLinksGeneric | LoadingImage] = js.undefined
  
  /**
    * Represents the type of `ErrorCellValue`.
    *
    * @remarks
    * [Api set: ExcelApi 1.16]
    */
  var errorType: js.UndefOr[busy | Busy] = js.undefined
  
  /**
    * Represents the type of this cell value.
    *
    * @remarks
    * [Api set: ExcelApi 1.16]
    */
  var `type`: typings.officeJs.Excel.CellValueType.error | Error
}
object BusyErrorCellValue {
  
  inline def apply(`type`: typings.officeJs.Excel.CellValueType.error | Error): BusyErrorCellValue = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[BusyErrorCellValue]
  }
  
  extension [Self <: BusyErrorCellValue](x: Self) {
    
    inline def setBasicType(value: error | Error): Self = StObject.set(x, "basicType", value.asInstanceOf[js.Any])
    
    inline def setBasicTypeUndefined: Self = StObject.set(x, "basicType", js.undefined)
    
    inline def setBasicValue(value: NumbersignBUSYExclamationmark | String): Self = StObject.set(x, "basicValue", value.asInstanceOf[js.Any])
    
    inline def setBasicValueUndefined: Self = StObject.set(x, "basicValue", js.undefined)
    
    inline def setErrorSubType(value: BusyErrorCellValueSubType | Unknown_ | ExternalLinksGeneric | LoadingImage): Self = StObject.set(x, "errorSubType", value.asInstanceOf[js.Any])
    
    inline def setErrorSubTypeUndefined: Self = StObject.set(x, "errorSubType", js.undefined)
    
    inline def setErrorType(value: busy | Busy): Self = StObject.set(x, "errorType", value.asInstanceOf[js.Any])
    
    inline def setErrorTypeUndefined: Self = StObject.set(x, "errorType", js.undefined)
    
    inline def setType(value: typings.officeJs.Excel.CellValueType.error | Error): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
  }
}
