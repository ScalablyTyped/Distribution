package typings.openrct2.mod.global

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * A coordinate within the game's client screen in pixels.
  */
trait ScreenCoordsXY extends StObject {
  
  var x: Double
  
  var y: Double
}
object ScreenCoordsXY {
  
  inline def apply(x: Double, y: Double): ScreenCoordsXY = {
    val __obj = js.Dynamic.literal(x = x.asInstanceOf[js.Any], y = y.asInstanceOf[js.Any])
    __obj.asInstanceOf[ScreenCoordsXY]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: ScreenCoordsXY] (val x: Self) extends AnyVal {
    
    inline def setX(value: Double): Self = StObject.set(x, "x", value.asInstanceOf[js.Any])
    
    inline def setY(value: Double): Self = StObject.set(x, "y", value.asInstanceOf[js.Any])
  }
}
