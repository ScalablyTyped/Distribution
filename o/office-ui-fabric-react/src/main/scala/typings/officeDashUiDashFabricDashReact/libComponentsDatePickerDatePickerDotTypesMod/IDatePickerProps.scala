package typings.officeDashUiDashFabricDashReact.libComponentsDatePickerDatePickerDotTypesMod

import typings.atUifabricMergeDashStyles.libIStyleFunctionMod.IStyleFunction
import typings.atUifabricStyling.libInterfacesIThemeMod.ITheme
import typings.atUifabricUtilities.libBaseComponentDotTypesMod.IBaseProps
import typings.atUifabricUtilities.libCreateRefMod.IRefObject
import typings.atUifabricUtilities.libIComponentAsMod.IComponentAs
import typings.officeDashUiDashFabricDashReact.libComponentsCalendarCalendarDotTypesMod.ICalendarFormatDateCallbacks
import typings.officeDashUiDashFabricDashReact.libComponentsCalendarCalendarDotTypesMod.ICalendarProps
import typings.officeDashUiDashFabricDashReact.libComponentsCalloutCalloutDotTypesMod.ICalloutProps
import typings.officeDashUiDashFabricDashReact.libComponentsTextFieldTextFieldDotTypesMod.ITextFieldProps
import typings.officeDashUiDashFabricDashReact.libUtilitiesDateValuesDateValuesMod.DayOfWeek
import typings.officeDashUiDashFabricDashReact.libUtilitiesDateValuesDateValuesMod.FirstWeekOfYear
import typings.react.reactMod.HTMLAttributes
import typings.std.Date
import typings.std.HTMLElement
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IDatePickerProps
  extends HTMLAttributes[HTMLElement]
     with IBaseProps[IDatePicker] {
  /**
    * Allows all elements to be focused, including disabled ones
    * @defaultvalue false
    */
  var allFocusable: js.UndefOr[Boolean] = js.undefined
  /**
    * Whether the DatePicker allows input a date string directly or not
    * @defaultvalue false
    */
  var allowTextInput: js.UndefOr[Boolean] = js.undefined
  /**
    * Aria Label for TextField of the DatePicker for screen reader users.
    */
  var ariaLabel: js.UndefOr[String] = js.undefined
  /**
    * Determines if DatePicker has a border.
    * @defaultvalue false
    */
  var borderless: js.UndefOr[Boolean] = js.undefined
  /**
    * Custom Calendar to be used for date picking
    */
  var calendarAs: js.UndefOr[IComponentAs[ICalendarProps]] = js.undefined
  /**
    * Pass calendar props to calendar component
    */
  var calendarProps: js.UndefOr[ICalendarProps] = js.undefined
  /**
    * Pass callout props to callout component
    */
  var calloutProps: js.UndefOr[ICalloutProps] = js.undefined
  /**
    * Apply additional formating to dates, for example localized date formatting.
    */
  var dateTimeFormatter: js.UndefOr[ICalendarFormatDateCallbacks] = js.undefined
  /**
    * Whether the DatePicker should open automatically when the control is focused
    * @defaultvalue false
    */
  var disableAutoFocus: js.UndefOr[Boolean] = js.undefined
  /**
    * Disabled state of the DatePicker.
    * @defaultvalue false
    */
  var disabled: js.UndefOr[Boolean] = js.undefined
  /**
    * The first day of the week for your locale.
    * @defaultvalue DayOfWeek.Sunday
    */
  var firstDayOfWeek: js.UndefOr[DayOfWeek] = js.undefined
  /**
    * Defines when the first week of the year should start, FirstWeekOfYear.FirstDay,
    * FirstWeekOfYear.FirstFullWeek or FirstWeekOfYear.FirstFourDayWeek are the possible values
    * @defaultvalue FirstWeekOfYear.FirstFullWeek
    */
  var firstWeekOfYear: js.UndefOr[FirstWeekOfYear] = js.undefined
  /**
    * Optional method to format the chosen date to a string to display in the DatePicker
    * @defaultvalue date.toString()
    */
  var formatDate: js.UndefOr[js.Function1[/* date */ js.UndefOr[Date], String]] = js.undefined
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
    * The initially highlighted date in the calendar picker
    */
  var initialPickerDate: js.UndefOr[Date] = js.undefined
  /**
    * Whether the month picker is shown beside the day picker or hidden.
    * @defaultvalue true
    */
  var isMonthPickerVisible: js.UndefOr[Boolean] = js.undefined
  /**
    * Whether the DatePicker is a required field or not
    * @defaultvalue false
    */
  var isRequired: js.UndefOr[Boolean] = js.undefined
  /**
    * Label for the DatePicker
    */
  var label: js.UndefOr[String] = js.undefined
  /**
    * The maximum allowable date.
    */
  var maxDate: js.UndefOr[Date] = js.undefined
  /**
    * The minimum allowable date.
    */
  var minDate: js.UndefOr[Date] = js.undefined
  /**
    * Callback that runs after DatePicker's menu (Calendar) is closed
    */
  var onAfterMenuDismiss: js.UndefOr[js.Function0[Unit]] = js.undefined
  /**
    * Callback issued when a date is selected
    */
  var onSelectDate: js.UndefOr[js.Function1[/* date */ js.UndefOr[Date | Null], Unit]] = js.undefined
  /**
    * Optional method to parse the text input value to date, it is only useful when allowTextInput is set to true
    * @defaultvalue new Date(Date.parse(dateStr))
    */
  var parseDateFromString: js.UndefOr[js.Function1[/* dateStr */ String, Date | Null]] = js.undefined
  /**
    * Aria label for date picker popup for screen reader users.
    * @defaultvalue Calendar
    */
  var pickerAriaLabel: js.UndefOr[String] = js.undefined
  /**
    * Whether the CalendarDay close button should be shown or not.
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
    * Whether the calendar should show the week number (weeks 1 to 53) before each week row
    * @defaultvalue false
    */
  var showWeekNumbers: js.UndefOr[Boolean] = js.undefined
  /**
    * Localized strings to use in the DatePicker
    */
  var strings: js.UndefOr[IDatePickerStrings] = js.undefined
  /**
    * Call to provide customized styling that will layer on top of the variant rules.
    */
  var styles: js.UndefOr[IStyleFunction[IDatePickerStyleProps, IDatePickerStyles]] = js.undefined
  /**
    * Pass textField props to textField component.
    * Prop name is "textField" for compatiblity with upcoming slots work.
    */
  var textField: js.UndefOr[ITextFieldProps] = js.undefined
  /**
    * Theme provided by High-Order Component.
    */
  var theme: js.UndefOr[ITheme] = js.undefined
  /**
    * Value of today. If null, current time in client machine will be used.
    */
  var today: js.UndefOr[Date] = js.undefined
  /**
    * Whether or not the Textfield of the DatePicker is underlined.
    * @defaultvalue false
    */
  var underlined: js.UndefOr[Boolean] = js.undefined
  /**
    * Default value of the DatePicker, if any
    */
  var value: js.UndefOr[Date] = js.undefined
}

object IDatePickerProps {
  @scala.inline
  def apply(
    HTMLAttributes: HTMLAttributes[HTMLElement] = null,
    IBaseProps: IBaseProps[IDatePicker] = null,
    allFocusable: js.UndefOr[Boolean] = js.undefined,
    allowTextInput: js.UndefOr[Boolean] = js.undefined,
    ariaLabel: String = null,
    borderless: js.UndefOr[Boolean] = js.undefined,
    calendarAs: IComponentAs[ICalendarProps] = null,
    calendarProps: ICalendarProps = null,
    calloutProps: ICalloutProps = null,
    className: String = null,
    componentRef: IRefObject[IDatePicker] = null,
    dateTimeFormatter: ICalendarFormatDateCallbacks = null,
    disableAutoFocus: js.UndefOr[Boolean] = js.undefined,
    disabled: js.UndefOr[Boolean] = js.undefined,
    firstDayOfWeek: DayOfWeek = null,
    firstWeekOfYear: FirstWeekOfYear = null,
    formatDate: /* date */ js.UndefOr[Date] => String = null,
    highlightCurrentMonth: js.UndefOr[Boolean] = js.undefined,
    highlightSelectedMonth: js.UndefOr[Boolean] = js.undefined,
    initialPickerDate: Date = null,
    isMonthPickerVisible: js.UndefOr[Boolean] = js.undefined,
    isRequired: js.UndefOr[Boolean] = js.undefined,
    label: String = null,
    maxDate: Date = null,
    minDate: Date = null,
    onAfterMenuDismiss: () => Unit = null,
    onSelectDate: /* date */ js.UndefOr[Date | Null] => Unit = null,
    parseDateFromString: /* dateStr */ String => Date | Null = null,
    pickerAriaLabel: String = null,
    placeholder: String = null,
    showCloseButton: js.UndefOr[Boolean] = js.undefined,
    showGoToToday: js.UndefOr[Boolean] = js.undefined,
    showMonthPickerAsOverlay: js.UndefOr[Boolean] = js.undefined,
    showWeekNumbers: js.UndefOr[Boolean] = js.undefined,
    strings: IDatePickerStrings = null,
    styles: IStyleFunction[IDatePickerStyleProps, IDatePickerStyles] = null,
    tabIndex: Int | Double = null,
    textField: ITextFieldProps = null,
    theme: ITheme = null,
    today: Date = null,
    underlined: js.UndefOr[Boolean] = js.undefined,
    value: Date = null
  ): IDatePickerProps = {
    val __obj = js.Dynamic.literal()
    js.Dynamic.global.Object.assign(__obj, HTMLAttributes)
    js.Dynamic.global.Object.assign(__obj, IBaseProps)
    if (!js.isUndefined(allFocusable)) __obj.updateDynamic("allFocusable")(allFocusable)
    if (!js.isUndefined(allowTextInput)) __obj.updateDynamic("allowTextInput")(allowTextInput)
    if (ariaLabel != null) __obj.updateDynamic("ariaLabel")(ariaLabel)
    if (!js.isUndefined(borderless)) __obj.updateDynamic("borderless")(borderless)
    if (calendarAs != null) __obj.updateDynamic("calendarAs")(calendarAs.asInstanceOf[js.Any])
    if (calendarProps != null) __obj.updateDynamic("calendarProps")(calendarProps)
    if (calloutProps != null) __obj.updateDynamic("calloutProps")(calloutProps)
    if (className != null) __obj.updateDynamic("className")(className)
    if (componentRef != null) __obj.updateDynamic("componentRef")(componentRef.asInstanceOf[js.Any])
    if (dateTimeFormatter != null) __obj.updateDynamic("dateTimeFormatter")(dateTimeFormatter)
    if (!js.isUndefined(disableAutoFocus)) __obj.updateDynamic("disableAutoFocus")(disableAutoFocus)
    if (!js.isUndefined(disabled)) __obj.updateDynamic("disabled")(disabled)
    if (firstDayOfWeek != null) __obj.updateDynamic("firstDayOfWeek")(firstDayOfWeek)
    if (firstWeekOfYear != null) __obj.updateDynamic("firstWeekOfYear")(firstWeekOfYear)
    if (formatDate != null) __obj.updateDynamic("formatDate")(js.Any.fromFunction1(formatDate))
    if (!js.isUndefined(highlightCurrentMonth)) __obj.updateDynamic("highlightCurrentMonth")(highlightCurrentMonth)
    if (!js.isUndefined(highlightSelectedMonth)) __obj.updateDynamic("highlightSelectedMonth")(highlightSelectedMonth)
    if (initialPickerDate != null) __obj.updateDynamic("initialPickerDate")(initialPickerDate)
    if (!js.isUndefined(isMonthPickerVisible)) __obj.updateDynamic("isMonthPickerVisible")(isMonthPickerVisible)
    if (!js.isUndefined(isRequired)) __obj.updateDynamic("isRequired")(isRequired)
    if (label != null) __obj.updateDynamic("label")(label)
    if (maxDate != null) __obj.updateDynamic("maxDate")(maxDate)
    if (minDate != null) __obj.updateDynamic("minDate")(minDate)
    if (onAfterMenuDismiss != null) __obj.updateDynamic("onAfterMenuDismiss")(js.Any.fromFunction0(onAfterMenuDismiss))
    if (onSelectDate != null) __obj.updateDynamic("onSelectDate")(js.Any.fromFunction1(onSelectDate))
    if (parseDateFromString != null) __obj.updateDynamic("parseDateFromString")(js.Any.fromFunction1(parseDateFromString))
    if (pickerAriaLabel != null) __obj.updateDynamic("pickerAriaLabel")(pickerAriaLabel)
    if (placeholder != null) __obj.updateDynamic("placeholder")(placeholder)
    if (!js.isUndefined(showCloseButton)) __obj.updateDynamic("showCloseButton")(showCloseButton)
    if (!js.isUndefined(showGoToToday)) __obj.updateDynamic("showGoToToday")(showGoToToday)
    if (!js.isUndefined(showMonthPickerAsOverlay)) __obj.updateDynamic("showMonthPickerAsOverlay")(showMonthPickerAsOverlay)
    if (!js.isUndefined(showWeekNumbers)) __obj.updateDynamic("showWeekNumbers")(showWeekNumbers)
    if (strings != null) __obj.updateDynamic("strings")(strings)
    if (styles != null) __obj.updateDynamic("styles")(styles)
    if (tabIndex != null) __obj.updateDynamic("tabIndex")(tabIndex.asInstanceOf[js.Any])
    if (textField != null) __obj.updateDynamic("textField")(textField)
    if (theme != null) __obj.updateDynamic("theme")(theme)
    if (today != null) __obj.updateDynamic("today")(today)
    if (!js.isUndefined(underlined)) __obj.updateDynamic("underlined")(underlined)
    if (value != null) __obj.updateDynamic("value")(value)
    __obj.asInstanceOf[IDatePickerProps]
  }
}

