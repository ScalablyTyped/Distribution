package typings.maximMazurokGapiClientRecommendationengine.gapi.client.recommendationengine

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait GoogleCloudRecommendationengineV1beta1PurgeUserEventsResponse extends js.Object {
  
  /** The total count of events purged as a result of the operation. */
  var purgedEventsCount: js.UndefOr[String] = js.native
  
  /** A sampling of events deleted (or will be deleted) depending on the `force` property in the request. Max of 500 items will be returned. */
  var userEventsSample: js.UndefOr[js.Array[GoogleCloudRecommendationengineV1beta1UserEvent]] = js.native
}
object GoogleCloudRecommendationengineV1beta1PurgeUserEventsResponse {
  
  @scala.inline
  def apply(): GoogleCloudRecommendationengineV1beta1PurgeUserEventsResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GoogleCloudRecommendationengineV1beta1PurgeUserEventsResponse]
  }
  
  @scala.inline
  implicit class GoogleCloudRecommendationengineV1beta1PurgeUserEventsResponseOps[Self <: GoogleCloudRecommendationengineV1beta1PurgeUserEventsResponse] (val x: Self) extends AnyVal {
    
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
    def setPurgedEventsCount(value: String): Self = this.set("purgedEventsCount", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deletePurgedEventsCount: Self = this.set("purgedEventsCount", js.undefined)
    
    @scala.inline
    def setUserEventsSampleVarargs(value: GoogleCloudRecommendationengineV1beta1UserEvent*): Self = this.set("userEventsSample", js.Array(value :_*))
    
    @scala.inline
    def setUserEventsSample(value: js.Array[GoogleCloudRecommendationengineV1beta1UserEvent]): Self = this.set("userEventsSample", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteUserEventsSample: Self = this.set("userEventsSample", js.undefined)
  }
}
