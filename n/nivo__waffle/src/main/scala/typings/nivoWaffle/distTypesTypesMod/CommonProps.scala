package typings.nivoWaffle.distTypesTypesMod

import typings.nivoColors.distTypesInheritedColorMod.InheritedColorConfig
import typings.nivoColors.distTypesScalesOrdinalColorScaleMod.OrdinalColorScaleConfig
import typings.nivoCore.mod.Box
import typings.nivoCore.mod.Theme
import typings.nivoWaffle.distTypesCellTooltipMod.TooltipProps
import typings.react.mod.FC
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait CommonProps[RawDatum /* <: Datum */] extends StObject {
  
  var borderColor: InheritedColorConfig[Cell[RawDatum]]
  
  var borderWidth: Double
  
  var colors: OrdinalColorScaleConfig[RawDatum]
  
  var emptyColor: String
  
  var emptyOpacity: Double
  
  var fillDirection: FillDirection
  
  var isInteractive: Boolean
  
  var margin: Box
  
  var padding: Double
  
  var role: String
  
  var theme: Theme
  
  var tooltip: FC[TooltipProps[RawDatum]]
  
  var valueFormat: js.UndefOr[String | ValueFormatter] = js.undefined
}
object CommonProps {
  
  inline def apply[RawDatum /* <: Datum */](
    borderColor: InheritedColorConfig[Cell[RawDatum]],
    borderWidth: Double,
    colors: OrdinalColorScaleConfig[RawDatum],
    emptyColor: String,
    emptyOpacity: Double,
    fillDirection: FillDirection,
    isInteractive: Boolean,
    margin: Box,
    padding: Double,
    role: String,
    theme: Theme,
    tooltip: FC[TooltipProps[RawDatum]]
  ): CommonProps[RawDatum] = {
    val __obj = js.Dynamic.literal(borderColor = borderColor.asInstanceOf[js.Any], borderWidth = borderWidth.asInstanceOf[js.Any], colors = colors.asInstanceOf[js.Any], emptyColor = emptyColor.asInstanceOf[js.Any], emptyOpacity = emptyOpacity.asInstanceOf[js.Any], fillDirection = fillDirection.asInstanceOf[js.Any], isInteractive = isInteractive.asInstanceOf[js.Any], margin = margin.asInstanceOf[js.Any], padding = padding.asInstanceOf[js.Any], role = role.asInstanceOf[js.Any], theme = theme.asInstanceOf[js.Any], tooltip = tooltip.asInstanceOf[js.Any])
    __obj.asInstanceOf[CommonProps[RawDatum]]
  }
  
  extension [Self <: CommonProps[?], RawDatum /* <: Datum */](x: Self & CommonProps[RawDatum]) {
    
    inline def setBorderColor(value: InheritedColorConfig[Cell[RawDatum]]): Self = StObject.set(x, "borderColor", value.asInstanceOf[js.Any])
    
    inline def setBorderWidth(value: Double): Self = StObject.set(x, "borderWidth", value.asInstanceOf[js.Any])
    
    inline def setColors(value: OrdinalColorScaleConfig[RawDatum]): Self = StObject.set(x, "colors", value.asInstanceOf[js.Any])
    
    inline def setColorsFunction1(value: RawDatum => String): Self = StObject.set(x, "colors", js.Any.fromFunction1(value))
    
    inline def setColorsVarargs(value: String*): Self = StObject.set(x, "colors", js.Array(value*))
    
    inline def setEmptyColor(value: String): Self = StObject.set(x, "emptyColor", value.asInstanceOf[js.Any])
    
    inline def setEmptyOpacity(value: Double): Self = StObject.set(x, "emptyOpacity", value.asInstanceOf[js.Any])
    
    inline def setFillDirection(value: FillDirection): Self = StObject.set(x, "fillDirection", value.asInstanceOf[js.Any])
    
    inline def setIsInteractive(value: Boolean): Self = StObject.set(x, "isInteractive", value.asInstanceOf[js.Any])
    
    inline def setMargin(value: Box): Self = StObject.set(x, "margin", value.asInstanceOf[js.Any])
    
    inline def setPadding(value: Double): Self = StObject.set(x, "padding", value.asInstanceOf[js.Any])
    
    inline def setRole(value: String): Self = StObject.set(x, "role", value.asInstanceOf[js.Any])
    
    inline def setTheme(value: Theme): Self = StObject.set(x, "theme", value.asInstanceOf[js.Any])
    
    inline def setTooltip(value: FC[TooltipProps[RawDatum]]): Self = StObject.set(x, "tooltip", value.asInstanceOf[js.Any])
    
    inline def setValueFormat(value: String | ValueFormatter): Self = StObject.set(x, "valueFormat", value.asInstanceOf[js.Any])
    
    inline def setValueFormatFunction1(value: /* value */ Double => DatumFormattedValue): Self = StObject.set(x, "valueFormat", js.Any.fromFunction1(value))
    
    inline def setValueFormatUndefined: Self = StObject.set(x, "valueFormat", js.undefined)
  }
}
