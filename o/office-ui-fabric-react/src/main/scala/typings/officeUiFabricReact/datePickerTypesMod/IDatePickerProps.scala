package typings.officeUiFabricReact.datePickerTypesMod

import typings.fluentuiDateTimeUtilities.dateValuesMod.DayOfWeek
import typings.fluentuiDateTimeUtilities.dateValuesMod.FirstWeekOfYear
import typings.fluentuiTheme.ithemeMod.ITheme
import typings.officeUiFabricReact.calendarTypesMod.ICalendarFormatDateCallbacks
import typings.officeUiFabricReact.calendarTypesMod.ICalendarProps
import typings.officeUiFabricReact.calloutTypesMod.ICalloutProps
import typings.officeUiFabricReact.textFieldTypesMod.ITextFieldProps
import typings.react.mod.HTMLAttributes
import typings.std.Date
import typings.std.HTMLElement
import typings.uifabricMergeStyles.deepPartialMod.DeepPartial
import typings.uifabricMergeStyles.istylefunctionMod.IStyleFunctionOrObject
import typings.uifabricUtilities.baseComponentTypesMod.IBaseProps
import typings.uifabricUtilities.icomponentasMod.IComponentAs
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait IDatePickerProps
  extends HTMLAttributes[HTMLElement]
     with IBaseProps[IDatePicker] {
  
  /**
    * Allows all elements to be focused, including disabled ones
    * @defaultvalue false
    */
  var allFocusable: js.UndefOr[Boolean] = js.native
  
  /**
    * Whether the DatePicker allows input a date string directly or not
    * @defaultvalue false
    */
  var allowTextInput: js.UndefOr[Boolean] = js.native
  
  /**
    * Aria Label for TextField of the DatePicker for screen reader users.
    */
  var ariaLabel: js.UndefOr[String] = js.native
  
  /**
    * Determines if DatePicker has a border.
    * @defaultvalue false
    */
  var borderless: js.UndefOr[Boolean] = js.native
  
  /**
    * Custom Calendar to be used for date picking
    */
  var calendarAs: js.UndefOr[IComponentAs[ICalendarProps]] = js.native
  
  /**
    * Pass calendar props to calendar component
    */
  var calendarProps: js.UndefOr[ICalendarProps] = js.native
  
  /**
    * Pass callout props to callout component
    */
  var calloutProps: js.UndefOr[ICalloutProps] = js.native
  
  /**
    * Apply additional formating to dates, for example localized date formatting.
    */
  var dateTimeFormatter: js.UndefOr[ICalendarFormatDateCallbacks] = js.native
  
  /**
    * Whether the DatePicker should open automatically when the control is focused
    * @defaultvalue false
    */
  var disableAutoFocus: js.UndefOr[Boolean] = js.native
  
  /**
    * Disabled state of the DatePicker.
    * @defaultvalue false
    */
  var disabled: js.UndefOr[Boolean] = js.native
  
  /**
    * The first day of the week for your locale.
    * @defaultvalue DayOfWeek.Sunday
    */
  var firstDayOfWeek: js.UndefOr[DayOfWeek] = js.native
  
  /**
    * Defines when the first week of the year should start, FirstWeekOfYear.FirstDay,
    * FirstWeekOfYear.FirstFullWeek or FirstWeekOfYear.FirstFourDayWeek are the possible values
    * @defaultvalue FirstWeekOfYear.FirstFullWeek
    */
  var firstWeekOfYear: js.UndefOr[FirstWeekOfYear] = js.native
  
  /**
    * Optional method to format the chosen date to a string to display in the DatePicker
    * @defaultvalue date.toString()
    */
  var formatDate: js.UndefOr[js.Function1[/* date */ js.UndefOr[Date], String]] = js.native
  
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
    * The initially highlighted date in the calendar picker
    */
  var initialPickerDate: js.UndefOr[Date] = js.native
  
  /**
    * Whether the month picker is shown beside the day picker or hidden.
    * @defaultvalue true
    */
  var isMonthPickerVisible: js.UndefOr[Boolean] = js.native
  
  /**
    * Whether the DatePicker is a required field or not
    * @defaultvalue false
    */
  var isRequired: js.UndefOr[Boolean] = js.native
  
  /**
    * Label for the DatePicker
    */
  var label: js.UndefOr[String] = js.native
  
  /**
    * The maximum allowable date.
    */
  var maxDate: js.UndefOr[Date] = js.native
  
  /**
    * The minimum allowable date.
    */
  var minDate: js.UndefOr[Date] = js.native
  
  /**
    * Callback that runs after DatePicker's menu (Calendar) is closed
    */
  var onAfterMenuDismiss: js.UndefOr[js.Function0[Unit]] = js.native
  
  /**
    * Callback issued when a date is selected
    */
  var onSelectDate: js.UndefOr[js.Function1[/* date */ js.UndefOr[Date | Null], Unit]] = js.native
  
  /**
    * Optional method to parse the text input value to date, it is only useful when allowTextInput is set to true
    * @defaultvalue new Date(Date.parse(dateStr))
    */
  var parseDateFromString: js.UndefOr[js.Function1[/* dateStr */ String, Date | Null]] = js.native
  
  /**
    * Aria label for date picker popup for screen reader users.
    * @defaultvalue Calendar
    */
  var pickerAriaLabel: js.UndefOr[String] = js.native
  
  /**
    * Whether the CalendarDay close button should be shown or not.
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
    * Whether the calendar should show the week number (weeks 1 to 53) before each week row
    * @defaultvalue false
    */
  var showWeekNumbers: js.UndefOr[Boolean] = js.native
  
  /**
    * Localized strings to use in the DatePicker
    */
  var strings: js.UndefOr[IDatePickerStrings] = js.native
  
  /**
    * Call to provide customized styling that will layer on top of the variant rules.
    */
  var styles: js.UndefOr[IStyleFunctionOrObject[IDatePickerStyleProps, IDatePickerStyles]] = js.native
  
  /**
    * Pass textField props to textField component.
    * Prop name is "textField" for compatiblity with upcoming slots work.
    */
  var textField: js.UndefOr[ITextFieldProps] = js.native
  
  /**
    * Theme provided by High-Order Component.
    */
  var theme: js.UndefOr[ITheme] = js.native
  
  /**
    * Value of today. If null, current time in client machine will be used.
    */
  var today: js.UndefOr[Date] = js.native
  
  /**
    * Whether or not the Textfield of the DatePicker is underlined.
    * @defaultvalue false
    */
  var underlined: js.UndefOr[Boolean] = js.native
  
  /**
    * Default value of the DatePicker, if any
    */
  var value: js.UndefOr[Date] = js.native
}
object IDatePickerProps {
  
  @scala.inline
  def apply(): IDatePickerProps = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[IDatePickerProps]
  }
  
  @scala.inline
  implicit class IDatePickerPropsOps[Self <: IDatePickerProps] (val x: Self) extends AnyVal {
    
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
    def setAllowTextInput(value: Boolean): Self = this.set("allowTextInput", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteAllowTextInput: Self = this.set("allowTextInput", js.undefined)
    
    @scala.inline
    def setAriaLabel(value: String): Self = this.set("ariaLabel", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteAriaLabel: Self = this.set("ariaLabel", js.undefined)
    
    @scala.inline
    def setBorderless(value: Boolean): Self = this.set("borderless", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteBorderless: Self = this.set("borderless", js.undefined)
    
    @scala.inline
    def setCalendarAs(value: IComponentAs[ICalendarProps]): Self = this.set("calendarAs", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteCalendarAs: Self = this.set("calendarAs", js.undefined)
    
    @scala.inline
    def setCalendarProps(value: ICalendarProps): Self = this.set("calendarProps", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteCalendarProps: Self = this.set("calendarProps", js.undefined)
    
    @scala.inline
    def setCalloutProps(value: ICalloutProps): Self = this.set("calloutProps", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteCalloutProps: Self = this.set("calloutProps", js.undefined)
    
    @scala.inline
    def setDateTimeFormatter(value: ICalendarFormatDateCallbacks): Self = this.set("dateTimeFormatter", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDateTimeFormatter: Self = this.set("dateTimeFormatter", js.undefined)
    
    @scala.inline
    def setDisableAutoFocus(value: Boolean): Self = this.set("disableAutoFocus", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDisableAutoFocus: Self = this.set("disableAutoFocus", js.undefined)
    
    @scala.inline
    def setDisabled(value: Boolean): Self = this.set("disabled", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDisabled: Self = this.set("disabled", js.undefined)
    
    @scala.inline
    def setFirstDayOfWeek(value: DayOfWeek): Self = this.set("firstDayOfWeek", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteFirstDayOfWeek: Self = this.set("firstDayOfWeek", js.undefined)
    
    @scala.inline
    def setFirstWeekOfYear(value: FirstWeekOfYear): Self = this.set("firstWeekOfYear", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteFirstWeekOfYear: Self = this.set("firstWeekOfYear", js.undefined)
    
    @scala.inline
    def setFormatDate(value: /* date */ js.UndefOr[Date] => String): Self = this.set("formatDate", js.Any.fromFunction1(value))
    
    @scala.inline
    def deleteFormatDate: Self = this.set("formatDate", js.undefined)
    
    @scala.inline
    def setHighlightCurrentMonth(value: Boolean): Self = this.set("highlightCurrentMonth", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteHighlightCurrentMonth: Self = this.set("highlightCurrentMonth", js.undefined)
    
    @scala.inline
    def setHighlightSelectedMonth(value: Boolean): Self = this.set("highlightSelectedMonth", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteHighlightSelectedMonth: Self = this.set("highlightSelectedMonth", js.undefined)
    
    @scala.inline
    def setInitialPickerDate(value: Date): Self = this.set("initialPickerDate", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteInitialPickerDate: Self = this.set("initialPickerDate", js.undefined)
    
    @scala.inline
    def setIsMonthPickerVisible(value: Boolean): Self = this.set("isMonthPickerVisible", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteIsMonthPickerVisible: Self = this.set("isMonthPickerVisible", js.undefined)
    
    @scala.inline
    def setIsRequired(value: Boolean): Self = this.set("isRequired", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteIsRequired: Self = this.set("isRequired", js.undefined)
    
    @scala.inline
    def setLabel(value: String): Self = this.set("label", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteLabel: Self = this.set("label", js.undefined)
    
    @scala.inline
    def setMaxDate(value: Date): Self = this.set("maxDate", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteMaxDate: Self = this.set("maxDate", js.undefined)
    
    @scala.inline
    def setMinDate(value: Date): Self = this.set("minDate", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteMinDate: Self = this.set("minDate", js.undefined)
    
    @scala.inline
    def setOnAfterMenuDismiss(value: () => Unit): Self = this.set("onAfterMenuDismiss", js.Any.fromFunction0(value))
    
    @scala.inline
    def deleteOnAfterMenuDismiss: Self = this.set("onAfterMenuDismiss", js.undefined)
    
    @scala.inline
    def setOnSelectDate(value: /* date */ js.UndefOr[Date | Null] => Unit): Self = this.set("onSelectDate", js.Any.fromFunction1(value))
    
    @scala.inline
    def deleteOnSelectDate: Self = this.set("onSelectDate", js.undefined)
    
    @scala.inline
    def setParseDateFromString(value: /* dateStr */ String => Date | Null): Self = this.set("parseDateFromString", js.Any.fromFunction1(value))
    
    @scala.inline
    def deleteParseDateFromString: Self = this.set("parseDateFromString", js.undefined)
    
    @scala.inline
    def setPickerAriaLabel(value: String): Self = this.set("pickerAriaLabel", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deletePickerAriaLabel: Self = this.set("pickerAriaLabel", js.undefined)
    
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
    def setShowWeekNumbers(value: Boolean): Self = this.set("showWeekNumbers", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteShowWeekNumbers: Self = this.set("showWeekNumbers", js.undefined)
    
    @scala.inline
    def setStrings(value: IDatePickerStrings): Self = this.set("strings", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteStrings: Self = this.set("strings", js.undefined)
    
    @scala.inline
    def setStylesFunction1(value: IDatePickerStyleProps => DeepPartial[IDatePickerStyles]): Self = this.set("styles", js.Any.fromFunction1(value))
    
    @scala.inline
    def setStyles(value: IStyleFunctionOrObject[IDatePickerStyleProps, IDatePickerStyles]): Self = this.set("styles", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteStyles: Self = this.set("styles", js.undefined)
    
    @scala.inline
    def setTextField(value: ITextFieldProps): Self = this.set("textField", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteTextField: Self = this.set("textField", js.undefined)
    
    @scala.inline
    def setTheme(value: ITheme): Self = this.set("theme", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteTheme: Self = this.set("theme", js.undefined)
    
    @scala.inline
    def setToday(value: Date): Self = this.set("today", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteToday: Self = this.set("today", js.undefined)
    
    @scala.inline
    def setUnderlined(value: Boolean): Self = this.set("underlined", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteUnderlined: Self = this.set("underlined", js.undefined)
    
    @scala.inline
    def setValue(value: Date): Self = this.set("value", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteValue: Self = this.set("value", js.undefined)
  }
}
