package typings.nivoCalendar.mod

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

/* Inlined @nivo/calendar.@nivo/calendar.CalendarData & @nivo/calendar.@nivo/calendar.CalendarCommonProps & std.Partial<{onClick (datum : @nivo/calendar.@nivo/calendar.CalendarDayData, event : react.react.MouseEvent<std.SVGRectElement, react.react.NativeMouseEvent>): void}> */
@js.native
trait CalendarSvgProps extends js.Object {
  var align: js.UndefOr[BoxAlign] = js.native
  var colors: js.UndefOr[js.Array[String]] = js.native
  var data: js.Array[CalendarDatum] = js.native
  var dayBorderColor: js.UndefOr[String] = js.native
  var dayBorderWidth: js.UndefOr[Double] = js.native
  var daySpacing: js.UndefOr[Double] = js.native
  var direction: js.UndefOr[CalendarDirection] = js.native
  var emptyColor: js.UndefOr[String] = js.native
  var from: DateOrString = js.native
  var isInteractive: js.UndefOr[Boolean] = js.native
  var legends: js.UndefOr[js.Array[CalendarLegend]] = js.native
  var margin: js.UndefOr[Box] = js.native
  var maxValue: js.UndefOr[auto | Double] = js.native
  var minValue: js.UndefOr[auto | Double] = js.native
  var monthBorderColor: js.UndefOr[String] = js.native
  var monthBorderWidth: js.UndefOr[Double] = js.native
  var monthLegend: js.UndefOr[
    js.Function3[/* year */ Double, /* month */ Double, /* date */ Date, String | Double]
  ] = js.native
  var monthLegendOffset: js.UndefOr[Double] = js.native
  var onClick: js.UndefOr[
    js.Function2[
      /* datum */ CalendarDayData, 
      /* event */ MouseEvent[SVGRectElement, NativeMouseEvent], 
      Unit
    ]
  ] = js.native
  var theme: js.UndefOr[Theme] = js.native
  var to: DateOrString = js.native
  var tooltip: js.UndefOr[StatelessComponent[CalendarDayData]] = js.native
  var tooltipFormat: js.UndefOr[js.Function1[/* value */ Double, String | Double]] = js.native
  var yearLegend: js.UndefOr[js.Function1[/* year */ Double, String | Double]] = js.native
  var yearLegendOffset: js.UndefOr[Double] = js.native
  var yearSpacing: js.UndefOr[Double] = js.native
}

object CalendarSvgProps {
  @scala.inline
  def apply(data: js.Array[CalendarDatum], from: DateOrString, to: DateOrString): CalendarSvgProps = {
    val __obj = js.Dynamic.literal(data = data.asInstanceOf[js.Any], from = from.asInstanceOf[js.Any], to = to.asInstanceOf[js.Any])
    __obj.asInstanceOf[CalendarSvgProps]
  }
  @scala.inline
  implicit class CalendarSvgPropsOps[Self <: CalendarSvgProps] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setDataVarargs(value: CalendarDatum*): Self = this.set("data", js.Array(value :_*))
    @scala.inline
    def setData(value: js.Array[CalendarDatum]): Self = this.set("data", value.asInstanceOf[js.Any])
    @scala.inline
    def setFrom(value: DateOrString): Self = this.set("from", value.asInstanceOf[js.Any])
    @scala.inline
    def setTo(value: DateOrString): Self = this.set("to", value.asInstanceOf[js.Any])
    @scala.inline
    def setAlign(value: BoxAlign): Self = this.set("align", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteAlign: Self = this.set("align", js.undefined)
    @scala.inline
    def setColorsVarargs(value: String*): Self = this.set("colors", js.Array(value :_*))
    @scala.inline
    def setColors(value: js.Array[String]): Self = this.set("colors", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteColors: Self = this.set("colors", js.undefined)
    @scala.inline
    def setDayBorderColor(value: String): Self = this.set("dayBorderColor", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDayBorderColor: Self = this.set("dayBorderColor", js.undefined)
    @scala.inline
    def setDayBorderWidth(value: Double): Self = this.set("dayBorderWidth", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDayBorderWidth: Self = this.set("dayBorderWidth", js.undefined)
    @scala.inline
    def setDaySpacing(value: Double): Self = this.set("daySpacing", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDaySpacing: Self = this.set("daySpacing", js.undefined)
    @scala.inline
    def setDirection(value: CalendarDirection): Self = this.set("direction", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDirection: Self = this.set("direction", js.undefined)
    @scala.inline
    def setEmptyColor(value: String): Self = this.set("emptyColor", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteEmptyColor: Self = this.set("emptyColor", js.undefined)
    @scala.inline
    def setIsInteractive(value: Boolean): Self = this.set("isInteractive", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteIsInteractive: Self = this.set("isInteractive", js.undefined)
    @scala.inline
    def setLegendsVarargs(value: CalendarLegend*): Self = this.set("legends", js.Array(value :_*))
    @scala.inline
    def setLegends(value: js.Array[CalendarLegend]): Self = this.set("legends", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteLegends: Self = this.set("legends", js.undefined)
    @scala.inline
    def setMargin(value: Box): Self = this.set("margin", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteMargin: Self = this.set("margin", js.undefined)
    @scala.inline
    def setMaxValue(value: auto | Double): Self = this.set("maxValue", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteMaxValue: Self = this.set("maxValue", js.undefined)
    @scala.inline
    def setMinValue(value: auto | Double): Self = this.set("minValue", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteMinValue: Self = this.set("minValue", js.undefined)
    @scala.inline
    def setMonthBorderColor(value: String): Self = this.set("monthBorderColor", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteMonthBorderColor: Self = this.set("monthBorderColor", js.undefined)
    @scala.inline
    def setMonthBorderWidth(value: Double): Self = this.set("monthBorderWidth", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteMonthBorderWidth: Self = this.set("monthBorderWidth", js.undefined)
    @scala.inline
    def setMonthLegend(value: (/* year */ Double, /* month */ Double, /* date */ Date) => String | Double): Self = this.set("monthLegend", js.Any.fromFunction3(value))
    @scala.inline
    def deleteMonthLegend: Self = this.set("monthLegend", js.undefined)
    @scala.inline
    def setMonthLegendOffset(value: Double): Self = this.set("monthLegendOffset", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteMonthLegendOffset: Self = this.set("monthLegendOffset", js.undefined)
    @scala.inline
    def setOnClick(
      value: (/* datum */ CalendarDayData, /* event */ MouseEvent[SVGRectElement, NativeMouseEvent]) => Unit
    ): Self = this.set("onClick", js.Any.fromFunction2(value))
    @scala.inline
    def deleteOnClick: Self = this.set("onClick", js.undefined)
    @scala.inline
    def setTheme(value: Theme): Self = this.set("theme", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteTheme: Self = this.set("theme", js.undefined)
    @scala.inline
    def setTooltip(value: StatelessComponent[CalendarDayData]): Self = this.set("tooltip", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteTooltip: Self = this.set("tooltip", js.undefined)
    @scala.inline
    def setTooltipFormat(value: /* value */ Double => String | Double): Self = this.set("tooltipFormat", js.Any.fromFunction1(value))
    @scala.inline
    def deleteTooltipFormat: Self = this.set("tooltipFormat", js.undefined)
    @scala.inline
    def setYearLegend(value: /* year */ Double => String | Double): Self = this.set("yearLegend", js.Any.fromFunction1(value))
    @scala.inline
    def deleteYearLegend: Self = this.set("yearLegend", js.undefined)
    @scala.inline
    def setYearLegendOffset(value: Double): Self = this.set("yearLegendOffset", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteYearLegendOffset: Self = this.set("yearLegendOffset", js.undefined)
    @scala.inline
    def setYearSpacing(value: Double): Self = this.set("yearSpacing", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteYearSpacing: Self = this.set("yearSpacing", js.undefined)
  }
  
}

