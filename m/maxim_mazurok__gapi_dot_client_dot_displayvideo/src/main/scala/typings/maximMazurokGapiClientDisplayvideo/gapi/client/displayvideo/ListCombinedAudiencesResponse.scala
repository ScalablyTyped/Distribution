package typings.maximMazurokGapiClientDisplayvideo.gapi.client.displayvideo

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ListCombinedAudiencesResponse extends StObject {
  
  /** The list of combined audiences. This list will be absent if empty. */
  var combinedAudiences: js.UndefOr[js.Array[CombinedAudience]] = js.undefined
  
  /** A token to retrieve the next page of results. Pass this value in the page_token field in the subsequent call to `ListCombinedAudiences` method to retrieve the next page of results. */
  var nextPageToken: js.UndefOr[String] = js.undefined
}
object ListCombinedAudiencesResponse {
  
  inline def apply(): ListCombinedAudiencesResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ListCombinedAudiencesResponse]
  }
  
  extension [Self <: ListCombinedAudiencesResponse](x: Self) {
    
    inline def setCombinedAudiences(value: js.Array[CombinedAudience]): Self = StObject.set(x, "combinedAudiences", value.asInstanceOf[js.Any])
    
    inline def setCombinedAudiencesUndefined: Self = StObject.set(x, "combinedAudiences", js.undefined)
    
    inline def setCombinedAudiencesVarargs(value: CombinedAudience*): Self = StObject.set(x, "combinedAudiences", js.Array(value :_*))
    
    inline def setNextPageToken(value: String): Self = StObject.set(x, "nextPageToken", value.asInstanceOf[js.Any])
    
    inline def setNextPageTokenUndefined: Self = StObject.set(x, "nextPageToken", js.undefined)
  }
}
