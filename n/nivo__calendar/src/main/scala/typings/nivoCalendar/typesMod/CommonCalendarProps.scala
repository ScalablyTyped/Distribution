package typings.nivoCalendar.typesMod

import typings.nivoCalendar.nivoCalendarStrings.after
import typings.nivoCalendar.nivoCalendarStrings.auto
import typings.nivoCalendar.nivoCalendarStrings.before
import typings.nivoCalendar.nivoCalendarStrings.horizontal
import typings.nivoCalendar.nivoCalendarStrings.vertical
import typings.nivoCore.mod.Box
import typings.nivoCore.mod.BoxAlign
import typings.nivoCore.mod.Theme
import typings.nivoCore.mod.ValueFormat
import typings.react.mod.FC
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait CommonCalendarProps extends StObject {
  
  var align: BoxAlign
  
  var colorScale: ColorScale
  
  var colors: js.Array[String]
  
  var dayBorderColor: String
  
  var dayBorderWidth: Double
  
  var daySpacing: Double
  
  var direction: horizontal | vertical
  
  var emptyColor: String
  
  var isInteractive: Boolean
  
  var legendFormat: ValueFormat[Double, Unit]
  
  var legends: js.Array[CalendarLegendProps]
  
  var margin: Box
  
  var maxValue: auto | Double
  
  var minValue: auto | Double
  
  var monthBorderColor: String
  
  var monthBorderWidth: Double
  
  def monthLegend(year: Double, month: Double, date: js.Date): String | Double
  
  var monthLegendOffset: Double
  
  var monthLegendPosition: before | after
  
  var monthSpacing: Double
  
  var renderWrapper: Boolean
  
  var theme: Theme
  
  var tooltip: FC[CalendarTooltipProps]
  
  var valueFormat: ValueFormat[Double, Unit]
  
  def yearLegend(year: Double): String | Double
  
  var yearLegendOffset: Double
  
  var yearLegendPosition: before | after
  
  var yearSpacing: Double
}
object CommonCalendarProps {
  
  inline def apply(
    align: BoxAlign,
    colorScale: ColorScale,
    colors: js.Array[String],
    dayBorderColor: String,
    dayBorderWidth: Double,
    daySpacing: Double,
    direction: horizontal | vertical,
    emptyColor: String,
    isInteractive: Boolean,
    legendFormat: ValueFormat[Double, Unit],
    legends: js.Array[CalendarLegendProps],
    margin: Box,
    maxValue: auto | Double,
    minValue: auto | Double,
    monthBorderColor: String,
    monthBorderWidth: Double,
    monthLegend: (Double, Double, js.Date) => String | Double,
    monthLegendOffset: Double,
    monthLegendPosition: before | after,
    monthSpacing: Double,
    renderWrapper: Boolean,
    theme: Theme,
    tooltip: FC[CalendarTooltipProps],
    valueFormat: ValueFormat[Double, Unit],
    yearLegend: Double => String | Double,
    yearLegendOffset: Double,
    yearLegendPosition: before | after,
    yearSpacing: Double
  ): CommonCalendarProps = {
    val __obj = js.Dynamic.literal(align = align.asInstanceOf[js.Any], colorScale = colorScale.asInstanceOf[js.Any], colors = colors.asInstanceOf[js.Any], dayBorderColor = dayBorderColor.asInstanceOf[js.Any], dayBorderWidth = dayBorderWidth.asInstanceOf[js.Any], daySpacing = daySpacing.asInstanceOf[js.Any], direction = direction.asInstanceOf[js.Any], emptyColor = emptyColor.asInstanceOf[js.Any], isInteractive = isInteractive.asInstanceOf[js.Any], legendFormat = legendFormat.asInstanceOf[js.Any], legends = legends.asInstanceOf[js.Any], margin = margin.asInstanceOf[js.Any], maxValue = maxValue.asInstanceOf[js.Any], minValue = minValue.asInstanceOf[js.Any], monthBorderColor = monthBorderColor.asInstanceOf[js.Any], monthBorderWidth = monthBorderWidth.asInstanceOf[js.Any], monthLegend = js.Any.fromFunction3(monthLegend), monthLegendOffset = monthLegendOffset.asInstanceOf[js.Any], monthLegendPosition = monthLegendPosition.asInstanceOf[js.Any], monthSpacing = monthSpacing.asInstanceOf[js.Any], renderWrapper = renderWrapper.asInstanceOf[js.Any], theme = theme.asInstanceOf[js.Any], tooltip = tooltip.asInstanceOf[js.Any], valueFormat = valueFormat.asInstanceOf[js.Any], yearLegend = js.Any.fromFunction1(yearLegend), yearLegendOffset = yearLegendOffset.asInstanceOf[js.Any], yearLegendPosition = yearLegendPosition.asInstanceOf[js.Any], yearSpacing = yearSpacing.asInstanceOf[js.Any])
    __obj.asInstanceOf[CommonCalendarProps]
  }
  
  extension [Self <: CommonCalendarProps](x: Self) {
    
    inline def setAlign(value: BoxAlign): Self = StObject.set(x, "align", value.asInstanceOf[js.Any])
    
    inline def setColorScale(value: ColorScale): Self = StObject.set(x, "colorScale", value.asInstanceOf[js.Any])
    
    inline def setColors(value: js.Array[String]): Self = StObject.set(x, "colors", value.asInstanceOf[js.Any])
    
    inline def setColorsVarargs(value: String*): Self = StObject.set(x, "colors", js.Array(value*))
    
    inline def setDayBorderColor(value: String): Self = StObject.set(x, "dayBorderColor", value.asInstanceOf[js.Any])
    
    inline def setDayBorderWidth(value: Double): Self = StObject.set(x, "dayBorderWidth", value.asInstanceOf[js.Any])
    
    inline def setDaySpacing(value: Double): Self = StObject.set(x, "daySpacing", value.asInstanceOf[js.Any])
    
    inline def setDirection(value: horizontal | vertical): Self = StObject.set(x, "direction", value.asInstanceOf[js.Any])
    
    inline def setEmptyColor(value: String): Self = StObject.set(x, "emptyColor", value.asInstanceOf[js.Any])
    
    inline def setIsInteractive(value: Boolean): Self = StObject.set(x, "isInteractive", value.asInstanceOf[js.Any])
    
    inline def setLegendFormat(value: ValueFormat[Double, Unit]): Self = StObject.set(x, "legendFormat", value.asInstanceOf[js.Any])
    
    inline def setLegendFormatFunction1(value: Double => String): Self = StObject.set(x, "legendFormat", js.Any.fromFunction1(value))
    
    inline def setLegendFormatFunction2(value: (Double, Unit) => String): Self = StObject.set(x, "legendFormat", js.Any.fromFunction2(value))
    
    inline def setLegends(value: js.Array[CalendarLegendProps]): Self = StObject.set(x, "legends", value.asInstanceOf[js.Any])
    
    inline def setLegendsVarargs(value: CalendarLegendProps*): Self = StObject.set(x, "legends", js.Array(value*))
    
    inline def setMargin(value: Box): Self = StObject.set(x, "margin", value.asInstanceOf[js.Any])
    
    inline def setMaxValue(value: auto | Double): Self = StObject.set(x, "maxValue", value.asInstanceOf[js.Any])
    
    inline def setMinValue(value: auto | Double): Self = StObject.set(x, "minValue", value.asInstanceOf[js.Any])
    
    inline def setMonthBorderColor(value: String): Self = StObject.set(x, "monthBorderColor", value.asInstanceOf[js.Any])
    
    inline def setMonthBorderWidth(value: Double): Self = StObject.set(x, "monthBorderWidth", value.asInstanceOf[js.Any])
    
    inline def setMonthLegend(value: (Double, Double, js.Date) => String | Double): Self = StObject.set(x, "monthLegend", js.Any.fromFunction3(value))
    
    inline def setMonthLegendOffset(value: Double): Self = StObject.set(x, "monthLegendOffset", value.asInstanceOf[js.Any])
    
    inline def setMonthLegendPosition(value: before | after): Self = StObject.set(x, "monthLegendPosition", value.asInstanceOf[js.Any])
    
    inline def setMonthSpacing(value: Double): Self = StObject.set(x, "monthSpacing", value.asInstanceOf[js.Any])
    
    inline def setRenderWrapper(value: Boolean): Self = StObject.set(x, "renderWrapper", value.asInstanceOf[js.Any])
    
    inline def setTheme(value: Theme): Self = StObject.set(x, "theme", value.asInstanceOf[js.Any])
    
    inline def setTooltip(value: FC[CalendarTooltipProps]): Self = StObject.set(x, "tooltip", value.asInstanceOf[js.Any])
    
    inline def setValueFormat(value: ValueFormat[Double, Unit]): Self = StObject.set(x, "valueFormat", value.asInstanceOf[js.Any])
    
    inline def setValueFormatFunction1(value: Double => String): Self = StObject.set(x, "valueFormat", js.Any.fromFunction1(value))
    
    inline def setValueFormatFunction2(value: (Double, Unit) => String): Self = StObject.set(x, "valueFormat", js.Any.fromFunction2(value))
    
    inline def setYearLegend(value: Double => String | Double): Self = StObject.set(x, "yearLegend", js.Any.fromFunction1(value))
    
    inline def setYearLegendOffset(value: Double): Self = StObject.set(x, "yearLegendOffset", value.asInstanceOf[js.Any])
    
    inline def setYearLegendPosition(value: before | after): Self = StObject.set(x, "yearLegendPosition", value.asInstanceOf[js.Any])
    
    inline def setYearSpacing(value: Double): Self = StObject.set(x, "yearSpacing", value.asInstanceOf[js.Any])
  }
}
