package typings.opentypeJs.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Metrics extends StObject {
  
  var leftSideBearing: Double
  
  var rightSideBearing: js.UndefOr[Double] = js.undefined
  
  var xMax: Double
  
  var xMin: Double
  
  var yMax: Double
  
  var yMin: Double
}
object Metrics {
  
  inline def apply(leftSideBearing: Double, xMax: Double, xMin: Double, yMax: Double, yMin: Double): Metrics = {
    val __obj = js.Dynamic.literal(leftSideBearing = leftSideBearing.asInstanceOf[js.Any], xMax = xMax.asInstanceOf[js.Any], xMin = xMin.asInstanceOf[js.Any], yMax = yMax.asInstanceOf[js.Any], yMin = yMin.asInstanceOf[js.Any])
    __obj.asInstanceOf[Metrics]
  }
  
  extension [Self <: Metrics](x: Self) {
    
    inline def setLeftSideBearing(value: Double): Self = StObject.set(x, "leftSideBearing", value.asInstanceOf[js.Any])
    
    inline def setRightSideBearing(value: Double): Self = StObject.set(x, "rightSideBearing", value.asInstanceOf[js.Any])
    
    inline def setRightSideBearingUndefined: Self = StObject.set(x, "rightSideBearing", js.undefined)
    
    inline def setXMax(value: Double): Self = StObject.set(x, "xMax", value.asInstanceOf[js.Any])
    
    inline def setXMin(value: Double): Self = StObject.set(x, "xMin", value.asInstanceOf[js.Any])
    
    inline def setYMax(value: Double): Self = StObject.set(x, "yMax", value.asInstanceOf[js.Any])
    
    inline def setYMin(value: Double): Self = StObject.set(x, "yMin", value.asInstanceOf[js.Any])
  }
}
