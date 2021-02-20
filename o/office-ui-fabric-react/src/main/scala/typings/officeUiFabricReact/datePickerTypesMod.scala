package typings.officeUiFabricReact

import typings.fluentuiDateTimeUtilities.dateValuesMod.DayOfWeek
import typings.fluentuiDateTimeUtilities.dateValuesMod.FirstWeekOfYear
import typings.fluentuiTheme.ithemeMod.ITheme
import typings.officeUiFabricReact.calendarTypesMod.ICalendarFormatDateCallbacks
import typings.officeUiFabricReact.calendarTypesMod.ICalendarProps
import typings.officeUiFabricReact.calendarTypesMod.ICalendarStrings
import typings.officeUiFabricReact.calloutTypesMod.ICalloutProps
import typings.officeUiFabricReact.textFieldTypesMod.ITextFieldProps
import typings.react.mod.HTMLAttributes
import typings.std.Date
import typings.std.HTMLElement
import typings.uifabricMergeStyles.deepPartialMod.DeepPartial
import typings.uifabricMergeStyles.istyleMod.IStyle
import typings.uifabricMergeStyles.istylefunctionMod.IStyleFunctionOrObject
import typings.uifabricUtilities.baseComponentTypesMod.IBaseProps
import typings.uifabricUtilities.icomponentasMod.IComponentAs
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object datePickerTypesMod {
  
  @js.native
  trait IDatePicker extends StObject {
    
    /** Sets focus to the text field */
    def focus(): Unit = js.native
    
    /** Reset the state of the picker to the default */
    def reset(): Unit = js.native
  }
  object IDatePicker {
    
    @scala.inline
    def apply(focus: () => Unit, reset: () => Unit): IDatePicker = {
      val __obj = js.Dynamic.literal(focus = js.Any.fromFunction0(focus), reset = js.Any.fromFunction0(reset))
      __obj.asInstanceOf[IDatePicker]
    }
    
    @scala.inline
    implicit class IDatePickerMutableBuilder[Self <: IDatePicker] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setFocus(value: () => Unit): Self = StObject.set(x, "focus", js.Any.fromFunction0(value))
      
      @scala.inline
      def setReset(value: () => Unit): Self = StObject.set(x, "reset", js.Any.fromFunction0(value))
    }
  }
  
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
    implicit class IDatePickerPropsMutableBuilder[Self <: IDatePickerProps] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setAllFocusable(value: Boolean): Self = StObject.set(x, "allFocusable", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setAllFocusableUndefined: Self = StObject.set(x, "allFocusable", js.undefined)
      
      @scala.inline
      def setAllowTextInput(value: Boolean): Self = StObject.set(x, "allowTextInput", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setAllowTextInputUndefined: Self = StObject.set(x, "allowTextInput", js.undefined)
      
      @scala.inline
      def setAriaLabel(value: String): Self = StObject.set(x, "ariaLabel", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setAriaLabelUndefined: Self = StObject.set(x, "ariaLabel", js.undefined)
      
      @scala.inline
      def setBorderless(value: Boolean): Self = StObject.set(x, "borderless", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setBorderlessUndefined: Self = StObject.set(x, "borderless", js.undefined)
      
      @scala.inline
      def setCalendarAs(value: IComponentAs[ICalendarProps]): Self = StObject.set(x, "calendarAs", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setCalendarAsUndefined: Self = StObject.set(x, "calendarAs", js.undefined)
      
      @scala.inline
      def setCalendarProps(value: ICalendarProps): Self = StObject.set(x, "calendarProps", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setCalendarPropsUndefined: Self = StObject.set(x, "calendarProps", js.undefined)
      
      @scala.inline
      def setCalloutProps(value: ICalloutProps): Self = StObject.set(x, "calloutProps", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setCalloutPropsUndefined: Self = StObject.set(x, "calloutProps", js.undefined)
      
      @scala.inline
      def setDateTimeFormatter(value: ICalendarFormatDateCallbacks): Self = StObject.set(x, "dateTimeFormatter", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDateTimeFormatterUndefined: Self = StObject.set(x, "dateTimeFormatter", js.undefined)
      
      @scala.inline
      def setDisableAutoFocus(value: Boolean): Self = StObject.set(x, "disableAutoFocus", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDisableAutoFocusUndefined: Self = StObject.set(x, "disableAutoFocus", js.undefined)
      
      @scala.inline
      def setDisabled(value: Boolean): Self = StObject.set(x, "disabled", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDisabledUndefined: Self = StObject.set(x, "disabled", js.undefined)
      
      @scala.inline
      def setFirstDayOfWeek(value: DayOfWeek): Self = StObject.set(x, "firstDayOfWeek", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setFirstDayOfWeekUndefined: Self = StObject.set(x, "firstDayOfWeek", js.undefined)
      
      @scala.inline
      def setFirstWeekOfYear(value: FirstWeekOfYear): Self = StObject.set(x, "firstWeekOfYear", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setFirstWeekOfYearUndefined: Self = StObject.set(x, "firstWeekOfYear", js.undefined)
      
      @scala.inline
      def setFormatDate(value: /* date */ js.UndefOr[Date] => String): Self = StObject.set(x, "formatDate", js.Any.fromFunction1(value))
      
      @scala.inline
      def setFormatDateUndefined: Self = StObject.set(x, "formatDate", js.undefined)
      
      @scala.inline
      def setHighlightCurrentMonth(value: Boolean): Self = StObject.set(x, "highlightCurrentMonth", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setHighlightCurrentMonthUndefined: Self = StObject.set(x, "highlightCurrentMonth", js.undefined)
      
      @scala.inline
      def setHighlightSelectedMonth(value: Boolean): Self = StObject.set(x, "highlightSelectedMonth", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setHighlightSelectedMonthUndefined: Self = StObject.set(x, "highlightSelectedMonth", js.undefined)
      
      @scala.inline
      def setInitialPickerDate(value: Date): Self = StObject.set(x, "initialPickerDate", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setInitialPickerDateUndefined: Self = StObject.set(x, "initialPickerDate", js.undefined)
      
      @scala.inline
      def setIsMonthPickerVisible(value: Boolean): Self = StObject.set(x, "isMonthPickerVisible", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setIsMonthPickerVisibleUndefined: Self = StObject.set(x, "isMonthPickerVisible", js.undefined)
      
      @scala.inline
      def setIsRequired(value: Boolean): Self = StObject.set(x, "isRequired", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setIsRequiredUndefined: Self = StObject.set(x, "isRequired", js.undefined)
      
      @scala.inline
      def setLabel(value: String): Self = StObject.set(x, "label", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setLabelUndefined: Self = StObject.set(x, "label", js.undefined)
      
      @scala.inline
      def setMaxDate(value: Date): Self = StObject.set(x, "maxDate", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMaxDateUndefined: Self = StObject.set(x, "maxDate", js.undefined)
      
      @scala.inline
      def setMinDate(value: Date): Self = StObject.set(x, "minDate", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMinDateUndefined: Self = StObject.set(x, "minDate", js.undefined)
      
      @scala.inline
      def setOnAfterMenuDismiss(value: () => Unit): Self = StObject.set(x, "onAfterMenuDismiss", js.Any.fromFunction0(value))
      
      @scala.inline
      def setOnAfterMenuDismissUndefined: Self = StObject.set(x, "onAfterMenuDismiss", js.undefined)
      
      @scala.inline
      def setOnSelectDate(value: /* date */ js.UndefOr[Date | Null] => Unit): Self = StObject.set(x, "onSelectDate", js.Any.fromFunction1(value))
      
      @scala.inline
      def setOnSelectDateUndefined: Self = StObject.set(x, "onSelectDate", js.undefined)
      
      @scala.inline
      def setParseDateFromString(value: /* dateStr */ String => Date | Null): Self = StObject.set(x, "parseDateFromString", js.Any.fromFunction1(value))
      
      @scala.inline
      def setParseDateFromStringUndefined: Self = StObject.set(x, "parseDateFromString", js.undefined)
      
      @scala.inline
      def setPickerAriaLabel(value: String): Self = StObject.set(x, "pickerAriaLabel", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPickerAriaLabelUndefined: Self = StObject.set(x, "pickerAriaLabel", js.undefined)
      
      @scala.inline
      def setShowCloseButton(value: Boolean): Self = StObject.set(x, "showCloseButton", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setShowCloseButtonUndefined: Self = StObject.set(x, "showCloseButton", js.undefined)
      
      @scala.inline
      def setShowGoToToday(value: Boolean): Self = StObject.set(x, "showGoToToday", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setShowGoToTodayUndefined: Self = StObject.set(x, "showGoToToday", js.undefined)
      
      @scala.inline
      def setShowMonthPickerAsOverlay(value: Boolean): Self = StObject.set(x, "showMonthPickerAsOverlay", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setShowMonthPickerAsOverlayUndefined: Self = StObject.set(x, "showMonthPickerAsOverlay", js.undefined)
      
      @scala.inline
      def setShowWeekNumbers(value: Boolean): Self = StObject.set(x, "showWeekNumbers", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setShowWeekNumbersUndefined: Self = StObject.set(x, "showWeekNumbers", js.undefined)
      
      @scala.inline
      def setStrings(value: IDatePickerStrings): Self = StObject.set(x, "strings", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setStringsUndefined: Self = StObject.set(x, "strings", js.undefined)
      
      @scala.inline
      def setStyles(value: IStyleFunctionOrObject[IDatePickerStyleProps, IDatePickerStyles]): Self = StObject.set(x, "styles", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setStylesFunction1(value: IDatePickerStyleProps => DeepPartial[IDatePickerStyles]): Self = StObject.set(x, "styles", js.Any.fromFunction1(value))
      
      @scala.inline
      def setStylesUndefined: Self = StObject.set(x, "styles", js.undefined)
      
      @scala.inline
      def setTextField(value: ITextFieldProps): Self = StObject.set(x, "textField", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTextFieldUndefined: Self = StObject.set(x, "textField", js.undefined)
      
      @scala.inline
      def setTheme(value: ITheme): Self = StObject.set(x, "theme", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setThemeUndefined: Self = StObject.set(x, "theme", js.undefined)
      
      @scala.inline
      def setToday(value: Date): Self = StObject.set(x, "today", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTodayUndefined: Self = StObject.set(x, "today", js.undefined)
      
      @scala.inline
      def setUnderlined(value: Boolean): Self = StObject.set(x, "underlined", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setUnderlinedUndefined: Self = StObject.set(x, "underlined", js.undefined)
      
      @scala.inline
      def setValue(value: Date): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setValueUndefined: Self = StObject.set(x, "value", js.undefined)
    }
  }
  
  @js.native
  trait IDatePickerStrings extends ICalendarStrings {
    
    /**
      * Error message to render for TextField if input date string parsing fails.
      */
    var invalidInputErrorMessage: js.UndefOr[String] = js.native
    
    /**
      * Error message to render for TextField if date boundary (minDate, maxDate) validation fails.
      */
    var isOutOfBoundsErrorMessage: js.UndefOr[String] = js.native
    
    /**
      * Error message to render for TextField if isRequired validation fails.
      */
    var isRequiredErrorMessage: js.UndefOr[String] = js.native
  }
  object IDatePickerStrings {
    
    @scala.inline
    def apply(
      days: js.Array[String],
      goToToday: String,
      months: js.Array[String],
      shortDays: js.Array[String],
      shortMonths: js.Array[String]
    ): IDatePickerStrings = {
      val __obj = js.Dynamic.literal(days = days.asInstanceOf[js.Any], goToToday = goToToday.asInstanceOf[js.Any], months = months.asInstanceOf[js.Any], shortDays = shortDays.asInstanceOf[js.Any], shortMonths = shortMonths.asInstanceOf[js.Any])
      __obj.asInstanceOf[IDatePickerStrings]
    }
    
    @scala.inline
    implicit class IDatePickerStringsMutableBuilder[Self <: IDatePickerStrings] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setInvalidInputErrorMessage(value: String): Self = StObject.set(x, "invalidInputErrorMessage", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setInvalidInputErrorMessageUndefined: Self = StObject.set(x, "invalidInputErrorMessage", js.undefined)
      
      @scala.inline
      def setIsOutOfBoundsErrorMessage(value: String): Self = StObject.set(x, "isOutOfBoundsErrorMessage", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setIsOutOfBoundsErrorMessageUndefined: Self = StObject.set(x, "isOutOfBoundsErrorMessage", js.undefined)
      
      @scala.inline
      def setIsRequiredErrorMessage(value: String): Self = StObject.set(x, "isRequiredErrorMessage", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setIsRequiredErrorMessageUndefined: Self = StObject.set(x, "isRequiredErrorMessage", js.undefined)
    }
  }
  
  @js.native
  trait IDatePickerStyleProps extends StObject {
    
    /**
      * Accept custom classNames
      */
    var className: js.UndefOr[String] = js.native
    
    var disabled: js.UndefOr[Boolean] = js.native
    
    var isDatePickerShown: js.UndefOr[Boolean] = js.native
    
    var label: js.UndefOr[Boolean] = js.native
    
    /**
      * Theme provided by High-Order Component.
      */
    var theme: ITheme = js.native
  }
  object IDatePickerStyleProps {
    
    @scala.inline
    def apply(theme: ITheme): IDatePickerStyleProps = {
      val __obj = js.Dynamic.literal(theme = theme.asInstanceOf[js.Any])
      __obj.asInstanceOf[IDatePickerStyleProps]
    }
    
    @scala.inline
    implicit class IDatePickerStylePropsMutableBuilder[Self <: IDatePickerStyleProps] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setClassName(value: String): Self = StObject.set(x, "className", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setClassNameUndefined: Self = StObject.set(x, "className", js.undefined)
      
      @scala.inline
      def setDisabled(value: Boolean): Self = StObject.set(x, "disabled", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDisabledUndefined: Self = StObject.set(x, "disabled", js.undefined)
      
      @scala.inline
      def setIsDatePickerShown(value: Boolean): Self = StObject.set(x, "isDatePickerShown", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setIsDatePickerShownUndefined: Self = StObject.set(x, "isDatePickerShown", js.undefined)
      
      @scala.inline
      def setLabel(value: Boolean): Self = StObject.set(x, "label", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setLabelUndefined: Self = StObject.set(x, "label", js.undefined)
      
      @scala.inline
      def setTheme(value: ITheme): Self = StObject.set(x, "theme", value.asInstanceOf[js.Any])
    }
  }
  
  @js.native
  trait IDatePickerStyles extends StObject {
    
    var callout: IStyle = js.native
    
    var icon: IStyle = js.native
    
    /**
      * Style for the root element.
      */
    var root: IStyle = js.native
    
    var textField: IStyle = js.native
    
    var wrapper: js.UndefOr[IStyle] = js.native
  }
  object IDatePickerStyles {
    
    @scala.inline
    def apply(): IDatePickerStyles = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[IDatePickerStyles]
    }
    
    @scala.inline
    implicit class IDatePickerStylesMutableBuilder[Self <: IDatePickerStyles] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setCallout(value: IStyle): Self = StObject.set(x, "callout", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setCalloutNull: Self = StObject.set(x, "callout", null)
      
      @scala.inline
      def setCalloutUndefined: Self = StObject.set(x, "callout", js.undefined)
      
      @scala.inline
      def setIcon(value: IStyle): Self = StObject.set(x, "icon", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setIconNull: Self = StObject.set(x, "icon", null)
      
      @scala.inline
      def setIconUndefined: Self = StObject.set(x, "icon", js.undefined)
      
      @scala.inline
      def setRoot(value: IStyle): Self = StObject.set(x, "root", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setRootNull: Self = StObject.set(x, "root", null)
      
      @scala.inline
      def setRootUndefined: Self = StObject.set(x, "root", js.undefined)
      
      @scala.inline
      def setTextField(value: IStyle): Self = StObject.set(x, "textField", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTextFieldNull: Self = StObject.set(x, "textField", null)
      
      @scala.inline
      def setTextFieldUndefined: Self = StObject.set(x, "textField", js.undefined)
      
      @scala.inline
      def setWrapper(value: IStyle): Self = StObject.set(x, "wrapper", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setWrapperNull: Self = StObject.set(x, "wrapper", null)
      
      @scala.inline
      def setWrapperUndefined: Self = StObject.set(x, "wrapper", js.undefined)
    }
  }
}
