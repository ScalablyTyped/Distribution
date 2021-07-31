package typings.maximMazurokGapiClientRecommendationengine.gapi.client.recommendationengine

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GoogleCloudRecommendationengineV1beta1RejoinUserEventsRequest extends StObject {
  
  /** Required. The type of the catalog rejoin to define the scope and range of the user events to be rejoined with catalog items. */
  var userEventRejoinScope: js.UndefOr[String] = js.undefined
}
object GoogleCloudRecommendationengineV1beta1RejoinUserEventsRequest {
  
  @scala.inline
  def apply(): GoogleCloudRecommendationengineV1beta1RejoinUserEventsRequest = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GoogleCloudRecommendationengineV1beta1RejoinUserEventsRequest]
  }
  
  @scala.inline
  implicit class GoogleCloudRecommendationengineV1beta1RejoinUserEventsRequestMutableBuilder[Self <: GoogleCloudRecommendationengineV1beta1RejoinUserEventsRequest] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setUserEventRejoinScope(value: String): Self = StObject.set(x, "userEventRejoinScope", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setUserEventRejoinScopeUndefined: Self = StObject.set(x, "userEventRejoinScope", js.undefined)
  }
}
