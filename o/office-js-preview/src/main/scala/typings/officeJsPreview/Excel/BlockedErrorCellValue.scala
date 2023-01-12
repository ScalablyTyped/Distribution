package typings.officeJsPreview.Excel

import typings.officeJsPreview.Excel.ErrorCellValueType.blocked
import typings.officeJsPreview.Excel.RangeValueType.error
import typings.officeJsPreview.officeJsPreviewStrings.Blocked
import typings.officeJsPreview.officeJsPreviewStrings.DataTypePrivacySetting
import typings.officeJsPreview.officeJsPreviewStrings.DataTypeRestrictedDomain
import typings.officeJsPreview.officeJsPreviewStrings.DataTypeUnsupportedApp
import typings.officeJsPreview.officeJsPreviewStrings.Error
import typings.officeJsPreview.officeJsPreviewStrings.ExternalLinksGeneric
import typings.officeJsPreview.officeJsPreviewStrings.NoLicense
import typings.officeJsPreview.officeJsPreviewStrings.NumbersignBLOCKEDExclamationmark
import typings.officeJsPreview.officeJsPreviewStrings.RichDataLinkDisabled
import typings.officeJsPreview.officeJsPreviewStrings.SignInError
import typings.officeJsPreview.officeJsPreviewStrings.Unknown_
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Represents the value of a cell containing a #BLOCKED! error.
  *
  * @remarks
  * [Api set: ExcelApi 1.16]
  */
trait BlockedErrorCellValue
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
  var basicValue: js.UndefOr[NumbersignBLOCKEDExclamationmark | String] = js.undefined
  
  /**
    * Represents the type of `BlockedErrorCellValue`.
    *
    * @remarks
    * [Api set: ExcelApi 1.16]
    */
  var errorSubType: js.UndefOr[
    BlockedErrorCellValueSubType | Unknown_ | DataTypeRestrictedDomain | DataTypePrivacySetting | DataTypeUnsupportedApp | ExternalLinksGeneric | RichDataLinkDisabled | SignInError | NoLicense
  ] = js.undefined
  
  /**
    * Represents the type of `ErrorCellValue`.
    *
    * @remarks
    * [Api set: ExcelApi 1.16]
    */
  var errorType: js.UndefOr[blocked | Blocked] = js.undefined
  
  /**
    * Represents the type of this cell value.
    *
    * @remarks
    * [Api set: ExcelApi 1.16]
    */
  var `type`: typings.officeJsPreview.Excel.CellValueType.error | Error
}
object BlockedErrorCellValue {
  
  inline def apply(`type`: typings.officeJsPreview.Excel.CellValueType.error | Error): BlockedErrorCellValue = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[BlockedErrorCellValue]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: BlockedErrorCellValue] (val x: Self) extends AnyVal {
    
    inline def setBasicType(value: error | Error): Self = StObject.set(x, "basicType", value.asInstanceOf[js.Any])
    
    inline def setBasicTypeUndefined: Self = StObject.set(x, "basicType", js.undefined)
    
    inline def setBasicValue(value: NumbersignBLOCKEDExclamationmark | String): Self = StObject.set(x, "basicValue", value.asInstanceOf[js.Any])
    
    inline def setBasicValueUndefined: Self = StObject.set(x, "basicValue", js.undefined)
    
    inline def setErrorSubType(
      value: BlockedErrorCellValueSubType | Unknown_ | DataTypeRestrictedDomain | DataTypePrivacySetting | DataTypeUnsupportedApp | ExternalLinksGeneric | RichDataLinkDisabled | SignInError | NoLicense
    ): Self = StObject.set(x, "errorSubType", value.asInstanceOf[js.Any])
    
    inline def setErrorSubTypeUndefined: Self = StObject.set(x, "errorSubType", js.undefined)
    
    inline def setErrorType(value: blocked | Blocked): Self = StObject.set(x, "errorType", value.asInstanceOf[js.Any])
    
    inline def setErrorTypeUndefined: Self = StObject.set(x, "errorType", js.undefined)
    
    inline def setType(value: typings.officeJsPreview.Excel.CellValueType.error | Error): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
  }
}
