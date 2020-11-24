package typings.peerjs.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait UtilSupportsObj extends js.Object {
  
  var audioVideo: Boolean = js.native
  
  var binaryBlob: Boolean = js.native
  
  var browser: Boolean = js.native
  
  var data: Boolean = js.native
  
  var reliable: Boolean = js.native
  
  var webRTC: Boolean = js.native
}
object UtilSupportsObj {
  
  @scala.inline
  def apply(
    audioVideo: Boolean,
    binaryBlob: Boolean,
    browser: Boolean,
    data: Boolean,
    reliable: Boolean,
    webRTC: Boolean
  ): UtilSupportsObj = {
    val __obj = js.Dynamic.literal(audioVideo = audioVideo.asInstanceOf[js.Any], binaryBlob = binaryBlob.asInstanceOf[js.Any], browser = browser.asInstanceOf[js.Any], data = data.asInstanceOf[js.Any], reliable = reliable.asInstanceOf[js.Any], webRTC = webRTC.asInstanceOf[js.Any])
    __obj.asInstanceOf[UtilSupportsObj]
  }
  
  @scala.inline
  implicit class UtilSupportsObjOps[Self <: UtilSupportsObj] (val x: Self) extends AnyVal {
    
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
    def setAudioVideo(value: Boolean): Self = this.set("audioVideo", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setBinaryBlob(value: Boolean): Self = this.set("binaryBlob", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setBrowser(value: Boolean): Self = this.set("browser", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setData(value: Boolean): Self = this.set("data", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setReliable(value: Boolean): Self = this.set("reliable", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setWebRTC(value: Boolean): Self = this.set("webRTC", value.asInstanceOf[js.Any])
  }
}
