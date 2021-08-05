package typings.maximMazurokGapiClientDisplayvideo.gapi.client.displayvideo

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait VideoPlayerSizeTargetingOptionDetails extends StObject {
  
  /** Output only. The video player size. */
  var videoPlayerSize: js.UndefOr[String] = js.undefined
}
object VideoPlayerSizeTargetingOptionDetails {
  
  inline def apply(): VideoPlayerSizeTargetingOptionDetails = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[VideoPlayerSizeTargetingOptionDetails]
  }
  
  extension [Self <: VideoPlayerSizeTargetingOptionDetails](x: Self) {
    
    inline def setVideoPlayerSize(value: String): Self = StObject.set(x, "videoPlayerSize", value.asInstanceOf[js.Any])
    
    inline def setVideoPlayerSizeUndefined: Self = StObject.set(x, "videoPlayerSize", js.undefined)
  }
}
