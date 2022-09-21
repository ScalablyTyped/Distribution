package typings.nivoLegends.anon

import typings.nivoLegends.nivoLegendsStrings.`text-before-edge`
import typings.nivoLegends.nivoLegendsStrings.alphabetic
import typings.nivoLegends.nivoLegendsStrings.central
import typings.nivoLegends.nivoLegendsStrings.end
import typings.nivoLegends.nivoLegendsStrings.middle
import typings.nivoLegends.nivoLegendsStrings.start
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait LabelAlignment extends StObject {
  
  var labelAlignment: alphabetic | central | `text-before-edge`
  
  var labelAnchor: start | middle | end
  
  var labelX: Double
  
  var labelY: Double
  
  var symbolX: Double
  
  var symbolY: Double
}
object LabelAlignment {
  
  inline def apply(
    labelAlignment: alphabetic | central | `text-before-edge`,
    labelAnchor: start | middle | end,
    labelX: Double,
    labelY: Double,
    symbolX: Double,
    symbolY: Double
  ): LabelAlignment = {
    val __obj = js.Dynamic.literal(labelAlignment = labelAlignment.asInstanceOf[js.Any], labelAnchor = labelAnchor.asInstanceOf[js.Any], labelX = labelX.asInstanceOf[js.Any], labelY = labelY.asInstanceOf[js.Any], symbolX = symbolX.asInstanceOf[js.Any], symbolY = symbolY.asInstanceOf[js.Any])
    __obj.asInstanceOf[LabelAlignment]
  }
  
  extension [Self <: LabelAlignment](x: Self) {
    
    inline def setLabelAlignment(value: alphabetic | central | `text-before-edge`): Self = StObject.set(x, "labelAlignment", value.asInstanceOf[js.Any])
    
    inline def setLabelAnchor(value: start | middle | end): Self = StObject.set(x, "labelAnchor", value.asInstanceOf[js.Any])
    
    inline def setLabelX(value: Double): Self = StObject.set(x, "labelX", value.asInstanceOf[js.Any])
    
    inline def setLabelY(value: Double): Self = StObject.set(x, "labelY", value.asInstanceOf[js.Any])
    
    inline def setSymbolX(value: Double): Self = StObject.set(x, "symbolX", value.asInstanceOf[js.Any])
    
    inline def setSymbolY(value: Double): Self = StObject.set(x, "symbolY", value.asInstanceOf[js.Any])
  }
}
