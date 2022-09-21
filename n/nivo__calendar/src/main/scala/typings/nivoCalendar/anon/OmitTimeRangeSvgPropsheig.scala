package typings.nivoCalendar.anon

import typings.nivoCalendar.nivoCalendarNumbers.`0`
import typings.nivoCalendar.nivoCalendarNumbers.`1`
import typings.nivoCalendar.nivoCalendarNumbers.`2`
import typings.nivoCalendar.nivoCalendarNumbers.`3`
import typings.nivoCalendar.nivoCalendarNumbers.`4`
import typings.nivoCalendar.nivoCalendarNumbers.`5`
import typings.nivoCalendar.nivoCalendarNumbers.`6`
import typings.nivoCalendar.nivoCalendarStrings.after
import typings.nivoCalendar.nivoCalendarStrings.auto
import typings.nivoCalendar.nivoCalendarStrings.before
import typings.nivoCalendar.nivoCalendarStrings.horizontal
import typings.nivoCalendar.nivoCalendarStrings.vertical
import typings.nivoCalendar.typesMod.CalendarDatum
import typings.nivoCalendar.typesMod.CalendarLegendProps
import typings.nivoCalendar.typesMod.CalendarTooltipProps
import typings.nivoCalendar.typesMod.ColorScale
import typings.nivoCalendar.typesMod.DateOrString
import typings.nivoCalendar.typesMod.TimeRangeDayData
import typings.nivoCore.mod.Box
import typings.nivoCore.mod.BoxAlign
import typings.nivoCore.mod.Theme
import typings.nivoCore.mod.ValueFormat
import typings.react.mod.FC
import typings.react.mod.MouseEvent
import typings.react.mod.NativeMouseEvent
import typings.std.SVGRectElement
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined std.Omit<@nivo/calendar.@nivo/calendar/dist/types/types.TimeRangeSvgProps, 'height' | 'width'> */
trait OmitTimeRangeSvgPropsheig extends StObject {
  
  var align: js.UndefOr[BoxAlign] = js.undefined
  
  var colorScale: js.UndefOr[ColorScale] = js.undefined
  
  var colors: js.UndefOr[js.Array[String]] = js.undefined
  
  var data: js.Array[CalendarDatum]
  
  var dayBorderColor: js.UndefOr[String] = js.undefined
  
  var dayBorderWidth: js.UndefOr[Double] = js.undefined
  
  var dayRadius: js.UndefOr[Double] = js.undefined
  
  var daySpacing: js.UndefOr[Double] = js.undefined
  
  var direction: js.UndefOr[horizontal | vertical] = js.undefined
  
  var emptyColor: js.UndefOr[String] = js.undefined
  
  var from: js.UndefOr[DateOrString] = js.undefined
  
  var isInteractive: js.UndefOr[Boolean] = js.undefined
  
  var legendFormat: js.UndefOr[ValueFormat[Double, Unit]] = js.undefined
  
  var legends: js.UndefOr[js.Array[CalendarLegendProps]] = js.undefined
  
  var margin: js.UndefOr[Box] = js.undefined
  
  var maxValue: js.UndefOr[auto | Double] = js.undefined
  
  var minValue: js.UndefOr[auto | Double] = js.undefined
  
  var monthLegend: js.UndefOr[
    js.Function3[/* year */ Double, /* month */ Double, /* date */ js.Date, String | Double]
  ] = js.undefined
  
  var monthLegendOffset: js.UndefOr[Double] = js.undefined
  
  var monthLegendPosition: js.UndefOr[before | after] = js.undefined
  
  var onClick: js.UndefOr[
    js.Function2[
      /* datum */ TimeRangeDayData, 
      /* event */ MouseEvent[SVGRectElement, NativeMouseEvent], 
      Unit
    ]
  ] = js.undefined
  
  var onMouseEnter: js.UndefOr[
    js.Function2[
      /* datum */ TimeRangeDayData, 
      /* event */ MouseEvent[SVGRectElement, NativeMouseEvent], 
      Unit
    ]
  ] = js.undefined
  
  var onMouseLeave: js.UndefOr[
    js.Function2[
      /* datum */ TimeRangeDayData, 
      /* event */ MouseEvent[SVGRectElement, NativeMouseEvent], 
      Unit
    ]
  ] = js.undefined
  
  var onMouseMove: js.UndefOr[
    js.Function2[
      /* datum */ TimeRangeDayData, 
      /* event */ MouseEvent[SVGRectElement, NativeMouseEvent], 
      Unit
    ]
  ] = js.undefined
  
  var renderWrapper: js.UndefOr[Boolean] = js.undefined
  
  var role: js.UndefOr[String] = js.undefined
  
  var square: js.UndefOr[Boolean] = js.undefined
  
  var theme: js.UndefOr[Theme] = js.undefined
  
  var to: js.UndefOr[DateOrString] = js.undefined
  
  var tooltip: js.UndefOr[FC[CalendarTooltipProps]] = js.undefined
  
  var valueFormat: js.UndefOr[ValueFormat[Double, Unit]] = js.undefined
  
  var weekdayLegendOffset: js.UndefOr[Double] = js.undefined
  
  var weekdayTicks: js.UndefOr[js.Array[`0` | `1` | `2` | `3` | `4` | `5` | `6`]] = js.undefined
}
object OmitTimeRangeSvgPropsheig {
  
  inline def apply(data: js.Array[CalendarDatum]): OmitTimeRangeSvgPropsheig = {
    val __obj = js.Dynamic.literal(data = data.asInstanceOf[js.Any])
    __obj.asInstanceOf[OmitTimeRangeSvgPropsheig]
  }
  
  extension [Self <: OmitTimeRangeSvgPropsheig](x: Self) {
    
    inline def setAlign(value: BoxAlign): Self = StObject.set(x, "align", value.asInstanceOf[js.Any])
    
    inline def setAlignUndefined: Self = StObject.set(x, "align", js.undefined)
    
    inline def setColorScale(value: ColorScale): Self = StObject.set(x, "colorScale", value.asInstanceOf[js.Any])
    
    inline def setColorScaleUndefined: Self = StObject.set(x, "colorScale", js.undefined)
    
    inline def setColors(value: js.Array[String]): Self = StObject.set(x, "colors", value.asInstanceOf[js.Any])
    
    inline def setColorsUndefined: Self = StObject.set(x, "colors", js.undefined)
    
    inline def setColorsVarargs(value: String*): Self = StObject.set(x, "colors", js.Array(value*))
    
    inline def setData(value: js.Array[CalendarDatum]): Self = StObject.set(x, "data", value.asInstanceOf[js.Any])
    
    inline def setDataVarargs(value: CalendarDatum*): Self = StObject.set(x, "data", js.Array(value*))
    
    inline def setDayBorderColor(value: String): Self = StObject.set(x, "dayBorderColor", value.asInstanceOf[js.Any])
    
    inline def setDayBorderColorUndefined: Self = StObject.set(x, "dayBorderColor", js.undefined)
    
    inline def setDayBorderWidth(value: Double): Self = StObject.set(x, "dayBorderWidth", value.asInstanceOf[js.Any])
    
    inline def setDayBorderWidthUndefined: Self = StObject.set(x, "dayBorderWidth", js.undefined)
    
    inline def setDayRadius(value: Double): Self = StObject.set(x, "dayRadius", value.asInstanceOf[js.Any])
    
    inline def setDayRadiusUndefined: Self = StObject.set(x, "dayRadius", js.undefined)
    
    inline def setDaySpacing(value: Double): Self = StObject.set(x, "daySpacing", value.asInstanceOf[js.Any])
    
    inline def setDaySpacingUndefined: Self = StObject.set(x, "daySpacing", js.undefined)
    
    inline def setDirection(value: horizontal | vertical): Self = StObject.set(x, "direction", value.asInstanceOf[js.Any])
    
    inline def setDirectionUndefined: Self = StObject.set(x, "direction", js.undefined)
    
    inline def setEmptyColor(value: String): Self = StObject.set(x, "emptyColor", value.asInstanceOf[js.Any])
    
    inline def setEmptyColorUndefined: Self = StObject.set(x, "emptyColor", js.undefined)
    
    inline def setFrom(value: DateOrString): Self = StObject.set(x, "from", value.asInstanceOf[js.Any])
    
    inline def setFromUndefined: Self = StObject.set(x, "from", js.undefined)
    
    inline def setIsInteractive(value: Boolean): Self = StObject.set(x, "isInteractive", value.asInstanceOf[js.Any])
    
    inline def setIsInteractiveUndefined: Self = StObject.set(x, "isInteractive", js.undefined)
    
    inline def setLegendFormat(value: ValueFormat[Double, Unit]): Self = StObject.set(x, "legendFormat", value.asInstanceOf[js.Any])
    
    inline def setLegendFormatFunction1(value: Double => String): Self = StObject.set(x, "legendFormat", js.Any.fromFunction1(value))
    
    inline def setLegendFormatFunction2(value: (Double, Unit) => String): Self = StObject.set(x, "legendFormat", js.Any.fromFunction2(value))
    
    inline def setLegendFormatUndefined: Self = StObject.set(x, "legendFormat", js.undefined)
    
    inline def setLegends(value: js.Array[CalendarLegendProps]): Self = StObject.set(x, "legends", value.asInstanceOf[js.Any])
    
    inline def setLegendsUndefined: Self = StObject.set(x, "legends", js.undefined)
    
    inline def setLegendsVarargs(value: CalendarLegendProps*): Self = StObject.set(x, "legends", js.Array(value*))
    
    inline def setMargin(value: Box): Self = StObject.set(x, "margin", value.asInstanceOf[js.Any])
    
    inline def setMarginUndefined: Self = StObject.set(x, "margin", js.undefined)
    
    inline def setMaxValue(value: auto | Double): Self = StObject.set(x, "maxValue", value.asInstanceOf[js.Any])
    
    inline def setMaxValueUndefined: Self = StObject.set(x, "maxValue", js.undefined)
    
    inline def setMinValue(value: auto | Double): Self = StObject.set(x, "minValue", value.asInstanceOf[js.Any])
    
    inline def setMinValueUndefined: Self = StObject.set(x, "minValue", js.undefined)
    
    inline def setMonthLegend(value: (/* year */ Double, /* month */ Double, /* date */ js.Date) => String | Double): Self = StObject.set(x, "monthLegend", js.Any.fromFunction3(value))
    
    inline def setMonthLegendOffset(value: Double): Self = StObject.set(x, "monthLegendOffset", value.asInstanceOf[js.Any])
    
    inline def setMonthLegendOffsetUndefined: Self = StObject.set(x, "monthLegendOffset", js.undefined)
    
    inline def setMonthLegendPosition(value: before | after): Self = StObject.set(x, "monthLegendPosition", value.asInstanceOf[js.Any])
    
    inline def setMonthLegendPositionUndefined: Self = StObject.set(x, "monthLegendPosition", js.undefined)
    
    inline def setMonthLegendUndefined: Self = StObject.set(x, "monthLegend", js.undefined)
    
    inline def setOnClick(
      value: (/* datum */ TimeRangeDayData, /* event */ MouseEvent[SVGRectElement, NativeMouseEvent]) => Unit
    ): Self = StObject.set(x, "onClick", js.Any.fromFunction2(value))
    
    inline def setOnClickUndefined: Self = StObject.set(x, "onClick", js.undefined)
    
    inline def setOnMouseEnter(
      value: (/* datum */ TimeRangeDayData, /* event */ MouseEvent[SVGRectElement, NativeMouseEvent]) => Unit
    ): Self = StObject.set(x, "onMouseEnter", js.Any.fromFunction2(value))
    
    inline def setOnMouseEnterUndefined: Self = StObject.set(x, "onMouseEnter", js.undefined)
    
    inline def setOnMouseLeave(
      value: (/* datum */ TimeRangeDayData, /* event */ MouseEvent[SVGRectElement, NativeMouseEvent]) => Unit
    ): Self = StObject.set(x, "onMouseLeave", js.Any.fromFunction2(value))
    
    inline def setOnMouseLeaveUndefined: Self = StObject.set(x, "onMouseLeave", js.undefined)
    
    inline def setOnMouseMove(
      value: (/* datum */ TimeRangeDayData, /* event */ MouseEvent[SVGRectElement, NativeMouseEvent]) => Unit
    ): Self = StObject.set(x, "onMouseMove", js.Any.fromFunction2(value))
    
    inline def setOnMouseMoveUndefined: Self = StObject.set(x, "onMouseMove", js.undefined)
    
    inline def setRenderWrapper(value: Boolean): Self = StObject.set(x, "renderWrapper", value.asInstanceOf[js.Any])
    
    inline def setRenderWrapperUndefined: Self = StObject.set(x, "renderWrapper", js.undefined)
    
    inline def setRole(value: String): Self = StObject.set(x, "role", value.asInstanceOf[js.Any])
    
    inline def setRoleUndefined: Self = StObject.set(x, "role", js.undefined)
    
    inline def setSquare(value: Boolean): Self = StObject.set(x, "square", value.asInstanceOf[js.Any])
    
    inline def setSquareUndefined: Self = StObject.set(x, "square", js.undefined)
    
    inline def setTheme(value: Theme): Self = StObject.set(x, "theme", value.asInstanceOf[js.Any])
    
    inline def setThemeUndefined: Self = StObject.set(x, "theme", js.undefined)
    
    inline def setTo(value: DateOrString): Self = StObject.set(x, "to", value.asInstanceOf[js.Any])
    
    inline def setToUndefined: Self = StObject.set(x, "to", js.undefined)
    
    inline def setTooltip(value: FC[CalendarTooltipProps]): Self = StObject.set(x, "tooltip", value.asInstanceOf[js.Any])
    
    inline def setTooltipUndefined: Self = StObject.set(x, "tooltip", js.undefined)
    
    inline def setValueFormat(value: ValueFormat[Double, Unit]): Self = StObject.set(x, "valueFormat", value.asInstanceOf[js.Any])
    
    inline def setValueFormatFunction1(value: Double => String): Self = StObject.set(x, "valueFormat", js.Any.fromFunction1(value))
    
    inline def setValueFormatFunction2(value: (Double, Unit) => String): Self = StObject.set(x, "valueFormat", js.Any.fromFunction2(value))
    
    inline def setValueFormatUndefined: Self = StObject.set(x, "valueFormat", js.undefined)
    
    inline def setWeekdayLegendOffset(value: Double): Self = StObject.set(x, "weekdayLegendOffset", value.asInstanceOf[js.Any])
    
    inline def setWeekdayLegendOffsetUndefined: Self = StObject.set(x, "weekdayLegendOffset", js.undefined)
    
    inline def setWeekdayTicks(value: js.Array[`0` | `1` | `2` | `3` | `4` | `5` | `6`]): Self = StObject.set(x, "weekdayTicks", value.asInstanceOf[js.Any])
    
    inline def setWeekdayTicksUndefined: Self = StObject.set(x, "weekdayTicks", js.undefined)
    
    inline def setWeekdayTicksVarargs(value: (`0` | `1` | `2` | `3` | `4` | `5` | `6`)*): Self = StObject.set(x, "weekdayTicks", js.Array(value*))
  }
}
