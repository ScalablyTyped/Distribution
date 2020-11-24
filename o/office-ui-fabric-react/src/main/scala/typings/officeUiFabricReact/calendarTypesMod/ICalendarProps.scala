package typings.officeUiFabricReact.calendarTypesMod

import typings.react.mod.HTMLAttributes
import typings.std.Date
import typings.std.HTMLElement
import typings.uifabricUtilities.baseComponentTypesMod.IBaseProps
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ICalendarProps
  extends HTMLAttributes[HTMLElement]
     with IBaseProps[ICalendar] {
  
  /**
    * Allows all dates and buttons to be focused, including disabled ones
    * @defaultvalue false
    */
  var allFocusable: js.UndefOr[Boolean] = js.native
  
  /**
    * Whether the month view should automatically navigate to the next or previous date range
    * depending on the selected date. If this property is set to true and the currently displayed
    * month is March 2017, if the user clicks on a day outside the month, i.e., April 1st, the
    * picker will automatically navigate to the month of April.
    * @defaultvalue false
    */
  var autoNavigateOnSelection: js.UndefOr[Boolean] = js.native
  
  /**
    * The date range type indicating how  many days should be selected as the user
    * selects days
    * @defaultvalue DateRangeType.Day
    */
  var dateRangeType: js.UndefOr[typings.fluentuiDateTimeUtilities.dateValuesMod.DateRangeType] = js.native
  
  /**
    * Apply additional formating to dates, for example localized date formatting.
    */
  var dateTimeFormatter: js.UndefOr[ICalendarFormatDateCallbacks] = js.native
  
  /**
    * The first day of the week for your locale.
    * @defaultvalue DayOfWeek.Sunday
    */
  var firstDayOfWeek: js.UndefOr[typings.fluentuiDateTimeUtilities.dateValuesMod.DayOfWeek] = js.native
  
  /**
    * Defines when the first week of the year should start, FirstWeekOfYear.FirstDay,
    * FirstWeekOfYear.FirstFullWeek or FirstWeekOfYear.FirstFourDayWeek are the possible values
    * @defaultvalue FirstWeekOfYear.FirstDay
    */
  var firstWeekOfYear: js.UndefOr[typings.fluentuiDateTimeUtilities.dateValuesMod.FirstWeekOfYear] = js.native
  
  /**
    * Whether the month picker should highlight the current month
    * @defaultvalue false
    */
  var highlightCurrentMonth: js.UndefOr[Boolean] = js.native
  
  /**
    * Whether the month picker should highlight the selected month
    * @defaultvalue false
    */
  var highlightSelectedMonth: js.UndefOr[Boolean] = js.native
  
  /**
    * Whether the day picker is shown beside the month picker or hidden.
    * @defaultvalue true
    */
  var isDayPickerVisible: js.UndefOr[Boolean] = js.native
  
  /**
    * Whether the month picker is shown beside the day picker or hidden.
    * @defaultvalue true
    */
  var isMonthPickerVisible: js.UndefOr[Boolean] = js.native
  
  /**
    * If set the Calendar will not allow navigation to or selection of a date later than this value.
    */
  var maxDate: js.UndefOr[Date] = js.native
  
  /**
    * If set the Calendar will not allow navigation to or selection of a date earlier than this value.
    */
  var minDate: js.UndefOr[Date] = js.native
  
  /**
    * Customize navigation icons using ICalendarIconStrings
    */
  var navigationIcons: js.UndefOr[ICalendarIconStrings] = js.native
  
  /**
    * Callback issued when calendar is closed
    */
  var onDismiss: js.UndefOr[js.Function0[Unit]] = js.native
  
  /**
    * Callback issued when a date is selected
    * @param date - The date the user selected
    * @param selectedDateRangeArray - The resultant list of dates that are selected based on the date range type set
    * for the component.
    */
  var onSelectDate: js.UndefOr[
    js.Function2[/* date */ Date, /* selectedDateRangeArray */ js.UndefOr[js.Array[Date]], Unit]
  ] = js.native
  
  /**
    * If set the Calendar will not allow selection of dates in this array.
    */
  var restrictedDates: js.UndefOr[js.Array[Date]] = js.native
  
  /**
    * When clicking on "Today", select the date and close the calendar.
    * @defaultvalue false
    */
  var selectDateOnClick: js.UndefOr[Boolean] = js.native
  
  /**
    * This property has been removed at 0.80.0 in place of the `focus` method, to be removed \@ 1.0.0.
    * @deprecated Replaced with the `focus` method.
    */
  var shouldFocusOnMount: js.UndefOr[Boolean] = js.native
  
  /**
    * Whether the close button should be shown or not
    * @defaultvalue false
    */
  var showCloseButton: js.UndefOr[Boolean] = js.native
  
  /**
    * Whether the "Go to today" link should be shown or not
    */
  var showGoToToday: js.UndefOr[Boolean] = js.native
  
  /**
    * Show month picker on top of date picker when visible.
    * @defaultvalue false
    */
  var showMonthPickerAsOverlay: js.UndefOr[Boolean] = js.native
  
  /**
    * Whether the calendar should show 6 weeks by default.
    * @defaultvalue false
    */
  var showSixWeeksByDefault: js.UndefOr[Boolean] = js.native
  
  /**
    * Whether the calendar should show the week number (weeks 1 to 53) before each week row
    * @defaultvalue false
    */
  var showWeekNumbers: js.UndefOr[Boolean] = js.native
  
  /**
    * Localized strings to use in the Calendar
    */
  var strings: ICalendarStrings | Null = js.native
  
  /**
    * Value of today. If null, current time in client machine will be used.
    */
  var today: js.UndefOr[Date] = js.native
  
  /**
    * Default value of the Calendar, if any
    */
  var value: js.UndefOr[Date] = js.native
  
  /**
    * The days that are selectable when dateRangeType is WorkWeek.
    * If dateRangeType is not WorkWeek this property does nothing.
    * @defaultvalue [Monday,Tuesday,Wednesday,Thursday,Friday]
    */
  var workWeekDays: js.UndefOr[js.Array[typings.fluentuiDateTimeUtilities.dateValuesMod.DayOfWeek]] = js.native
  
  /**
    * Whether the year picker is enabled
    * @defaultvalue false
    */
  var yearPickerHidden: js.UndefOr[Boolean] = js.native
}
object ICalendarProps {
  
  @scala.inline
  def apply(): ICalendarProps = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ICalendarProps]
  }
  
  @scala.inline
  implicit class ICalendarPropsOps[Self <: ICalendarProps] (val x: Self) extends AnyVal {
    
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
    def setAllFocusable(value: Boolean): Self = this.set("allFocusable", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteAllFocusable: Self = this.set("allFocusable", js.undefined)
    
    @scala.inline
    def setAutoNavigateOnSelection(value: Boolean): Self = this.set("autoNavigateOnSelection", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteAutoNavigateOnSelection: Self = this.set("autoNavigateOnSelection", js.undefined)
    
    @scala.inline
    def setDateRangeType(value: typings.fluentuiDateTimeUtilities.dateValuesMod.DateRangeType): Self = this.set("dateRangeType", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDateRangeType: Self = this.set("dateRangeType", js.undefined)
    
    @scala.inline
    def setDateTimeFormatter(value: ICalendarFormatDateCallbacks): Self = this.set("dateTimeFormatter", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDateTimeFormatter: Self = this.set("dateTimeFormatter", js.undefined)
    
    @scala.inline
    def setFirstDayOfWeek(value: typings.fluentuiDateTimeUtilities.dateValuesMod.DayOfWeek): Self = this.set("firstDayOfWeek", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteFirstDayOfWeek: Self = this.set("firstDayOfWeek", js.undefined)
    
    @scala.inline
    def setFirstWeekOfYear(value: typings.fluentuiDateTimeUtilities.dateValuesMod.FirstWeekOfYear): Self = this.set("firstWeekOfYear", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteFirstWeekOfYear: Self = this.set("firstWeekOfYear", js.undefined)
    
    @scala.inline
    def setHighlightCurrentMonth(value: Boolean): Self = this.set("highlightCurrentMonth", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteHighlightCurrentMonth: Self = this.set("highlightCurrentMonth", js.undefined)
    
    @scala.inline
    def setHighlightSelectedMonth(value: Boolean): Self = this.set("highlightSelectedMonth", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteHighlightSelectedMonth: Self = this.set("highlightSelectedMonth", js.undefined)
    
    @scala.inline
    def setIsDayPickerVisible(value: Boolean): Self = this.set("isDayPickerVisible", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteIsDayPickerVisible: Self = this.set("isDayPickerVisible", js.undefined)
    
    @scala.inline
    def setIsMonthPickerVisible(value: Boolean): Self = this.set("isMonthPickerVisible", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteIsMonthPickerVisible: Self = this.set("isMonthPickerVisible", js.undefined)
    
    @scala.inline
    def setMaxDate(value: Date): Self = this.set("maxDate", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteMaxDate: Self = this.set("maxDate", js.undefined)
    
    @scala.inline
    def setMinDate(value: Date): Self = this.set("minDate", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteMinDate: Self = this.set("minDate", js.undefined)
    
    @scala.inline
    def setNavigationIcons(value: ICalendarIconStrings): Self = this.set("navigationIcons", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteNavigationIcons: Self = this.set("navigationIcons", js.undefined)
    
    @scala.inline
    def setOnDismiss(value: () => Unit): Self = this.set("onDismiss", js.Any.fromFunction0(value))
    
    @scala.inline
    def deleteOnDismiss: Self = this.set("onDismiss", js.undefined)
    
    @scala.inline
    def setOnSelectDate(value: (/* date */ Date, /* selectedDateRangeArray */ js.UndefOr[js.Array[Date]]) => Unit): Self = this.set("onSelectDate", js.Any.fromFunction2(value))
    
    @scala.inline
    def deleteOnSelectDate: Self = this.set("onSelectDate", js.undefined)
    
    @scala.inline
    def setRestrictedDatesVarargs(value: Date*): Self = this.set("restrictedDates", js.Array(value :_*))
    
    @scala.inline
    def setRestrictedDates(value: js.Array[Date]): Self = this.set("restrictedDates", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteRestrictedDates: Self = this.set("restrictedDates", js.undefined)
    
    @scala.inline
    def setSelectDateOnClick(value: Boolean): Self = this.set("selectDateOnClick", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSelectDateOnClick: Self = this.set("selectDateOnClick", js.undefined)
    
    @scala.inline
    def setShouldFocusOnMount(value: Boolean): Self = this.set("shouldFocusOnMount", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteShouldFocusOnMount: Self = this.set("shouldFocusOnMount", js.undefined)
    
    @scala.inline
    def setShowCloseButton(value: Boolean): Self = this.set("showCloseButton", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteShowCloseButton: Self = this.set("showCloseButton", js.undefined)
    
    @scala.inline
    def setShowGoToToday(value: Boolean): Self = this.set("showGoToToday", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteShowGoToToday: Self = this.set("showGoToToday", js.undefined)
    
    @scala.inline
    def setShowMonthPickerAsOverlay(value: Boolean): Self = this.set("showMonthPickerAsOverlay", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteShowMonthPickerAsOverlay: Self = this.set("showMonthPickerAsOverlay", js.undefined)
    
    @scala.inline
    def setShowSixWeeksByDefault(value: Boolean): Self = this.set("showSixWeeksByDefault", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteShowSixWeeksByDefault: Self = this.set("showSixWeeksByDefault", js.undefined)
    
    @scala.inline
    def setShowWeekNumbers(value: Boolean): Self = this.set("showWeekNumbers", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteShowWeekNumbers: Self = this.set("showWeekNumbers", js.undefined)
    
    @scala.inline
    def setStrings(value: ICalendarStrings): Self = this.set("strings", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStringsNull: Self = this.set("strings", null)
    
    @scala.inline
    def setToday(value: Date): Self = this.set("today", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteToday: Self = this.set("today", js.undefined)
    
    @scala.inline
    def setValue(value: Date): Self = this.set("value", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteValue: Self = this.set("value", js.undefined)
    
    @scala.inline
    def setWorkWeekDaysVarargs(value: typings.fluentuiDateTimeUtilities.dateValuesMod.DayOfWeek*): Self = this.set("workWeekDays", js.Array(value :_*))
    
    @scala.inline
    def setWorkWeekDays(value: js.Array[typings.fluentuiDateTimeUtilities.dateValuesMod.DayOfWeek]): Self = this.set("workWeekDays", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteWorkWeekDays: Self = this.set("workWeekDays", js.undefined)
    
    @scala.inline
    def setYearPickerHidden(value: Boolean): Self = this.set("yearPickerHidden", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteYearPickerHidden: Self = this.set("yearPickerHidden", js.undefined)
  }
}
