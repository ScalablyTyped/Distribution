package typings.atNivoCalendar

import typings.atNivoCalendar.atNivoCalendarMod.CalendarDayData
import typings.atNivoCalendar.atNivoCalendarMod.CalendarDirection
import typings.atNivoCalendar.atNivoCalendarMod.CalendarLegend
import typings.atNivoCalendar.atNivoCalendarStrings.auto
import typings.atNivoCore.atNivoCoreMod.Box
import typings.atNivoCore.atNivoCoreMod.BoxAlign
import typings.atNivoCore.atNivoCoreMod.Theme
import typings.react.reactMod.StatelessComponent
import typings.std.Date
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Align extends js.Object {
  var align: BoxAlign
  var colors: js.Array[String]
  var dayBorderColor: String
  var dayBorderWidth: Double
  var daySpacing: Double
  var direction: CalendarDirection
  var emptyColor: String
  var isInteractive: Boolean
  var legends: js.Array[CalendarLegend]
  var margin: Box
  var maxValue: auto | Double
  var minValue: auto | Double
  var monthBorderColor: String
  var monthBorderWidth: Double
  var monthLegendOffset: Double
  var theme: Theme
  var tooltip: StatelessComponent[CalendarDayData]
  var yearLegendOffset: Double
  var yearSpacing: Double
  def monthLegend(year: Double, month: Double, date: Date): String | Double
  def tooltipFormat(value: Double): String | Double
  def yearLegend(year: Double): String | Double
}

object Anon_Align {
  @scala.inline
  def apply(
    align: BoxAlign,
    colors: js.Array[String],
    dayBorderColor: String,
    dayBorderWidth: Double,
    daySpacing: Double,
    direction: CalendarDirection,
    emptyColor: String,
    isInteractive: Boolean,
    legends: js.Array[CalendarLegend],
    margin: Box,
    maxValue: auto | Double,
    minValue: auto | Double,
    monthBorderColor: String,
    monthBorderWidth: Double,
    monthLegend: (Double, Double, Date) => String | Double,
    monthLegendOffset: Double,
    theme: Theme,
    tooltip: StatelessComponent[CalendarDayData],
    tooltipFormat: Double => String | Double,
    yearLegend: Double => String | Double,
    yearLegendOffset: Double,
    yearSpacing: Double
  ): Anon_Align = {
    val __obj = js.Dynamic.literal(align = align, colors = colors, dayBorderColor = dayBorderColor, dayBorderWidth = dayBorderWidth, daySpacing = daySpacing, direction = direction, emptyColor = emptyColor, isInteractive = isInteractive, legends = legends, margin = margin, maxValue = maxValue.asInstanceOf[js.Any], minValue = minValue.asInstanceOf[js.Any], monthBorderColor = monthBorderColor, monthBorderWidth = monthBorderWidth, monthLegend = js.Any.fromFunction3(monthLegend), monthLegendOffset = monthLegendOffset, theme = theme, tooltip = tooltip, tooltipFormat = js.Any.fromFunction1(tooltipFormat), yearLegend = js.Any.fromFunction1(yearLegend), yearLegendOffset = yearLegendOffset, yearSpacing = yearSpacing)
  
    __obj.asInstanceOf[Anon_Align]
  }
}

