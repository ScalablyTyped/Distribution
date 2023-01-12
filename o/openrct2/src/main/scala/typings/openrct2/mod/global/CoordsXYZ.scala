package typings.openrct2.mod.global

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * A coordinate within the game.
  * Each in-game tile is a size of 32x32.
  * The z-coordinate raises 16 per land increment. A full-height wall is 32 in height.
  */
trait CoordsXYZ
  extends StObject
     with CoordsXY {
  
  var z: Double
}
object CoordsXYZ {
  
  inline def apply(x: Double, y: Double, z: Double): CoordsXYZ = {
    val __obj = js.Dynamic.literal(x = x.asInstanceOf[js.Any], y = y.asInstanceOf[js.Any], z = z.asInstanceOf[js.Any])
    __obj.asInstanceOf[CoordsXYZ]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: CoordsXYZ] (val x: Self) extends AnyVal {
    
    inline def setZ(value: Double): Self = StObject.set(x, "z", value.asInstanceOf[js.Any])
  }
}
