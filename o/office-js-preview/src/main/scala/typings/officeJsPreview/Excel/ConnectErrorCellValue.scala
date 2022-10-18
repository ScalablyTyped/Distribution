package typings.officeJsPreview.Excel

import typings.officeJsPreview.Excel.ErrorCellValueType.connect
import typings.officeJsPreview.Excel.RangeValueType.error
import typings.officeJsPreview.officeJsPreviewStrings.Connect
import typings.officeJsPreview.officeJsPreviewStrings.DataTypeNoConnection
import typings.officeJsPreview.officeJsPreviewStrings.DataTypeServiceError
import typings.officeJsPreview.officeJsPreviewStrings.Error
import typings.officeJsPreview.officeJsPreviewStrings.ExternalLinks
import typings.officeJsPreview.officeJsPreviewStrings.ExternalLinksAccessFailed
import typings.officeJsPreview.officeJsPreviewStrings.ExternalLinksFailedToRefresh
import typings.officeJsPreview.officeJsPreviewStrings.ExternalLinksFileTooLarge
import typings.officeJsPreview.officeJsPreviewStrings.ExternalLinksInvalidRequest
import typings.officeJsPreview.officeJsPreviewStrings.ExternalLinksNonCloudLocation
import typings.officeJsPreview.officeJsPreviewStrings.ExternalLinksServerError
import typings.officeJsPreview.officeJsPreviewStrings.ExternalLinksThrottledByHost
import typings.officeJsPreview.officeJsPreviewStrings.ExternalLinksUnAuthenticated
import typings.officeJsPreview.officeJsPreviewStrings.GenericServerError
import typings.officeJsPreview.officeJsPreviewStrings.MissingContent
import typings.officeJsPreview.officeJsPreviewStrings.NumbersignCONNECTExclamationmark
import typings.officeJsPreview.officeJsPreviewStrings.OutdatedLinkedEntity
import typings.officeJsPreview.officeJsPreviewStrings.RequestThrottle
import typings.officeJsPreview.officeJsPreviewStrings.ServiceError
import typings.officeJsPreview.officeJsPreviewStrings.Unknown_
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Represents the value of a cell containing a #CONNECT! error.
  *
  * @remarks
  * [Api set: ExcelApi 1.16]
  */
trait ConnectErrorCellValue
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
  var basicValue: js.UndefOr[NumbersignCONNECTExclamationmark | String] = js.undefined
  
  /**
    * Represents the type of `ConnectErrorCellValue`.
    *
    * @remarks
    * [Api set: ExcelApi 1.16]
    */
  var errorSubType: js.UndefOr[
    ConnectErrorCellValueSubType | Unknown_ | ServiceError | ExternalLinks | ExternalLinksNonCloudLocation | DataTypeNoConnection | DataTypeServiceError | MissingContent | RequestThrottle | ExternalLinksFailedToRefresh | ExternalLinksAccessFailed | ExternalLinksServerError | ExternalLinksInvalidRequest | ExternalLinksUnAuthenticated | ExternalLinksThrottledByHost | ExternalLinksFileTooLarge | OutdatedLinkedEntity | GenericServerError
  ] = js.undefined
  
  /**
    * Represents the type of `ErrorCellValue`.
    *
    * @remarks
    * [Api set: ExcelApi 1.16]
    */
  var errorType: js.UndefOr[connect | Connect] = js.undefined
  
  /**
    * Represents the type of this cell value.
    *
    * @remarks
    * [Api set: ExcelApi 1.16]
    */
  var `type`: typings.officeJsPreview.Excel.CellValueType.error | Error
}
object ConnectErrorCellValue {
  
  inline def apply(`type`: typings.officeJsPreview.Excel.CellValueType.error | Error): ConnectErrorCellValue = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[ConnectErrorCellValue]
  }
  
  extension [Self <: ConnectErrorCellValue](x: Self) {
    
    inline def setBasicType(value: error | Error): Self = StObject.set(x, "basicType", value.asInstanceOf[js.Any])
    
    inline def setBasicTypeUndefined: Self = StObject.set(x, "basicType", js.undefined)
    
    inline def setBasicValue(value: NumbersignCONNECTExclamationmark | String): Self = StObject.set(x, "basicValue", value.asInstanceOf[js.Any])
    
    inline def setBasicValueUndefined: Self = StObject.set(x, "basicValue", js.undefined)
    
    inline def setErrorSubType(
      value: ConnectErrorCellValueSubType | Unknown_ | ServiceError | ExternalLinks | ExternalLinksNonCloudLocation | DataTypeNoConnection | DataTypeServiceError | MissingContent | RequestThrottle | ExternalLinksFailedToRefresh | ExternalLinksAccessFailed | ExternalLinksServerError | ExternalLinksInvalidRequest | ExternalLinksUnAuthenticated | ExternalLinksThrottledByHost | ExternalLinksFileTooLarge | OutdatedLinkedEntity | GenericServerError
    ): Self = StObject.set(x, "errorSubType", value.asInstanceOf[js.Any])
    
    inline def setErrorSubTypeUndefined: Self = StObject.set(x, "errorSubType", js.undefined)
    
    inline def setErrorType(value: connect | Connect): Self = StObject.set(x, "errorType", value.asInstanceOf[js.Any])
    
    inline def setErrorTypeUndefined: Self = StObject.set(x, "errorType", js.undefined)
    
    inline def setType(value: typings.officeJsPreview.Excel.CellValueType.error | Error): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
  }
}
