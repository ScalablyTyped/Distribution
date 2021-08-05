package typings.modernizr

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait VideoBoolean extends StObject {
  
  var h264: String
  
  var ogg: String
  
  var webm: String
}
object VideoBoolean {
  
  inline def apply(h264: String, ogg: String, webm: String): VideoBoolean = {
    val __obj = js.Dynamic.literal(h264 = h264.asInstanceOf[js.Any], ogg = ogg.asInstanceOf[js.Any], webm = webm.asInstanceOf[js.Any])
    __obj.asInstanceOf[VideoBoolean]
  }
  
  extension [Self <: VideoBoolean](x: Self) {
    
    inline def setH264(value: String): Self = StObject.set(x, "h264", value.asInstanceOf[js.Any])
    
    inline def setOgg(value: String): Self = StObject.set(x, "ogg", value.asInstanceOf[js.Any])
    
    inline def setWebm(value: String): Self = StObject.set(x, "webm", value.asInstanceOf[js.Any])
  }
}
