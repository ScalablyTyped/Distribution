package typings.novncNovnc

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("@novnc/novnc/core/input/util", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def getKey(event: KeyboardEventBase): String = ^.asInstanceOf[js.Dynamic].applyDynamic("getKey")(event.asInstanceOf[js.Any]).asInstanceOf[String]
  
  inline def getKeycode(event: KeyboardEventBase): String = ^.asInstanceOf[js.Dynamic].applyDynamic("getKeycode")(event.asInstanceOf[js.Any]).asInstanceOf[String]
  
  inline def getKeysym(event: KeyboardEventBase): Double = ^.asInstanceOf[js.Dynamic].applyDynamic("getKeysym")(event.asInstanceOf[js.Any]).asInstanceOf[Double]
  
  trait KeyboardEventBase extends StObject {
    
    var char: js.UndefOr[String] = js.undefined
    
    var charCode: js.UndefOr[Double] = js.undefined
    
    var code: String
    
    var key: String
    
    var keyCode: js.UndefOr[Double] = js.undefined
    
    var location: js.UndefOr[Double] = js.undefined
    
    var `type`: js.UndefOr[String] = js.undefined
  }
  object KeyboardEventBase {
    
    inline def apply(code: String, key: String): KeyboardEventBase = {
      val __obj = js.Dynamic.literal(code = code.asInstanceOf[js.Any], key = key.asInstanceOf[js.Any])
      __obj.asInstanceOf[KeyboardEventBase]
    }
    
    extension [Self <: KeyboardEventBase](x: Self) {
      
      inline def setChar(value: String): Self = StObject.set(x, "char", value.asInstanceOf[js.Any])
      
      inline def setCharCode(value: Double): Self = StObject.set(x, "charCode", value.asInstanceOf[js.Any])
      
      inline def setCharCodeUndefined: Self = StObject.set(x, "charCode", js.undefined)
      
      inline def setCharUndefined: Self = StObject.set(x, "char", js.undefined)
      
      inline def setCode(value: String): Self = StObject.set(x, "code", value.asInstanceOf[js.Any])
      
      inline def setKey(value: String): Self = StObject.set(x, "key", value.asInstanceOf[js.Any])
      
      inline def setKeyCode(value: Double): Self = StObject.set(x, "keyCode", value.asInstanceOf[js.Any])
      
      inline def setKeyCodeUndefined: Self = StObject.set(x, "keyCode", js.undefined)
      
      inline def setLocation(value: Double): Self = StObject.set(x, "location", value.asInstanceOf[js.Any])
      
      inline def setLocationUndefined: Self = StObject.set(x, "location", js.undefined)
      
      inline def setType(value: String): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
      
      inline def setTypeUndefined: Self = StObject.set(x, "type", js.undefined)
    }
  }
}
