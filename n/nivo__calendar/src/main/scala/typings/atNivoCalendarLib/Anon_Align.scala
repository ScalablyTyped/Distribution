package typings
package atNivoCalendarLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Align extends js.Object {
  var align: atNivoCoreLib.atNivoCoreMod.BoxAlign
  var colors: js.Array[java.lang.String]
  var dayBorderColor: java.lang.String
  var dayBorderWidth: scala.Double
  var daySpacing: scala.Double
  var direction: atNivoCalendarLib.atNivoCalendarMod.CalendarDirection
  var emptyColor: java.lang.String
  var isInteractive: scala.Boolean
  var legends: js.Array[atNivoCalendarLib.atNivoCalendarMod.CalendarLegend]
  var margin: atNivoCoreLib.atNivoCoreMod.Box
  var maxValue: atNivoCalendarLib.atNivoCalendarLibStrings.auto | scala.Double
  var minValue: atNivoCalendarLib.atNivoCalendarLibStrings.auto | scala.Double
  var monthBorderColor: java.lang.String
  var monthBorderWidth: scala.Double
  var monthLegendOffset: scala.Double
  var theme: atNivoCoreLib.atNivoCoreMod.Theme
  var tooltip: reactLib.reactMod.ReactNs.StatelessComponent[atNivoCalendarLib.atNivoCalendarMod.CalendarDayData]
  var yearLegendOffset: scala.Double
  var yearSpacing: scala.Double
  def monthLegend(year: scala.Double, month: scala.Double, date: stdLib.Date): java.lang.String | scala.Double
  def tooltipFormat(value: scala.Double): java.lang.String | scala.Double
  def yearLegend(year: scala.Double): java.lang.String | scala.Double
}

object Anon_Align {
  @scala.inline
  def apply(
    align: atNivoCoreLib.atNivoCoreMod.BoxAlign,
    colors: js.Array[java.lang.String],
    dayBorderColor: java.lang.String,
    dayBorderWidth: scala.Double,
    daySpacing: scala.Double,
    direction: atNivoCalendarLib.atNivoCalendarMod.CalendarDirection,
    emptyColor: java.lang.String,
    isInteractive: scala.Boolean,
    legends: js.Array[atNivoCalendarLib.atNivoCalendarMod.CalendarLegend],
    margin: atNivoCoreLib.atNivoCoreMod.Box,
    maxValue: atNivoCalendarLib.atNivoCalendarLibStrings.auto | scala.Double,
    minValue: atNivoCalendarLib.atNivoCalendarLibStrings.auto | scala.Double,
    monthBorderColor: java.lang.String,
    monthBorderWidth: scala.Double,
    monthLegend: (scala.Double, scala.Double, stdLib.Date) => java.lang.String | scala.Double,
    monthLegendOffset: scala.Double,
    theme: atNivoCoreLib.atNivoCoreMod.Theme,
    tooltip: reactLib.reactMod.ReactNs.StatelessComponent[atNivoCalendarLib.atNivoCalendarMod.CalendarDayData],
    tooltipFormat: scala.Double => java.lang.String | scala.Double,
    yearLegend: scala.Double => java.lang.String | scala.Double,
    yearLegendOffset: scala.Double,
    yearSpacing: scala.Double
  ): Anon_Align = {
    val __obj = js.Dynamic.literal(align = align, colors = colors, dayBorderColor = dayBorderColor, dayBorderWidth = dayBorderWidth, daySpacing = daySpacing, direction = direction, emptyColor = emptyColor, isInteractive = isInteractive, legends = legends, margin = margin, maxValue = maxValue.asInstanceOf[js.Any], minValue = minValue.asInstanceOf[js.Any], monthBorderColor = monthBorderColor, monthBorderWidth = monthBorderWidth, monthLegend = js.Any.fromFunction3(monthLegend), monthLegendOffset = monthLegendOffset, theme = theme, tooltip = tooltip, tooltipFormat = js.Any.fromFunction1(tooltipFormat), yearLegend = js.Any.fromFunction1(yearLegend), yearLegendOffset = yearLegendOffset, yearSpacing = yearSpacing)
  
    __obj.asInstanceOf[Anon_Align]
  }
}

