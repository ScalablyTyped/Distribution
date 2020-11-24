package typings.maximMazurokGapiClientDisplayvideo.gapi.client.displayvideo

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait VideoPlayerSizeAssignedTargetingOptionDetails extends js.Object {
  
  /** Required. The targeting_option_id field when targeting_type is `TARGETING_TYPE_VIDEO_PLAYER_SIZE`. */
  var targetingOptionId: js.UndefOr[String] = js.native
  
  /** Output only. The video player size. */
  var videoPlayerSize: js.UndefOr[String] = js.native
}
object VideoPlayerSizeAssignedTargetingOptionDetails {
  
  @scala.inline
  def apply(): VideoPlayerSizeAssignedTargetingOptionDetails = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[VideoPlayerSizeAssignedTargetingOptionDetails]
  }
  
  @scala.inline
  implicit class VideoPlayerSizeAssignedTargetingOptionDetailsOps[Self <: VideoPlayerSizeAssignedTargetingOptionDetails] (val x: Self) extends AnyVal {
    
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
    def setTargetingOptionId(value: String): Self = this.set("targetingOptionId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteTargetingOptionId: Self = this.set("targetingOptionId", js.undefined)
    
    @scala.inline
    def setVideoPlayerSize(value: String): Self = this.set("videoPlayerSize", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteVideoPlayerSize: Self = this.set("videoPlayerSize", js.undefined)
  }
}
