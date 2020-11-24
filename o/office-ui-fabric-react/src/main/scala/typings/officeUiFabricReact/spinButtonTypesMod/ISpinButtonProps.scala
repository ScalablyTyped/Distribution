package typings.officeUiFabricReact.spinButtonTypesMod

import typings.fluentuiTheme.ithemeMod.ITheme
import typings.officeUiFabricReact.anon.PartialIButtonStyles
import typings.officeUiFabricReact.anon.PartialISpinButtonStyles
import typings.officeUiFabricReact.buttonTypesMod.IButtonProps
import typings.officeUiFabricReact.iconTypesMod.IIconProps
import typings.officeUiFabricReact.keytipTypesMod.IKeytipProps
import typings.officeUiFabricReact.positioningTypesMod.Position
import typings.officeUiFabricReact.spinButtonSpinButtonMod.KeyboardSpinDirection
import typings.react.mod.FocusEvent
import typings.react.mod.FocusEventHandler
import typings.react.mod.HTMLAttributes
import typings.react.mod.InputHTMLAttributes
import typings.react.mod.KeyboardEvent
import typings.react.mod.MouseEvent
import typings.react.mod.NativeMouseEvent
import typings.react.mod.SyntheticEvent
import typings.std.Event
import typings.std.HTMLDivElement
import typings.std.HTMLElement
import typings.std.HTMLInputElement
import typings.uifabricUtilities.createRefMod.IRefObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ISpinButtonProps extends HTMLAttributes[HTMLDivElement] {
  
  /**
    * ID of a label which describes the control, if not using the default label.
    */
  var ariaDescribedBy: js.UndefOr[String] = js.native
  
  /**
    * A description of the control for the benefit of screen reader users.
    */
  var ariaLabel: js.UndefOr[String] = js.native
  
  /**
    * The position in the parent set (if in a set).
    */
  var ariaPositionInSet: js.UndefOr[Double] = js.native
  
  /**
    * The total size of the parent set (if in a set).
    */
  var ariaSetSize: js.UndefOr[Double] = js.native
  
  /**
    * Sets the control's aria-valuenow. This is the numeric form of `value`.
    * Providing this only makes sense when using as a controlled component.
    */
  var ariaValueNow: js.UndefOr[Double] = js.native
  
  var ariaValueText: js.UndefOr[String] = js.native
  
  /**
    * Gets the component ref.
    */
  var componentRef: js.UndefOr[IRefObject[ISpinButton]] = js.native
  
  /**
    * Accessible label text for the decrement button (for screen reader users).
    */
  var decrementButtonAriaLabel: js.UndefOr[String] = js.native
  
  /**
    * Custom props for the decrement button.
    */
  var decrementButtonIcon: js.UndefOr[IIconProps] = js.native
  
  /**
    * Initial value of the control. Updates to this prop will not be respected.
    *
    * Use this if you intend for the SpinButton to be an uncontrolled component which maintains its own value.
    * Mutually exclusive with `value`.
    * @defaultvalue 0
    */
  @JSName("defaultValue")
  var defaultValue_ISpinButtonProps: js.UndefOr[String] = js.native
  
  /**
    * Whether or not the control is disabled.
    */
  var disabled: js.UndefOr[Boolean] = js.native
  
  /**
    * Custom styles for the down arrow button.
    *
    * Note: The buttons are in a checked state when arrow keys are used to incremenent/decrement
    * the SpinButton. Use `rootChecked` instead of `rootPressed` for styling when that is the case.
    */
  var downArrowButtonStyles: js.UndefOr[PartialIButtonStyles] = js.native
  
  /**
    * Custom function for providing the classNames for the control. Can be used to provide
    * all styles for the component instead of applying them on top of the default styles.
    */
  var getClassNames: js.UndefOr[
    js.Function6[
      /* theme */ ITheme, 
      /* disabled */ Boolean, 
      /* isFocused */ Boolean, 
      /* keyboardSpinDirection */ KeyboardSpinDirection, 
      /* labelPosition */ js.UndefOr[Position], 
      /* className */ js.UndefOr[String], 
      ISpinButtonClassNames
    ]
  ] = js.native
  
  /**
    * Additional props for the up and down arrow buttons.
    */
  var iconButtonProps: js.UndefOr[IButtonProps] = js.native
  
  /**
    * Props for an icon to display alongside the control's label.
    */
  var iconProps: js.UndefOr[IIconProps] = js.native
  
  /**
    * Accessible label text for the increment button (for screen reader users).
    */
  var incrementButtonAriaLabel: js.UndefOr[String] = js.native
  
  /**
    * Custom props for the increment button.
    */
  var incrementButtonIcon: js.UndefOr[IIconProps] = js.native
  
  /**
    * Additional props for the input field.
    */
  var inputProps: js.UndefOr[InputHTMLAttributes[HTMLElement | HTMLInputElement]] = js.native
  
  /**
    * Keytip for the control.
    */
  var keytipProps: js.UndefOr[IKeytipProps] = js.native
  
  /**
    * Descriptive label for the control.
    */
  var label: js.UndefOr[String] = js.native
  
  /**
    * Where to position the control's label.
    * @defaultvalue Left
    */
  var labelPosition: js.UndefOr[Position] = js.native
  
  /**
    * Max value of the control.
    * @defaultvalue 100
    */
  var max: js.UndefOr[Double] = js.native
  
  /**
    * Min value of the control.
    * @defaultvalue 0
    */
  var min: js.UndefOr[Double] = js.native
  
  /**
    * Callback for when the control loses focus.
    */
  @JSName("onBlur")
  var onBlur_ISpinButtonProps: js.UndefOr[FocusEventHandler[HTMLInputElement]] = js.native
  
  /**
    * Callback for when the decrement button or down arrow key is pressed.
    * @param value - The current value to be decremented
    * @param event - The event that triggered this decrement
    * @returns If a string is returned, it will be used as the new value
    */
  var onDecrement: js.UndefOr[
    js.Function2[
      /* value */ String, 
      /* event */ js.UndefOr[(MouseEvent[HTMLElement, NativeMouseEvent]) | KeyboardEvent[HTMLElement]], 
      String | Unit
    ]
  ] = js.native
  
  /**
    * Callback for when the user focuses the control.
    */
  @JSName("onFocus")
  var onFocus_ISpinButtonProps: js.UndefOr[FocusEventHandler[HTMLInputElement]] = js.native
  
  /**
    * Callback for when the increment button or up arrow key is pressed.
    * @param value - The current value to be incremented
    * @param event - The event that triggered this increment
    * @returns If a string is returned, it will be used as the new value
    */
  var onIncrement: js.UndefOr[
    js.Function2[
      /* value */ String, 
      /* event */ js.UndefOr[(MouseEvent[HTMLElement, NativeMouseEvent]) | KeyboardEvent[HTMLElement]], 
      String | Unit
    ]
  ] = js.native
  
  /**
    * Callback for when the entered value should be validated.
    * @param value - The entered value to validate
    * @param event - The event that triggered this validate, if any (for accessibility)
    * @returns If a string is returned, it will be used as the new value
    */
  var onValidate: js.UndefOr[
    js.Function2[
      /* value */ String, 
      /* event */ js.UndefOr[SyntheticEvent[HTMLElement, Event]], 
      String | Unit
    ]
  ] = js.native
  
  /**
    * How many decimal places the value should be rounded to.
    *
    * The default is calculated based on the precision of `step`: i.e. if step = 1, precision = 0.
    * step = 0.0089, precision = 4. step = 300, precision = 2. step = 23.00, precision = 2.
    */
  var precision: js.UndefOr[Double] = js.native
  
  /**
    * Difference between two adjacent values of the control.
    * This value is used to calculate the precision of the input if no `precision` is given.
    * The precision calculated this way will always be \>= 0.
    * @defaultvalue 1
    */
  var step: js.UndefOr[Double] = js.native
  
  /**
    * Custom styling for individual elements within the control.
    */
  var styles: js.UndefOr[PartialISpinButtonStyles] = js.native
  
  /**
    * Theme provided by HOC.
    */
  var theme: js.UndefOr[ITheme] = js.native
  
  /**
    * Custom styles for the up arrow button.
    *
    * Note: The buttons are in a checked state when arrow keys are used to incremenent/decrement
    * the SpinButton. Use `rootChecked` instead of `rootPressed` for styling when that is the case.
    */
  var upArrowButtonStyles: js.UndefOr[PartialIButtonStyles] = js.native
  
  /**
    * Current value of the control.
    *
    * Use this if you intend to pass in a new value as a result of change events.
    * Mutually exclusive with `defaultValue`.
    */
  var value: js.UndefOr[String] = js.native
}
object ISpinButtonProps {
  
  @scala.inline
  def apply(): ISpinButtonProps = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ISpinButtonProps]
  }
  
  @scala.inline
  implicit class ISpinButtonPropsOps[Self <: ISpinButtonProps] (val x: Self) extends AnyVal {
    
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
    def setAriaDescribedBy(value: String): Self = this.set("ariaDescribedBy", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteAriaDescribedBy: Self = this.set("ariaDescribedBy", js.undefined)
    
    @scala.inline
    def setAriaLabel(value: String): Self = this.set("ariaLabel", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteAriaLabel: Self = this.set("ariaLabel", js.undefined)
    
    @scala.inline
    def setAriaPositionInSet(value: Double): Self = this.set("ariaPositionInSet", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteAriaPositionInSet: Self = this.set("ariaPositionInSet", js.undefined)
    
    @scala.inline
    def setAriaSetSize(value: Double): Self = this.set("ariaSetSize", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteAriaSetSize: Self = this.set("ariaSetSize", js.undefined)
    
    @scala.inline
    def setAriaValueNow(value: Double): Self = this.set("ariaValueNow", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteAriaValueNow: Self = this.set("ariaValueNow", js.undefined)
    
    @scala.inline
    def setAriaValueText(value: String): Self = this.set("ariaValueText", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteAriaValueText: Self = this.set("ariaValueText", js.undefined)
    
    @scala.inline
    def setComponentRefFunction1(value: /* ref */ ISpinButton | Null => Unit): Self = this.set("componentRef", js.Any.fromFunction1(value))
    
    @scala.inline
    def setComponentRef(value: IRefObject[ISpinButton]): Self = this.set("componentRef", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteComponentRef: Self = this.set("componentRef", js.undefined)
    
    @scala.inline
    def setDecrementButtonAriaLabel(value: String): Self = this.set("decrementButtonAriaLabel", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDecrementButtonAriaLabel: Self = this.set("decrementButtonAriaLabel", js.undefined)
    
    @scala.inline
    def setDecrementButtonIcon(value: IIconProps): Self = this.set("decrementButtonIcon", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDecrementButtonIcon: Self = this.set("decrementButtonIcon", js.undefined)
    
    @scala.inline
    def setDefaultValue(value: String): Self = this.set("defaultValue", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDefaultValue: Self = this.set("defaultValue", js.undefined)
    
    @scala.inline
    def setDisabled(value: Boolean): Self = this.set("disabled", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDisabled: Self = this.set("disabled", js.undefined)
    
    @scala.inline
    def setDownArrowButtonStyles(value: PartialIButtonStyles): Self = this.set("downArrowButtonStyles", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDownArrowButtonStyles: Self = this.set("downArrowButtonStyles", js.undefined)
    
    @scala.inline
    def setGetClassNames(
      value: (/* theme */ ITheme, /* disabled */ Boolean, /* isFocused */ Boolean, /* keyboardSpinDirection */ KeyboardSpinDirection, /* labelPosition */ js.UndefOr[Position], /* className */ js.UndefOr[String]) => ISpinButtonClassNames
    ): Self = this.set("getClassNames", js.Any.fromFunction6(value))
    
    @scala.inline
    def deleteGetClassNames: Self = this.set("getClassNames", js.undefined)
    
    @scala.inline
    def setIconButtonProps(value: IButtonProps): Self = this.set("iconButtonProps", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteIconButtonProps: Self = this.set("iconButtonProps", js.undefined)
    
    @scala.inline
    def setIconProps(value: IIconProps): Self = this.set("iconProps", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteIconProps: Self = this.set("iconProps", js.undefined)
    
    @scala.inline
    def setIncrementButtonAriaLabel(value: String): Self = this.set("incrementButtonAriaLabel", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteIncrementButtonAriaLabel: Self = this.set("incrementButtonAriaLabel", js.undefined)
    
    @scala.inline
    def setIncrementButtonIcon(value: IIconProps): Self = this.set("incrementButtonIcon", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteIncrementButtonIcon: Self = this.set("incrementButtonIcon", js.undefined)
    
    @scala.inline
    def setInputProps(value: InputHTMLAttributes[HTMLElement | HTMLInputElement]): Self = this.set("inputProps", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteInputProps: Self = this.set("inputProps", js.undefined)
    
    @scala.inline
    def setKeytipProps(value: IKeytipProps): Self = this.set("keytipProps", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteKeytipProps: Self = this.set("keytipProps", js.undefined)
    
    @scala.inline
    def setLabel(value: String): Self = this.set("label", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteLabel: Self = this.set("label", js.undefined)
    
    @scala.inline
    def setLabelPosition(value: Position): Self = this.set("labelPosition", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteLabelPosition: Self = this.set("labelPosition", js.undefined)
    
    @scala.inline
    def setMax(value: Double): Self = this.set("max", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteMax: Self = this.set("max", js.undefined)
    
    @scala.inline
    def setMin(value: Double): Self = this.set("min", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteMin: Self = this.set("min", js.undefined)
    
    @scala.inline
    def setOnBlur(value: FocusEvent[HTMLInputElement] => Unit): Self = this.set("onBlur", js.Any.fromFunction1(value))
    
    @scala.inline
    def deleteOnBlur: Self = this.set("onBlur", js.undefined)
    
    @scala.inline
    def setOnDecrement(
      value: (/* value */ String, /* event */ js.UndefOr[(MouseEvent[HTMLElement, NativeMouseEvent]) | KeyboardEvent[HTMLElement]]) => String | Unit
    ): Self = this.set("onDecrement", js.Any.fromFunction2(value))
    
    @scala.inline
    def deleteOnDecrement: Self = this.set("onDecrement", js.undefined)
    
    @scala.inline
    def setOnFocus(value: FocusEvent[HTMLInputElement] => Unit): Self = this.set("onFocus", js.Any.fromFunction1(value))
    
    @scala.inline
    def deleteOnFocus: Self = this.set("onFocus", js.undefined)
    
    @scala.inline
    def setOnIncrement(
      value: (/* value */ String, /* event */ js.UndefOr[(MouseEvent[HTMLElement, NativeMouseEvent]) | KeyboardEvent[HTMLElement]]) => String | Unit
    ): Self = this.set("onIncrement", js.Any.fromFunction2(value))
    
    @scala.inline
    def deleteOnIncrement: Self = this.set("onIncrement", js.undefined)
    
    @scala.inline
    def setOnValidate(
      value: (/* value */ String, /* event */ js.UndefOr[SyntheticEvent[HTMLElement, Event]]) => String | Unit
    ): Self = this.set("onValidate", js.Any.fromFunction2(value))
    
    @scala.inline
    def deleteOnValidate: Self = this.set("onValidate", js.undefined)
    
    @scala.inline
    def setPrecision(value: Double): Self = this.set("precision", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deletePrecision: Self = this.set("precision", js.undefined)
    
    @scala.inline
    def setStep(value: Double): Self = this.set("step", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteStep: Self = this.set("step", js.undefined)
    
    @scala.inline
    def setStyles(value: PartialISpinButtonStyles): Self = this.set("styles", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteStyles: Self = this.set("styles", js.undefined)
    
    @scala.inline
    def setTheme(value: ITheme): Self = this.set("theme", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteTheme: Self = this.set("theme", js.undefined)
    
    @scala.inline
    def setUpArrowButtonStyles(value: PartialIButtonStyles): Self = this.set("upArrowButtonStyles", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteUpArrowButtonStyles: Self = this.set("upArrowButtonStyles", js.undefined)
    
    @scala.inline
    def setValue(value: String): Self = this.set("value", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteValue: Self = this.set("value", js.undefined)
  }
}
