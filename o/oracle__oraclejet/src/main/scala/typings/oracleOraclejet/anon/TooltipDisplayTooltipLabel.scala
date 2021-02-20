package typings.oracleOraclejet.anon

import typings.oracleOraclejet.oracleOraclejetStrings.auto
import typings.oracleOraclejet.oracleOraclejetStrings.off
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait TooltipDisplayTooltipLabel extends StObject {
  
  var tooltipDisplay: js.UndefOr[off | auto] = js.native
  
  var tooltipLabel: js.UndefOr[String] = js.native
}
object TooltipDisplayTooltipLabel {
  
  @scala.inline
  def apply(): TooltipDisplayTooltipLabel = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[TooltipDisplayTooltipLabel]
  }
  
  @scala.inline
  implicit class TooltipDisplayTooltipLabelMutableBuilder[Self <: TooltipDisplayTooltipLabel] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setTooltipDisplay(value: off | auto): Self = StObject.set(x, "tooltipDisplay", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTooltipDisplayUndefined: Self = StObject.set(x, "tooltipDisplay", js.undefined)
    
    @scala.inline
    def setTooltipLabel(value: String): Self = StObject.set(x, "tooltipLabel", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTooltipLabelUndefined: Self = StObject.set(x, "tooltipLabel", js.undefined)
  }
}
