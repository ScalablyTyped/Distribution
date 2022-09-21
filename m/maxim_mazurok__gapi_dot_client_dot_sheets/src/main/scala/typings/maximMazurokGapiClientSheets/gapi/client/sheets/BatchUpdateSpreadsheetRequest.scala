package typings.maximMazurokGapiClientSheets.gapi.client.sheets

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait BatchUpdateSpreadsheetRequest extends StObject {
  
  /** Determines if the update response should include the spreadsheet resource. */
  var includeSpreadsheetInResponse: js.UndefOr[Boolean] = js.undefined
  
  /** A list of updates to apply to the spreadsheet. Requests will be applied in the order they are specified. If any request is not valid, no requests will be applied. */
  var requests: js.UndefOr[js.Array[Request]] = js.undefined
  
  /** True if grid data should be returned. Meaningful only if include_spreadsheet_in_response is 'true'. This parameter is ignored if a field mask was set in the request. */
  var responseIncludeGridData: js.UndefOr[Boolean] = js.undefined
  
  /** Limits the ranges included in the response spreadsheet. Meaningful only if include_spreadsheet_in_response is 'true'. */
  var responseRanges: js.UndefOr[js.Array[String]] = js.undefined
}
object BatchUpdateSpreadsheetRequest {
  
  inline def apply(): BatchUpdateSpreadsheetRequest = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[BatchUpdateSpreadsheetRequest]
  }
  
  extension [Self <: BatchUpdateSpreadsheetRequest](x: Self) {
    
    inline def setIncludeSpreadsheetInResponse(value: Boolean): Self = StObject.set(x, "includeSpreadsheetInResponse", value.asInstanceOf[js.Any])
    
    inline def setIncludeSpreadsheetInResponseUndefined: Self = StObject.set(x, "includeSpreadsheetInResponse", js.undefined)
    
    inline def setRequests(value: js.Array[Request]): Self = StObject.set(x, "requests", value.asInstanceOf[js.Any])
    
    inline def setRequestsUndefined: Self = StObject.set(x, "requests", js.undefined)
    
    inline def setRequestsVarargs(value: Request*): Self = StObject.set(x, "requests", js.Array(value*))
    
    inline def setResponseIncludeGridData(value: Boolean): Self = StObject.set(x, "responseIncludeGridData", value.asInstanceOf[js.Any])
    
    inline def setResponseIncludeGridDataUndefined: Self = StObject.set(x, "responseIncludeGridData", js.undefined)
    
    inline def setResponseRanges(value: js.Array[String]): Self = StObject.set(x, "responseRanges", value.asInstanceOf[js.Any])
    
    inline def setResponseRangesUndefined: Self = StObject.set(x, "responseRanges", js.undefined)
    
    inline def setResponseRangesVarargs(value: String*): Self = StObject.set(x, "responseRanges", js.Array(value*))
  }
}
