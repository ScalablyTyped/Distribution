package typings.pikadayTime

import typings.moment.mod.Moment
import typings.std.HTMLElement
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("pikaday-time", JSImport.Namespace)
  @js.native
  open class ^ protected ()
    extends StObject
       with Pikaday {
    def this(options: PikadayOptions) = this()
  }
  
  @js.native
  trait Pikaday extends StObject {
    
    /**
      * Recalculate and change the position of the picker.
      */
    def adjustPosition(): Unit = js.native
    
    /**
      * Extends the existing configuration options for Pikaday object with the options provided.
      * Can be used to change/extend the configurations on runtime.
      * @param options full/partial configuration options.
      * @returns extended configurations.
      */
    def config(options: PikadayOptions): PikadayOptions = js.native
    
    /**
      * Hide the picker and remove all event listeners - no going back!
      */
    def destroy(): Unit = js.native
    
    /**
      * Update the HTML.
      */
    def draw(force: Boolean): Unit = js.native
    
    var el: HTMLElement = js.native
    
    /**
      * Returns a JavaScript Date object for the selected day, or null if
      * no date is selected.
      */
    def getDate(): js.Date = js.native
    
    /**
      * Returns a Moment.js object for the selected date (Moment must be
      * loaded before Pikaday).
      */
    def getMoment(): Moment = js.native
    
    /**
      * Change the current view to see a specific date.
      */
    def gotoDate(date: js.Date): Unit = js.native
    
    /**
      * Change the current view by month (0: January, 1: Februrary, etc).
      */
    def gotoMonth(monthIndex: Double): Unit = js.native
    
    /**
      * Shortcut for picker.gotoDate(new Date())
      */
    def gotoToday(): Unit = js.native
    
    /**
      * Change the year being viewed.
      */
    def gotoYear(year: Double): Unit = js.native
    
    /**
      * Hide the picker making it invisible.
      */
    def hide(): Unit = js.native
    
    /**
      * Returns true if the picker is visible.
      */
    def isVisible(): Boolean = js.native
    
    /**
      * Go to the next month (this will change year if necessary).
      */
    def nextMonth(): Unit = js.native
    
    /**
      * Go to the previous month (this will change year if necessary).
      */
    def prevMonth(): Unit = js.native
    
    /**
      * Set the current selection. This will be restricted within the bounds
      * of minDate and maxDate options if they're specified. A boolean (true)
      * can optionally be passed as the second parameter to prevent triggering
      * of the onSelect callback, allowing the date to be set silently.
      */
    def setDate(date: String): Unit = js.native
    def setDate(date: String, triggerOnSelect: Boolean): Unit = js.native
    def setDate(date: js.Date): Unit = js.native
    def setDate(date: js.Date, triggerOnSelect: Boolean): Unit = js.native
    
    /**
      * Update the range end date. For using two Pikaday instances to select
      * a date range.
      */
    def setEndRange(date: js.Date): Unit = js.native
    
    /**
      * Update the maximum/latest date that can be selected.
      */
    def setMaxDate(date: js.Date): Unit = js.native
    
    /**
      * Update the minimum/earliest date that can be selected.
      */
    def setMinDate(date: js.Date): Unit = js.native
    
    /**
      * Set the current selection with a Moment.js object (see setDate).
      */
    def setMoment(moment: Any): Unit = js.native
    
    /**
      * Update the range start date. For using two Pikaday instances to
      * select a date range.
      */
    def setStartRange(date: js.Date): Unit = js.native
    
    /**
      * Make the picker visible.
      */
    def show(): Unit = js.native
    
    def toString(format: String): String = js.native
  }
  
  trait PikadayI18nConfig extends StObject {
    
    var months: js.Array[String]
    
    var nextMonth: String
    
    var previousMonth: String
    
    var weekdays: js.Array[String]
    
    var weekdaysShort: js.Array[String]
  }
  object PikadayI18nConfig {
    
    inline def apply(
      months: js.Array[String],
      nextMonth: String,
      previousMonth: String,
      weekdays: js.Array[String],
      weekdaysShort: js.Array[String]
    ): PikadayI18nConfig = {
      val __obj = js.Dynamic.literal(months = months.asInstanceOf[js.Any], nextMonth = nextMonth.asInstanceOf[js.Any], previousMonth = previousMonth.asInstanceOf[js.Any], weekdays = weekdays.asInstanceOf[js.Any], weekdaysShort = weekdaysShort.asInstanceOf[js.Any])
      __obj.asInstanceOf[PikadayI18nConfig]
    }
    
    extension [Self <: PikadayI18nConfig](x: Self) {
      
      inline def setMonths(value: js.Array[String]): Self = StObject.set(x, "months", value.asInstanceOf[js.Any])
      
      inline def setMonthsVarargs(value: String*): Self = StObject.set(x, "months", js.Array(value*))
      
      inline def setNextMonth(value: String): Self = StObject.set(x, "nextMonth", value.asInstanceOf[js.Any])
      
      inline def setPreviousMonth(value: String): Self = StObject.set(x, "previousMonth", value.asInstanceOf[js.Any])
      
      inline def setWeekdays(value: js.Array[String]): Self = StObject.set(x, "weekdays", value.asInstanceOf[js.Any])
      
      inline def setWeekdaysShort(value: js.Array[String]): Self = StObject.set(x, "weekdaysShort", value.asInstanceOf[js.Any])
      
      inline def setWeekdaysShortVarargs(value: String*): Self = StObject.set(x, "weekdaysShort", js.Array(value*))
      
      inline def setWeekdaysVarargs(value: String*): Self = StObject.set(x, "weekdays", js.Array(value*))
    }
  }
  
  trait PikadayOptions extends StObject {
    
    /**
      * Optional numeric property to prevent calendar from auto-closing after date is selected.
      */
    var autoClose: js.UndefOr[Boolean] = js.undefined
    
    /**
      * Automatically show/hide the datepicker on field focus.
      * Default: true if field is set.
      */
    var bound: js.UndefOr[Boolean] = js.undefined
    
    /**
      * DOM node to render calendar into, see container example.
      * Default: undefined.
      */
    var container: js.UndefOr[HTMLElement] = js.undefined
    
    /**
      * The initial date to view when first opened.
      */
    var defaultDate: js.UndefOr[js.Date] = js.undefined
    
    /**
      * Callback function that gets passed a Date object for each day
      * in view. Should return true to disable selection of that day.
      */
    var disableDayFn: js.UndefOr[js.Function1[/* date */ js.Date, Boolean]] = js.undefined
    
    /**
      * Disallow selection of Saturdays and Sundays.
      */
    var disableWeekends: js.UndefOr[Boolean] = js.undefined
    
    /**
      * Bind the datepicker to a form field.
      */
    var field: js.UndefOr[HTMLElement] = js.undefined
    
    /**
      * First day of the week (0: Sunday, 1: Monday, etc).
      */
    var firstDay: js.UndefOr[Double] = js.undefined
    
    /**
      * The default output format for toString() and field value.
      * Requires Moment.js for custom formatting.
      */
    var format: js.UndefOr[String] = js.undefined
    
    /**
      * Language defaults for month and weekday names.
      */
    var i18n: js.UndefOr[PikadayI18nConfig] = js.undefined
    
    /**
      * Optional numeric property to specify the increment step for hour.
      */
    var incrementHourBy: js.UndefOr[Double] = js.undefined
    
    /**
      * Optional numeric property to specify the increment step for minute.
      */
    var incrementMinuteBy: js.UndefOr[Double] = js.undefined
    
    /**
      * Optional numeric property to specify the increment step for second.
      */
    var incrementSecondBy: js.UndefOr[Double] = js.undefined
    
    /**
      * Reverse the calendar for right-to-left languages. Default: false.
      */
    var isRTL: js.UndefOr[Boolean] = js.undefined
    
    /**
      * When numberOfMonths is used, this will help you to choose where the
      * main calendar will be (default left, can be set to right). Only used
      * for the first display or when a selected date is not already visible.
      */
    var mainCalendar: js.UndefOr[String] = js.undefined
    
    /**
      * The latest date that can be selected (this should be a native
      * Date object - e.g. new Date() or moment().toDate()).
      */
    var maxDate: js.UndefOr[js.Date] = js.undefined
    
    /**
      * The earliest date that can be selected (this should be a native
      * Date object - e.g. new Date() or moment().toDate()).
      */
    var minDate: js.UndefOr[js.Date] = js.undefined
    
    /**
      * Number of visible calendars.
      */
    var numberOfMonths: js.UndefOr[Double] = js.undefined
    
    /**
      * Callback function for when the picker is hidden.
      */
    var onClose: js.UndefOr[js.Function0[Unit]] = js.undefined
    
    /**
      * Callback function for when the picker draws a new month.
      */
    var onDraw: js.UndefOr[js.Function0[Unit]] = js.undefined
    
    /**
      * Callback function for when the picker becomes visible.
      */
    var onOpen: js.UndefOr[js.Function0[Unit]] = js.undefined
    
    /**
      * Callback function for when a date is selected.
      */
    var onSelect: js.UndefOr[js.Function1[/* date */ js.Date, Unit]] = js.undefined
    
    /**
      * Preferred position of the datepicker relative to the form field
      * (e.g. 'top right'). Automatic adjustment may occur to avoid
      * displaying outside the viewport. Default: 'bottom left'.
      */
    var position: js.UndefOr[String] = js.undefined
    
    /**
      * Can be set to false to not reposition the datepicker within the
      * viewport, forcing it to take the configured position. Default: true.
      */
    var reposition: js.UndefOr[Boolean] = js.undefined
    
    /**
      * Make the defaultDate the initial selected value.
      */
    var setDefaultDate: js.UndefOr[Boolean] = js.undefined
    
    /**
      * Render days of the calendar grid that fall in the next or previous months to the current month instead of rendering an empty table cell. Default: false.
      */
    var showDaysInNextAndPreviousMonths: js.UndefOr[Boolean] = js.undefined
    
    /**
      * Optional boolean property to specify whether to show minute controls with calendar or not.
      */
    var showMinutes: js.UndefOr[Boolean] = js.undefined
    
    /**
      * Render the month after the year in the title. Default: false.
      */
    var showMonthAfterYear: js.UndefOr[Boolean] = js.undefined
    
    /**
      * Optional boolean property to specify whether to show second controls with calendar or not.
      */
    var showSeconds: js.UndefOr[Boolean] = js.undefined
    
    /*--pikaday-time specific addition--*/
    /**
      * Optional boolean property to specify whether to show time controls with calendar or not.
      */
    var showTime: js.UndefOr[Boolean] = js.undefined
    
    /**
      * Show the ISO week number at the head of the row. Default: false.
      */
    var showWeekNumber: js.UndefOr[Boolean] = js.undefined
    
    /**
      * Define a class name that can be used as a hook for styling different
      * themes. Default: null.
      */
    var theme: js.UndefOr[String] = js.undefined
    
    /**
      * Optional string added to left of time select
      */
    var timeLabel: js.UndefOr[String] = js.undefined
    
    /**
      * Use a different element to trigger opening the datepicker.
      * Default: field element.
      */
    var trigger: js.UndefOr[HTMLElement] = js.undefined
    
    /**
      * Optional boolean property to specify whether to use 24 hours format or not.
      */
    var use24hour: js.UndefOr[Boolean] = js.undefined
    
    /**
      * Number of years either side (e.g. 10) or array of upper/lower range
      * (e.g. [1900, 2015]).
      */
    var yearRange: js.UndefOr[Double | js.Array[Double]] = js.undefined
    
    /**
      * Additional text to append to the year in the title.
      */
    var yearSuffix: js.UndefOr[String] = js.undefined
  }
  object PikadayOptions {
    
    inline def apply(): PikadayOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[PikadayOptions]
    }
    
    extension [Self <: PikadayOptions](x: Self) {
      
      inline def setAutoClose(value: Boolean): Self = StObject.set(x, "autoClose", value.asInstanceOf[js.Any])
      
      inline def setAutoCloseUndefined: Self = StObject.set(x, "autoClose", js.undefined)
      
      inline def setBound(value: Boolean): Self = StObject.set(x, "bound", value.asInstanceOf[js.Any])
      
      inline def setBoundUndefined: Self = StObject.set(x, "bound", js.undefined)
      
      inline def setContainer(value: HTMLElement): Self = StObject.set(x, "container", value.asInstanceOf[js.Any])
      
      inline def setContainerUndefined: Self = StObject.set(x, "container", js.undefined)
      
      inline def setDefaultDate(value: js.Date): Self = StObject.set(x, "defaultDate", value.asInstanceOf[js.Any])
      
      inline def setDefaultDateUndefined: Self = StObject.set(x, "defaultDate", js.undefined)
      
      inline def setDisableDayFn(value: /* date */ js.Date => Boolean): Self = StObject.set(x, "disableDayFn", js.Any.fromFunction1(value))
      
      inline def setDisableDayFnUndefined: Self = StObject.set(x, "disableDayFn", js.undefined)
      
      inline def setDisableWeekends(value: Boolean): Self = StObject.set(x, "disableWeekends", value.asInstanceOf[js.Any])
      
      inline def setDisableWeekendsUndefined: Self = StObject.set(x, "disableWeekends", js.undefined)
      
      inline def setField(value: HTMLElement): Self = StObject.set(x, "field", value.asInstanceOf[js.Any])
      
      inline def setFieldUndefined: Self = StObject.set(x, "field", js.undefined)
      
      inline def setFirstDay(value: Double): Self = StObject.set(x, "firstDay", value.asInstanceOf[js.Any])
      
      inline def setFirstDayUndefined: Self = StObject.set(x, "firstDay", js.undefined)
      
      inline def setFormat(value: String): Self = StObject.set(x, "format", value.asInstanceOf[js.Any])
      
      inline def setFormatUndefined: Self = StObject.set(x, "format", js.undefined)
      
      inline def setI18n(value: PikadayI18nConfig): Self = StObject.set(x, "i18n", value.asInstanceOf[js.Any])
      
      inline def setI18nUndefined: Self = StObject.set(x, "i18n", js.undefined)
      
      inline def setIncrementHourBy(value: Double): Self = StObject.set(x, "incrementHourBy", value.asInstanceOf[js.Any])
      
      inline def setIncrementHourByUndefined: Self = StObject.set(x, "incrementHourBy", js.undefined)
      
      inline def setIncrementMinuteBy(value: Double): Self = StObject.set(x, "incrementMinuteBy", value.asInstanceOf[js.Any])
      
      inline def setIncrementMinuteByUndefined: Self = StObject.set(x, "incrementMinuteBy", js.undefined)
      
      inline def setIncrementSecondBy(value: Double): Self = StObject.set(x, "incrementSecondBy", value.asInstanceOf[js.Any])
      
      inline def setIncrementSecondByUndefined: Self = StObject.set(x, "incrementSecondBy", js.undefined)
      
      inline def setIsRTL(value: Boolean): Self = StObject.set(x, "isRTL", value.asInstanceOf[js.Any])
      
      inline def setIsRTLUndefined: Self = StObject.set(x, "isRTL", js.undefined)
      
      inline def setMainCalendar(value: String): Self = StObject.set(x, "mainCalendar", value.asInstanceOf[js.Any])
      
      inline def setMainCalendarUndefined: Self = StObject.set(x, "mainCalendar", js.undefined)
      
      inline def setMaxDate(value: js.Date): Self = StObject.set(x, "maxDate", value.asInstanceOf[js.Any])
      
      inline def setMaxDateUndefined: Self = StObject.set(x, "maxDate", js.undefined)
      
      inline def setMinDate(value: js.Date): Self = StObject.set(x, "minDate", value.asInstanceOf[js.Any])
      
      inline def setMinDateUndefined: Self = StObject.set(x, "minDate", js.undefined)
      
      inline def setNumberOfMonths(value: Double): Self = StObject.set(x, "numberOfMonths", value.asInstanceOf[js.Any])
      
      inline def setNumberOfMonthsUndefined: Self = StObject.set(x, "numberOfMonths", js.undefined)
      
      inline def setOnClose(value: () => Unit): Self = StObject.set(x, "onClose", js.Any.fromFunction0(value))
      
      inline def setOnCloseUndefined: Self = StObject.set(x, "onClose", js.undefined)
      
      inline def setOnDraw(value: () => Unit): Self = StObject.set(x, "onDraw", js.Any.fromFunction0(value))
      
      inline def setOnDrawUndefined: Self = StObject.set(x, "onDraw", js.undefined)
      
      inline def setOnOpen(value: () => Unit): Self = StObject.set(x, "onOpen", js.Any.fromFunction0(value))
      
      inline def setOnOpenUndefined: Self = StObject.set(x, "onOpen", js.undefined)
      
      inline def setOnSelect(value: /* date */ js.Date => Unit): Self = StObject.set(x, "onSelect", js.Any.fromFunction1(value))
      
      inline def setOnSelectUndefined: Self = StObject.set(x, "onSelect", js.undefined)
      
      inline def setPosition(value: String): Self = StObject.set(x, "position", value.asInstanceOf[js.Any])
      
      inline def setPositionUndefined: Self = StObject.set(x, "position", js.undefined)
      
      inline def setReposition(value: Boolean): Self = StObject.set(x, "reposition", value.asInstanceOf[js.Any])
      
      inline def setRepositionUndefined: Self = StObject.set(x, "reposition", js.undefined)
      
      inline def setSetDefaultDate(value: Boolean): Self = StObject.set(x, "setDefaultDate", value.asInstanceOf[js.Any])
      
      inline def setSetDefaultDateUndefined: Self = StObject.set(x, "setDefaultDate", js.undefined)
      
      inline def setShowDaysInNextAndPreviousMonths(value: Boolean): Self = StObject.set(x, "showDaysInNextAndPreviousMonths", value.asInstanceOf[js.Any])
      
      inline def setShowDaysInNextAndPreviousMonthsUndefined: Self = StObject.set(x, "showDaysInNextAndPreviousMonths", js.undefined)
      
      inline def setShowMinutes(value: Boolean): Self = StObject.set(x, "showMinutes", value.asInstanceOf[js.Any])
      
      inline def setShowMinutesUndefined: Self = StObject.set(x, "showMinutes", js.undefined)
      
      inline def setShowMonthAfterYear(value: Boolean): Self = StObject.set(x, "showMonthAfterYear", value.asInstanceOf[js.Any])
      
      inline def setShowMonthAfterYearUndefined: Self = StObject.set(x, "showMonthAfterYear", js.undefined)
      
      inline def setShowSeconds(value: Boolean): Self = StObject.set(x, "showSeconds", value.asInstanceOf[js.Any])
      
      inline def setShowSecondsUndefined: Self = StObject.set(x, "showSeconds", js.undefined)
      
      inline def setShowTime(value: Boolean): Self = StObject.set(x, "showTime", value.asInstanceOf[js.Any])
      
      inline def setShowTimeUndefined: Self = StObject.set(x, "showTime", js.undefined)
      
      inline def setShowWeekNumber(value: Boolean): Self = StObject.set(x, "showWeekNumber", value.asInstanceOf[js.Any])
      
      inline def setShowWeekNumberUndefined: Self = StObject.set(x, "showWeekNumber", js.undefined)
      
      inline def setTheme(value: String): Self = StObject.set(x, "theme", value.asInstanceOf[js.Any])
      
      inline def setThemeUndefined: Self = StObject.set(x, "theme", js.undefined)
      
      inline def setTimeLabel(value: String): Self = StObject.set(x, "timeLabel", value.asInstanceOf[js.Any])
      
      inline def setTimeLabelUndefined: Self = StObject.set(x, "timeLabel", js.undefined)
      
      inline def setTrigger(value: HTMLElement): Self = StObject.set(x, "trigger", value.asInstanceOf[js.Any])
      
      inline def setTriggerUndefined: Self = StObject.set(x, "trigger", js.undefined)
      
      inline def setUse24hour(value: Boolean): Self = StObject.set(x, "use24hour", value.asInstanceOf[js.Any])
      
      inline def setUse24hourUndefined: Self = StObject.set(x, "use24hour", js.undefined)
      
      inline def setYearRange(value: Double | js.Array[Double]): Self = StObject.set(x, "yearRange", value.asInstanceOf[js.Any])
      
      inline def setYearRangeUndefined: Self = StObject.set(x, "yearRange", js.undefined)
      
      inline def setYearRangeVarargs(value: Double*): Self = StObject.set(x, "yearRange", js.Array(value*))
      
      inline def setYearSuffix(value: String): Self = StObject.set(x, "yearSuffix", value.asInstanceOf[js.Any])
      
      inline def setYearSuffixUndefined: Self = StObject.set(x, "yearSuffix", js.undefined)
    }
  }
}
