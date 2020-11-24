package typings.maximMazurokGapiClientRecommendationengine.gapi.client.recommendationengine

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait GoogleCloudRecommendationengineV1beta1RejoinUserEventsResponse extends js.Object {
  
  /** Number of user events that were joined with latest catalog items. */
  var rejoinedUserEventsCount: js.UndefOr[String] = js.native
}
object GoogleCloudRecommendationengineV1beta1RejoinUserEventsResponse {
  
  @scala.inline
  def apply(): GoogleCloudRecommendationengineV1beta1RejoinUserEventsResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GoogleCloudRecommendationengineV1beta1RejoinUserEventsResponse]
  }
  
  @scala.inline
  implicit class GoogleCloudRecommendationengineV1beta1RejoinUserEventsResponseOps[Self <: GoogleCloudRecommendationengineV1beta1RejoinUserEventsResponse] (val x: Self) extends AnyVal {
    
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
    def setRejoinedUserEventsCount(value: String): Self = this.set("rejoinedUserEventsCount", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteRejoinedUserEventsCount: Self = this.set("rejoinedUserEventsCount", js.undefined)
  }
}
