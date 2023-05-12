package typings.nivoArcs.anon

import typings.reactSpringWeb.mod.Interpolation
import typings.reactSpringWeb.mod.SpringValue
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait BorderColor extends StObject {
  
  var borderColor: SpringValue[String]
  
  var borderWidth: Double
  
  var color: SpringValue[String]
  
  var opacity: SpringValue[Double]
  
  var path: Interpolation[String, Any]
}
object BorderColor {
  
  inline def apply(
    borderColor: SpringValue[String],
    borderWidth: Double,
    color: SpringValue[String],
    opacity: SpringValue[Double],
    path: Interpolation[String, Any]
  ): BorderColor = {
    val __obj = js.Dynamic.literal(borderColor = borderColor.asInstanceOf[js.Any], borderWidth = borderWidth.asInstanceOf[js.Any], color = color.asInstanceOf[js.Any], opacity = opacity.asInstanceOf[js.Any], path = path.asInstanceOf[js.Any])
    __obj.asInstanceOf[BorderColor]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: BorderColor] (val x: Self) extends AnyVal {
    
    inline def setBorderColor(value: SpringValue[String]): Self = StObject.set(x, "borderColor", value.asInstanceOf[js.Any])
    
    inline def setBorderWidth(value: Double): Self = StObject.set(x, "borderWidth", value.asInstanceOf[js.Any])
    
    inline def setColor(value: SpringValue[String]): Self = StObject.set(x, "color", value.asInstanceOf[js.Any])
    
    inline def setOpacity(value: SpringValue[Double]): Self = StObject.set(x, "opacity", value.asInstanceOf[js.Any])
    
    inline def setPath(value: Interpolation[String, Any]): Self = StObject.set(x, "path", value.asInstanceOf[js.Any])
  }
}
