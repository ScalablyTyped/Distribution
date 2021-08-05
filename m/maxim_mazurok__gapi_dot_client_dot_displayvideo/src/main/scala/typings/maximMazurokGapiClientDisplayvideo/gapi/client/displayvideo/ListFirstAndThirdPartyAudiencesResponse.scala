package typings.maximMazurokGapiClientDisplayvideo.gapi.client.displayvideo

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ListFirstAndThirdPartyAudiencesResponse extends StObject {
  
  /** The list of first and third party audiences. Audience size properties will not be included. This list will be absent if empty. */
  var firstAndThirdPartyAudiences: js.UndefOr[js.Array[FirstAndThirdPartyAudience]] = js.undefined
  
  /**
    * A token to retrieve the next page of results. Pass this value in the page_token field in the subsequent call to `ListFirstAndThirdPartyAudiences` method to retrieve the next page of
    * results.
    */
  var nextPageToken: js.UndefOr[String] = js.undefined
}
object ListFirstAndThirdPartyAudiencesResponse {
  
  inline def apply(): ListFirstAndThirdPartyAudiencesResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ListFirstAndThirdPartyAudiencesResponse]
  }
  
  extension [Self <: ListFirstAndThirdPartyAudiencesResponse](x: Self) {
    
    inline def setFirstAndThirdPartyAudiences(value: js.Array[FirstAndThirdPartyAudience]): Self = StObject.set(x, "firstAndThirdPartyAudiences", value.asInstanceOf[js.Any])
    
    inline def setFirstAndThirdPartyAudiencesUndefined: Self = StObject.set(x, "firstAndThirdPartyAudiences", js.undefined)
    
    inline def setFirstAndThirdPartyAudiencesVarargs(value: FirstAndThirdPartyAudience*): Self = StObject.set(x, "firstAndThirdPartyAudiences", js.Array(value :_*))
    
    inline def setNextPageToken(value: String): Self = StObject.set(x, "nextPageToken", value.asInstanceOf[js.Any])
    
    inline def setNextPageTokenUndefined: Self = StObject.set(x, "nextPageToken", js.undefined)
  }
}
