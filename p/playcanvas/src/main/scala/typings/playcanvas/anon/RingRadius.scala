package typings.playcanvas.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait RingRadius extends StObject {
  
  var calculateTangents: js.UndefOr[Boolean] = js.undefined
  
  var ringRadius: js.UndefOr[Double] = js.undefined
  
  var segments: js.UndefOr[Double] = js.undefined
  
  var sides: js.UndefOr[Double] = js.undefined
  
  var tubeRadius: js.UndefOr[Double] = js.undefined
}
object RingRadius {
  
  inline def apply(): RingRadius = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[RingRadius]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: RingRadius] (val x: Self) extends AnyVal {
    
    inline def setCalculateTangents(value: Boolean): Self = StObject.set(x, "calculateTangents", value.asInstanceOf[js.Any])
    
    inline def setCalculateTangentsUndefined: Self = StObject.set(x, "calculateTangents", js.undefined)
    
    inline def setRingRadius(value: Double): Self = StObject.set(x, "ringRadius", value.asInstanceOf[js.Any])
    
    inline def setRingRadiusUndefined: Self = StObject.set(x, "ringRadius", js.undefined)
    
    inline def setSegments(value: Double): Self = StObject.set(x, "segments", value.asInstanceOf[js.Any])
    
    inline def setSegmentsUndefined: Self = StObject.set(x, "segments", js.undefined)
    
    inline def setSides(value: Double): Self = StObject.set(x, "sides", value.asInstanceOf[js.Any])
    
    inline def setSidesUndefined: Self = StObject.set(x, "sides", js.undefined)
    
    inline def setTubeRadius(value: Double): Self = StObject.set(x, "tubeRadius", value.asInstanceOf[js.Any])
    
    inline def setTubeRadiusUndefined: Self = StObject.set(x, "tubeRadius", js.undefined)
  }
}
