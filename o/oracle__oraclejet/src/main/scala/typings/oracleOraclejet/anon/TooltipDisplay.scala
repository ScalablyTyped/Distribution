package typings.oracleOraclejet.anon

import typings.oracleOraclejet.oracleOraclejetStrings.auto
import typings.oracleOraclejet.oracleOraclejetStrings.off
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait TooltipDisplay extends StObject {
  
  var tooltipDisplay: off | auto = js.native
  
  var tooltipLabel: String | js.Array[String] = js.native
}
object TooltipDisplay {
  
  @scala.inline
  def apply(tooltipDisplay: off | auto, tooltipLabel: String | js.Array[String]): TooltipDisplay = {
    val __obj = js.Dynamic.literal(tooltipDisplay = tooltipDisplay.asInstanceOf[js.Any], tooltipLabel = tooltipLabel.asInstanceOf[js.Any])
    __obj.asInstanceOf[TooltipDisplay]
  }
  
  @scala.inline
  implicit class TooltipDisplayMutableBuilder[Self <: TooltipDisplay] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setTooltipDisplay(value: off | auto): Self = StObject.set(x, "tooltipDisplay", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTooltipLabel(value: String | js.Array[String]): Self = StObject.set(x, "tooltipLabel", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTooltipLabelVarargs(value: String*): Self = StObject.set(x, "tooltipLabel", js.Array(value :_*))
  }
}
