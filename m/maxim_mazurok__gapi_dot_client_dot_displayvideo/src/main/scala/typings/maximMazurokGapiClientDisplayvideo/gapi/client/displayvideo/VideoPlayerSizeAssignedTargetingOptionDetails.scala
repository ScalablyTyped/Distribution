package typings.maximMazurokGapiClientDisplayvideo.gapi.client.displayvideo

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait VideoPlayerSizeAssignedTargetingOptionDetails extends StObject {
  
  /** Required. The targeting_option_id field when targeting_type is `TARGETING_TYPE_VIDEO_PLAYER_SIZE`. */
  var targetingOptionId: js.UndefOr[String] = js.undefined
  
  /** Output only. The video player size. */
  var videoPlayerSize: js.UndefOr[String] = js.undefined
}
object VideoPlayerSizeAssignedTargetingOptionDetails {
  
  @scala.inline
  def apply(): VideoPlayerSizeAssignedTargetingOptionDetails = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[VideoPlayerSizeAssignedTargetingOptionDetails]
  }
  
  @scala.inline
  implicit class VideoPlayerSizeAssignedTargetingOptionDetailsMutableBuilder[Self <: VideoPlayerSizeAssignedTargetingOptionDetails] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setTargetingOptionId(value: String): Self = StObject.set(x, "targetingOptionId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTargetingOptionIdUndefined: Self = StObject.set(x, "targetingOptionId", js.undefined)
    
    @scala.inline
    def setVideoPlayerSize(value: String): Self = StObject.set(x, "videoPlayerSize", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setVideoPlayerSizeUndefined: Self = StObject.set(x, "videoPlayerSize", js.undefined)
  }
}
