package typings.nivoBar.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Color extends StObject {
  
  var borderColor: String
  
  var color: String
  
  var height: Double
  
  var labelColor: String
  
  var labelOpacity: Double
  
  var labelX: Double
  
  var labelY: Double
  
  var opacity: Double
  
  var transform: String
  
  var width: Double
}
object Color {
  
  inline def apply(
    borderColor: String,
    color: String,
    height: Double,
    labelColor: String,
    labelOpacity: Double,
    labelX: Double,
    labelY: Double,
    opacity: Double,
    transform: String,
    width: Double
  ): Color = {
    val __obj = js.Dynamic.literal(borderColor = borderColor.asInstanceOf[js.Any], color = color.asInstanceOf[js.Any], height = height.asInstanceOf[js.Any], labelColor = labelColor.asInstanceOf[js.Any], labelOpacity = labelOpacity.asInstanceOf[js.Any], labelX = labelX.asInstanceOf[js.Any], labelY = labelY.asInstanceOf[js.Any], opacity = opacity.asInstanceOf[js.Any], transform = transform.asInstanceOf[js.Any], width = width.asInstanceOf[js.Any])
    __obj.asInstanceOf[Color]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: Color] (val x: Self) extends AnyVal {
    
    inline def setBorderColor(value: String): Self = StObject.set(x, "borderColor", value.asInstanceOf[js.Any])
    
    inline def setColor(value: String): Self = StObject.set(x, "color", value.asInstanceOf[js.Any])
    
    inline def setHeight(value: Double): Self = StObject.set(x, "height", value.asInstanceOf[js.Any])
    
    inline def setLabelColor(value: String): Self = StObject.set(x, "labelColor", value.asInstanceOf[js.Any])
    
    inline def setLabelOpacity(value: Double): Self = StObject.set(x, "labelOpacity", value.asInstanceOf[js.Any])
    
    inline def setLabelX(value: Double): Self = StObject.set(x, "labelX", value.asInstanceOf[js.Any])
    
    inline def setLabelY(value: Double): Self = StObject.set(x, "labelY", value.asInstanceOf[js.Any])
    
    inline def setOpacity(value: Double): Self = StObject.set(x, "opacity", value.asInstanceOf[js.Any])
    
    inline def setTransform(value: String): Self = StObject.set(x, "transform", value.asInstanceOf[js.Any])
    
    inline def setWidth(value: Double): Self = StObject.set(x, "width", value.asInstanceOf[js.Any])
  }
}
