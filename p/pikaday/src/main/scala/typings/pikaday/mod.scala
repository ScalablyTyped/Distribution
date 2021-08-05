package typings.pikaday

import typings.moment.mod.Moment
import typings.std.Date
import typings.std.HTMLElement
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("pikaday", JSImport.Namespace)
  @js.native
  class ^ protected ()
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
      * Clear and reset the date
      */
    def clear(): Unit = js.native
    
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
    def getDate(): Date | Null = js.native
    
    /**
      * Returns a Moment.js object for the selected date (Moment must be
      * loaded before Pikaday).
      */
    def getMoment(): Moment | Null = js.native
    
    /**
      * Change the current view to see a specific date.
      */
    def gotoDate(date: Date): Unit = js.native
    
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
    def setDate(): Unit = js.native
    def setDate(date: String): Unit = js.native
    def setDate(date: String, preventOnSelect: Boolean): Unit = js.native
    def setDate(date: Null, preventOnSelect: Boolean): Unit = js.native
    def setDate(date: Date): Unit = js.native
    def setDate(date: Date, preventOnSelect: Boolean): Unit = js.native
    
    /**
      * Update the range end date. For using two Pikaday instances to select
      * a date range.
      */
    def setEndRange(): Unit = js.native
    def setEndRange(date: Date): Unit = js.native
    
    /**
      * Update the maximum/latest date that can be selected.
      */
    def setMaxDate(): Unit = js.native
    def setMaxDate(date: Date): Unit = js.native
    
    /**
      * Update the minimum/earliest date that can be selected.
      */
    def setMinDate(): Unit = js.native
    def setMinDate(date: Date): Unit = js.native
    
    /**
      * Set the current selection with a Moment.js object (see setDate).
      */
    def setMoment(moment: js.Any): Unit = js.native
    def setMoment(moment: js.Any, preventOnSelect: Boolean): Unit = js.native
    
    /**
      * Update the range start date. For using two Pikaday instances to
      * select a date range.
      */
    def setStartRange(): Unit = js.native
    def setStartRange(date: Date): Unit = js.native
    
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
      
      inline def setMonthsVarargs(value: String*): Self = StObject.set(x, "months", js.Array(value :_*))
      
      inline def setNextMonth(value: String): Self = StObject.set(x, "nextMonth", value.asInstanceOf[js.Any])
      
      inline def setPreviousMonth(value: String): Self = StObject.set(x, "previousMonth", value.asInstanceOf[js.Any])
      
      inline def setWeekdays(value: js.Array[String]): Self = StObject.set(x, "weekdays", value.asInstanceOf[js.Any])
      
      inline def setWeekdaysShort(value: js.Array[String]): Self = StObject.set(x, "weekdaysShort", value.asInstanceOf[js.Any])
      
      inline def setWeekdaysShortVarargs(value: String*): Self = StObject.set(x, "weekdaysShort", js.Array(value :_*))
      
      inline def setWeekdaysVarargs(value: String*): Self = StObject.set(x, "weekdays", js.Array(value :_*))
    }
  }
  
  trait PikadayOptions extends StObject {
    
    /**
      * Data-attribute on the input field with an aria assistance test (only applied when bound is set)
      */
    var ariaLabel: js.UndefOr[String] = js.undefined
    
    /**
      * Defines if the field is blurred when a date is selected (default true)
      */
    var blurFieldOnSelect: js.UndefOr[Boolean] = js.undefined
    
    /**
      * Automatically show/hide the datepicker on field focus.
      * Default: true if field is set.
      */
    var bound: js.UndefOr[Boolean] = js.undefined
    
    /**
      * DOM node to render calendar into, see container example.
      * Default: undefined.
      */
    var container: js.UndefOr[HTMLElement | Null] = js.undefined
    
    /**
      * The initial date to view when first opened.
      */
    var defaultDate: js.UndefOr[Date] = js.undefined
    
    /**
      * Callback function that gets passed a Date object for each day
      * in view. Should return true to disable selection of that day.
      */
    var disableDayFn: js.UndefOr[js.Function1[/* date */ Date, Boolean]] = js.undefined
    
    /**
      * Disallow selection of Saturdays and Sundays.
      */
    var disableWeekends: js.UndefOr[Boolean] = js.undefined
    
    /**
      * Allows user to select date that is in the next or previous months (default: false)
      */
    var enableSelectionDaysInNextAndPreviousMonths: js.UndefOr[Boolean] = js.undefined
    
    /**
      * Array of dates that you would like to differentiate from regular days (e.g. ['Sat Jun 28 2017', 'Sun Jun 29 2017', 'Tue Jul 01 2017',])
      */
    var events: js.UndefOr[js.Array[String]] = js.undefined
    
    /**
      * Bind the datepicker to a form field.
      */
    var field: js.UndefOr[HTMLElement | Null] = js.undefined
    
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
      * The default flag for moment's strict date parsing (requires Moment.js for custom formatting). Default: false
      */
    var formatStrict: js.UndefOr[Boolean] = js.undefined
    
    /**
      * Language defaults for month and weekday names.
      */
    var i18n: js.UndefOr[PikadayI18nConfig] = js.undefined
    
    /**
      * Reverse the calendar for right-to-left languages. Default: false.
      */
    var isRTL: js.UndefOr[Boolean] = js.undefined
    
    /**
      * Enable keyboard input support. Default: true
      */
    var keyboardInput: js.UndefOr[Boolean] = js.undefined
    
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
    var maxDate: js.UndefOr[Date] = js.undefined
    
    /**
      * The earliest date that can be selected (this should be a native
      * Date object - e.g. new Date() or moment().toDate()).
      */
    var minDate: js.UndefOr[Date] = js.undefined
    
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
    var onSelect: js.UndefOr[js.ThisFunction1[/* this */ Pikaday, /* date */ Date, Unit]] = js.undefined
    
    /**
      * Function which will be used for parsing input string and getting a date object from it.
      * This function will take precedence over moment.
      */
    var parse: js.UndefOr[js.Function2[/* date */ String, /* format */ String, Date | Null]] = js.undefined
    
    /**
      * Select a whole week instead of a day (default false)
      */
    var pickWholeWeek: js.UndefOr[Boolean] = js.undefined
    
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
      * Render the month after the year in the title. Default: false.
      */
    var showMonthAfterYear: js.UndefOr[Boolean] = js.undefined
    
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
      * Function which will be used for formatting date object to string.
      * This function will take precedence over moment.
      */
    @JSName("toString")
    var toString_FPikadayOptions: js.UndefOr[js.Function2[/* date */ Date, /* format */ js.UndefOr[String], String]] = js.undefined
    
    /**
      * Use a different element to trigger opening the datepicker.
      * Default: field element.
      */
    var trigger: js.UndefOr[HTMLElement | Null] = js.undefined
    
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
      
      inline def setAriaLabel(value: String): Self = StObject.set(x, "ariaLabel", value.asInstanceOf[js.Any])
      
      inline def setAriaLabelUndefined: Self = StObject.set(x, "ariaLabel", js.undefined)
      
      inline def setBlurFieldOnSelect(value: Boolean): Self = StObject.set(x, "blurFieldOnSelect", value.asInstanceOf[js.Any])
      
      inline def setBlurFieldOnSelectUndefined: Self = StObject.set(x, "blurFieldOnSelect", js.undefined)
      
      inline def setBound(value: Boolean): Self = StObject.set(x, "bound", value.asInstanceOf[js.Any])
      
      inline def setBoundUndefined: Self = StObject.set(x, "bound", js.undefined)
      
      inline def setContainer(value: HTMLElement): Self = StObject.set(x, "container", value.asInstanceOf[js.Any])
      
      inline def setContainerNull: Self = StObject.set(x, "container", null)
      
      inline def setContainerUndefined: Self = StObject.set(x, "container", js.undefined)
      
      inline def setDefaultDate(value: Date): Self = StObject.set(x, "defaultDate", value.asInstanceOf[js.Any])
      
      inline def setDefaultDateUndefined: Self = StObject.set(x, "defaultDate", js.undefined)
      
      inline def setDisableDayFn(value: /* date */ Date => Boolean): Self = StObject.set(x, "disableDayFn", js.Any.fromFunction1(value))
      
      inline def setDisableDayFnUndefined: Self = StObject.set(x, "disableDayFn", js.undefined)
      
      inline def setDisableWeekends(value: Boolean): Self = StObject.set(x, "disableWeekends", value.asInstanceOf[js.Any])
      
      inline def setDisableWeekendsUndefined: Self = StObject.set(x, "disableWeekends", js.undefined)
      
      inline def setEnableSelectionDaysInNextAndPreviousMonths(value: Boolean): Self = StObject.set(x, "enableSelectionDaysInNextAndPreviousMonths", value.asInstanceOf[js.Any])
      
      inline def setEnableSelectionDaysInNextAndPreviousMonthsUndefined: Self = StObject.set(x, "enableSelectionDaysInNextAndPreviousMonths", js.undefined)
      
      inline def setEvents(value: js.Array[String]): Self = StObject.set(x, "events", value.asInstanceOf[js.Any])
      
      inline def setEventsUndefined: Self = StObject.set(x, "events", js.undefined)
      
      inline def setEventsVarargs(value: String*): Self = StObject.set(x, "events", js.Array(value :_*))
      
      inline def setField(value: HTMLElement): Self = StObject.set(x, "field", value.asInstanceOf[js.Any])
      
      inline def setFieldNull: Self = StObject.set(x, "field", null)
      
      inline def setFieldUndefined: Self = StObject.set(x, "field", js.undefined)
      
      inline def setFirstDay(value: Double): Self = StObject.set(x, "firstDay", value.asInstanceOf[js.Any])
      
      inline def setFirstDayUndefined: Self = StObject.set(x, "firstDay", js.undefined)
      
      inline def setFormat(value: String): Self = StObject.set(x, "format", value.asInstanceOf[js.Any])
      
      inline def setFormatStrict(value: Boolean): Self = StObject.set(x, "formatStrict", value.asInstanceOf[js.Any])
      
      inline def setFormatStrictUndefined: Self = StObject.set(x, "formatStrict", js.undefined)
      
      inline def setFormatUndefined: Self = StObject.set(x, "format", js.undefined)
      
      inline def setI18n(value: PikadayI18nConfig): Self = StObject.set(x, "i18n", value.asInstanceOf[js.Any])
      
      inline def setI18nUndefined: Self = StObject.set(x, "i18n", js.undefined)
      
      inline def setIsRTL(value: Boolean): Self = StObject.set(x, "isRTL", value.asInstanceOf[js.Any])
      
      inline def setIsRTLUndefined: Self = StObject.set(x, "isRTL", js.undefined)
      
      inline def setKeyboardInput(value: Boolean): Self = StObject.set(x, "keyboardInput", value.asInstanceOf[js.Any])
      
      inline def setKeyboardInputUndefined: Self = StObject.set(x, "keyboardInput", js.undefined)
      
      inline def setMainCalendar(value: String): Self = StObject.set(x, "mainCalendar", value.asInstanceOf[js.Any])
      
      inline def setMainCalendarUndefined: Self = StObject.set(x, "mainCalendar", js.undefined)
      
      inline def setMaxDate(value: Date): Self = StObject.set(x, "maxDate", value.asInstanceOf[js.Any])
      
      inline def setMaxDateUndefined: Self = StObject.set(x, "maxDate", js.undefined)
      
      inline def setMinDate(value: Date): Self = StObject.set(x, "minDate", value.asInstanceOf[js.Any])
      
      inline def setMinDateUndefined: Self = StObject.set(x, "minDate", js.undefined)
      
      inline def setNumberOfMonths(value: Double): Self = StObject.set(x, "numberOfMonths", value.asInstanceOf[js.Any])
      
      inline def setNumberOfMonthsUndefined: Self = StObject.set(x, "numberOfMonths", js.undefined)
      
      inline def setOnClose(value: () => Unit): Self = StObject.set(x, "onClose", js.Any.fromFunction0(value))
      
      inline def setOnCloseUndefined: Self = StObject.set(x, "onClose", js.undefined)
      
      inline def setOnDraw(value: () => Unit): Self = StObject.set(x, "onDraw", js.Any.fromFunction0(value))
      
      inline def setOnDrawUndefined: Self = StObject.set(x, "onDraw", js.undefined)
      
      inline def setOnOpen(value: () => Unit): Self = StObject.set(x, "onOpen", js.Any.fromFunction0(value))
      
      inline def setOnOpenUndefined: Self = StObject.set(x, "onOpen", js.undefined)
      
      inline def setOnSelect(value: js.ThisFunction1[/* this */ Pikaday, /* date */ Date, Unit]): Self = StObject.set(x, "onSelect", value.asInstanceOf[js.Any])
      
      inline def setOnSelectUndefined: Self = StObject.set(x, "onSelect", js.undefined)
      
      inline def setParse(value: (/* date */ String, /* format */ String) => Date | Null): Self = StObject.set(x, "parse", js.Any.fromFunction2(value))
      
      inline def setParseUndefined: Self = StObject.set(x, "parse", js.undefined)
      
      inline def setPickWholeWeek(value: Boolean): Self = StObject.set(x, "pickWholeWeek", value.asInstanceOf[js.Any])
      
      inline def setPickWholeWeekUndefined: Self = StObject.set(x, "pickWholeWeek", js.undefined)
      
      inline def setPosition(value: String): Self = StObject.set(x, "position", value.asInstanceOf[js.Any])
      
      inline def setPositionUndefined: Self = StObject.set(x, "position", js.undefined)
      
      inline def setReposition(value: Boolean): Self = StObject.set(x, "reposition", value.asInstanceOf[js.Any])
      
      inline def setRepositionUndefined: Self = StObject.set(x, "reposition", js.undefined)
      
      inline def setSetDefaultDate(value: Boolean): Self = StObject.set(x, "setDefaultDate", value.asInstanceOf[js.Any])
      
      inline def setSetDefaultDateUndefined: Self = StObject.set(x, "setDefaultDate", js.undefined)
      
      inline def setShowDaysInNextAndPreviousMonths(value: Boolean): Self = StObject.set(x, "showDaysInNextAndPreviousMonths", value.asInstanceOf[js.Any])
      
      inline def setShowDaysInNextAndPreviousMonthsUndefined: Self = StObject.set(x, "showDaysInNextAndPreviousMonths", js.undefined)
      
      inline def setShowMonthAfterYear(value: Boolean): Self = StObject.set(x, "showMonthAfterYear", value.asInstanceOf[js.Any])
      
      inline def setShowMonthAfterYearUndefined: Self = StObject.set(x, "showMonthAfterYear", js.undefined)
      
      inline def setShowWeekNumber(value: Boolean): Self = StObject.set(x, "showWeekNumber", value.asInstanceOf[js.Any])
      
      inline def setShowWeekNumberUndefined: Self = StObject.set(x, "showWeekNumber", js.undefined)
      
      inline def setTheme(value: String): Self = StObject.set(x, "theme", value.asInstanceOf[js.Any])
      
      inline def setThemeUndefined: Self = StObject.set(x, "theme", js.undefined)
      
      inline def setToString_(value: (/* date */ Date, /* format */ js.UndefOr[String]) => String): Self = StObject.set(x, "toString", js.Any.fromFunction2(value))
      
      inline def setToString_Undefined: Self = StObject.set(x, "toString", js.undefined)
      
      inline def setTrigger(value: HTMLElement): Self = StObject.set(x, "trigger", value.asInstanceOf[js.Any])
      
      inline def setTriggerNull: Self = StObject.set(x, "trigger", null)
      
      inline def setTriggerUndefined: Self = StObject.set(x, "trigger", js.undefined)
      
      inline def setYearRange(value: Double | js.Array[Double]): Self = StObject.set(x, "yearRange", value.asInstanceOf[js.Any])
      
      inline def setYearRangeUndefined: Self = StObject.set(x, "yearRange", js.undefined)
      
      inline def setYearRangeVarargs(value: Double*): Self = StObject.set(x, "yearRange", js.Array(value :_*))
      
      inline def setYearSuffix(value: String): Self = StObject.set(x, "yearSuffix", value.asInstanceOf[js.Any])
      
      inline def setYearSuffixUndefined: Self = StObject.set(x, "yearSuffix", js.undefined)
    }
  }
}
