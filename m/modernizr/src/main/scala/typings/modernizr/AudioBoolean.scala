package typings.modernizr

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait AudioBoolean extends js.Object {
  
  var m4a: String = js.native
  
  var mp3: String = js.native
  
  var ogg: String = js.native
  
  var wav: String = js.native
}
object AudioBoolean {
  
  @scala.inline
  def apply(m4a: String, mp3: String, ogg: String, wav: String): AudioBoolean = {
    val __obj = js.Dynamic.literal(m4a = m4a.asInstanceOf[js.Any], mp3 = mp3.asInstanceOf[js.Any], ogg = ogg.asInstanceOf[js.Any], wav = wav.asInstanceOf[js.Any])
    __obj.asInstanceOf[AudioBoolean]
  }
  
  @scala.inline
  implicit class AudioBooleanOps[Self <: AudioBoolean] (val x: Self) extends AnyVal {
    
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
    def setM4a(value: String): Self = this.set("m4a", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMp3(value: String): Self = this.set("mp3", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOgg(value: String): Self = this.set("ogg", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setWav(value: String): Self = this.set("wav", value.asInstanceOf[js.Any])
  }
}
