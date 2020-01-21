package typings.nivoCalendar.mod

import typings.nivoCalendar.nivoCalendarStrings.auto
import typings.nivoCore.mod.Box
import typings.nivoCore.mod.BoxAlign
import typings.nivoCore.mod.Theme
import typings.react.mod.StatelessComponent
import typings.std.Date
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Inlined std.Partial<{  minValue  :'auto' | number,   maxValue  :'auto' | number,   direction  :@nivo/calendar.@nivo/calendar.CalendarDirection,   colors  :std.Array<string>,   margin  :@nivo/core.@nivo/core.Box,   align  :@nivo/core.@nivo/core.BoxAlign, yearLegend (year : number): string | number,   yearSpacing  :number,   yearLegendOffset  :number, monthLegend (year : number, month : number, date : std.Date): string | number,   monthBorderWidth  :number,   monthBorderColor  :string,   monthLegendOffset  :number,   daySpacing  :number,   dayBorderWidth  :number,   dayBorderColor  :string,   emptyColor  :string,   isInteractive  :boolean, tooltipFormat (value : number): string | number,   tooltip  :react.react.StatelessComponent<@nivo/calendar.@nivo/calendar.CalendarDayData>,   legends  :std.Array<@nivo/calendar.@nivo/calendar.CalendarLegend>,   theme  :@nivo/core.@nivo/core.Theme}> */
trait CalendarCommonProps extends js.Object {
  var align: js.UndefOr[BoxAlign] = js.undefined
  var colors: js.UndefOr[js.Array[String]] = js.undefined
  var dayBorderColor: js.UndefOr[String] = js.undefined
  var dayBorderWidth: js.UndefOr[Double] = js.undefined
  var daySpacing: js.UndefOr[Double] = js.undefined
  var direction: js.UndefOr[CalendarDirection] = js.undefined
  var emptyColor: js.UndefOr[String] = js.undefined
  var isInteractive: js.UndefOr[Boolean] = js.undefined
  var legends: js.UndefOr[js.Array[CalendarLegend]] = js.undefined
  var margin: js.UndefOr[Box] = js.undefined
  var maxValue: js.UndefOr[auto | Double] = js.undefined
  var minValue: js.UndefOr[auto | Double] = js.undefined
  var monthBorderColor: js.UndefOr[String] = js.undefined
  var monthBorderWidth: js.UndefOr[Double] = js.undefined
  var monthLegend: js.UndefOr[
    js.Function3[/* year */ Double, /* month */ Double, /* date */ Date, String | Double]
  ] = js.undefined
  var monthLegendOffset: js.UndefOr[Double] = js.undefined
  var theme: js.UndefOr[Theme] = js.undefined
  var tooltip: js.UndefOr[StatelessComponent[CalendarDayData]] = js.undefined
  var tooltipFormat: js.UndefOr[js.Function1[/* value */ Double, String | Double]] = js.undefined
  var yearLegend: js.UndefOr[js.Function1[/* year */ Double, String | Double]] = js.undefined
  var yearLegendOffset: js.UndefOr[Double] = js.undefined
  var yearSpacing: js.UndefOr[Double] = js.undefined
}

object CalendarCommonProps {
  @scala.inline
  def apply(
    align: BoxAlign = null,
    colors: js.Array[String] = null,
    dayBorderColor: String = null,
    dayBorderWidth: Int | Double = null,
    daySpacing: Int | Double = null,
    direction: CalendarDirection = null,
    emptyColor: String = null,
    isInteractive: js.UndefOr[Boolean] = js.undefined,
    legends: js.Array[CalendarLegend] = null,
    margin: Box = null,
    maxValue: auto | Double = null,
    minValue: auto | Double = null,
    monthBorderColor: String = null,
    monthBorderWidth: Int | Double = null,
    monthLegend: (/* year */ Double, /* month */ Double, /* date */ Date) => String | Double = null,
    monthLegendOffset: Int | Double = null,
    theme: Theme = null,
    tooltip: StatelessComponent[CalendarDayData] = null,
    tooltipFormat: /* value */ Double => String | Double = null,
    yearLegend: /* year */ Double => String | Double = null,
    yearLegendOffset: Int | Double = null,
    yearSpacing: Int | Double = null
  ): CalendarCommonProps = {
    val __obj = js.Dynamic.literal()
    if (align != null) __obj.updateDynamic("align")(align.asInstanceOf[js.Any])
    if (colors != null) __obj.updateDynamic("colors")(colors.asInstanceOf[js.Any])
    if (dayBorderColor != null) __obj.updateDynamic("dayBorderColor")(dayBorderColor.asInstanceOf[js.Any])
    if (dayBorderWidth != null) __obj.updateDynamic("dayBorderWidth")(dayBorderWidth.asInstanceOf[js.Any])
    if (daySpacing != null) __obj.updateDynamic("daySpacing")(daySpacing.asInstanceOf[js.Any])
    if (direction != null) __obj.updateDynamic("direction")(direction.asInstanceOf[js.Any])
    if (emptyColor != null) __obj.updateDynamic("emptyColor")(emptyColor.asInstanceOf[js.Any])
    if (!js.isUndefined(isInteractive)) __obj.updateDynamic("isInteractive")(isInteractive.asInstanceOf[js.Any])
    if (legends != null) __obj.updateDynamic("legends")(legends.asInstanceOf[js.Any])
    if (margin != null) __obj.updateDynamic("margin")(margin.asInstanceOf[js.Any])
    if (maxValue != null) __obj.updateDynamic("maxValue")(maxValue.asInstanceOf[js.Any])
    if (minValue != null) __obj.updateDynamic("minValue")(minValue.asInstanceOf[js.Any])
    if (monthBorderColor != null) __obj.updateDynamic("monthBorderColor")(monthBorderColor.asInstanceOf[js.Any])
    if (monthBorderWidth != null) __obj.updateDynamic("monthBorderWidth")(monthBorderWidth.asInstanceOf[js.Any])
    if (monthLegend != null) __obj.updateDynamic("monthLegend")(js.Any.fromFunction3(monthLegend))
    if (monthLegendOffset != null) __obj.updateDynamic("monthLegendOffset")(monthLegendOffset.asInstanceOf[js.Any])
    if (theme != null) __obj.updateDynamic("theme")(theme.asInstanceOf[js.Any])
    if (tooltip != null) __obj.updateDynamic("tooltip")(tooltip.asInstanceOf[js.Any])
    if (tooltipFormat != null) __obj.updateDynamic("tooltipFormat")(js.Any.fromFunction1(tooltipFormat))
    if (yearLegend != null) __obj.updateDynamic("yearLegend")(js.Any.fromFunction1(yearLegend))
    if (yearLegendOffset != null) __obj.updateDynamic("yearLegendOffset")(yearLegendOffset.asInstanceOf[js.Any])
    if (yearSpacing != null) __obj.updateDynamic("yearSpacing")(yearSpacing.asInstanceOf[js.Any])
    __obj.asInstanceOf[CalendarCommonProps]
  }
}

