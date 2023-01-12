package typings.openrct2.mod.global

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait RideCreateGameActionResult
  extends StObject
     with GameActionResult {
  
  val ride: Double
}
object RideCreateGameActionResult {
  
  inline def apply(ride: Double): RideCreateGameActionResult = {
    val __obj = js.Dynamic.literal(ride = ride.asInstanceOf[js.Any])
    __obj.asInstanceOf[RideCreateGameActionResult]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: RideCreateGameActionResult] (val x: Self) extends AnyVal {
    
    inline def setRide(value: Double): Self = StObject.set(x, "ride", value.asInstanceOf[js.Any])
  }
}
