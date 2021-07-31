package typings.maximMazurokGapiClientDisplayvideo.gapi.client.displayvideo

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait VideoPlayerSizeTargetingOptionDetails extends StObject {
  
  /** Output only. The video player size. */
  var videoPlayerSize: js.UndefOr[String] = js.undefined
}
object VideoPlayerSizeTargetingOptionDetails {
  
  @scala.inline
  def apply(): VideoPlayerSizeTargetingOptionDetails = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[VideoPlayerSizeTargetingOptionDetails]
  }
  
  @scala.inline
  implicit class VideoPlayerSizeTargetingOptionDetailsMutableBuilder[Self <: VideoPlayerSizeTargetingOptionDetails] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setVideoPlayerSize(value: String): Self = StObject.set(x, "videoPlayerSize", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setVideoPlayerSizeUndefined: Self = StObject.set(x, "videoPlayerSize", js.undefined)
  }
}
