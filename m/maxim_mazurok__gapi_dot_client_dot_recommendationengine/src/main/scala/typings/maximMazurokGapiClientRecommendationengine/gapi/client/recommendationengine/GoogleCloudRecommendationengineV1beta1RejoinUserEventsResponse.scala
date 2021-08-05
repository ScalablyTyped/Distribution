package typings.maximMazurokGapiClientRecommendationengine.gapi.client.recommendationengine

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GoogleCloudRecommendationengineV1beta1RejoinUserEventsResponse extends StObject {
  
  /** Number of user events that were joined with latest catalog items. */
  var rejoinedUserEventsCount: js.UndefOr[String] = js.undefined
}
object GoogleCloudRecommendationengineV1beta1RejoinUserEventsResponse {
  
  inline def apply(): GoogleCloudRecommendationengineV1beta1RejoinUserEventsResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GoogleCloudRecommendationengineV1beta1RejoinUserEventsResponse]
  }
  
  extension [Self <: GoogleCloudRecommendationengineV1beta1RejoinUserEventsResponse](x: Self) {
    
    inline def setRejoinedUserEventsCount(value: String): Self = StObject.set(x, "rejoinedUserEventsCount", value.asInstanceOf[js.Any])
    
    inline def setRejoinedUserEventsCountUndefined: Self = StObject.set(x, "rejoinedUserEventsCount", js.undefined)
  }
}
