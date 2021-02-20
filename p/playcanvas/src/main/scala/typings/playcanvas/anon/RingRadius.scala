package typings.playcanvas.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait RingRadius extends StObject {
  
  var ringRadius: js.UndefOr[Double] = js.native
  
  var segments: js.UndefOr[Double] = js.native
  
  var sides: js.UndefOr[Double] = js.native
  
  var tubeRadius: js.UndefOr[Double] = js.native
}
object RingRadius {
  
  @scala.inline
  def apply(): RingRadius = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[RingRadius]
  }
  
  @scala.inline
  implicit class RingRadiusMutableBuilder[Self <: RingRadius] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setRingRadius(value: Double): Self = StObject.set(x, "ringRadius", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRingRadiusUndefined: Self = StObject.set(x, "ringRadius", js.undefined)
    
    @scala.inline
    def setSegments(value: Double): Self = StObject.set(x, "segments", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSegmentsUndefined: Self = StObject.set(x, "segments", js.undefined)
    
    @scala.inline
    def setSides(value: Double): Self = StObject.set(x, "sides", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSidesUndefined: Self = StObject.set(x, "sides", js.undefined)
    
    @scala.inline
    def setTubeRadius(value: Double): Self = StObject.set(x, "tubeRadius", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTubeRadiusUndefined: Self = StObject.set(x, "tubeRadius", js.undefined)
  }
}
