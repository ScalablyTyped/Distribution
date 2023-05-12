package typings.nivoArcs.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait InnerRadius extends StObject {
  
  var diagonalLength: Double
  
  var endAngle: Double
  
  var innerRadius: Double
  
  var linkColor: String
  
  var offset: Double
  
  var opacity: Double
  
  var outerRadius: Double
  
  var startAngle: Double
  
  var straightLength: Double
  
  var textColor: String
  
  var textOffset: Double
}
object InnerRadius {
  
  inline def apply(
    diagonalLength: Double,
    endAngle: Double,
    innerRadius: Double,
    linkColor: String,
    offset: Double,
    opacity: Double,
    outerRadius: Double,
    startAngle: Double,
    straightLength: Double,
    textColor: String,
    textOffset: Double
  ): InnerRadius = {
    val __obj = js.Dynamic.literal(diagonalLength = diagonalLength.asInstanceOf[js.Any], endAngle = endAngle.asInstanceOf[js.Any], innerRadius = innerRadius.asInstanceOf[js.Any], linkColor = linkColor.asInstanceOf[js.Any], offset = offset.asInstanceOf[js.Any], opacity = opacity.asInstanceOf[js.Any], outerRadius = outerRadius.asInstanceOf[js.Any], startAngle = startAngle.asInstanceOf[js.Any], straightLength = straightLength.asInstanceOf[js.Any], textColor = textColor.asInstanceOf[js.Any], textOffset = textOffset.asInstanceOf[js.Any])
    __obj.asInstanceOf[InnerRadius]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: InnerRadius] (val x: Self) extends AnyVal {
    
    inline def setDiagonalLength(value: Double): Self = StObject.set(x, "diagonalLength", value.asInstanceOf[js.Any])
    
    inline def setEndAngle(value: Double): Self = StObject.set(x, "endAngle", value.asInstanceOf[js.Any])
    
    inline def setInnerRadius(value: Double): Self = StObject.set(x, "innerRadius", value.asInstanceOf[js.Any])
    
    inline def setLinkColor(value: String): Self = StObject.set(x, "linkColor", value.asInstanceOf[js.Any])
    
    inline def setOffset(value: Double): Self = StObject.set(x, "offset", value.asInstanceOf[js.Any])
    
    inline def setOpacity(value: Double): Self = StObject.set(x, "opacity", value.asInstanceOf[js.Any])
    
    inline def setOuterRadius(value: Double): Self = StObject.set(x, "outerRadius", value.asInstanceOf[js.Any])
    
    inline def setStartAngle(value: Double): Self = StObject.set(x, "startAngle", value.asInstanceOf[js.Any])
    
    inline def setStraightLength(value: Double): Self = StObject.set(x, "straightLength", value.asInstanceOf[js.Any])
    
    inline def setTextColor(value: String): Self = StObject.set(x, "textColor", value.asInstanceOf[js.Any])
    
    inline def setTextOffset(value: Double): Self = StObject.set(x, "textOffset", value.asInstanceOf[js.Any])
  }
}
