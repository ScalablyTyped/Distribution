package typings.openfin.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ScreenX extends StObject {
  
  var screenX: Double
  
  var screenY: Double
}
object ScreenX {
  
  inline def apply(screenX: Double, screenY: Double): ScreenX = {
    val __obj = js.Dynamic.literal(screenX = screenX.asInstanceOf[js.Any], screenY = screenY.asInstanceOf[js.Any])
    __obj.asInstanceOf[ScreenX]
  }
  
  extension [Self <: ScreenX](x: Self) {
    
    inline def setScreenX(value: Double): Self = StObject.set(x, "screenX", value.asInstanceOf[js.Any])
    
    inline def setScreenY(value: Double): Self = StObject.set(x, "screenY", value.asInstanceOf[js.Any])
  }
}
