package typings.openrct2.mod.global

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * A coordinate within the game.
  * Each in-game tile is a size of 32x32.
  * The z-coordinate raises 16 per land increment. A full-height wall is 32 in height.
  * The direction is between 0 and 3.
  */
trait CoordsXYZD
  extends StObject
     with CoordsXYZ {
  
  var direction: Double
}
object CoordsXYZD {
  
  inline def apply(direction: Double, x: Double, y: Double, z: Double): CoordsXYZD = {
    val __obj = js.Dynamic.literal(direction = direction.asInstanceOf[js.Any], x = x.asInstanceOf[js.Any], y = y.asInstanceOf[js.Any], z = z.asInstanceOf[js.Any])
    __obj.asInstanceOf[CoordsXYZD]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: CoordsXYZD] (val x: Self) extends AnyVal {
    
    inline def setDirection(value: Double): Self = StObject.set(x, "direction", value.asInstanceOf[js.Any])
  }
}
