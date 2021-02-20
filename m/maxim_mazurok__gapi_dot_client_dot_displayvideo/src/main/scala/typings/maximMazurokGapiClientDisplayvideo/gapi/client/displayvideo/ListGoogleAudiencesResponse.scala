package typings.maximMazurokGapiClientDisplayvideo.gapi.client.displayvideo

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ListGoogleAudiencesResponse extends StObject {
  
  /** The list of Google audiences. This list will be absent if empty. */
  var googleAudiences: js.UndefOr[js.Array[GoogleAudience]] = js.native
  
  /** A token to retrieve the next page of results. Pass this value in the page_token field in the subsequent call to `ListGoogleAudiences` method to retrieve the next page of results. */
  var nextPageToken: js.UndefOr[String] = js.native
}
object ListGoogleAudiencesResponse {
  
  @scala.inline
  def apply(): ListGoogleAudiencesResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ListGoogleAudiencesResponse]
  }
  
  @scala.inline
  implicit class ListGoogleAudiencesResponseMutableBuilder[Self <: ListGoogleAudiencesResponse] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setGoogleAudiences(value: js.Array[GoogleAudience]): Self = StObject.set(x, "googleAudiences", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setGoogleAudiencesUndefined: Self = StObject.set(x, "googleAudiences", js.undefined)
    
    @scala.inline
    def setGoogleAudiencesVarargs(value: GoogleAudience*): Self = StObject.set(x, "googleAudiences", js.Array(value :_*))
    
    @scala.inline
    def setNextPageToken(value: String): Self = StObject.set(x, "nextPageToken", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNextPageTokenUndefined: Self = StObject.set(x, "nextPageToken", js.undefined)
  }
}
