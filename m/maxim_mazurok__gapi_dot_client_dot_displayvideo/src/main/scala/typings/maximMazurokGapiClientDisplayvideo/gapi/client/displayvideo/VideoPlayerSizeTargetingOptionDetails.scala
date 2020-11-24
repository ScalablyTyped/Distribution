package typings.maximMazurokGapiClientDisplayvideo.gapi.client.displayvideo

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait VideoPlayerSizeTargetingOptionDetails extends js.Object {
  
  /** Output only. The video player size. */
  var videoPlayerSize: js.UndefOr[String] = js.native
}
object VideoPlayerSizeTargetingOptionDetails {
  
  @scala.inline
  def apply(): VideoPlayerSizeTargetingOptionDetails = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[VideoPlayerSizeTargetingOptionDetails]
  }
  
  @scala.inline
  implicit class VideoPlayerSizeTargetingOptionDetailsOps[Self <: VideoPlayerSizeTargetingOptionDetails] (val x: Self) extends AnyVal {
    
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
    def setVideoPlayerSize(value: String): Self = this.set("videoPlayerSize", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteVideoPlayerSize: Self = this.set("videoPlayerSize", js.undefined)
  }
}
