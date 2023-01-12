package typings.peerjs.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait UtilSupportsObj extends StObject {
  
  var audioVideo: Boolean
  
  var binaryBlob: Boolean
  
  var browser: Boolean
  
  var data: Boolean
  
  var reliable: Boolean
  
  var webRTC: Boolean
}
object UtilSupportsObj {
  
  inline def apply(
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
  implicit open class MutableBuilder[Self <: UtilSupportsObj] (val x: Self) extends AnyVal {
    
    inline def setAudioVideo(value: Boolean): Self = StObject.set(x, "audioVideo", value.asInstanceOf[js.Any])
    
    inline def setBinaryBlob(value: Boolean): Self = StObject.set(x, "binaryBlob", value.asInstanceOf[js.Any])
    
    inline def setBrowser(value: Boolean): Self = StObject.set(x, "browser", value.asInstanceOf[js.Any])
    
    inline def setData(value: Boolean): Self = StObject.set(x, "data", value.asInstanceOf[js.Any])
    
    inline def setReliable(value: Boolean): Self = StObject.set(x, "reliable", value.asInstanceOf[js.Any])
    
    inline def setWebRTC(value: Boolean): Self = StObject.set(x, "webRTC", value.asInstanceOf[js.Any])
  }
}
