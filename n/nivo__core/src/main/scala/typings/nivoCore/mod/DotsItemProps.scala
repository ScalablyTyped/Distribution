package typings.nivoCore.mod

import typings.nivoCore.nivoCoreStrings.end
import typings.nivoCore.nivoCoreStrings.middle
import typings.nivoCore.nivoCoreStrings.start
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DotsItemProps[D] extends StObject {
  
  var borderColor: String
  
  var borderWidth: Double
  
  var color: String
  
  var datum: D
  
  var label: js.UndefOr[String | Double] = js.undefined
  
  var labelTextAnchor: js.UndefOr[start | middle | end] = js.undefined
  
  var labelYOffset: js.UndefOr[Double] = js.undefined
  
  var size: Double
  
  var symbol: js.UndefOr[DotsItemSymbolComponent] = js.undefined
  
  var x: Double
  
  var y: Double
}
object DotsItemProps {
  
  inline def apply[D](
    borderColor: String,
    borderWidth: Double,
    color: String,
    datum: D,
    size: Double,
    x: Double,
    y: Double
  ): DotsItemProps[D] = {
    val __obj = js.Dynamic.literal(borderColor = borderColor.asInstanceOf[js.Any], borderWidth = borderWidth.asInstanceOf[js.Any], color = color.asInstanceOf[js.Any], datum = datum.asInstanceOf[js.Any], size = size.asInstanceOf[js.Any], x = x.asInstanceOf[js.Any], y = y.asInstanceOf[js.Any])
    __obj.asInstanceOf[DotsItemProps[D]]
  }
  
  extension [Self <: DotsItemProps[?], D](x: Self & DotsItemProps[D]) {
    
    inline def setBorderColor(value: String): Self = StObject.set(x, "borderColor", value.asInstanceOf[js.Any])
    
    inline def setBorderWidth(value: Double): Self = StObject.set(x, "borderWidth", value.asInstanceOf[js.Any])
    
    inline def setColor(value: String): Self = StObject.set(x, "color", value.asInstanceOf[js.Any])
    
    inline def setDatum(value: D): Self = StObject.set(x, "datum", value.asInstanceOf[js.Any])
    
    inline def setLabel(value: String | Double): Self = StObject.set(x, "label", value.asInstanceOf[js.Any])
    
    inline def setLabelTextAnchor(value: start | middle | end): Self = StObject.set(x, "labelTextAnchor", value.asInstanceOf[js.Any])
    
    inline def setLabelTextAnchorUndefined: Self = StObject.set(x, "labelTextAnchor", js.undefined)
    
    inline def setLabelUndefined: Self = StObject.set(x, "label", js.undefined)
    
    inline def setLabelYOffset(value: Double): Self = StObject.set(x, "labelYOffset", value.asInstanceOf[js.Any])
    
    inline def setLabelYOffsetUndefined: Self = StObject.set(x, "labelYOffset", js.undefined)
    
    inline def setSize(value: Double): Self = StObject.set(x, "size", value.asInstanceOf[js.Any])
    
    inline def setSymbol(value: DotsItemSymbolComponent): Self = StObject.set(x, "symbol", value.asInstanceOf[js.Any])
    
    inline def setSymbolUndefined: Self = StObject.set(x, "symbol", js.undefined)
    
    inline def setX(value: Double): Self = StObject.set(x, "x", value.asInstanceOf[js.Any])
    
    inline def setY(value: Double): Self = StObject.set(x, "y", value.asInstanceOf[js.Any])
  }
}
