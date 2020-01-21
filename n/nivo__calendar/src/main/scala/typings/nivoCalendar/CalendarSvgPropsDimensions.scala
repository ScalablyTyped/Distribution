package typings.nivoCalendar

import typings.nivoCalendar.mod.CalendarDatum
import typings.nivoCalendar.mod.CalendarDayData
import typings.nivoCalendar.mod.CalendarDirection
import typings.nivoCalendar.mod.CalendarLegend
import typings.nivoCalendar.mod.DateOrString
import typings.nivoCalendar.nivoCalendarStrings.auto
import typings.nivoCore.mod.Box
import typings.nivoCore.mod.BoxAlign
import typings.nivoCore.mod.Theme
import typings.react.mod.MouseEvent
import typings.react.mod.NativeMouseEvent
import typings.react.mod.StatelessComponent
import typings.std.Date
import typings.std.SVGRectElement
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Inlined @nivo/calendar.@nivo/calendar.CalendarSvgProps & @nivo/core.@nivo/core.Dimensions */
trait CalendarSvgPropsDimensions extends js.Object {
  var align: js.UndefOr[BoxAlign] = js.undefined
  var colors: js.UndefOr[js.Array[String]] = js.undefined
  var data: js.Array[CalendarDatum]
  var dayBorderColor: js.UndefOr[String] = js.undefined
  var dayBorderWidth: js.UndefOr[Double] = js.undefined
  var daySpacing: js.UndefOr[Double] = js.undefined
  var direction: js.UndefOr[CalendarDirection] = js.undefined
  var emptyColor: js.UndefOr[String] = js.undefined
  var from: DateOrString
  var height: Double
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
  var onClick: js.UndefOr[
    js.Function2[
      /* datum */ CalendarDayData, 
      /* event */ MouseEvent[SVGRectElement, NativeMouseEvent], 
      Unit
    ]
  ] = js.undefined
  var theme: js.UndefOr[Theme] = js.undefined
  var to: DateOrString
  var tooltip: js.UndefOr[StatelessComponent[CalendarDayData]] = js.undefined
  var tooltipFormat: js.UndefOr[js.Function1[/* value */ Double, String | Double]] = js.undefined
  var width: Double
  var yearLegend: js.UndefOr[js.Function1[/* year */ Double, String | Double]] = js.undefined
  var yearLegendOffset: js.UndefOr[Double] = js.undefined
  var yearSpacing: js.UndefOr[Double] = js.undefined
}

object CalendarSvgPropsDimensions {
  @scala.inline
  def apply(
    data: js.Array[CalendarDatum],
    from: DateOrString,
    height: Double,
    to: DateOrString,
    width: Double,
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
    onClick: (/* datum */ CalendarDayData, /* event */ MouseEvent[SVGRectElement, NativeMouseEvent]) => Unit = null,
    theme: Theme = null,
    tooltip: StatelessComponent[CalendarDayData] = null,
    tooltipFormat: /* value */ Double => String | Double = null,
    yearLegend: /* year */ Double => String | Double = null,
    yearLegendOffset: Int | Double = null,
    yearSpacing: Int | Double = null
  ): CalendarSvgPropsDimensions = {
    val __obj = js.Dynamic.literal(data = data.asInstanceOf[js.Any], from = from.asInstanceOf[js.Any], height = height.asInstanceOf[js.Any], to = to.asInstanceOf[js.Any], width = width.asInstanceOf[js.Any])
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
    if (onClick != null) __obj.updateDynamic("onClick")(js.Any.fromFunction2(onClick))
    if (theme != null) __obj.updateDynamic("theme")(theme.asInstanceOf[js.Any])
    if (tooltip != null) __obj.updateDynamic("tooltip")(tooltip.asInstanceOf[js.Any])
    if (tooltipFormat != null) __obj.updateDynamic("tooltipFormat")(js.Any.fromFunction1(tooltipFormat))
    if (yearLegend != null) __obj.updateDynamic("yearLegend")(js.Any.fromFunction1(yearLegend))
    if (yearLegendOffset != null) __obj.updateDynamic("yearLegendOffset")(yearLegendOffset.asInstanceOf[js.Any])
    if (yearSpacing != null) __obj.updateDynamic("yearSpacing")(yearSpacing.asInstanceOf[js.Any])
    __obj.asInstanceOf[CalendarSvgPropsDimensions]
  }
}

