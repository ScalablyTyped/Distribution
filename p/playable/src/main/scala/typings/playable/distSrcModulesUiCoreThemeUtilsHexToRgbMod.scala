package typings.playable

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distSrcModulesUiCoreThemeUtilsHexToRgbMod {
  
  @JSImport("playable/dist/src/modules/ui/core/theme/utils/hexToRgb", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def default(hex: String): IRGB = ^.asInstanceOf[js.Dynamic].applyDynamic("default")(hex.asInstanceOf[js.Any]).asInstanceOf[IRGB]
  
  trait IRGB extends StObject {
    
    var b: Double
    
    var g: Double
    
    var r: Double
  }
  object IRGB {
    
    inline def apply(b: Double, g: Double, r: Double): IRGB = {
      val __obj = js.Dynamic.literal(b = b.asInstanceOf[js.Any], g = g.asInstanceOf[js.Any], r = r.asInstanceOf[js.Any])
      __obj.asInstanceOf[IRGB]
    }
    
    extension [Self <: IRGB](x: Self) {
      
      inline def setB(value: Double): Self = StObject.set(x, "b", value.asInstanceOf[js.Any])
      
      inline def setG(value: Double): Self = StObject.set(x, "g", value.asInstanceOf[js.Any])
      
      inline def setR(value: Double): Self = StObject.set(x, "r", value.asInstanceOf[js.Any])
    }
  }
}
