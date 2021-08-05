package typings.plotlyJs.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait PlotCoordinate extends StObject {
  
  var pointNumber: Double
  
  var x: Double
  
  var y: Double
}
object PlotCoordinate {
  
  inline def apply(pointNumber: Double, x: Double, y: Double): PlotCoordinate = {
    val __obj = js.Dynamic.literal(pointNumber = pointNumber.asInstanceOf[js.Any], x = x.asInstanceOf[js.Any], y = y.asInstanceOf[js.Any])
    __obj.asInstanceOf[PlotCoordinate]
  }
  
  extension [Self <: PlotCoordinate](x: Self) {
    
    inline def setPointNumber(value: Double): Self = StObject.set(x, "pointNumber", value.asInstanceOf[js.Any])
    
    inline def setX(value: Double): Self = StObject.set(x, "x", value.asInstanceOf[js.Any])
    
    inline def setY(value: Double): Self = StObject.set(x, "y", value.asInstanceOf[js.Any])
  }
}
