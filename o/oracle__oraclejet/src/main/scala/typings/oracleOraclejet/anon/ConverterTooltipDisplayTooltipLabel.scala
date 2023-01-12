package typings.oracleOraclejet.anon

import typings.oracleOraclejet.oracleOraclejetStrings.auto
import typings.oracleOraclejet.oracleOraclejetStrings.off
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ConverterTooltipDisplayTooltipLabel extends StObject {
  
  var converter: js.UndefOr[typings.oracleOraclejet.ojvalidationBaseMod.Converter[Double]] = js.undefined
  
  var tooltipDisplay: js.UndefOr[off | auto] = js.undefined
  
  var tooltipLabel: js.UndefOr[String] = js.undefined
}
object ConverterTooltipDisplayTooltipLabel {
  
  inline def apply(): ConverterTooltipDisplayTooltipLabel = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ConverterTooltipDisplayTooltipLabel]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: ConverterTooltipDisplayTooltipLabel] (val x: Self) extends AnyVal {
    
    inline def setConverter(value: typings.oracleOraclejet.ojvalidationBaseMod.Converter[Double]): Self = StObject.set(x, "converter", value.asInstanceOf[js.Any])
    
    inline def setConverterUndefined: Self = StObject.set(x, "converter", js.undefined)
    
    inline def setTooltipDisplay(value: off | auto): Self = StObject.set(x, "tooltipDisplay", value.asInstanceOf[js.Any])
    
    inline def setTooltipDisplayUndefined: Self = StObject.set(x, "tooltipDisplay", js.undefined)
    
    inline def setTooltipLabel(value: String): Self = StObject.set(x, "tooltipLabel", value.asInstanceOf[js.Any])
    
    inline def setTooltipLabelUndefined: Self = StObject.set(x, "tooltipLabel", js.undefined)
  }
}
