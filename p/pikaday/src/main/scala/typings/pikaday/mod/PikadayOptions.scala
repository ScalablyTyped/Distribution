package typings.pikaday.mod

import typings.std.Date
import typings.std.HTMLElement
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait PikadayOptions extends js.Object {
  
  /**
    * Data-attribute on the input field with an aria assistance test (only applied when bound is set)
    */
  var ariaLabel: js.UndefOr[String] = js.native
  
  /**
    * Defines if the field is blurred when a date is selected (default true)
    */
  var blurFieldOnSelect: js.UndefOr[Boolean] = js.native
  
  /**
    * Automatically show/hide the datepicker on field focus.
    * Default: true if field is set.
    */
  var bound: js.UndefOr[Boolean] = js.native
  
  /**
    * DOM node to render calendar into, see container example.
    * Default: undefined.
    */
  var container: js.UndefOr[HTMLElement | Null] = js.native
  
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
    * Allows user to select date that is in the next or previous months (default: false)
    */
  var enableSelectionDaysInNextAndPreviousMonths: js.UndefOr[Boolean] = js.native
  
  /**
    * Array of dates that you would like to differentiate from regular days (e.g. ['Sat Jun 28 2017', 'Sun Jun 29 2017', 'Tue Jul 01 2017',])
    */
  var events: js.UndefOr[js.Array[String]] = js.native
  
  /**
    * Bind the datepicker to a form field.
    */
  var field: js.UndefOr[HTMLElement | Null] = js.native
  
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
    * The default flag for moment's strict date parsing (requires Moment.js for custom formatting). Default: false
    */
  var formatStrict: js.UndefOr[Boolean] = js.native
  
  /**
    * Language defaults for month and weekday names.
    */
  var i18n: js.UndefOr[PikadayI18nConfig] = js.native
  
  /**
    * Reverse the calendar for right-to-left languages. Default: false.
    */
  var isRTL: js.UndefOr[Boolean] = js.native
  
  /**
    * Enable keyboard input support. Default: true
    */
  var keyboardInput: js.UndefOr[Boolean] = js.native
  
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
  var onSelect: js.UndefOr[js.ThisFunction1[/* this */ Pikaday, /* date */ Date, Unit]] = js.native
  
  /**
    * Function which will be used for parsing input string and getting a date object from it.
    * This function will take precedence over moment.
    */
  var parse: js.UndefOr[js.Function2[/* date */ String, /* format */ String, Date | Null]] = js.native
  
  /**
    * Select a whole week instead of a day (default false)
    */
  var pickWholeWeek: js.UndefOr[Boolean] = js.native
  
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
    * Render the month after the year in the title. Default: false.
    */
  var showMonthAfterYear: js.UndefOr[Boolean] = js.native
  
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
    * Function which will be used for formatting date object to string.
    * This function will take precedence over moment.
    */
  @JSName("toString")
  var toString_FPikadayOptions: js.UndefOr[js.Function2[/* date */ Date, /* format */ js.UndefOr[String], String]] = js.native
  
  /**
    * Use a different element to trigger opening the datepicker.
    * Default: field element.
    */
  var trigger: js.UndefOr[HTMLElement | Null] = js.native
  
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
    def setAriaLabel(value: String): Self = this.set("ariaLabel", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteAriaLabel: Self = this.set("ariaLabel", js.undefined)
    
    @scala.inline
    def setBlurFieldOnSelect(value: Boolean): Self = this.set("blurFieldOnSelect", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteBlurFieldOnSelect: Self = this.set("blurFieldOnSelect", js.undefined)
    
    @scala.inline
    def setBound(value: Boolean): Self = this.set("bound", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteBound: Self = this.set("bound", js.undefined)
    
    @scala.inline
    def setContainer(value: HTMLElement): Self = this.set("container", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteContainer: Self = this.set("container", js.undefined)
    
    @scala.inline
    def setContainerNull: Self = this.set("container", null)
    
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
    def setEnableSelectionDaysInNextAndPreviousMonths(value: Boolean): Self = this.set("enableSelectionDaysInNextAndPreviousMonths", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteEnableSelectionDaysInNextAndPreviousMonths: Self = this.set("enableSelectionDaysInNextAndPreviousMonths", js.undefined)
    
    @scala.inline
    def setEventsVarargs(value: String*): Self = this.set("events", js.Array(value :_*))
    
    @scala.inline
    def setEvents(value: js.Array[String]): Self = this.set("events", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteEvents: Self = this.set("events", js.undefined)
    
    @scala.inline
    def setField(value: HTMLElement): Self = this.set("field", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteField: Self = this.set("field", js.undefined)
    
    @scala.inline
    def setFieldNull: Self = this.set("field", null)
    
    @scala.inline
    def setFirstDay(value: Double): Self = this.set("firstDay", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteFirstDay: Self = this.set("firstDay", js.undefined)
    
    @scala.inline
    def setFormat(value: String): Self = this.set("format", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteFormat: Self = this.set("format", js.undefined)
    
    @scala.inline
    def setFormatStrict(value: Boolean): Self = this.set("formatStrict", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteFormatStrict: Self = this.set("formatStrict", js.undefined)
    
    @scala.inline
    def setI18n(value: PikadayI18nConfig): Self = this.set("i18n", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteI18n: Self = this.set("i18n", js.undefined)
    
    @scala.inline
    def setIsRTL(value: Boolean): Self = this.set("isRTL", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteIsRTL: Self = this.set("isRTL", js.undefined)
    
    @scala.inline
    def setKeyboardInput(value: Boolean): Self = this.set("keyboardInput", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteKeyboardInput: Self = this.set("keyboardInput", js.undefined)
    
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
    def setOnSelect(value: js.ThisFunction1[/* this */ Pikaday, /* date */ Date, Unit]): Self = this.set("onSelect", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteOnSelect: Self = this.set("onSelect", js.undefined)
    
    @scala.inline
    def setParse(value: (/* date */ String, /* format */ String) => Date | Null): Self = this.set("parse", js.Any.fromFunction2(value))
    
    @scala.inline
    def deleteParse: Self = this.set("parse", js.undefined)
    
    @scala.inline
    def setPickWholeWeek(value: Boolean): Self = this.set("pickWholeWeek", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deletePickWholeWeek: Self = this.set("pickWholeWeek", js.undefined)
    
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
    def setShowMonthAfterYear(value: Boolean): Self = this.set("showMonthAfterYear", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteShowMonthAfterYear: Self = this.set("showMonthAfterYear", js.undefined)
    
    @scala.inline
    def setShowWeekNumber(value: Boolean): Self = this.set("showWeekNumber", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteShowWeekNumber: Self = this.set("showWeekNumber", js.undefined)
    
    @scala.inline
    def setTheme(value: String): Self = this.set("theme", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteTheme: Self = this.set("theme", js.undefined)
    
    @scala.inline
    def setToString(value: (/* date */ Date, /* format */ js.UndefOr[String]) => String): Self = this.set("toString", js.Any.fromFunction2(value))
    
    @scala.inline
    def deleteToString: Self = this.set("toString", js.undefined)
    
    @scala.inline
    def setTrigger(value: HTMLElement): Self = this.set("trigger", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteTrigger: Self = this.set("trigger", js.undefined)
    
    @scala.inline
    def setTriggerNull: Self = this.set("trigger", null)
    
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
