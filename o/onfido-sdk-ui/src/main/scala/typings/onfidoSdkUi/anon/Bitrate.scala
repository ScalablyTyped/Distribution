package typings.onfidoSdkUi.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Bitrate extends StObject {
  
  var bitrate: Double
  
  var duration: Double
  
  var framerate: Double
  
  var webm_mime_type_preference: js.Array[String]
}
object Bitrate {
  
  inline def apply(bitrate: Double, duration: Double, framerate: Double, webm_mime_type_preference: js.Array[String]): Bitrate = {
    val __obj = js.Dynamic.literal(bitrate = bitrate.asInstanceOf[js.Any], duration = duration.asInstanceOf[js.Any], framerate = framerate.asInstanceOf[js.Any], webm_mime_type_preference = webm_mime_type_preference.asInstanceOf[js.Any])
    __obj.asInstanceOf[Bitrate]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: Bitrate] (val x: Self) extends AnyVal {
    
    inline def setBitrate(value: Double): Self = StObject.set(x, "bitrate", value.asInstanceOf[js.Any])
    
    inline def setDuration(value: Double): Self = StObject.set(x, "duration", value.asInstanceOf[js.Any])
    
    inline def setFramerate(value: Double): Self = StObject.set(x, "framerate", value.asInstanceOf[js.Any])
    
    inline def setWebm_mime_type_preference(value: js.Array[String]): Self = StObject.set(x, "webm_mime_type_preference", value.asInstanceOf[js.Any])
    
    inline def setWebm_mime_type_preferenceVarargs(value: String*): Self = StObject.set(x, "webm_mime_type_preference", js.Array(value*))
  }
}
