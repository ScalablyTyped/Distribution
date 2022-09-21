package typings.openrct2.mod.global

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait RideRatingsCalculateArgs extends StObject {
  
  var excitement: Double
  
  var intensity: Double
  
  var nausea: Double
  
  val rideId: Double
}
object RideRatingsCalculateArgs {
  
  inline def apply(excitement: Double, intensity: Double, nausea: Double, rideId: Double): RideRatingsCalculateArgs = {
    val __obj = js.Dynamic.literal(excitement = excitement.asInstanceOf[js.Any], intensity = intensity.asInstanceOf[js.Any], nausea = nausea.asInstanceOf[js.Any], rideId = rideId.asInstanceOf[js.Any])
    __obj.asInstanceOf[RideRatingsCalculateArgs]
  }
  
  extension [Self <: RideRatingsCalculateArgs](x: Self) {
    
    inline def setExcitement(value: Double): Self = StObject.set(x, "excitement", value.asInstanceOf[js.Any])
    
    inline def setIntensity(value: Double): Self = StObject.set(x, "intensity", value.asInstanceOf[js.Any])
    
    inline def setNausea(value: Double): Self = StObject.set(x, "nausea", value.asInstanceOf[js.Any])
    
    inline def setRideId(value: Double): Self = StObject.set(x, "rideId", value.asInstanceOf[js.Any])
  }
}
