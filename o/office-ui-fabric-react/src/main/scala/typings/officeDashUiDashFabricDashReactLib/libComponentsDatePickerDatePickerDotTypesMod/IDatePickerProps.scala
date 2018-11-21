package typings
package officeDashUiDashFabricDashReactLib.libComponentsDatePickerDatePickerDotTypesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._


trait IDatePickerProps
  extends reactLib.reactMod.ReactNs.HTMLAttributes[reactLib.HTMLElement]
     with atUifabricUtilitiesLib.libBaseComponentMod.IBaseProps[IDatePicker] {
  /**
       * Allows all elements to be focused, including disabled ones
       * @defaultvalue false
       */
  var allFocusable: js.UndefOr[scala.Boolean] = js.undefined
  /**
       * Whether the DatePicker allows input a date string directly or not
       * @defaultvalue false
       */
  var allowTextInput: js.UndefOr[scala.Boolean] = js.undefined
  /**
       * Aria Label for TextField of the DatePicker for screen reader users.
       */
  var ariaLabel: js.UndefOr[java.lang.String] = js.undefined
  /**
       * Determines if DatePicker has a border.
       * @defaultvalue false
       */
  var borderless: js.UndefOr[scala.Boolean] = js.undefined
  /**
       * Pass calendar props to calendar component
       */
  var calendarProps: js.UndefOr[
    officeDashUiDashFabricDashReactLib.libComponentsCalendarCalendarDotTypesMod.ICalendarProps
  ] = js.undefined
  /**
       * Apply additional formating to dates, for example localized date formatting.
       */
  var dateTimeFormatter: js.UndefOr[
    officeDashUiDashFabricDashReactLib.libComponentsCalendarCalendarDotTypesMod.ICalendarFormatDateCallbacks
  ] = js.undefined
  /**
       * Whether the DatePicker should open automatically when the control is focused
       * @defaultvalue false
       */
  var disableAutoFocus: js.UndefOr[scala.Boolean] = js.undefined
  /**
       * Disabled state of the DatePicker.
       * @default false
       */
  var disabled: js.UndefOr[scala.Boolean] = js.undefined
  /**
       * The first day of the week for your locale.
       * @defaultvalue DayOfWeek.Sunday
       */
  var firstDayOfWeek: js.UndefOr[officeDashUiDashFabricDashReactLib.libUtilitiesDateValuesDateValuesMod.DayOfWeek] = js.undefined
  /**
       * Defines when the first week of the year should start, FirstWeekOfYear.FirstDay,
       * FirstWeekOfYear.FirstFullWeek or FirstWeekOfYear.FirstFourDayWeek are the possible values
       * @defaultvalue FirstWeekOfYear.FirstFullWeek
       */
  var firstWeekOfYear: js.UndefOr[
    officeDashUiDashFabricDashReactLib.libUtilitiesDateValuesDateValuesMod.FirstWeekOfYear
  ] = js.undefined
  /**
       * Optional method to format the chosen date to a string to display in the DatePicker
       * @defaultvalue date.toString()
       */
  var formatDate: js.UndefOr[js.Function1[/* date */ js.UndefOr[stdLib.Date], java.lang.String]] = js.undefined
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
       * The initially highlighted date in the calendar picker
       */
  var initialPickerDate: js.UndefOr[stdLib.Date] = js.undefined
  /**
       * Whether the month picker is shown beside the day picker or hidden.
       * @defaultvalue true
       */
  var isMonthPickerVisible: js.UndefOr[scala.Boolean] = js.undefined
  /**
       * Whether the DatePicker is a required field or not
       * @defaultvalue false
       */
  var isRequired: js.UndefOr[scala.Boolean] = js.undefined
  /**
       * Label for the DatePicker
       */
  var label: js.UndefOr[java.lang.String] = js.undefined
  /**
       * The maximum allowable date.
       */
  var maxDate: js.UndefOr[stdLib.Date] = js.undefined
  /**
       * The minimum allowable date.
       */
  var minDate: js.UndefOr[stdLib.Date] = js.undefined
  /**
       * Callback that runs after DatePicker's menu (Calendar) is closed
       */
  var onAfterMenuDismiss: js.UndefOr[js.Function0[scala.Unit]] = js.undefined
  /**
       * Callback issued when a date is selected
       */
  var onSelectDate: js.UndefOr[js.Function1[/* date */ js.UndefOr[stdLib.Date | scala.Null], scala.Unit]] = js.undefined
  /**
       * Optional method to parse the text input value to date, it is only useful when allowTextInput is set to true
       * @defaultvalue new Date(Date.parse(dateStr))
       */
  var parseDateFromString: js.UndefOr[js.Function1[/* dateStr */ java.lang.String, stdLib.Date | scala.Null]] = js.undefined
  /**
       * Aria label for date picker popup for screen reader users.
       * @defaultvalue Calendar
       */
  var pickerAriaLabel: js.UndefOr[java.lang.String] = js.undefined
  /**
       * Whether the CalendarDay close button should be shown or not.
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
       * Whether the calendar should show the week number (weeks 1 to 53) before each week row
       * @defaultvalue false
       */
  var showWeekNumbers: js.UndefOr[scala.Boolean] = js.undefined
  /**
       * Localized strings to use in the DatePicker
       */
  var strings: js.UndefOr[IDatePickerStrings] = js.undefined
  /**
       * Call to provide customized styling that will layer on top of the variant rules.
       */
  var styles: js.UndefOr[
    atUifabricMergeDashStylesLib.libIStyleFunctionMod.IStyleFunction[IDatePickerStyleProps, IDatePickerStyles]
  ] = js.undefined
  /**
       * Theme provided by High-Order Component.
       */
  var theme: js.UndefOr[atUifabricStylingLib.libInterfacesIThemeMod.ITheme] = js.undefined
  /**
       * Value of today. If null, current time in client machine will be used.
       */
  var today: js.UndefOr[stdLib.Date] = js.undefined
  /**
       * Whether or not the Textfield of the DatePicker is underlined.
       * @default false
       */
  var underlined: js.UndefOr[scala.Boolean] = js.undefined
  /**
       * Default value of the DatePicker, if any
       */
  var value: js.UndefOr[stdLib.Date] = js.undefined
}

