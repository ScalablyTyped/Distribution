package typings.nivoArcs.anon

import typings.nivoArcs.nivoArcsStrings.end
import typings.nivoArcs.nivoArcsStrings.start
import typings.reactSpringWeb.mod.Interpolation
import typings.reactSpringWeb.mod.SpringValue
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait LinkColor extends StObject {
  
  var linkColor: SpringValue[String]
  
  var opacity: SpringValue[Double]
  
  var path: Interpolation[String, Any]
  
  var textAnchor: Interpolation[start | end, Any]
  
  var textColor: SpringValue[String]
  
  var textPosition: Interpolation[String, Any]
  
  var thickness: Double
}
object LinkColor {
  
  inline def apply(
    linkColor: SpringValue[String],
    opacity: SpringValue[Double],
    path: Interpolation[String, Any],
    textAnchor: Interpolation[start | end, Any],
    textColor: SpringValue[String],
    textPosition: Interpolation[String, Any],
    thickness: Double
  ): LinkColor = {
    val __obj = js.Dynamic.literal(linkColor = linkColor.asInstanceOf[js.Any], opacity = opacity.asInstanceOf[js.Any], path = path.asInstanceOf[js.Any], textAnchor = textAnchor.asInstanceOf[js.Any], textColor = textColor.asInstanceOf[js.Any], textPosition = textPosition.asInstanceOf[js.Any], thickness = thickness.asInstanceOf[js.Any])
    __obj.asInstanceOf[LinkColor]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: LinkColor] (val x: Self) extends AnyVal {
    
    inline def setLinkColor(value: SpringValue[String]): Self = StObject.set(x, "linkColor", value.asInstanceOf[js.Any])
    
    inline def setOpacity(value: SpringValue[Double]): Self = StObject.set(x, "opacity", value.asInstanceOf[js.Any])
    
    inline def setPath(value: Interpolation[String, Any]): Self = StObject.set(x, "path", value.asInstanceOf[js.Any])
    
    inline def setTextAnchor(value: Interpolation[start | end, Any]): Self = StObject.set(x, "textAnchor", value.asInstanceOf[js.Any])
    
    inline def setTextColor(value: SpringValue[String]): Self = StObject.set(x, "textColor", value.asInstanceOf[js.Any])
    
    inline def setTextPosition(value: Interpolation[String, Any]): Self = StObject.set(x, "textPosition", value.asInstanceOf[js.Any])
    
    inline def setThickness(value: Double): Self = StObject.set(x, "thickness", value.asInstanceOf[js.Any])
  }
}
