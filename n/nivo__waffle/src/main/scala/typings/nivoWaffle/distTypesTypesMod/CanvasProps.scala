package typings.nivoWaffle.distTypesTypesMod

import typings.nivoColors.distTypesInheritedColorMod.InheritedColorConfig
import typings.nivoColors.distTypesScalesOrdinalColorScaleMod.OrdinalColorScaleConfig
import typings.nivoCore.mod.Box
import typings.nivoCore.mod.Theme
import typings.nivoLegends.distTypesTypesMod.LegendProps
import typings.nivoWaffle.distTypesCellTooltipMod.TooltipProps
import typings.react.mod.FC
import typings.react.mod.MouseEvent
import typings.react.mod.NativeMouseEvent
import typings.std.HTMLCanvasElement
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined {  legends :std.Array<@nivo/legends.@nivo/legends.LegendProps> | undefined,   pixelRatio :number | undefined} & @nivo/waffle.@nivo/waffle/dist/types/types.DataProps<RawDatum> & @nivo/core.@nivo/core.Dimensions & std.Partial<@nivo/waffle.@nivo/waffle/dist/types/types.CommonProps<RawDatum>> & std.Omit<@nivo/waffle.@nivo/waffle/dist/types/types.MouseHandlers<RawDatum, std.HTMLCanvasElement>, 'onMouseEnter' | 'onMouseLeave'> */
trait CanvasProps[RawDatum /* <: Datum */] extends StObject {
  
  var borderColor: js.UndefOr[InheritedColorConfig[Cell[RawDatum]]] = js.undefined
  
  var borderWidth: js.UndefOr[Double] = js.undefined
  
  var colors: js.UndefOr[OrdinalColorScaleConfig[RawDatum]] = js.undefined
  
  var columns: Double
  
  var data: js.Array[RawDatum]
  
  var emptyColor: js.UndefOr[String] = js.undefined
  
  var emptyOpacity: js.UndefOr[Double] = js.undefined
  
  var fillDirection: js.UndefOr[FillDirection] = js.undefined
  
  var height: Double
  
  var isInteractive: js.UndefOr[Boolean] = js.undefined
  
  var legends: js.UndefOr[js.Array[LegendProps]] = js.undefined
  
  var margin: js.UndefOr[Box] = js.undefined
  
  var onClick: js.UndefOr[MouseHandler[RawDatum, HTMLCanvasElement]] = js.undefined
  
  var onMouseMove: js.UndefOr[MouseHandler[RawDatum, HTMLCanvasElement]] = js.undefined
  
  var padding: js.UndefOr[Double] = js.undefined
  
  var pixelRatio: js.UndefOr[Double] = js.undefined
  
  var role: js.UndefOr[String] = js.undefined
  
  var rows: Double
  
  var theme: js.UndefOr[Theme] = js.undefined
  
  var tooltip: js.UndefOr[FC[TooltipProps[RawDatum]]] = js.undefined
  
  var total: Double
  
  var valueFormat: js.UndefOr[String | ValueFormatter] = js.undefined
  
  var width: Double
}
object CanvasProps {
  
  inline def apply[RawDatum /* <: Datum */](
    columns: Double,
    data: js.Array[RawDatum],
    height: Double,
    rows: Double,
    total: Double,
    width: Double
  ): CanvasProps[RawDatum] = {
    val __obj = js.Dynamic.literal(columns = columns.asInstanceOf[js.Any], data = data.asInstanceOf[js.Any], height = height.asInstanceOf[js.Any], rows = rows.asInstanceOf[js.Any], total = total.asInstanceOf[js.Any], width = width.asInstanceOf[js.Any])
    __obj.asInstanceOf[CanvasProps[RawDatum]]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: CanvasProps[?], RawDatum /* <: Datum */] (val x: Self & CanvasProps[RawDatum]) extends AnyVal {
    
    inline def setBorderColor(value: InheritedColorConfig[Cell[RawDatum]]): Self = StObject.set(x, "borderColor", value.asInstanceOf[js.Any])
    
    inline def setBorderColorUndefined: Self = StObject.set(x, "borderColor", js.undefined)
    
    inline def setBorderWidth(value: Double): Self = StObject.set(x, "borderWidth", value.asInstanceOf[js.Any])
    
    inline def setBorderWidthUndefined: Self = StObject.set(x, "borderWidth", js.undefined)
    
    inline def setColors(value: OrdinalColorScaleConfig[RawDatum]): Self = StObject.set(x, "colors", value.asInstanceOf[js.Any])
    
    inline def setColorsFunction1(value: RawDatum => String): Self = StObject.set(x, "colors", js.Any.fromFunction1(value))
    
    inline def setColorsUndefined: Self = StObject.set(x, "colors", js.undefined)
    
    inline def setColorsVarargs(value: String*): Self = StObject.set(x, "colors", js.Array(value*))
    
    inline def setColumns(value: Double): Self = StObject.set(x, "columns", value.asInstanceOf[js.Any])
    
    inline def setData(value: js.Array[RawDatum]): Self = StObject.set(x, "data", value.asInstanceOf[js.Any])
    
    inline def setDataVarargs(value: RawDatum*): Self = StObject.set(x, "data", js.Array(value*))
    
    inline def setEmptyColor(value: String): Self = StObject.set(x, "emptyColor", value.asInstanceOf[js.Any])
    
    inline def setEmptyColorUndefined: Self = StObject.set(x, "emptyColor", js.undefined)
    
    inline def setEmptyOpacity(value: Double): Self = StObject.set(x, "emptyOpacity", value.asInstanceOf[js.Any])
    
    inline def setEmptyOpacityUndefined: Self = StObject.set(x, "emptyOpacity", js.undefined)
    
    inline def setFillDirection(value: FillDirection): Self = StObject.set(x, "fillDirection", value.asInstanceOf[js.Any])
    
    inline def setFillDirectionUndefined: Self = StObject.set(x, "fillDirection", js.undefined)
    
    inline def setHeight(value: Double): Self = StObject.set(x, "height", value.asInstanceOf[js.Any])
    
    inline def setIsInteractive(value: Boolean): Self = StObject.set(x, "isInteractive", value.asInstanceOf[js.Any])
    
    inline def setIsInteractiveUndefined: Self = StObject.set(x, "isInteractive", js.undefined)
    
    inline def setLegends(value: js.Array[LegendProps]): Self = StObject.set(x, "legends", value.asInstanceOf[js.Any])
    
    inline def setLegendsUndefined: Self = StObject.set(x, "legends", js.undefined)
    
    inline def setLegendsVarargs(value: LegendProps*): Self = StObject.set(x, "legends", js.Array(value*))
    
    inline def setMargin(value: Box): Self = StObject.set(x, "margin", value.asInstanceOf[js.Any])
    
    inline def setMarginUndefined: Self = StObject.set(x, "margin", js.undefined)
    
    inline def setOnClick(
      value: (/* cell */ Cell[RawDatum], /* event */ MouseEvent[HTMLCanvasElement, NativeMouseEvent]) => Unit
    ): Self = StObject.set(x, "onClick", js.Any.fromFunction2(value))
    
    inline def setOnClickUndefined: Self = StObject.set(x, "onClick", js.undefined)
    
    inline def setOnMouseMove(
      value: (/* cell */ Cell[RawDatum], /* event */ MouseEvent[HTMLCanvasElement, NativeMouseEvent]) => Unit
    ): Self = StObject.set(x, "onMouseMove", js.Any.fromFunction2(value))
    
    inline def setOnMouseMoveUndefined: Self = StObject.set(x, "onMouseMove", js.undefined)
    
    inline def setPadding(value: Double): Self = StObject.set(x, "padding", value.asInstanceOf[js.Any])
    
    inline def setPaddingUndefined: Self = StObject.set(x, "padding", js.undefined)
    
    inline def setPixelRatio(value: Double): Self = StObject.set(x, "pixelRatio", value.asInstanceOf[js.Any])
    
    inline def setPixelRatioUndefined: Self = StObject.set(x, "pixelRatio", js.undefined)
    
    inline def setRole(value: String): Self = StObject.set(x, "role", value.asInstanceOf[js.Any])
    
    inline def setRoleUndefined: Self = StObject.set(x, "role", js.undefined)
    
    inline def setRows(value: Double): Self = StObject.set(x, "rows", value.asInstanceOf[js.Any])
    
    inline def setTheme(value: Theme): Self = StObject.set(x, "theme", value.asInstanceOf[js.Any])
    
    inline def setThemeUndefined: Self = StObject.set(x, "theme", js.undefined)
    
    inline def setTooltip(value: FC[TooltipProps[RawDatum]]): Self = StObject.set(x, "tooltip", value.asInstanceOf[js.Any])
    
    inline def setTooltipUndefined: Self = StObject.set(x, "tooltip", js.undefined)
    
    inline def setTotal(value: Double): Self = StObject.set(x, "total", value.asInstanceOf[js.Any])
    
    inline def setValueFormat(value: String | ValueFormatter): Self = StObject.set(x, "valueFormat", value.asInstanceOf[js.Any])
    
    inline def setValueFormatFunction1(value: /* value */ Double => DatumFormattedValue): Self = StObject.set(x, "valueFormat", js.Any.fromFunction1(value))
    
    inline def setValueFormatUndefined: Self = StObject.set(x, "valueFormat", js.undefined)
    
    inline def setWidth(value: Double): Self = StObject.set(x, "width", value.asInstanceOf[js.Any])
  }
}
