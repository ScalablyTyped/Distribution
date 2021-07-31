package typings.maximMazurokGapiClientRecommendationengine.gapi.client.recommendationengine

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GoogleCloudRecommendationengineV1beta1UserEventInlineSource extends StObject {
  
  /** Optional. A list of user events to import. Recommended max of 10k items. */
  var userEvents: js.UndefOr[js.Array[GoogleCloudRecommendationengineV1beta1UserEvent]] = js.undefined
}
object GoogleCloudRecommendationengineV1beta1UserEventInlineSource {
  
  @scala.inline
  def apply(): GoogleCloudRecommendationengineV1beta1UserEventInlineSource = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GoogleCloudRecommendationengineV1beta1UserEventInlineSource]
  }
  
  @scala.inline
  implicit class GoogleCloudRecommendationengineV1beta1UserEventInlineSourceMutableBuilder[Self <: GoogleCloudRecommendationengineV1beta1UserEventInlineSource] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setUserEvents(value: js.Array[GoogleCloudRecommendationengineV1beta1UserEvent]): Self = StObject.set(x, "userEvents", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setUserEventsUndefined: Self = StObject.set(x, "userEvents", js.undefined)
    
    @scala.inline
    def setUserEventsVarargs(value: GoogleCloudRecommendationengineV1beta1UserEvent*): Self = StObject.set(x, "userEvents", js.Array(value :_*))
  }
}
