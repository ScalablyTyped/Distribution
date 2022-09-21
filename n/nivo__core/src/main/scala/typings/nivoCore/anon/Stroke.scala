package typings.nivoCore.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Stroke extends StObject {
  
  var stroke: String
  
  var strokeDasharray: String
  
  var strokeOpacity: Double
  
  var strokeWidth: Double
}
object Stroke {
  
  inline def apply(stroke: String, strokeDasharray: String, strokeOpacity: Double, strokeWidth: Double): Stroke = {
    val __obj = js.Dynamic.literal(stroke = stroke.asInstanceOf[js.Any], strokeDasharray = strokeDasharray.asInstanceOf[js.Any], strokeOpacity = strokeOpacity.asInstanceOf[js.Any], strokeWidth = strokeWidth.asInstanceOf[js.Any])
    __obj.asInstanceOf[Stroke]
  }
  
  extension [Self <: Stroke](x: Self) {
    
    inline def setStroke(value: String): Self = StObject.set(x, "stroke", value.asInstanceOf[js.Any])
    
    inline def setStrokeDasharray(value: String): Self = StObject.set(x, "strokeDasharray", value.asInstanceOf[js.Any])
    
    inline def setStrokeOpacity(value: Double): Self = StObject.set(x, "strokeOpacity", value.asInstanceOf[js.Any])
    
    inline def setStrokeWidth(value: Double): Self = StObject.set(x, "strokeWidth", value.asInstanceOf[js.Any])
  }
}
