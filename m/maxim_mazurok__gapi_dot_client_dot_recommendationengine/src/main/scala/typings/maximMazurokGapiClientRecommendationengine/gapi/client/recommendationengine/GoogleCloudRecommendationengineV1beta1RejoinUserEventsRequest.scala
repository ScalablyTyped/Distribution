package typings.maximMazurokGapiClientRecommendationengine.gapi.client.recommendationengine

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait GoogleCloudRecommendationengineV1beta1RejoinUserEventsRequest extends js.Object {
  
  /** Required. The type of the catalog rejoin to define the scope and range of the user events to be rejoined with catalog items. */
  var userEventRejoinScope: js.UndefOr[String] = js.native
}
object GoogleCloudRecommendationengineV1beta1RejoinUserEventsRequest {
  
  @scala.inline
  def apply(): GoogleCloudRecommendationengineV1beta1RejoinUserEventsRequest = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GoogleCloudRecommendationengineV1beta1RejoinUserEventsRequest]
  }
  
  @scala.inline
  implicit class GoogleCloudRecommendationengineV1beta1RejoinUserEventsRequestOps[Self <: GoogleCloudRecommendationengineV1beta1RejoinUserEventsRequest] (val x: Self) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setUserEventRejoinScope(value: String): Self = this.set("userEventRejoinScope", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteUserEventRejoinScope: Self = this.set("userEventRejoinScope", js.undefined)
  }
}
