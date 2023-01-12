package typings.officeUiFabricReact

import typings.fluentuiDateTimeUtilities.libDateValuesDateValuesMod.DateRangeType
import typings.fluentuiDateTimeUtilities.libDateValuesDateValuesMod.DayOfWeek
import typings.fluentuiDateTimeUtilities.libDateValuesDateValuesMod.FirstWeekOfYear
import typings.react.mod.HTMLAttributes
import typings.std.HTMLElement
import typings.uifabricUtilities.libBaseComponentDottypesMod.IBaseProps
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object libComponentsCalendarCalendarDottypesMod {
  
  @JSImport("office-ui-fabric-react/lib/components/Calendar/Calendar.types", "DateRangeType")
  @js.native
  object DateRangeType extends StObject {
    
    @JSBracketAccess
    def apply(value: Double): js.UndefOr[
        typings.fluentuiDateTimeUtilities.libDateValuesDateValuesMod.DateRangeType & Double
      ] = js.native
    
    /* 0 */ val Day: typings.fluentuiDateTimeUtilities.libDateValuesDateValuesMod.DateRangeType.Day & Double = js.native
    
    /* 2 */ val Month: typings.fluentuiDateTimeUtilities.libDateValuesDateValuesMod.DateRangeType.Month & Double = js.native
    
    /* 1 */ val Week: typings.fluentuiDateTimeUtilities.libDateValuesDateValuesMod.DateRangeType.Week & Double = js.native
    
    /* 3 */ val WorkWeek: typings.fluentuiDateTimeUtilities.libDateValuesDateValuesMod.DateRangeType.WorkWeek & Double = js.native
  }
  
  @JSImport("office-ui-fabric-react/lib/components/Calendar/Calendar.types", "DayOfWeek")
  @js.native
  object DayOfWeek extends StObject {
    
    @JSBracketAccess
    def apply(value: Double): js.UndefOr[typings.fluentuiDateTimeUtilities.libDateValuesDateValuesMod.DayOfWeek & Double] = js.native
    
    /* 5 */ val Friday: typings.fluentuiDateTimeUtilities.libDateValuesDateValuesMod.DayOfWeek.Friday & Double = js.native
    
    /* 1 */ val Monday: typings.fluentuiDateTimeUtilities.libDateValuesDateValuesMod.DayOfWeek.Monday & Double = js.native
    
    /* 6 */ val Saturday: typings.fluentuiDateTimeUtilities.libDateValuesDateValuesMod.DayOfWeek.Saturday & Double = js.native
    
    /* 0 */ val Sunday: typings.fluentuiDateTimeUtilities.libDateValuesDateValuesMod.DayOfWeek.Sunday & Double = js.native
    
    /* 4 */ val Thursday: typings.fluentuiDateTimeUtilities.libDateValuesDateValuesMod.DayOfWeek.Thursday & Double = js.native
    
    /* 2 */ val Tuesday: typings.fluentuiDateTimeUtilities.libDateValuesDateValuesMod.DayOfWeek.Tuesday & Double = js.native
    
    /* 3 */ val Wednesday: typings.fluentuiDateTimeUtilities.libDateValuesDateValuesMod.DayOfWeek.Wednesday & Double = js.native
  }
  
  @JSImport("office-ui-fabric-react/lib/components/Calendar/Calendar.types", "FirstWeekOfYear")
  @js.native
  object FirstWeekOfYear extends StObject {
    
    @JSBracketAccess
    def apply(value: Double): js.UndefOr[
        typings.fluentuiDateTimeUtilities.libDateValuesDateValuesMod.FirstWeekOfYear & Double
      ] = js.native
    
    /* 0 */ val FirstDay: typings.fluentuiDateTimeUtilities.libDateValuesDateValuesMod.FirstWeekOfYear.FirstDay & Double = js.native
    
    /* 2 */ val FirstFourDayWeek: typings.fluentuiDateTimeUtilities.libDateValuesDateValuesMod.FirstWeekOfYear.FirstFourDayWeek & Double = js.native
    
    /* 1 */ val FirstFullWeek: typings.fluentuiDateTimeUtilities.libDateValuesDateValuesMod.FirstWeekOfYear.FirstFullWeek & Double = js.native
  }
  
  trait ICalendar extends StObject {
    
    /** Sets focus to the selected date. */
    def focus(): Unit
  }
  object ICalendar {
    
    inline def apply(focus: () => Unit): ICalendar = {
      val __obj = js.Dynamic.literal(focus = js.Any.fromFunction0(focus))
      __obj.asInstanceOf[ICalendar]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: ICalendar] (val x: Self) extends AnyVal {
      
      inline def setFocus(value: () => Unit): Self = StObject.set(x, "focus", js.Any.fromFunction0(value))
    }
  }
  
  @js.native
  trait ICalendarFormatDateCallbacks extends StObject {
    
    /**
      * Callback to apply formatting to the days in the Day Picker calendar
      */
    def formatDay(date: js.Date): String = js.native
    
    /**
      * Callback to apply formatting to mmmm d, yyyy formated dates
      */
    def formatMonthDayYear(date: js.Date): String = js.native
    def formatMonthDayYear(date: js.Date, strings: ICalendarStrings): String = js.native
    
    /**
      * Callback to apply formatting to the month and year in the Day Picker header
      */
    def formatMonthYear(date: js.Date): String = js.native
    def formatMonthYear(date: js.Date, strings: ICalendarStrings): String = js.native
    
    /**
      * Callback to apply formatting to the year in the Month Picker header
      */
    def formatYear(date: js.Date): String = js.native
  }
  
  trait ICalendarIconStrings extends StObject {
    
    /**
      * Close icon
      * @defaultvalue 'CalculatorMultiply'
      */
    var closeIcon: js.UndefOr[String] = js.undefined
    
    /**
      * FabricMDL2Icons name for the left navigation icon.  Previous default: ChevronLeft.
      * @defaultvalue 'Up'
      */
    var leftNavigation: js.UndefOr[String] = js.undefined
    
    /**
      * FabricMDL2Icons name for the right navigation icon.  Previous default: ChevronRight.
      * @defaultvalue 'Down'
      */
    var rightNavigation: js.UndefOr[String] = js.undefined
  }
  object ICalendarIconStrings {
    
    inline def apply(): ICalendarIconStrings = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[ICalendarIconStrings]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: ICalendarIconStrings] (val x: Self) extends AnyVal {
      
      inline def setCloseIcon(value: String): Self = StObject.set(x, "closeIcon", value.asInstanceOf[js.Any])
      
      inline def setCloseIconUndefined: Self = StObject.set(x, "closeIcon", js.undefined)
      
      inline def setLeftNavigation(value: String): Self = StObject.set(x, "leftNavigation", value.asInstanceOf[js.Any])
      
      inline def setLeftNavigationUndefined: Self = StObject.set(x, "leftNavigation", js.undefined)
      
      inline def setRightNavigation(value: String): Self = StObject.set(x, "rightNavigation", value.asInstanceOf[js.Any])
      
      inline def setRightNavigationUndefined: Self = StObject.set(x, "rightNavigation", js.undefined)
    }
  }
  
  trait ICalendarProps
    extends StObject
       with IBaseProps[ICalendar]
       with HTMLAttributes[HTMLElement] {
    
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
    var dateRangeType: js.UndefOr[DateRangeType] = js.undefined
    
    /**
      * Apply additional formating to dates, for example localized date formatting.
      */
    var dateTimeFormatter: js.UndefOr[ICalendarFormatDateCallbacks] = js.undefined
    
    /**
      * The first day of the week for your locale.
      * @defaultvalue DayOfWeek.Sunday
      */
    var firstDayOfWeek: js.UndefOr[DayOfWeek] = js.undefined
    
    /**
      * Defines when the first week of the year should start, FirstWeekOfYear.FirstDay,
      * FirstWeekOfYear.FirstFullWeek or FirstWeekOfYear.FirstFourDayWeek are the possible values
      * @defaultvalue FirstWeekOfYear.FirstDay
      */
    var firstWeekOfYear: js.UndefOr[FirstWeekOfYear] = js.undefined
    
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
    var maxDate: js.UndefOr[js.Date] = js.undefined
    
    /**
      * If set the Calendar will not allow navigation to or selection of a date earlier than this value.
      */
    var minDate: js.UndefOr[js.Date] = js.undefined
    
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
      * @param selectedDateRangeArray - The resultant list of dates that are selected based on the date range type set
      * for the component.
      */
    var onSelectDate: js.UndefOr[
        js.Function2[/* date */ js.Date, /* selectedDateRangeArray */ js.UndefOr[js.Array[js.Date]], Unit]
      ] = js.undefined
    
    /**
      * If set the Calendar will not allow selection of dates in this array.
      */
    var restrictedDates: js.UndefOr[js.Array[js.Date]] = js.undefined
    
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
    var today: js.UndefOr[js.Date] = js.undefined
    
    /**
      * Default value of the Calendar, if any
      */
    var value: js.UndefOr[js.Date] = js.undefined
    
    /**
      * The days that are selectable when dateRangeType is WorkWeek.
      * If dateRangeType is not WorkWeek this property does nothing.
      * @defaultvalue [Monday,Tuesday,Wednesday,Thursday,Friday]
      */
    var workWeekDays: js.UndefOr[js.Array[DayOfWeek]] = js.undefined
    
    /**
      * Whether the year picker is enabled
      * @defaultvalue false
      */
    var yearPickerHidden: js.UndefOr[Boolean] = js.undefined
  }
  object ICalendarProps {
    
    inline def apply(): ICalendarProps = {
      val __obj = js.Dynamic.literal(strings = null)
      __obj.asInstanceOf[ICalendarProps]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: ICalendarProps] (val x: Self) extends AnyVal {
      
      inline def setAllFocusable(value: Boolean): Self = StObject.set(x, "allFocusable", value.asInstanceOf[js.Any])
      
      inline def setAllFocusableUndefined: Self = StObject.set(x, "allFocusable", js.undefined)
      
      inline def setAutoNavigateOnSelection(value: Boolean): Self = StObject.set(x, "autoNavigateOnSelection", value.asInstanceOf[js.Any])
      
      inline def setAutoNavigateOnSelectionUndefined: Self = StObject.set(x, "autoNavigateOnSelection", js.undefined)
      
      inline def setDateRangeType(value: DateRangeType): Self = StObject.set(x, "dateRangeType", value.asInstanceOf[js.Any])
      
      inline def setDateRangeTypeUndefined: Self = StObject.set(x, "dateRangeType", js.undefined)
      
      inline def setDateTimeFormatter(value: ICalendarFormatDateCallbacks): Self = StObject.set(x, "dateTimeFormatter", value.asInstanceOf[js.Any])
      
      inline def setDateTimeFormatterUndefined: Self = StObject.set(x, "dateTimeFormatter", js.undefined)
      
      inline def setFirstDayOfWeek(value: DayOfWeek): Self = StObject.set(x, "firstDayOfWeek", value.asInstanceOf[js.Any])
      
      inline def setFirstDayOfWeekUndefined: Self = StObject.set(x, "firstDayOfWeek", js.undefined)
      
      inline def setFirstWeekOfYear(value: FirstWeekOfYear): Self = StObject.set(x, "firstWeekOfYear", value.asInstanceOf[js.Any])
      
      inline def setFirstWeekOfYearUndefined: Self = StObject.set(x, "firstWeekOfYear", js.undefined)
      
      inline def setHighlightCurrentMonth(value: Boolean): Self = StObject.set(x, "highlightCurrentMonth", value.asInstanceOf[js.Any])
      
      inline def setHighlightCurrentMonthUndefined: Self = StObject.set(x, "highlightCurrentMonth", js.undefined)
      
      inline def setHighlightSelectedMonth(value: Boolean): Self = StObject.set(x, "highlightSelectedMonth", value.asInstanceOf[js.Any])
      
      inline def setHighlightSelectedMonthUndefined: Self = StObject.set(x, "highlightSelectedMonth", js.undefined)
      
      inline def setIsDayPickerVisible(value: Boolean): Self = StObject.set(x, "isDayPickerVisible", value.asInstanceOf[js.Any])
      
      inline def setIsDayPickerVisibleUndefined: Self = StObject.set(x, "isDayPickerVisible", js.undefined)
      
      inline def setIsMonthPickerVisible(value: Boolean): Self = StObject.set(x, "isMonthPickerVisible", value.asInstanceOf[js.Any])
      
      inline def setIsMonthPickerVisibleUndefined: Self = StObject.set(x, "isMonthPickerVisible", js.undefined)
      
      inline def setMaxDate(value: js.Date): Self = StObject.set(x, "maxDate", value.asInstanceOf[js.Any])
      
      inline def setMaxDateUndefined: Self = StObject.set(x, "maxDate", js.undefined)
      
      inline def setMinDate(value: js.Date): Self = StObject.set(x, "minDate", value.asInstanceOf[js.Any])
      
      inline def setMinDateUndefined: Self = StObject.set(x, "minDate", js.undefined)
      
      inline def setNavigationIcons(value: ICalendarIconStrings): Self = StObject.set(x, "navigationIcons", value.asInstanceOf[js.Any])
      
      inline def setNavigationIconsUndefined: Self = StObject.set(x, "navigationIcons", js.undefined)
      
      inline def setOnDismiss(value: () => Unit): Self = StObject.set(x, "onDismiss", js.Any.fromFunction0(value))
      
      inline def setOnDismissUndefined: Self = StObject.set(x, "onDismiss", js.undefined)
      
      inline def setOnSelectDate(value: (/* date */ js.Date, /* selectedDateRangeArray */ js.UndefOr[js.Array[js.Date]]) => Unit): Self = StObject.set(x, "onSelectDate", js.Any.fromFunction2(value))
      
      inline def setOnSelectDateUndefined: Self = StObject.set(x, "onSelectDate", js.undefined)
      
      inline def setRestrictedDates(value: js.Array[js.Date]): Self = StObject.set(x, "restrictedDates", value.asInstanceOf[js.Any])
      
      inline def setRestrictedDatesUndefined: Self = StObject.set(x, "restrictedDates", js.undefined)
      
      inline def setRestrictedDatesVarargs(value: js.Date*): Self = StObject.set(x, "restrictedDates", js.Array(value*))
      
      inline def setSelectDateOnClick(value: Boolean): Self = StObject.set(x, "selectDateOnClick", value.asInstanceOf[js.Any])
      
      inline def setSelectDateOnClickUndefined: Self = StObject.set(x, "selectDateOnClick", js.undefined)
      
      inline def setShouldFocusOnMount(value: Boolean): Self = StObject.set(x, "shouldFocusOnMount", value.asInstanceOf[js.Any])
      
      inline def setShouldFocusOnMountUndefined: Self = StObject.set(x, "shouldFocusOnMount", js.undefined)
      
      inline def setShowCloseButton(value: Boolean): Self = StObject.set(x, "showCloseButton", value.asInstanceOf[js.Any])
      
      inline def setShowCloseButtonUndefined: Self = StObject.set(x, "showCloseButton", js.undefined)
      
      inline def setShowGoToToday(value: Boolean): Self = StObject.set(x, "showGoToToday", value.asInstanceOf[js.Any])
      
      inline def setShowGoToTodayUndefined: Self = StObject.set(x, "showGoToToday", js.undefined)
      
      inline def setShowMonthPickerAsOverlay(value: Boolean): Self = StObject.set(x, "showMonthPickerAsOverlay", value.asInstanceOf[js.Any])
      
      inline def setShowMonthPickerAsOverlayUndefined: Self = StObject.set(x, "showMonthPickerAsOverlay", js.undefined)
      
      inline def setShowSixWeeksByDefault(value: Boolean): Self = StObject.set(x, "showSixWeeksByDefault", value.asInstanceOf[js.Any])
      
      inline def setShowSixWeeksByDefaultUndefined: Self = StObject.set(x, "showSixWeeksByDefault", js.undefined)
      
      inline def setShowWeekNumbers(value: Boolean): Self = StObject.set(x, "showWeekNumbers", value.asInstanceOf[js.Any])
      
      inline def setShowWeekNumbersUndefined: Self = StObject.set(x, "showWeekNumbers", js.undefined)
      
      inline def setStrings(value: ICalendarStrings): Self = StObject.set(x, "strings", value.asInstanceOf[js.Any])
      
      inline def setStringsNull: Self = StObject.set(x, "strings", null)
      
      inline def setToday(value: js.Date): Self = StObject.set(x, "today", value.asInstanceOf[js.Any])
      
      inline def setTodayUndefined: Self = StObject.set(x, "today", js.undefined)
      
      inline def setValue(value: js.Date): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
      
      inline def setValueUndefined: Self = StObject.set(x, "value", js.undefined)
      
      inline def setWorkWeekDays(value: js.Array[DayOfWeek]): Self = StObject.set(x, "workWeekDays", value.asInstanceOf[js.Any])
      
      inline def setWorkWeekDaysUndefined: Self = StObject.set(x, "workWeekDays", js.undefined)
      
      inline def setWorkWeekDaysVarargs(value: DayOfWeek*): Self = StObject.set(x, "workWeekDays", js.Array(value*))
      
      inline def setYearPickerHidden(value: Boolean): Self = StObject.set(x, "yearPickerHidden", value.asInstanceOf[js.Any])
      
      inline def setYearPickerHiddenUndefined: Self = StObject.set(x, "yearPickerHidden", js.undefined)
    }
  }
  
  trait ICalendarStrings extends StObject {
    
    /**
      * Aria-label for the "close" button.
      */
    var closeButtonAriaLabel: js.UndefOr[String] = js.undefined
    
    /**
      * An array of strings for the full names of days of the week.
      * The array is 0-based, so days[0] should be the full name of Sunday.
      */
    var days: js.Array[String]
    
    /**
      * String to render for button to direct the user to today's date.
      */
    var goToToday: String
    
    /**
      * Aria-label format string for the header button in the month picker. Should have 1 string param, e.g. "`{0}`,
      * select to change the year". This aria-label will only be applied if the year picker is enabled; otherwise
      * the label will default to the header string, e.g. "2019".
      */
    var monthPickerHeaderAriaLabel: js.UndefOr[String] = js.undefined
    
    /**
      * An array of strings for the full names of months.
      * The array is 0-based, so months[0] should be the full name of January.
      */
    var months: js.Array[String]
    
    /**
      * Aria-label for the "next month" button.
      */
    var nextMonthAriaLabel: js.UndefOr[String] = js.undefined
    
    /**
      * Aria-label for the "next year" button.
      */
    var nextYearAriaLabel: js.UndefOr[String] = js.undefined
    
    /**
      * Aria-label for the "next year range" button.
      */
    var nextYearRangeAriaLabel: js.UndefOr[String] = js.undefined
    
    /**
      * Aria-label for the "previous month" button.
      */
    var prevMonthAriaLabel: js.UndefOr[String] = js.undefined
    
    /**
      * Aria-label for the "previous year" button.
      */
    var prevYearAriaLabel: js.UndefOr[String] = js.undefined
    
    /**
      * Aria-label for the "previous year range" button.
      */
    var prevYearRangeAriaLabel: js.UndefOr[String] = js.undefined
    
    /**
      * An array of strings for the initials of the days of the week.
      * The array is 0-based, so days[0] should be the initial of Sunday.
      */
    var shortDays: js.Array[String]
    
    /**
      * An array of strings for the short names of months.
      * The array is 0-based, so shortMonths[0] should be the short name of January.
      */
    var shortMonths: js.Array[String]
    
    /**
      * Aria-label format string for the week number header. Should have 1 string param e.g. "week number \{0\}"
      */
    var weekNumberFormatString: js.UndefOr[String] = js.undefined
    
    /**
      * Aria-label format string for the header button in the year picker.
      * Should have 1 string param, e.g. "`{0}`, select to change the month"
      */
    var yearPickerHeaderAriaLabel: js.UndefOr[String] = js.undefined
  }
  object ICalendarStrings {
    
    inline def apply(
      days: js.Array[String],
      goToToday: String,
      months: js.Array[String],
      shortDays: js.Array[String],
      shortMonths: js.Array[String]
    ): ICalendarStrings = {
      val __obj = js.Dynamic.literal(days = days.asInstanceOf[js.Any], goToToday = goToToday.asInstanceOf[js.Any], months = months.asInstanceOf[js.Any], shortDays = shortDays.asInstanceOf[js.Any], shortMonths = shortMonths.asInstanceOf[js.Any])
      __obj.asInstanceOf[ICalendarStrings]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: ICalendarStrings] (val x: Self) extends AnyVal {
      
      inline def setCloseButtonAriaLabel(value: String): Self = StObject.set(x, "closeButtonAriaLabel", value.asInstanceOf[js.Any])
      
      inline def setCloseButtonAriaLabelUndefined: Self = StObject.set(x, "closeButtonAriaLabel", js.undefined)
      
      inline def setDays(value: js.Array[String]): Self = StObject.set(x, "days", value.asInstanceOf[js.Any])
      
      inline def setDaysVarargs(value: String*): Self = StObject.set(x, "days", js.Array(value*))
      
      inline def setGoToToday(value: String): Self = StObject.set(x, "goToToday", value.asInstanceOf[js.Any])
      
      inline def setMonthPickerHeaderAriaLabel(value: String): Self = StObject.set(x, "monthPickerHeaderAriaLabel", value.asInstanceOf[js.Any])
      
      inline def setMonthPickerHeaderAriaLabelUndefined: Self = StObject.set(x, "monthPickerHeaderAriaLabel", js.undefined)
      
      inline def setMonths(value: js.Array[String]): Self = StObject.set(x, "months", value.asInstanceOf[js.Any])
      
      inline def setMonthsVarargs(value: String*): Self = StObject.set(x, "months", js.Array(value*))
      
      inline def setNextMonthAriaLabel(value: String): Self = StObject.set(x, "nextMonthAriaLabel", value.asInstanceOf[js.Any])
      
      inline def setNextMonthAriaLabelUndefined: Self = StObject.set(x, "nextMonthAriaLabel", js.undefined)
      
      inline def setNextYearAriaLabel(value: String): Self = StObject.set(x, "nextYearAriaLabel", value.asInstanceOf[js.Any])
      
      inline def setNextYearAriaLabelUndefined: Self = StObject.set(x, "nextYearAriaLabel", js.undefined)
      
      inline def setNextYearRangeAriaLabel(value: String): Self = StObject.set(x, "nextYearRangeAriaLabel", value.asInstanceOf[js.Any])
      
      inline def setNextYearRangeAriaLabelUndefined: Self = StObject.set(x, "nextYearRangeAriaLabel", js.undefined)
      
      inline def setPrevMonthAriaLabel(value: String): Self = StObject.set(x, "prevMonthAriaLabel", value.asInstanceOf[js.Any])
      
      inline def setPrevMonthAriaLabelUndefined: Self = StObject.set(x, "prevMonthAriaLabel", js.undefined)
      
      inline def setPrevYearAriaLabel(value: String): Self = StObject.set(x, "prevYearAriaLabel", value.asInstanceOf[js.Any])
      
      inline def setPrevYearAriaLabelUndefined: Self = StObject.set(x, "prevYearAriaLabel", js.undefined)
      
      inline def setPrevYearRangeAriaLabel(value: String): Self = StObject.set(x, "prevYearRangeAriaLabel", value.asInstanceOf[js.Any])
      
      inline def setPrevYearRangeAriaLabelUndefined: Self = StObject.set(x, "prevYearRangeAriaLabel", js.undefined)
      
      inline def setShortDays(value: js.Array[String]): Self = StObject.set(x, "shortDays", value.asInstanceOf[js.Any])
      
      inline def setShortDaysVarargs(value: String*): Self = StObject.set(x, "shortDays", js.Array(value*))
      
      inline def setShortMonths(value: js.Array[String]): Self = StObject.set(x, "shortMonths", value.asInstanceOf[js.Any])
      
      inline def setShortMonthsVarargs(value: String*): Self = StObject.set(x, "shortMonths", js.Array(value*))
      
      inline def setWeekNumberFormatString(value: String): Self = StObject.set(x, "weekNumberFormatString", value.asInstanceOf[js.Any])
      
      inline def setWeekNumberFormatStringUndefined: Self = StObject.set(x, "weekNumberFormatString", js.undefined)
      
      inline def setYearPickerHeaderAriaLabel(value: String): Self = StObject.set(x, "yearPickerHeaderAriaLabel", value.asInstanceOf[js.Any])
      
      inline def setYearPickerHeaderAriaLabelUndefined: Self = StObject.set(x, "yearPickerHeaderAriaLabel", js.undefined)
    }
  }
}
