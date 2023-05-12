package typings.onfidoSdkUi.mod

import typings.onfidoSdkUi.anon.Bitrate
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait MotionCapture extends StObject {
  
  var sign_upload: Boolean
  
  var supported: Boolean
  
  var video_settings: Bitrate
}
object MotionCapture {
  
  inline def apply(sign_upload: Boolean, supported: Boolean, video_settings: Bitrate): MotionCapture = {
    val __obj = js.Dynamic.literal(sign_upload = sign_upload.asInstanceOf[js.Any], supported = supported.asInstanceOf[js.Any], video_settings = video_settings.asInstanceOf[js.Any])
    __obj.asInstanceOf[MotionCapture]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: MotionCapture] (val x: Self) extends AnyVal {
    
    inline def setSign_upload(value: Boolean): Self = StObject.set(x, "sign_upload", value.asInstanceOf[js.Any])
    
    inline def setSupported(value: Boolean): Self = StObject.set(x, "supported", value.asInstanceOf[js.Any])
    
    inline def setVideo_settings(value: Bitrate): Self = StObject.set(x, "video_settings", value.asInstanceOf[js.Any])
  }
}
