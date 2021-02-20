package typings.opentypeJs.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Metrics extends StObject {
  
  var leftSideBearing: Double = js.native
  
  var rightSideBearing: js.UndefOr[Double] = js.native
  
  var xMax: Double = js.native
  
  var xMin: Double = js.native
  
  var yMax: Double = js.native
  
  var yMin: Double = js.native
}
object Metrics {
  
  @scala.inline
  def apply(leftSideBearing: Double, xMax: Double, xMin: Double, yMax: Double, yMin: Double): Metrics = {
    val __obj = js.Dynamic.literal(leftSideBearing = leftSideBearing.asInstanceOf[js.Any], xMax = xMax.asInstanceOf[js.Any], xMin = xMin.asInstanceOf[js.Any], yMax = yMax.asInstanceOf[js.Any], yMin = yMin.asInstanceOf[js.Any])
    __obj.asInstanceOf[Metrics]
  }
  
  @scala.inline
  implicit class MetricsMutableBuilder[Self <: Metrics] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setLeftSideBearing(value: Double): Self = StObject.set(x, "leftSideBearing", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRightSideBearing(value: Double): Self = StObject.set(x, "rightSideBearing", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRightSideBearingUndefined: Self = StObject.set(x, "rightSideBearing", js.undefined)
    
    @scala.inline
    def setXMax(value: Double): Self = StObject.set(x, "xMax", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setXMin(value: Double): Self = StObject.set(x, "xMin", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setYMax(value: Double): Self = StObject.set(x, "yMax", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setYMin(value: Double): Self = StObject.set(x, "yMin", value.asInstanceOf[js.Any])
  }
}
