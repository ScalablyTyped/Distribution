package typings.maximMazurokGapiClientDisplayvideo.gapi.client.displayvideo

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ListGoogleAudiencesResponse extends StObject {
  
  /** The list of Google audiences. This list will be absent if empty. */
  var googleAudiences: js.UndefOr[js.Array[GoogleAudience]] = js.undefined
  
  /** A token to retrieve the next page of results. Pass this value in the page_token field in the subsequent call to `ListGoogleAudiences` method to retrieve the next page of results. */
  var nextPageToken: js.UndefOr[String] = js.undefined
}
object ListGoogleAudiencesResponse {
  
  inline def apply(): ListGoogleAudiencesResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ListGoogleAudiencesResponse]
  }
  
  extension [Self <: ListGoogleAudiencesResponse](x: Self) {
    
    inline def setGoogleAudiences(value: js.Array[GoogleAudience]): Self = StObject.set(x, "googleAudiences", value.asInstanceOf[js.Any])
    
    inline def setGoogleAudiencesUndefined: Self = StObject.set(x, "googleAudiences", js.undefined)
    
    inline def setGoogleAudiencesVarargs(value: GoogleAudience*): Self = StObject.set(x, "googleAudiences", js.Array(value*))
    
    inline def setNextPageToken(value: String): Self = StObject.set(x, "nextPageToken", value.asInstanceOf[js.Any])
    
    inline def setNextPageTokenUndefined: Self = StObject.set(x, "nextPageToken", js.undefined)
  }
}
