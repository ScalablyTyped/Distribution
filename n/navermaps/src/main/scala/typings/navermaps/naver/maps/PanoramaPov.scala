package typings.navermaps.naver.maps

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait PanoramaPov extends StObject {
  
  var fov: js.UndefOr[Double] = js.undefined
  
  var pan: js.UndefOr[Double] = js.undefined
  
  var tilt: js.UndefOr[Double] = js.undefined
}
object PanoramaPov {
  
  inline def apply(): PanoramaPov = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PanoramaPov]
  }
  
  extension [Self <: PanoramaPov](x: Self) {
    
    inline def setFov(value: Double): Self = StObject.set(x, "fov", value.asInstanceOf[js.Any])
    
    inline def setFovUndefined: Self = StObject.set(x, "fov", js.undefined)
    
    inline def setPan(value: Double): Self = StObject.set(x, "pan", value.asInstanceOf[js.Any])
    
    inline def setPanUndefined: Self = StObject.set(x, "pan", js.undefined)
    
    inline def setTilt(value: Double): Self = StObject.set(x, "tilt", value.asInstanceOf[js.Any])
    
    inline def setTiltUndefined: Self = StObject.set(x, "tilt", js.undefined)
  }
}
