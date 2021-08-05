package typings.navermaps.naver.maps

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait PanoramaPov extends StObject {
  
  var fov: Double
  
  var pan: Double
  
  var tilt: Double
}
object PanoramaPov {
  
  inline def apply(fov: Double, pan: Double, tilt: Double): PanoramaPov = {
    val __obj = js.Dynamic.literal(fov = fov.asInstanceOf[js.Any], pan = pan.asInstanceOf[js.Any], tilt = tilt.asInstanceOf[js.Any])
    __obj.asInstanceOf[PanoramaPov]
  }
  
  extension [Self <: PanoramaPov](x: Self) {
    
    inline def setFov(value: Double): Self = StObject.set(x, "fov", value.asInstanceOf[js.Any])
    
    inline def setPan(value: Double): Self = StObject.set(x, "pan", value.asInstanceOf[js.Any])
    
    inline def setTilt(value: Double): Self = StObject.set(x, "tilt", value.asInstanceOf[js.Any])
  }
}
