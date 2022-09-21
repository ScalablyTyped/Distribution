package typings.openrct2.mod.global

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * A coordinate within the game.
  * Each in-game tile is a size of 32x32.
  */
trait CoordsXY extends StObject {
  
  var x: Double
  
  var y: Double
}
object CoordsXY {
  
  inline def apply(x: Double, y: Double): CoordsXY = {
    val __obj = js.Dynamic.literal(x = x.asInstanceOf[js.Any], y = y.asInstanceOf[js.Any])
    __obj.asInstanceOf[CoordsXY]
  }
  
  extension [Self <: CoordsXY](x: Self) {
    
    inline def setX(value: Double): Self = StObject.set(x, "x", value.asInstanceOf[js.Any])
    
    inline def setY(value: Double): Self = StObject.set(x, "y", value.asInstanceOf[js.Any])
  }
}
