package typings.maximMazurokGapiClientRecommendationengine.gapi.client.recommendationengine

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GoogleCloudRecommendationengineV1beta1ListUserEventsResponse extends StObject {
  
  /** If empty, the list is complete. If nonempty, the token to pass to the next request's ListUserEvents.page_token. */
  var nextPageToken: js.UndefOr[String] = js.undefined
  
  /** The user events. */
  var userEvents: js.UndefOr[js.Array[GoogleCloudRecommendationengineV1beta1UserEvent]] = js.undefined
}
object GoogleCloudRecommendationengineV1beta1ListUserEventsResponse {
  
  inline def apply(): GoogleCloudRecommendationengineV1beta1ListUserEventsResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GoogleCloudRecommendationengineV1beta1ListUserEventsResponse]
  }
  
  extension [Self <: GoogleCloudRecommendationengineV1beta1ListUserEventsResponse](x: Self) {
    
    inline def setNextPageToken(value: String): Self = StObject.set(x, "nextPageToken", value.asInstanceOf[js.Any])
    
    inline def setNextPageTokenUndefined: Self = StObject.set(x, "nextPageToken", js.undefined)
    
    inline def setUserEvents(value: js.Array[GoogleCloudRecommendationengineV1beta1UserEvent]): Self = StObject.set(x, "userEvents", value.asInstanceOf[js.Any])
    
    inline def setUserEventsUndefined: Self = StObject.set(x, "userEvents", js.undefined)
    
    inline def setUserEventsVarargs(value: GoogleCloudRecommendationengineV1beta1UserEvent*): Self = StObject.set(x, "userEvents", js.Array(value*))
  }
}
