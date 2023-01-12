package typings.modernizr

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait AudioBoolean extends StObject {
  
  var m4a: String
  
  var mp3: String
  
  var ogg: String
  
  var wav: String
}
object AudioBoolean {
  
  inline def apply(m4a: String, mp3: String, ogg: String, wav: String): AudioBoolean = {
    val __obj = js.Dynamic.literal(m4a = m4a.asInstanceOf[js.Any], mp3 = mp3.asInstanceOf[js.Any], ogg = ogg.asInstanceOf[js.Any], wav = wav.asInstanceOf[js.Any])
    __obj.asInstanceOf[AudioBoolean]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: AudioBoolean] (val x: Self) extends AnyVal {
    
    inline def setM4a(value: String): Self = StObject.set(x, "m4a", value.asInstanceOf[js.Any])
    
    inline def setMp3(value: String): Self = StObject.set(x, "mp3", value.asInstanceOf[js.Any])
    
    inline def setOgg(value: String): Self = StObject.set(x, "ogg", value.asInstanceOf[js.Any])
    
    inline def setWav(value: String): Self = StObject.set(x, "wav", value.asInstanceOf[js.Any])
  }
}
