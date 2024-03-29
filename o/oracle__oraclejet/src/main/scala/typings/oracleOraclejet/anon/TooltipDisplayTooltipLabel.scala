package typings.oracleOraclejet.anon

import typings.oracleOraclejet.oracleOraclejetStrings.auto
import typings.oracleOraclejet.oracleOraclejetStrings.off
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait TooltipDisplayTooltipLabel extends StObject {
  
  var tooltipDisplay: js.UndefOr[off | auto] = js.undefined
  
  var tooltipLabel: js.UndefOr[String] = js.undefined
}
object TooltipDisplayTooltipLabel {
  
  inline def apply(): TooltipDisplayTooltipLabel = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[TooltipDisplayTooltipLabel]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: TooltipDisplayTooltipLabel] (val x: Self) extends AnyVal {
    
    inline def setTooltipDisplay(value: off | auto): Self = StObject.set(x, "tooltipDisplay", value.asInstanceOf[js.Any])
    
    inline def setTooltipDisplayUndefined: Self = StObject.set(x, "tooltipDisplay", js.undefined)
    
    inline def setTooltipLabel(value: String): Self = StObject.set(x, "tooltipLabel", value.asInstanceOf[js.Any])
    
    inline def setTooltipLabelUndefined: Self = StObject.set(x, "tooltipLabel", js.undefined)
  }
}
