package typings.officeDashUiDashFabricDashReact.libComponentsCalendarCalendarDotTypesMod

import typings.atUifabricUtilities.libBaseComponentDotTypesMod.IBaseProps
import typings.atUifabricUtilities.libCreateRefMod.IRefObject
import typings.react.reactMod.HTMLAttributes
import typings.std.Date
import typings.std.HTMLElement
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ICalendarProps
  extends HTMLAttributes[HTMLElement]
     with IBaseProps[ICalendar] {
  /**
    * Allows all dates and buttons to be focused, including disabled ones
    * @defaultvalue false
    */
  var allFocusable: js.UndefOr[Boolean] = js.undefined
  /**
    * Whether the month view should automatically navigate to the next or previous date range
    * depending on the selected date. If this property is set to true and the currently displayed
    * month is March 2017, if the user clicks on a day outside the month, i.e., April 1st, the
    * picker will automatically navigate to the month of April.
    * @defaultvalue false
    */
  var autoNavigateOnSelection: js.UndefOr[Boolean] = js.undefined
  /**
    * The date range type indicating how  many days should be selected as the user
    * selects days
    * @defaultvalue DateRangeType.Day
    */
  var dateRangeType: js.UndefOr[
    typings.officeDashUiDashFabricDashReact.libUtilitiesDateValuesDateValuesMod.DateRangeType
  ] = js.undefined
  /**
    * Apply additional formating to dates, for example localized date formatting.
    */
  var dateTimeFormatter: js.UndefOr[ICalendarFormatDateCallbacks] = js.undefined
  /**
    * The first day of the week for your locale.
    * @defaultvalue DayOfWeek.Sunday
    */
  var firstDayOfWeek: js.UndefOr[
    typings.officeDashUiDashFabricDashReact.libUtilitiesDateValuesDateValuesMod.DayOfWeek
  ] = js.undefined
  /**
    * Defines when the first week of the year should start, FirstWeekOfYear.FirstDay,
    * FirstWeekOfYear.FirstFullWeek or FirstWeekOfYear.FirstFourDayWeek are the possible values
    * @defaultvalue FirstWeekOfYear.FirstDay
    */
  var firstWeekOfYear: js.UndefOr[
    typings.officeDashUiDashFabricDashReact.libUtilitiesDateValuesDateValuesMod.FirstWeekOfYear
  ] = js.undefined
  /**
    * Whether the month picker should highlight the current month
    * @defaultvalue false
    */
  var highlightCurrentMonth: js.UndefOr[Boolean] = js.undefined
  /**
    * Whether the month picker should highlight the selected month
    * @defaultvalue false
    */
  var highlightSelectedMonth: js.UndefOr[Boolean] = js.undefined
  /**
    * Whether the day picker is shown beside the month picker or hidden.
    * @defaultvalue true
    */
  var isDayPickerVisible: js.UndefOr[Boolean] = js.undefined
  /**
    * Whether the month picker is shown beside the day picker or hidden.
    * @defaultvalue true
    */
  var isMonthPickerVisible: js.UndefOr[Boolean] = js.undefined
  /**
    * If set the Calendar will not allow navigation to or selection of a date later than this value.
    */
  var maxDate: js.UndefOr[Date] = js.undefined
  /**
    * If set the Calendar will not allow navigation to or selection of a date earlier than this value.
    */
  var minDate: js.UndefOr[Date] = js.undefined
  /**
    * Customize navigation icons using ICalendarIconStrings
    */
  var navigationIcons: js.UndefOr[ICalendarIconStrings] = js.undefined
  /**
    * Callback issued when calendar is closed
    */
  var onDismiss: js.UndefOr[js.Function0[Unit]] = js.undefined
  /**
    * Callback issued when a date is selected
    * @param date - The date the user selected
    * @param selectedDateRangeArray - The resultant list of dates that are selected based on the date range type set for the component.
    */
  var onSelectDate: js.UndefOr[
    js.Function2[/* date */ Date, /* selectedDateRangeArray */ js.UndefOr[js.Array[Date]], Unit]
  ] = js.undefined
  /**
    * If set the Calendar will not allow selection of dates in this array.
    */
  var restrictedDates: js.UndefOr[js.Array[Date]] = js.undefined
  /**
    * When clicking on "Today", select the date and close the calendar.
    * @defaultvalue false
    */
  var selectDateOnClick: js.UndefOr[Boolean] = js.undefined
  /**
    * This property has been removed at 0.80.0 in place of the `focus` method, to be removed \@ 1.0.0.
    * @deprecated Replaced with the `focus` method.
    */
  var shouldFocusOnMount: js.UndefOr[Boolean] = js.undefined
  /**
    * Whether the close button should be shown or not
    * @defaultvalue false
    */
  var showCloseButton: js.UndefOr[Boolean] = js.undefined
  /**
    * Whether the "Go to today" link should be shown or not
    */
  var showGoToToday: js.UndefOr[Boolean] = js.undefined
  /**
    * Show month picker on top of date picker when visible.
    * @defaultvalue false
    */
  var showMonthPickerAsOverlay: js.UndefOr[Boolean] = js.undefined
  /**
    * Whether the calendar should show 6 weeks by default.
    * @defaultvalue false
    */
  var showSixWeeksByDefault: js.UndefOr[Boolean] = js.undefined
  /**
    * Whether the calendar should show the week number (weeks 1 to 53) before each week row
    * @defaultvalue false
    */
  var showWeekNumbers: js.UndefOr[Boolean] = js.undefined
  /**
    * Localized strings to use in the Calendar
    */
  var strings: ICalendarStrings | Null
  /**
    * Value of today. If null, current time in client machine will be used.
    */
  var today: js.UndefOr[Date] = js.undefined
  /**
    * Default value of the Calendar, if any
    */
  var value: js.UndefOr[Date] = js.undefined
  /**
    * The days that are selectable when dateRangeType is WorkWeek. If dateRangeType is not WorkWeek this property does nothing.
    * @defaultvalue [Monday,Tuesday,Wednesday,Thursday,Friday]
    */
  var workWeekDays: js.UndefOr[
    js.Array[
      typings.officeDashUiDashFabricDashReact.libUtilitiesDateValuesDateValuesMod.DayOfWeek
    ]
  ] = js.undefined
  /**
    * Whether the year picker is enabled
    * @defaultvalue false
    */
  var yearPickerHidden: js.UndefOr[Boolean] = js.undefined
}

object ICalendarProps {
  @scala.inline
  def apply(
    HTMLAttributes: HTMLAttributes[HTMLElement] = null,
    IBaseProps: IBaseProps[ICalendar] = null,
    allFocusable: js.UndefOr[Boolean] = js.undefined,
    autoNavigateOnSelection: js.UndefOr[Boolean] = js.undefined,
    className: String = null,
    componentRef: IRefObject[ICalendar] = null,
    dateRangeType: typings.officeDashUiDashFabricDashReact.libUtilitiesDateValuesDateValuesMod.DateRangeType = null,
    dateTimeFormatter: ICalendarFormatDateCallbacks = null,
    firstDayOfWeek: typings.officeDashUiDashFabricDashReact.libUtilitiesDateValuesDateValuesMod.DayOfWeek = null,
    firstWeekOfYear: typings.officeDashUiDashFabricDashReact.libUtilitiesDateValuesDateValuesMod.FirstWeekOfYear = null,
    highlightCurrentMonth: js.UndefOr[Boolean] = js.undefined,
    highlightSelectedMonth: js.UndefOr[Boolean] = js.undefined,
    isDayPickerVisible: js.UndefOr[Boolean] = js.undefined,
    isMonthPickerVisible: js.UndefOr[Boolean] = js.undefined,
    maxDate: Date = null,
    minDate: Date = null,
    navigationIcons: ICalendarIconStrings = null,
    onDismiss: () => Unit = null,
    onSelectDate: (/* date */ Date, /* selectedDateRangeArray */ js.UndefOr[js.Array[Date]]) => Unit = null,
    restrictedDates: js.Array[Date] = null,
    selectDateOnClick: js.UndefOr[Boolean] = js.undefined,
    shouldFocusOnMount: js.UndefOr[Boolean] = js.undefined,
    showCloseButton: js.UndefOr[Boolean] = js.undefined,
    showGoToToday: js.UndefOr[Boolean] = js.undefined,
    showMonthPickerAsOverlay: js.UndefOr[Boolean] = js.undefined,
    showSixWeeksByDefault: js.UndefOr[Boolean] = js.undefined,
    showWeekNumbers: js.UndefOr[Boolean] = js.undefined,
    strings: ICalendarStrings = null,
    today: Date = null,
    value: Date = null,
    workWeekDays: js.Array[
      typings.officeDashUiDashFabricDashReact.libUtilitiesDateValuesDateValuesMod.DayOfWeek
    ] = null,
    yearPickerHidden: js.UndefOr[Boolean] = js.undefined
  ): ICalendarProps = {
    val __obj = js.Dynamic.literal()
    js.Dynamic.global.Object.assign(__obj, HTMLAttributes)
    js.Dynamic.global.Object.assign(__obj, IBaseProps)
    if (!js.isUndefined(allFocusable)) __obj.updateDynamic("allFocusable")(allFocusable)
    if (!js.isUndefined(autoNavigateOnSelection)) __obj.updateDynamic("autoNavigateOnSelection")(autoNavigateOnSelection)
    if (className != null) __obj.updateDynamic("className")(className)
    if (componentRef != null) __obj.updateDynamic("componentRef")(componentRef.asInstanceOf[js.Any])
    if (dateRangeType != null) __obj.updateDynamic("dateRangeType")(dateRangeType)
    if (dateTimeFormatter != null) __obj.updateDynamic("dateTimeFormatter")(dateTimeFormatter)
    if (firstDayOfWeek != null) __obj.updateDynamic("firstDayOfWeek")(firstDayOfWeek)
    if (firstWeekOfYear != null) __obj.updateDynamic("firstWeekOfYear")(firstWeekOfYear)
    if (!js.isUndefined(highlightCurrentMonth)) __obj.updateDynamic("highlightCurrentMonth")(highlightCurrentMonth)
    if (!js.isUndefined(highlightSelectedMonth)) __obj.updateDynamic("highlightSelectedMonth")(highlightSelectedMonth)
    if (!js.isUndefined(isDayPickerVisible)) __obj.updateDynamic("isDayPickerVisible")(isDayPickerVisible)
    if (!js.isUndefined(isMonthPickerVisible)) __obj.updateDynamic("isMonthPickerVisible")(isMonthPickerVisible)
    if (maxDate != null) __obj.updateDynamic("maxDate")(maxDate)
    if (minDate != null) __obj.updateDynamic("minDate")(minDate)
    if (navigationIcons != null) __obj.updateDynamic("navigationIcons")(navigationIcons)
    if (onDismiss != null) __obj.updateDynamic("onDismiss")(js.Any.fromFunction0(onDismiss))
    if (onSelectDate != null) __obj.updateDynamic("onSelectDate")(js.Any.fromFunction2(onSelectDate))
    if (restrictedDates != null) __obj.updateDynamic("restrictedDates")(restrictedDates)
    if (!js.isUndefined(selectDateOnClick)) __obj.updateDynamic("selectDateOnClick")(selectDateOnClick)
    if (!js.isUndefined(shouldFocusOnMount)) __obj.updateDynamic("shouldFocusOnMount")(shouldFocusOnMount)
    if (!js.isUndefined(showCloseButton)) __obj.updateDynamic("showCloseButton")(showCloseButton)
    if (!js.isUndefined(showGoToToday)) __obj.updateDynamic("showGoToToday")(showGoToToday)
    if (!js.isUndefined(showMonthPickerAsOverlay)) __obj.updateDynamic("showMonthPickerAsOverlay")(showMonthPickerAsOverlay)
    if (!js.isUndefined(showSixWeeksByDefault)) __obj.updateDynamic("showSixWeeksByDefault")(showSixWeeksByDefault)
    if (!js.isUndefined(showWeekNumbers)) __obj.updateDynamic("showWeekNumbers")(showWeekNumbers)
    if (strings != null) __obj.updateDynamic("strings")(strings)
    if (today != null) __obj.updateDynamic("today")(today)
    if (value != null) __obj.updateDynamic("value")(value)
    if (workWeekDays != null) __obj.updateDynamic("workWeekDays")(workWeekDays)
    if (!js.isUndefined(yearPickerHidden)) __obj.updateDynamic("yearPickerHidden")(yearPickerHidden)
    __obj.asInstanceOf[ICalendarProps]
  }
}

