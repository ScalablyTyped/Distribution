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
  
  @scala.inline
  def apply(): ListReportTypesResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ListReportTypesResponse]
  }
  
  @scala.inline
  implicit class ListReportTypesResponseMutableBuilder[Self <: ListReportTypesResponse] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setNextPageToken(value: String): Self = StObject.set(x, "nextPageToken", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNextPageTokenUndefined: Self = StObject.set(x, "nextPageToken", js.undefined)
    
    @scala.inline
    def setReportTypes(value: js.Array[ReportType]): Self = StObject.set(x, "reportTypes", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setReportTypesUndefined: Self = StObject.set(x, "reportTypes", js.undefined)
    
    @scala.inline
    def setReportTypesVarargs(value: ReportType*): Self = StObject.set(x, "reportTypes", js.Array(value :_*))
  }
}
