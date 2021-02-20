package typings.maximMazurokGapiClientRecommendationengine.gapi.client.recommendationengine

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait GoogleCloudRecommendationengineV1beta1ListUserEventsResponse extends StObject {
  
  /** If empty, the list is complete. If nonempty, the token to pass to the next request's ListUserEvents.page_token. */
  var nextPageToken: js.UndefOr[String] = js.native
  
  /** The user events. */
  var userEvents: js.UndefOr[js.Array[GoogleCloudRecommendationengineV1beta1UserEvent]] = js.native
}
object GoogleCloudRecommendationengineV1beta1ListUserEventsResponse {
  
  @scala.inline
  def apply(): GoogleCloudRecommendationengineV1beta1ListUserEventsResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GoogleCloudRecommendationengineV1beta1ListUserEventsResponse]
  }
  
  @scala.inline
  implicit class GoogleCloudRecommendationengineV1beta1ListUserEventsResponseMutableBuilder[Self <: GoogleCloudRecommendationengineV1beta1ListUserEventsResponse] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setNextPageToken(value: String): Self = StObject.set(x, "nextPageToken", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNextPageTokenUndefined: Self = StObject.set(x, "nextPageToken", js.undefined)
    
    @scala.inline
    def setUserEvents(value: js.Array[GoogleCloudRecommendationengineV1beta1UserEvent]): Self = StObject.set(x, "userEvents", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setUserEventsUndefined: Self = StObject.set(x, "userEvents", js.undefined)
    
    @scala.inline
    def setUserEventsVarargs(value: GoogleCloudRecommendationengineV1beta1UserEvent*): Self = StObject.set(x, "userEvents", js.Array(value :_*))
  }
}
