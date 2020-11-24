package typings.maximMazurokGapiClientRecommendationengine.gapi.client.recommendationengine

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait GoogleCloudRecommendationengineV1beta1UserEventInlineSource extends js.Object {
  
  /** Optional. A list of user events to import. Recommended max of 10k items. */
  var userEvents: js.UndefOr[js.Array[GoogleCloudRecommendationengineV1beta1UserEvent]] = js.native
}
object GoogleCloudRecommendationengineV1beta1UserEventInlineSource {
  
  @scala.inline
  def apply(): GoogleCloudRecommendationengineV1beta1UserEventInlineSource = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GoogleCloudRecommendationengineV1beta1UserEventInlineSource]
  }
  
  @scala.inline
  implicit class GoogleCloudRecommendationengineV1beta1UserEventInlineSourceOps[Self <: GoogleCloudRecommendationengineV1beta1UserEventInlineSource] (val x: Self) extends AnyVal {
    
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
    def setUserEventsVarargs(value: GoogleCloudRecommendationengineV1beta1UserEvent*): Self = this.set("userEvents", js.Array(value :_*))
    
    @scala.inline
    def setUserEvents(value: js.Array[GoogleCloudRecommendationengineV1beta1UserEvent]): Self = this.set("userEvents", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteUserEvents: Self = this.set("userEvents", js.undefined)
  }
}
