package typings.modernizr

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait VideoBoolean extends js.Object {
  
  var h264: String = js.native
  
  var ogg: String = js.native
  
  var webm: String = js.native
}
object VideoBoolean {
  
  @scala.inline
  def apply(h264: String, ogg: String, webm: String): VideoBoolean = {
    val __obj = js.Dynamic.literal(h264 = h264.asInstanceOf[js.Any], ogg = ogg.asInstanceOf[js.Any], webm = webm.asInstanceOf[js.Any])
    __obj.asInstanceOf[VideoBoolean]
  }
  
  @scala.inline
  implicit class VideoBooleanOps[Self <: VideoBoolean] (val x: Self) extends AnyVal {
    
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
    def setH264(value: String): Self = this.set("h264", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOgg(value: String): Self = this.set("ogg", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setWebm(value: String): Self = this.set("webm", value.asInstanceOf[js.Any])
  }
}
