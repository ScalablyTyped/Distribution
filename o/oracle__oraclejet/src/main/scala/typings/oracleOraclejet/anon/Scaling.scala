package typings.oracleOraclejet.anon

import typings.oracleOraclejet.oracleOraclejetStrings.auto
import typings.oracleOraclejet.oracleOraclejetStrings.billion
import typings.oracleOraclejet.oracleOraclejetStrings.million
import typings.oracleOraclejet.oracleOraclejetStrings.none
import typings.oracleOraclejet.oracleOraclejetStrings.off
import typings.oracleOraclejet.oracleOraclejetStrings.quadrillion
import typings.oracleOraclejet.oracleOraclejetStrings.thousand
import typings.oracleOraclejet.oracleOraclejetStrings.trillion
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Scaling extends StObject {
  
  var converter: js.Object = js.native
  
  var scaling: none | thousand | million | billion | trillion | quadrillion | auto = js.native
  
  var tooltipDisplay: off | auto = js.native
  
  var tooltipLabel: String = js.native
}
object Scaling {
  
  @scala.inline
  def apply(
    converter: js.Object,
    scaling: none | thousand | million | billion | trillion | quadrillion | auto,
    tooltipDisplay: off | auto,
    tooltipLabel: String
  ): Scaling = {
    val __obj = js.Dynamic.literal(converter = converter.asInstanceOf[js.Any], scaling = scaling.asInstanceOf[js.Any], tooltipDisplay = tooltipDisplay.asInstanceOf[js.Any], tooltipLabel = tooltipLabel.asInstanceOf[js.Any])
    __obj.asInstanceOf[Scaling]
  }
  
  @scala.inline
  implicit class ScalingMutableBuilder[Self <: Scaling] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setConverter(value: js.Object): Self = StObject.set(x, "converter", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setScaling(value: none | thousand | million | billion | trillion | quadrillion | auto): Self = StObject.set(x, "scaling", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTooltipDisplay(value: off | auto): Self = StObject.set(x, "tooltipDisplay", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTooltipLabel(value: String): Self = StObject.set(x, "tooltipLabel", value.asInstanceOf[js.Any])
  }
}
