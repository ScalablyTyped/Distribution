package typings.playcanvas.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Mask extends StObject {
  
  var mask: Any
  
  var screen: Any
}
object Mask {
  
  inline def apply(mask: Any, screen: Any): Mask = {
    val __obj = js.Dynamic.literal(mask = mask.asInstanceOf[js.Any], screen = screen.asInstanceOf[js.Any])
    __obj.asInstanceOf[Mask]
  }
  
  extension [Self <: Mask](x: Self) {
    
    inline def setMask(value: Any): Self = StObject.set(x, "mask", value.asInstanceOf[js.Any])
    
    inline def setScreen(value: Any): Self = StObject.set(x, "screen", value.asInstanceOf[js.Any])
  }
}
