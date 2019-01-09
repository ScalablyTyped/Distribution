package typings
package officeDashUiDashFabricDashReactLib.libComponentsCalendarCalendarDotTypesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ICalendarProps
  extends reactLib.reactMod.ReactNs.HTMLAttributes[reactLib.HTMLElement]
     with atUifabricUtilitiesLib.libBaseComponentMod.IBaseProps[ICalendar] {
  /**
    * Allows all dates and buttons to be focused, including disabled ones
    * @defaultvalue false
    */
  var allFocusable: js.UndefOr[scala.Boolean] = js.undefined
  /**
    * Whether the month view should automatically navigate to the next or previous date range
    * depending on the selected date. If this property is set to true and the currently displayed
    * month is March 2017, if the user clicks on a day outside the month, i.e., April 1st, the
    * picker will automatically navigate to the month of April.
    * @defaultvalue false
    */
  var autoNavigateOnSelection: js.UndefOr[scala.Boolean] = js.undefined
  /**
    * The date range type indicating how  many days should be selected as the user
    * selects days
    * @defaultvalue DateRangeType.Day
    */
  var dateRangeType: js.UndefOr[
    officeDashUiDashFabricDashReactLib.libUtilitiesDateValuesDateValuesMod.DateRangeType
  ] = js.undefined
  /**
    * Apply additional formating to dates, for example localized date formatting.
    */
  var dateTimeFormatter: js.UndefOr[ICalendarFormatDateCallbacks] = js.undefined
  /**
    * The first day of the week for your locale.
    * @defaultvalue DayOfWeek.Sunday
    */
  var firstDayOfWeek: js.UndefOr[officeDashUiDashFabricDashReactLib.libUtilitiesDateValuesDateValuesMod.DayOfWeek] = js.undefined
  /**
    * Defines when the first week of the year should start, FirstWeekOfYear.FirstDay,
    * FirstWeekOfYear.FirstFullWeek or FirstWeekOfYear.FirstFourDayWeek are the possible values
    * @defaultvalue FirstWeekOfYear.FirstDay
    */
  var firstWeekOfYear: js.UndefOr[
    officeDashUiDashFabricDashReactLib.libUtilitiesDateValuesDateValuesMod.FirstWeekOfYear
  ] = js.undefined
  /**
    * Whether the month picker should highlight the current month
    * @defaultvalue false
    */
  var highlightCurrentMonth: js.UndefOr[scala.Boolean] = js.undefined
  /**
    * Whether the month picker should highlight the selected month
    * @defaultvalue false
    */
  var highlightSelectedMonth: js.UndefOr[scala.Boolean] = js.undefined
  /**
    * Whether the day picker is shown beside the month picker or hidden.
    * @defaultvalue true
    */
  var isDayPickerVisible: js.UndefOr[scala.Boolean] = js.undefined
  /**
    * Whether the month picker is shown beside the day picker or hidden.
    * @defaultvalue true
    */
  var isMonthPickerVisible: js.UndefOr[scala.Boolean] = js.undefined
  /**
    * If set the Calendar will not allow navigation to or selection of a date later than this value.
    */
  var maxDate: js.UndefOr[stdLib.Date] = js.undefined
  /**
    * If set the Calendar will not allow navigation to or selection of a date earlier than this value.
    */
  var minDate: js.UndefOr[stdLib.Date] = js.undefined
  /**
    * Customize navigation icons using ICalendarIconStrings
    */
  var navigationIcons: js.UndefOr[ICalendarIconStrings] = js.undefined
  /**
    * Callback issued when calendar is closed
    */
  var onDismiss: js.UndefOr[js.Function0[scala.Unit]] = js.undefined
  /**
    * Callback issued when a date is selected
    * @param date - The date the user selected
    * @param selectedDateRangeArray - The resultant list of dates that are selected based on the date range type set for the component.
    */
  var onSelectDate: js.UndefOr[
    js.Function2[
      /* date */ stdLib.Date, 
      /* selectedDateRangeArray */ js.UndefOr[js.Array[stdLib.Date]], 
      scala.Unit
    ]
  ] = js.undefined
  /**
    * If set the Calendar will not allow selection of dates in this array.
    */
  var restrictedDates: js.UndefOr[js.Array[stdLib.Date]] = js.undefined
  /**
    * When clicking on "Today", select the date and close the calendar.
    * @defaultvalue false
    */
  var selectDateOnClick: js.UndefOr[scala.Boolean] = js.undefined
  /**
    * This property has been removed at 0.80.0 in place of the `focus` method, to be removed \@ 1.0.0.
    * @deprecated Replaced with the `focus` method.
    */
  var shouldFocusOnMount: js.UndefOr[scala.Boolean] = js.undefined
  /**
    * Whether the close button should be shown or not
    * @defaultvalue false
    */
  var showCloseButton: js.UndefOr[scala.Boolean] = js.undefined
  /**
    * Whether the "Go to today" link should be shown or not
    */
  var showGoToToday: js.UndefOr[scala.Boolean] = js.undefined
  /**
    * Show month picker on top of date picker when visible.
    * @defaultvalue false
    */
  var showMonthPickerAsOverlay: js.UndefOr[scala.Boolean] = js.undefined
  /**
    * Whether the calendar should show 6 weeks by default.
    * @defaultvalue false
    */
  var showSixWeeksByDefault: js.UndefOr[scala.Boolean] = js.undefined
  /**
    * Whether the calendar should show the week number (weeks 1 to 53) before each week row
    * @defaultvalue false
    */
  var showWeekNumbers: js.UndefOr[scala.Boolean] = js.undefined
  /**
    * Localized strings to use in the Calendar
    */
  var strings: ICalendarStrings | scala.Null
  /**
    * Value of today. If null, current time in client machine will be used.
    */
  var today: js.UndefOr[stdLib.Date] = js.undefined
  /**
    * Default value of the Calendar, if any
    */
  var value: js.UndefOr[stdLib.Date] = js.undefined
  /**
    * The days that are selectable when dateRangeType is WorkWeek. If dateRangeType is not WorkWeek this property does nothing.
    * @defaultvalue [Monday,Tuesday,Wednesday,Thursday,Friday]
    */
  var workWeekDays: js.UndefOr[
    js.Array[officeDashUiDashFabricDashReactLib.libUtilitiesDateValuesDateValuesMod.DayOfWeek]
  ] = js.undefined
  /**
    * Whether the year picker is enabled
    * @defaultvalue false
    */
  var yearPickerHidden: js.UndefOr[scala.Boolean] = js.undefined
}

