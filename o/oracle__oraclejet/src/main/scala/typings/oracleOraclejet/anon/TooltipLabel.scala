package typings.oracleOraclejet.anon

import typings.oracleOraclejet.oracleOraclejetStrings.auto
import typings.oracleOraclejet.oracleOraclejetStrings.off
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait TooltipLabel extends StObject {
  
  var tooltipDisplay: off | auto = js.native
  
  var tooltipLabel: String = js.native
}
object TooltipLabel {
  
  @scala.inline
  def apply(tooltipDisplay: off | auto, tooltipLabel: String): TooltipLabel = {
    val __obj = js.Dynamic.literal(tooltipDisplay = tooltipDisplay.asInstanceOf[js.Any], tooltipLabel = tooltipLabel.asInstanceOf[js.Any])
    __obj.asInstanceOf[TooltipLabel]
  }
  
  @scala.inline
  implicit class TooltipLabelMutableBuilder[Self <: TooltipLabel] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setTooltipDisplay(value: off | auto): Self = StObject.set(x, "tooltipDisplay", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTooltipLabel(value: String): Self = StObject.set(x, "tooltipLabel", value.asInstanceOf[js.Any])
  }
}
