package typings.pikadayTime.mod

import typings.std.Date
import typings.std.HTMLElement
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait PikadayOptions extends js.Object {
  
  /**
    * Optional numeric property to prevent calendar from auto-closing after date is selected.
    */
  var autoClose: js.UndefOr[Boolean] = js.native
  
  /**
    * Automatically show/hide the datepicker on field focus.
    * Default: true if field is set.
    */
  var bound: js.UndefOr[Boolean] = js.native
  
  /**
    * DOM node to render calendar into, see container example.
    * Default: undefined.
    */
  var container: js.UndefOr[HTMLElement] = js.native
  
  /**
    * The initial date to view when first opened.
    */
  var defaultDate: js.UndefOr[Date] = js.native
  
  /**
    * Callback function that gets passed a Date object for each day
    * in view. Should return true to disable selection of that day.
    */
  var disableDayFn: js.UndefOr[js.Function1[/* date */ Date, Boolean]] = js.native
  
  /**
    * Disallow selection of Saturdays and Sundays.
    */
  var disableWeekends: js.UndefOr[Boolean] = js.native
  
  /**
    * Bind the datepicker to a form field.
    */
  var field: js.UndefOr[HTMLElement] = js.native
  
  /**
    * First day of the week (0: Sunday, 1: Monday, etc).
    */
  var firstDay: js.UndefOr[Double] = js.native
  
  /**
    * The default output format for toString() and field value.
    * Requires Moment.js for custom formatting.
    */
  var format: js.UndefOr[String] = js.native
  
  /**
    * Language defaults for month and weekday names.
    */
  var i18n: js.UndefOr[PikadayI18nConfig] = js.native
  
  /**
    * Optional numeric property to specify the increment step for hour.
    */
  var incrementHourBy: js.UndefOr[Double] = js.native
  
  /**
    * Optional numeric property to specify the increment step for minute.
    */
  var incrementMinuteBy: js.UndefOr[Double] = js.native
  
  /**
    * Optional numeric property to specify the increment step for second.
    */
  var incrementSecondBy: js.UndefOr[Double] = js.native
  
  /**
    * Reverse the calendar for right-to-left languages. Default: false.
    */
  var isRTL: js.UndefOr[Boolean] = js.native
  
  /**
    * When numberOfMonths is used, this will help you to choose where the
    * main calendar will be (default left, can be set to right). Only used
    * for the first display or when a selected date is not already visible.
    */
  var mainCalendar: js.UndefOr[String] = js.native
  
  /**
    * The latest date that can be selected (this should be a native
    * Date object - e.g. new Date() or moment().toDate()).
    */
  var maxDate: js.UndefOr[Date] = js.native
  
  /**
    * The earliest date that can be selected (this should be a native
    * Date object - e.g. new Date() or moment().toDate()).
    */
  var minDate: js.UndefOr[Date] = js.native
  
  /**
    * Number of visible calendars.
    */
  var numberOfMonths: js.UndefOr[Double] = js.native
  
  /**
    * Callback function for when the picker is hidden.
    */
  var onClose: js.UndefOr[js.Function0[Unit]] = js.native
  
  /**
    * Callback function for when the picker draws a new month.
    */
  var onDraw: js.UndefOr[js.Function0[Unit]] = js.native
  
  /**
    * Callback function for when the picker becomes visible.
    */
  var onOpen: js.UndefOr[js.Function0[Unit]] = js.native
  
  /**
    * Callback function for when a date is selected.
    */
  var onSelect: js.UndefOr[js.Function1[/* date */ Date, Unit]] = js.native
  
  /**
    * Preferred position of the datepicker relative to the form field
    * (e.g. 'top right'). Automatic adjustment may occur to avoid
    * displaying outside the viewport. Default: 'bottom left'.
    */
  var position: js.UndefOr[String] = js.native
  
  /**
    * Can be set to false to not reposition the datepicker within the
    * viewport, forcing it to take the configured position. Default: true.
    */
  var reposition: js.UndefOr[Boolean] = js.native
  
  /**
    * Make the defaultDate the initial selected value.
    */
  var setDefaultDate: js.UndefOr[Boolean] = js.native
  
  /**
    * Render days of the calendar grid that fall in the next or previous months to the current month instead of rendering an empty table cell. Default: false.
    */
  var showDaysInNextAndPreviousMonths: js.UndefOr[Boolean] = js.native
  
  /**
    * Optional boolean property to specify whether to show minute controls with calendar or not.
    */
  var showMinutes: js.UndefOr[Boolean] = js.native
  
  /**
    * Render the month after the year in the title. Default: false.
    */
  var showMonthAfterYear: js.UndefOr[Boolean] = js.native
  
  /**
    * Optional boolean property to specify whether to show second controls with calendar or not.
    */
  var showSeconds: js.UndefOr[Boolean] = js.native
  
  /*--pikaday-time specific addition--*/
  /**
    * Optional boolean property to specify whether to show time controls with calendar or not.
    */
  var showTime: js.UndefOr[Boolean] = js.native
  
  /**
    * Show the ISO week number at the head of the row. Default: false.
    */
  var showWeekNumber: js.UndefOr[Boolean] = js.native
  
  /**
    * Define a class name that can be used as a hook for styling different
    * themes. Default: null.
    */
  var theme: js.UndefOr[String] = js.native
  
  /**
    * Optional string added to left of time select
    */
  var timeLabel: js.UndefOr[String] = js.native
  
  /**
    * Use a different element to trigger opening the datepicker.
    * Default: field element.
    */
  var trigger: js.UndefOr[HTMLElement] = js.native
  
  /**
    * Optional boolean property to specify whether to use 24 hours format or not.
    */
  var use24hour: js.UndefOr[Boolean] = js.native
  
  /**
    * Number of years either side (e.g. 10) or array of upper/lower range
    * (e.g. [1900, 2015]).
    */
  var yearRange: js.UndefOr[Double | js.Array[Double]] = js.native
  
  /**
    * Additional text to append to the year in the title.
    */
  var yearSuffix: js.UndefOr[String] = js.native
}
object PikadayOptions {
  
  @scala.inline
  def apply(): PikadayOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PikadayOptions]
  }
  
  @scala.inline
  implicit class PikadayOptionsOps[Self <: PikadayOptions] (val x: Self) extends AnyVal {
    
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
    def setAutoClose(value: Boolean): Self = this.set("autoClose", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteAutoClose: Self = this.set("autoClose", js.undefined)
    
    @scala.inline
    def setBound(value: Boolean): Self = this.set("bound", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteBound: Self = this.set("bound", js.undefined)
    
    @scala.inline
    def setContainer(value: HTMLElement): Self = this.set("container", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteContainer: Self = this.set("container", js.undefined)
    
    @scala.inline
    def setDefaultDate(value: Date): Self = this.set("defaultDate", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDefaultDate: Self = this.set("defaultDate", js.undefined)
    
    @scala.inline
    def setDisableDayFn(value: /* date */ Date => Boolean): Self = this.set("disableDayFn", js.Any.fromFunction1(value))
    
    @scala.inline
    def deleteDisableDayFn: Self = this.set("disableDayFn", js.undefined)
    
    @scala.inline
    def setDisableWeekends(value: Boolean): Self = this.set("disableWeekends", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDisableWeekends: Self = this.set("disableWeekends", js.undefined)
    
    @scala.inline
    def setField(value: HTMLElement): Self = this.set("field", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteField: Self = this.set("field", js.undefined)
    
    @scala.inline
    def setFirstDay(value: Double): Self = this.set("firstDay", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteFirstDay: Self = this.set("firstDay", js.undefined)
    
    @scala.inline
    def setFormat(value: String): Self = this.set("format", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteFormat: Self = this.set("format", js.undefined)
    
    @scala.inline
    def setI18n(value: PikadayI18nConfig): Self = this.set("i18n", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteI18n: Self = this.set("i18n", js.undefined)
    
    @scala.inline
    def setIncrementHourBy(value: Double): Self = this.set("incrementHourBy", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteIncrementHourBy: Self = this.set("incrementHourBy", js.undefined)
    
    @scala.inline
    def setIncrementMinuteBy(value: Double): Self = this.set("incrementMinuteBy", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteIncrementMinuteBy: Self = this.set("incrementMinuteBy", js.undefined)
    
    @scala.inline
    def setIncrementSecondBy(value: Double): Self = this.set("incrementSecondBy", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteIncrementSecondBy: Self = this.set("incrementSecondBy", js.undefined)
    
    @scala.inline
    def setIsRTL(value: Boolean): Self = this.set("isRTL", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteIsRTL: Self = this.set("isRTL", js.undefined)
    
    @scala.inline
    def setMainCalendar(value: String): Self = this.set("mainCalendar", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteMainCalendar: Self = this.set("mainCalendar", js.undefined)
    
    @scala.inline
    def setMaxDate(value: Date): Self = this.set("maxDate", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteMaxDate: Self = this.set("maxDate", js.undefined)
    
    @scala.inline
    def setMinDate(value: Date): Self = this.set("minDate", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteMinDate: Self = this.set("minDate", js.undefined)
    
    @scala.inline
    def setNumberOfMonths(value: Double): Self = this.set("numberOfMonths", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteNumberOfMonths: Self = this.set("numberOfMonths", js.undefined)
    
    @scala.inline
    def setOnClose(value: () => Unit): Self = this.set("onClose", js.Any.fromFunction0(value))
    
    @scala.inline
    def deleteOnClose: Self = this.set("onClose", js.undefined)
    
    @scala.inline
    def setOnDraw(value: () => Unit): Self = this.set("onDraw", js.Any.fromFunction0(value))
    
    @scala.inline
    def deleteOnDraw: Self = this.set("onDraw", js.undefined)
    
    @scala.inline
    def setOnOpen(value: () => Unit): Self = this.set("onOpen", js.Any.fromFunction0(value))
    
    @scala.inline
    def deleteOnOpen: Self = this.set("onOpen", js.undefined)
    
    @scala.inline
    def setOnSelect(value: /* date */ Date => Unit): Self = this.set("onSelect", js.Any.fromFunction1(value))
    
    @scala.inline
    def deleteOnSelect: Self = this.set("onSelect", js.undefined)
    
    @scala.inline
    def setPosition(value: String): Self = this.set("position", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deletePosition: Self = this.set("position", js.undefined)
    
    @scala.inline
    def setReposition(value: Boolean): Self = this.set("reposition", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteReposition: Self = this.set("reposition", js.undefined)
    
    @scala.inline
    def setSetDefaultDate(value: Boolean): Self = this.set("setDefaultDate", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSetDefaultDate: Self = this.set("setDefaultDate", js.undefined)
    
    @scala.inline
    def setShowDaysInNextAndPreviousMonths(value: Boolean): Self = this.set("showDaysInNextAndPreviousMonths", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteShowDaysInNextAndPreviousMonths: Self = this.set("showDaysInNextAndPreviousMonths", js.undefined)
    
    @scala.inline
    def setShowMinutes(value: Boolean): Self = this.set("showMinutes", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteShowMinutes: Self = this.set("showMinutes", js.undefined)
    
    @scala.inline
    def setShowMonthAfterYear(value: Boolean): Self = this.set("showMonthAfterYear", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteShowMonthAfterYear: Self = this.set("showMonthAfterYear", js.undefined)
    
    @scala.inline
    def setShowSeconds(value: Boolean): Self = this.set("showSeconds", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteShowSeconds: Self = this.set("showSeconds", js.undefined)
    
    @scala.inline
    def setShowTime(value: Boolean): Self = this.set("showTime", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteShowTime: Self = this.set("showTime", js.undefined)
    
    @scala.inline
    def setShowWeekNumber(value: Boolean): Self = this.set("showWeekNumber", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteShowWeekNumber: Self = this.set("showWeekNumber", js.undefined)
    
    @scala.inline
    def setTheme(value: String): Self = this.set("theme", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteTheme: Self = this.set("theme", js.undefined)
    
    @scala.inline
    def setTimeLabel(value: String): Self = this.set("timeLabel", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteTimeLabel: Self = this.set("timeLabel", js.undefined)
    
    @scala.inline
    def setTrigger(value: HTMLElement): Self = this.set("trigger", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteTrigger: Self = this.set("trigger", js.undefined)
    
    @scala.inline
    def setUse24hour(value: Boolean): Self = this.set("use24hour", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteUse24hour: Self = this.set("use24hour", js.undefined)
    
    @scala.inline
    def setYearRangeVarargs(value: Double*): Self = this.set("yearRange", js.Array(value :_*))
    
    @scala.inline
    def setYearRange(value: Double | js.Array[Double]): Self = this.set("yearRange", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteYearRange: Self = this.set("yearRange", js.undefined)
    
    @scala.inline
    def setYearSuffix(value: String): Self = this.set("yearSuffix", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteYearSuffix: Self = this.set("yearSuffix", js.undefined)
  }
}
