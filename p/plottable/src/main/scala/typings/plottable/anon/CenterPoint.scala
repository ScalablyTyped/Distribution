package typings.plottable.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait CenterPoint extends StObject {
  
  var centerPoint: Double
  
  var zoomAmount: Double
}
object CenterPoint {
  
  inline def apply(centerPoint: Double, zoomAmount: Double): CenterPoint = {
    val __obj = js.Dynamic.literal(centerPoint = centerPoint.asInstanceOf[js.Any], zoomAmount = zoomAmount.asInstanceOf[js.Any])
    __obj.asInstanceOf[CenterPoint]
  }
  
  extension [Self <: CenterPoint](x: Self) {
    
    inline def setCenterPoint(value: Double): Self = StObject.set(x, "centerPoint", value.asInstanceOf[js.Any])
    
    inline def setZoomAmount(value: Double): Self = StObject.set(x, "zoomAmount", value.asInstanceOf[js.Any])
  }
}
