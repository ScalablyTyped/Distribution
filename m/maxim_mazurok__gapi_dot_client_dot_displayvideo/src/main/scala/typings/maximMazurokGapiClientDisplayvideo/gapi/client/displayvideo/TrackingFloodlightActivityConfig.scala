package typings.maximMazurokGapiClientDisplayvideo.gapi.client.displayvideo

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait TrackingFloodlightActivityConfig extends js.Object {
  
  /** Required. The ID of the Floodlight activity. */
  var floodlightActivityId: js.UndefOr[String] = js.native
  
  /** Required. The number of days after an ad has been clicked in which a conversion may be counted. Must be between 0 and 90 inclusive. */
  var postClickLookbackWindowDays: js.UndefOr[Double] = js.native
  
  /** Required. The number of days after an ad has been viewed in which a conversion may be counted. Must be between 0 and 90 inclusive. */
  var postViewLookbackWindowDays: js.UndefOr[Double] = js.native
}
object TrackingFloodlightActivityConfig {
  
  @scala.inline
  def apply(): TrackingFloodlightActivityConfig = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[TrackingFloodlightActivityConfig]
  }
  
  @scala.inline
  implicit class TrackingFloodlightActivityConfigOps[Self <: TrackingFloodlightActivityConfig] (val x: Self) extends AnyVal {
    
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
    def setFloodlightActivityId(value: String): Self = this.set("floodlightActivityId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteFloodlightActivityId: Self = this.set("floodlightActivityId", js.undefined)
    
    @scala.inline
    def setPostClickLookbackWindowDays(value: Double): Self = this.set("postClickLookbackWindowDays", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deletePostClickLookbackWindowDays: Self = this.set("postClickLookbackWindowDays", js.undefined)
    
    @scala.inline
    def setPostViewLookbackWindowDays(value: Double): Self = this.set("postViewLookbackWindowDays", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deletePostViewLookbackWindowDays: Self = this.set("postViewLookbackWindowDays", js.undefined)
  }
}
