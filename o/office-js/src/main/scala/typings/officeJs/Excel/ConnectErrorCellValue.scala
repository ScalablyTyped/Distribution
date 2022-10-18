package typings.officeJs.Excel

import typings.officeJs.Excel.ErrorCellValueType.connect
import typings.officeJs.Excel.RangeValueType.error
import typings.officeJs.officeJsStrings.Connect
import typings.officeJs.officeJsStrings.DataTypeNoConnection
import typings.officeJs.officeJsStrings.DataTypeServiceError
import typings.officeJs.officeJsStrings.Error
import typings.officeJs.officeJsStrings.ExternalLinks
import typings.officeJs.officeJsStrings.ExternalLinksAccessFailed
import typings.officeJs.officeJsStrings.ExternalLinksFailedToRefresh
import typings.officeJs.officeJsStrings.ExternalLinksFileTooLarge
import typings.officeJs.officeJsStrings.ExternalLinksInvalidRequest
import typings.officeJs.officeJsStrings.ExternalLinksNonCloudLocation
import typings.officeJs.officeJsStrings.ExternalLinksServerError
import typings.officeJs.officeJsStrings.ExternalLinksThrottledByHost
import typings.officeJs.officeJsStrings.ExternalLinksUnAuthenticated
import typings.officeJs.officeJsStrings.GenericServerError
import typings.officeJs.officeJsStrings.MissingContent
import typings.officeJs.officeJsStrings.NumbersignCONNECTExclamationmark
import typings.officeJs.officeJsStrings.OutdatedLinkedEntity
import typings.officeJs.officeJsStrings.RequestThrottle
import typings.officeJs.officeJsStrings.ServiceError
import typings.officeJs.officeJsStrings.Unknown_
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
  var `type`: typings.officeJs.Excel.CellValueType.error | Error
}
object ConnectErrorCellValue {
  
  inline def apply(`type`: typings.officeJs.Excel.CellValueType.error | Error): ConnectErrorCellValue = {
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
    
    inline def setType(value: typings.officeJs.Excel.CellValueType.error | Error): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
  }
}
