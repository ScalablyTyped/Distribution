package typings.maximMazurokGapiClientYoutubereporting.gapi.client.youtubereporting

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ListReportTypesResponse extends StObject {
  
  /**
    * A token to retrieve next page of results. Pass this value in the ListReportTypesRequest.page_token field in the subsequent call to `ListReportTypes` method to retrieve the next page
    * of results.
    */
  var nextPageToken: js.UndefOr[String] = js.undefined
  
  /** The list of report types. */
  var reportTypes: js.UndefOr[js.Array[ReportType]] = js.undefined
}
object ListReportTypesResponse {
  
  inline def apply(): ListReportTypesResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ListReportTypesResponse]
  }
  
  extension [Self <: ListReportTypesResponse](x: Self) {
    
    inline def setNextPageToken(value: String): Self = StObject.set(x, "nextPageToken", value.asInstanceOf[js.Any])
    
    inline def setNextPageTokenUndefined: Self = StObject.set(x, "nextPageToken", js.undefined)
    
    inline def setReportTypes(value: js.Array[ReportType]): Self = StObject.set(x, "reportTypes", value.asInstanceOf[js.Any])
    
    inline def setReportTypesUndefined: Self = StObject.set(x, "reportTypes", js.undefined)
    
    inline def setReportTypesVarargs(value: ReportType*): Self = StObject.set(x, "reportTypes", js.Array(value*))
  }
}
