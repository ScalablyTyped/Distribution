package typings.playcanvas.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait UseMouse extends StObject {
  
  var useMouse: js.UndefOr[Boolean] = js.undefined
  
  var useTouch: js.UndefOr[Boolean] = js.undefined
  
  var useXr: js.UndefOr[Boolean] = js.undefined
}
object UseMouse {
  
  inline def apply(): UseMouse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[UseMouse]
  }
  
  extension [Self <: UseMouse](x: Self) {
    
    inline def setUseMouse(value: Boolean): Self = StObject.set(x, "useMouse", value.asInstanceOf[js.Any])
    
    inline def setUseMouseUndefined: Self = StObject.set(x, "useMouse", js.undefined)
    
    inline def setUseTouch(value: Boolean): Self = StObject.set(x, "useTouch", value.asInstanceOf[js.Any])
    
    inline def setUseTouchUndefined: Self = StObject.set(x, "useTouch", js.undefined)
    
    inline def setUseXr(value: Boolean): Self = StObject.set(x, "useXr", value.asInstanceOf[js.Any])
    
    inline def setUseXrUndefined: Self = StObject.set(x, "useXr", js.undefined)
  }
}
