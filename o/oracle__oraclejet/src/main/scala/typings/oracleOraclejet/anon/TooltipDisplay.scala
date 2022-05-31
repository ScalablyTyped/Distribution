package typings.oracleOraclejet.anon

import typings.oracleOraclejet.oracleOraclejetStrings.auto
import typings.oracleOraclejet.oracleOraclejetStrings.off
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait TooltipDisplay extends StObject {
  
  var tooltipDisplay: off | auto
  
  var tooltipLabel: String | js.Array[String]
}
object TooltipDisplay {
  
  inline def apply(tooltipDisplay: off | auto, tooltipLabel: String | js.Array[String]): TooltipDisplay = {
    val __obj = js.Dynamic.literal(tooltipDisplay = tooltipDisplay.asInstanceOf[js.Any], tooltipLabel = tooltipLabel.asInstanceOf[js.Any])
    __obj.asInstanceOf[TooltipDisplay]
  }
  
  extension [Self <: TooltipDisplay](x: Self) {
    
    inline def setTooltipDisplay(value: off | auto): Self = StObject.set(x, "tooltipDisplay", value.asInstanceOf[js.Any])
    
    inline def setTooltipLabel(value: String | js.Array[String]): Self = StObject.set(x, "tooltipLabel", value.asInstanceOf[js.Any])
    
    inline def setTooltipLabelVarargs(value: String*): Self = StObject.set(x, "tooltipLabel", js.Array(value :_*))
  }
}
