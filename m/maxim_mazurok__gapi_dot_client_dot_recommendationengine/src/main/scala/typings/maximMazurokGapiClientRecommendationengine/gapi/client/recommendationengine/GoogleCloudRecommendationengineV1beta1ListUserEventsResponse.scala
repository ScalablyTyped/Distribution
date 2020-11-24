package typings.maximMazurokGapiClientRecommendationengine.gapi.client.recommendationengine

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait GoogleCloudRecommendationengineV1beta1ListUserEventsResponse extends js.Object {
  
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
  implicit class GoogleCloudRecommendationengineV1beta1ListUserEventsResponseOps[Self <: GoogleCloudRecommendationengineV1beta1ListUserEventsResponse] (val x: Self) extends AnyVal {
    
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
    def setNextPageToken(value: String): Self = this.set("nextPageToken", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteNextPageToken: Self = this.set("nextPageToken", js.undefined)
    
    @scala.inline
    def setUserEventsVarargs(value: GoogleCloudRecommendationengineV1beta1UserEvent*): Self = this.set("userEvents", js.Array(value :_*))
    
    @scala.inline
    def setUserEvents(value: js.Array[GoogleCloudRecommendationengineV1beta1UserEvent]): Self = this.set("userEvents", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteUserEvents: Self = this.set("userEvents", js.undefined)
  }
}
