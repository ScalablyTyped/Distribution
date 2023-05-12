package typings.nivoArcs.anon

import typings.reactSpringCore.mod.Interpolation
import typings.reactSpringCore.mod.SpringValue
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait OuterRadius extends StObject {
  
  var endAngle: SpringValue[Double]
  
  var innerRadius: SpringValue[Double]
  
  var outerRadius: SpringValue[Double]
  
  var path: Interpolation[String | Null, Any]
  
  var startAngle: SpringValue[Double]
}
object OuterRadius {
  
  inline def apply(
    endAngle: SpringValue[Double],
    innerRadius: SpringValue[Double],
    outerRadius: SpringValue[Double],
    path: Interpolation[String | Null, Any],
    startAngle: SpringValue[Double]
  ): OuterRadius = {
    val __obj = js.Dynamic.literal(endAngle = endAngle.asInstanceOf[js.Any], innerRadius = innerRadius.asInstanceOf[js.Any], outerRadius = outerRadius.asInstanceOf[js.Any], path = path.asInstanceOf[js.Any], startAngle = startAngle.asInstanceOf[js.Any])
    __obj.asInstanceOf[OuterRadius]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: OuterRadius] (val x: Self) extends AnyVal {
    
    inline def setEndAngle(value: SpringValue[Double]): Self = StObject.set(x, "endAngle", value.asInstanceOf[js.Any])
    
    inline def setInnerRadius(value: SpringValue[Double]): Self = StObject.set(x, "innerRadius", value.asInstanceOf[js.Any])
    
    inline def setOuterRadius(value: SpringValue[Double]): Self = StObject.set(x, "outerRadius", value.asInstanceOf[js.Any])
    
    inline def setPath(value: Interpolation[String | Null, Any]): Self = StObject.set(x, "path", value.asInstanceOf[js.Any])
    
    inline def setStartAngle(value: SpringValue[Double]): Self = StObject.set(x, "startAngle", value.asInstanceOf[js.Any])
  }
}
