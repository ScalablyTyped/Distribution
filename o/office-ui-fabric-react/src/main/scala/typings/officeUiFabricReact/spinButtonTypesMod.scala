package typings.officeUiFabricReact

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
import typings.uifabricMergeStyles.istyleMod.IStyle
import typings.uifabricUtilities.createRefMod.IRefObject
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object spinButtonTypesMod {
  
  trait ISpinButton extends StObject {
    
    /**
      * Sets focus to the control.
      */
    def focus(): Unit
    
    /**
      * Current value of the control.
      */
    var value: js.UndefOr[String] = js.undefined
  }
  object ISpinButton {
    
    @scala.inline
    def apply(focus: () => Unit): ISpinButton = {
      val __obj = js.Dynamic.literal(focus = js.Any.fromFunction0(focus))
      __obj.asInstanceOf[ISpinButton]
    }
    
    @scala.inline
    implicit class ISpinButtonMutableBuilder[Self <: ISpinButton] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setFocus(value: () => Unit): Self = StObject.set(x, "focus", js.Any.fromFunction0(value))
      
      @scala.inline
      def setValue(value: String): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setValueUndefined: Self = StObject.set(x, "value", js.undefined)
    }
  }
  
  trait ISpinButtonClassNames extends StObject {
    
    var arrowBox: String
    
    var icon: String
    
    var input: String
    
    var label: String
    
    var labelWrapper: String
    
    var root: String
    
    var spinButtonWrapper: String
  }
  object ISpinButtonClassNames {
    
    @scala.inline
    def apply(
      arrowBox: String,
      icon: String,
      input: String,
      label: String,
      labelWrapper: String,
      root: String,
      spinButtonWrapper: String
    ): ISpinButtonClassNames = {
      val __obj = js.Dynamic.literal(arrowBox = arrowBox.asInstanceOf[js.Any], icon = icon.asInstanceOf[js.Any], input = input.asInstanceOf[js.Any], label = label.asInstanceOf[js.Any], labelWrapper = labelWrapper.asInstanceOf[js.Any], root = root.asInstanceOf[js.Any], spinButtonWrapper = spinButtonWrapper.asInstanceOf[js.Any])
      __obj.asInstanceOf[ISpinButtonClassNames]
    }
    
    @scala.inline
    implicit class ISpinButtonClassNamesMutableBuilder[Self <: ISpinButtonClassNames] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setArrowBox(value: String): Self = StObject.set(x, "arrowBox", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setIcon(value: String): Self = StObject.set(x, "icon", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setInput(value: String): Self = StObject.set(x, "input", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setLabel(value: String): Self = StObject.set(x, "label", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setLabelWrapper(value: String): Self = StObject.set(x, "labelWrapper", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setRoot(value: String): Self = StObject.set(x, "root", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSpinButtonWrapper(value: String): Self = StObject.set(x, "spinButtonWrapper", value.asInstanceOf[js.Any])
    }
  }
  
  trait ISpinButtonProps
    extends StObject
       with HTMLAttributes[HTMLDivElement] {
    
    /**
      * ID of a label which describes the control, if not using the default label.
      */
    var ariaDescribedBy: js.UndefOr[String] = js.undefined
    
    /**
      * A description of the control for the benefit of screen reader users.
      */
    var ariaLabel: js.UndefOr[String] = js.undefined
    
    /**
      * The position in the parent set (if in a set).
      */
    var ariaPositionInSet: js.UndefOr[Double] = js.undefined
    
    /**
      * The total size of the parent set (if in a set).
      */
    var ariaSetSize: js.UndefOr[Double] = js.undefined
    
    /**
      * Sets the control's aria-valuenow. This is the numeric form of `value`.
      * Providing this only makes sense when using as a controlled component.
      */
    var ariaValueNow: js.UndefOr[Double] = js.undefined
    
    var ariaValueText: js.UndefOr[String] = js.undefined
    
    /**
      * Gets the component ref.
      */
    var componentRef: js.UndefOr[IRefObject[ISpinButton]] = js.undefined
    
    /**
      * Accessible label text for the decrement button (for screen reader users).
      */
    var decrementButtonAriaLabel: js.UndefOr[String] = js.undefined
    
    /**
      * Custom props for the decrement button.
      */
    var decrementButtonIcon: js.UndefOr[IIconProps] = js.undefined
    
    /**
      * Initial value of the control. Updates to this prop will not be respected.
      *
      * Use this if you intend for the SpinButton to be an uncontrolled component which maintains its own value.
      * Mutually exclusive with `value`.
      * @defaultvalue 0
      */
    @JSName("defaultValue")
    var defaultValue_ISpinButtonProps: js.UndefOr[String] = js.undefined
    
    /**
      * Whether or not the control is disabled.
      */
    var disabled: js.UndefOr[Boolean] = js.undefined
    
    /**
      * Custom styles for the down arrow button.
      *
      * Note: The buttons are in a checked state when arrow keys are used to incremenent/decrement
      * the SpinButton. Use `rootChecked` instead of `rootPressed` for styling when that is the case.
      */
    var downArrowButtonStyles: js.UndefOr[PartialIButtonStyles] = js.undefined
    
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
      ] = js.undefined
    
    /**
      * Additional props for the up and down arrow buttons.
      */
    var iconButtonProps: js.UndefOr[IButtonProps] = js.undefined
    
    /**
      * Props for an icon to display alongside the control's label.
      */
    var iconProps: js.UndefOr[IIconProps] = js.undefined
    
    /**
      * Accessible label text for the increment button (for screen reader users).
      */
    var incrementButtonAriaLabel: js.UndefOr[String] = js.undefined
    
    /**
      * Custom props for the increment button.
      */
    var incrementButtonIcon: js.UndefOr[IIconProps] = js.undefined
    
    /**
      * Additional props for the input field.
      */
    var inputProps: js.UndefOr[InputHTMLAttributes[HTMLElement | HTMLInputElement]] = js.undefined
    
    /**
      * Keytip for the control.
      */
    var keytipProps: js.UndefOr[IKeytipProps] = js.undefined
    
    /**
      * Descriptive label for the control.
      */
    var label: js.UndefOr[String] = js.undefined
    
    /**
      * Where to position the control's label.
      * @defaultvalue Left
      */
    var labelPosition: js.UndefOr[Position] = js.undefined
    
    /**
      * Max value of the control.
      * @defaultvalue 100
      */
    var max: js.UndefOr[Double] = js.undefined
    
    /**
      * Min value of the control.
      * @defaultvalue 0
      */
    var min: js.UndefOr[Double] = js.undefined
    
    /**
      * Callback for when the control loses focus.
      */
    @JSName("onBlur")
    var onBlur_ISpinButtonProps: js.UndefOr[FocusEventHandler[HTMLInputElement]] = js.undefined
    
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
      ] = js.undefined
    
    /**
      * Callback for when the user focuses the control.
      */
    @JSName("onFocus")
    var onFocus_ISpinButtonProps: js.UndefOr[FocusEventHandler[HTMLInputElement]] = js.undefined
    
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
      ] = js.undefined
    
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
      ] = js.undefined
    
    /**
      * How many decimal places the value should be rounded to.
      *
      * The default is calculated based on the precision of `step`: i.e. if step = 1, precision = 0.
      * step = 0.0089, precision = 4. step = 300, precision = 2. step = 23.00, precision = 2.
      */
    var precision: js.UndefOr[Double] = js.undefined
    
    /**
      * Difference between two adjacent values of the control.
      * This value is used to calculate the precision of the input if no `precision` is given.
      * The precision calculated this way will always be \>= 0.
      * @defaultvalue 1
      */
    var step: js.UndefOr[Double] = js.undefined
    
    /**
      * Custom styling for individual elements within the control.
      */
    var styles: js.UndefOr[PartialISpinButtonStyles] = js.undefined
    
    /**
      * Theme provided by HOC.
      */
    var theme: js.UndefOr[ITheme] = js.undefined
    
    /**
      * Custom styles for the up arrow button.
      *
      * Note: The buttons are in a checked state when arrow keys are used to incremenent/decrement
      * the SpinButton. Use `rootChecked` instead of `rootPressed` for styling when that is the case.
      */
    var upArrowButtonStyles: js.UndefOr[PartialIButtonStyles] = js.undefined
    
    /**
      * Current value of the control.
      *
      * Use this if you intend to pass in a new value as a result of change events.
      * Mutually exclusive with `defaultValue`.
      */
    var value: js.UndefOr[String] = js.undefined
  }
  object ISpinButtonProps {
    
    @scala.inline
    def apply(): ISpinButtonProps = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[ISpinButtonProps]
    }
    
    @scala.inline
    implicit class ISpinButtonPropsMutableBuilder[Self <: ISpinButtonProps] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setAriaDescribedBy(value: String): Self = StObject.set(x, "ariaDescribedBy", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setAriaDescribedByUndefined: Self = StObject.set(x, "ariaDescribedBy", js.undefined)
      
      @scala.inline
      def setAriaLabel(value: String): Self = StObject.set(x, "ariaLabel", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setAriaLabelUndefined: Self = StObject.set(x, "ariaLabel", js.undefined)
      
      @scala.inline
      def setAriaPositionInSet(value: Double): Self = StObject.set(x, "ariaPositionInSet", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setAriaPositionInSetUndefined: Self = StObject.set(x, "ariaPositionInSet", js.undefined)
      
      @scala.inline
      def setAriaSetSize(value: Double): Self = StObject.set(x, "ariaSetSize", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setAriaSetSizeUndefined: Self = StObject.set(x, "ariaSetSize", js.undefined)
      
      @scala.inline
      def setAriaValueNow(value: Double): Self = StObject.set(x, "ariaValueNow", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setAriaValueNowUndefined: Self = StObject.set(x, "ariaValueNow", js.undefined)
      
      @scala.inline
      def setAriaValueText(value: String): Self = StObject.set(x, "ariaValueText", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setAriaValueTextUndefined: Self = StObject.set(x, "ariaValueText", js.undefined)
      
      @scala.inline
      def setComponentRef(value: IRefObject[ISpinButton]): Self = StObject.set(x, "componentRef", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setComponentRefFunction1(value: /* ref */ ISpinButton | Null => Unit): Self = StObject.set(x, "componentRef", js.Any.fromFunction1(value))
      
      @scala.inline
      def setComponentRefUndefined: Self = StObject.set(x, "componentRef", js.undefined)
      
      @scala.inline
      def setDecrementButtonAriaLabel(value: String): Self = StObject.set(x, "decrementButtonAriaLabel", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDecrementButtonAriaLabelUndefined: Self = StObject.set(x, "decrementButtonAriaLabel", js.undefined)
      
      @scala.inline
      def setDecrementButtonIcon(value: IIconProps): Self = StObject.set(x, "decrementButtonIcon", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDecrementButtonIconUndefined: Self = StObject.set(x, "decrementButtonIcon", js.undefined)
      
      @scala.inline
      def setDefaultValue(value: String): Self = StObject.set(x, "defaultValue", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDefaultValueUndefined: Self = StObject.set(x, "defaultValue", js.undefined)
      
      @scala.inline
      def setDisabled(value: Boolean): Self = StObject.set(x, "disabled", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDisabledUndefined: Self = StObject.set(x, "disabled", js.undefined)
      
      @scala.inline
      def setDownArrowButtonStyles(value: PartialIButtonStyles): Self = StObject.set(x, "downArrowButtonStyles", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDownArrowButtonStylesUndefined: Self = StObject.set(x, "downArrowButtonStyles", js.undefined)
      
      @scala.inline
      def setGetClassNames(
        value: (/* theme */ ITheme, /* disabled */ Boolean, /* isFocused */ Boolean, /* keyboardSpinDirection */ KeyboardSpinDirection, /* labelPosition */ js.UndefOr[Position], /* className */ js.UndefOr[String]) => ISpinButtonClassNames
      ): Self = StObject.set(x, "getClassNames", js.Any.fromFunction6(value))
      
      @scala.inline
      def setGetClassNamesUndefined: Self = StObject.set(x, "getClassNames", js.undefined)
      
      @scala.inline
      def setIconButtonProps(value: IButtonProps): Self = StObject.set(x, "iconButtonProps", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setIconButtonPropsUndefined: Self = StObject.set(x, "iconButtonProps", js.undefined)
      
      @scala.inline
      def setIconProps(value: IIconProps): Self = StObject.set(x, "iconProps", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setIconPropsUndefined: Self = StObject.set(x, "iconProps", js.undefined)
      
      @scala.inline
      def setIncrementButtonAriaLabel(value: String): Self = StObject.set(x, "incrementButtonAriaLabel", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setIncrementButtonAriaLabelUndefined: Self = StObject.set(x, "incrementButtonAriaLabel", js.undefined)
      
      @scala.inline
      def setIncrementButtonIcon(value: IIconProps): Self = StObject.set(x, "incrementButtonIcon", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setIncrementButtonIconUndefined: Self = StObject.set(x, "incrementButtonIcon", js.undefined)
      
      @scala.inline
      def setInputProps(value: InputHTMLAttributes[HTMLElement | HTMLInputElement]): Self = StObject.set(x, "inputProps", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setInputPropsUndefined: Self = StObject.set(x, "inputProps", js.undefined)
      
      @scala.inline
      def setKeytipProps(value: IKeytipProps): Self = StObject.set(x, "keytipProps", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setKeytipPropsUndefined: Self = StObject.set(x, "keytipProps", js.undefined)
      
      @scala.inline
      def setLabel(value: String): Self = StObject.set(x, "label", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setLabelPosition(value: Position): Self = StObject.set(x, "labelPosition", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setLabelPositionUndefined: Self = StObject.set(x, "labelPosition", js.undefined)
      
      @scala.inline
      def setLabelUndefined: Self = StObject.set(x, "label", js.undefined)
      
      @scala.inline
      def setMax(value: Double): Self = StObject.set(x, "max", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMaxUndefined: Self = StObject.set(x, "max", js.undefined)
      
      @scala.inline
      def setMin(value: Double): Self = StObject.set(x, "min", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMinUndefined: Self = StObject.set(x, "min", js.undefined)
      
      @scala.inline
      def setOnBlur(value: FocusEvent[HTMLInputElement] => Unit): Self = StObject.set(x, "onBlur", js.Any.fromFunction1(value))
      
      @scala.inline
      def setOnBlurUndefined: Self = StObject.set(x, "onBlur", js.undefined)
      
      @scala.inline
      def setOnDecrement(
        value: (/* value */ String, /* event */ js.UndefOr[(MouseEvent[HTMLElement, NativeMouseEvent]) | KeyboardEvent[HTMLElement]]) => String | Unit
      ): Self = StObject.set(x, "onDecrement", js.Any.fromFunction2(value))
      
      @scala.inline
      def setOnDecrementUndefined: Self = StObject.set(x, "onDecrement", js.undefined)
      
      @scala.inline
      def setOnFocus(value: FocusEvent[HTMLInputElement] => Unit): Self = StObject.set(x, "onFocus", js.Any.fromFunction1(value))
      
      @scala.inline
      def setOnFocusUndefined: Self = StObject.set(x, "onFocus", js.undefined)
      
      @scala.inline
      def setOnIncrement(
        value: (/* value */ String, /* event */ js.UndefOr[(MouseEvent[HTMLElement, NativeMouseEvent]) | KeyboardEvent[HTMLElement]]) => String | Unit
      ): Self = StObject.set(x, "onIncrement", js.Any.fromFunction2(value))
      
      @scala.inline
      def setOnIncrementUndefined: Self = StObject.set(x, "onIncrement", js.undefined)
      
      @scala.inline
      def setOnValidate(
        value: (/* value */ String, /* event */ js.UndefOr[SyntheticEvent[HTMLElement, Event]]) => String | Unit
      ): Self = StObject.set(x, "onValidate", js.Any.fromFunction2(value))
      
      @scala.inline
      def setOnValidateUndefined: Self = StObject.set(x, "onValidate", js.undefined)
      
      @scala.inline
      def setPrecision(value: Double): Self = StObject.set(x, "precision", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPrecisionUndefined: Self = StObject.set(x, "precision", js.undefined)
      
      @scala.inline
      def setStep(value: Double): Self = StObject.set(x, "step", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setStepUndefined: Self = StObject.set(x, "step", js.undefined)
      
      @scala.inline
      def setStyles(value: PartialISpinButtonStyles): Self = StObject.set(x, "styles", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setStylesUndefined: Self = StObject.set(x, "styles", js.undefined)
      
      @scala.inline
      def setTheme(value: ITheme): Self = StObject.set(x, "theme", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setThemeUndefined: Self = StObject.set(x, "theme", js.undefined)
      
      @scala.inline
      def setUpArrowButtonStyles(value: PartialIButtonStyles): Self = StObject.set(x, "upArrowButtonStyles", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setUpArrowButtonStylesUndefined: Self = StObject.set(x, "upArrowButtonStyles", js.undefined)
      
      @scala.inline
      def setValue(value: String): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setValueUndefined: Self = StObject.set(x, "value", js.undefined)
    }
  }
  
  trait ISpinButtonStyles extends StObject {
    
    /**
      * Styles for the arrowButtonsContainer
      */
    var arrowButtonsContainer: IStyle
    
    /**
      * Style override for the arrowButtonsContainer when control is disabled.
      */
    var arrowButtonsContainerDisabled: IStyle
    
    /**
      * Style for the icon.
      */
    var icon: IStyle
    
    /**
      * Style for the icon when the control is disabled.
      */
    var iconDisabled: IStyle
    
    /**
      * Styles for the input.
      */
    var input: IStyle
    
    /**
      * Style override when control is disabled.
      */
    var inputDisabled: IStyle
    
    /**
      * Style override for ::selection
      */
    var inputTextSelected: IStyle
    
    /**
      * Style for the label text.
      */
    var label: IStyle
    
    /**
      * Style for the label text when the control is disabled.
      * @deprecated Disabled styles taken care by `Label` component.
      */
    var labelDisabled: IStyle
    
    /**
      * Style for the label wrapper element, which contains the icon and label.
      */
    var labelWrapper: IStyle
    
    /**
      * Style override when the label is positioned at the bottom.
      */
    var labelWrapperBottom: IStyle
    
    /**
      * Style override when the label is positioned at the end.
      */
    var labelWrapperEnd: IStyle
    
    /**
      * Style override when the label is positioned at the start.
      */
    var labelWrapperStart: IStyle
    
    /**
      * Style override when the label is positioned at the top.
      */
    var labelWrapperTop: IStyle
    
    /**
      * Styles for the root of the component.
      */
    var root: IStyle
    
    /**
      * Style for the wrapper element of the input field and arrow buttons.
      */
    var spinButtonWrapper: IStyle
    
    /**
      * Style override when control is disabled.
      */
    var spinButtonWrapperDisabled: IStyle
    
    /**
      * Style override when SpinButton is enabled/focused.
      */
    var spinButtonWrapperFocused: IStyle
    
    /**
      * Style override when control is enabled/hovered.
      */
    var spinButtonWrapperHovered: IStyle
    
    /**
      * Style override when label is positioned at the top/bottom.
      */
    var spinButtonWrapperTopBottom: IStyle
  }
  object ISpinButtonStyles {
    
    @scala.inline
    def apply(): ISpinButtonStyles = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[ISpinButtonStyles]
    }
    
    @scala.inline
    implicit class ISpinButtonStylesMutableBuilder[Self <: ISpinButtonStyles] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setArrowButtonsContainer(value: IStyle): Self = StObject.set(x, "arrowButtonsContainer", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setArrowButtonsContainerDisabled(value: IStyle): Self = StObject.set(x, "arrowButtonsContainerDisabled", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setArrowButtonsContainerDisabledNull: Self = StObject.set(x, "arrowButtonsContainerDisabled", null)
      
      @scala.inline
      def setArrowButtonsContainerDisabledUndefined: Self = StObject.set(x, "arrowButtonsContainerDisabled", js.undefined)
      
      @scala.inline
      def setArrowButtonsContainerNull: Self = StObject.set(x, "arrowButtonsContainer", null)
      
      @scala.inline
      def setArrowButtonsContainerUndefined: Self = StObject.set(x, "arrowButtonsContainer", js.undefined)
      
      @scala.inline
      def setIcon(value: IStyle): Self = StObject.set(x, "icon", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setIconDisabled(value: IStyle): Self = StObject.set(x, "iconDisabled", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setIconDisabledNull: Self = StObject.set(x, "iconDisabled", null)
      
      @scala.inline
      def setIconDisabledUndefined: Self = StObject.set(x, "iconDisabled", js.undefined)
      
      @scala.inline
      def setIconNull: Self = StObject.set(x, "icon", null)
      
      @scala.inline
      def setIconUndefined: Self = StObject.set(x, "icon", js.undefined)
      
      @scala.inline
      def setInput(value: IStyle): Self = StObject.set(x, "input", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setInputDisabled(value: IStyle): Self = StObject.set(x, "inputDisabled", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setInputDisabledNull: Self = StObject.set(x, "inputDisabled", null)
      
      @scala.inline
      def setInputDisabledUndefined: Self = StObject.set(x, "inputDisabled", js.undefined)
      
      @scala.inline
      def setInputNull: Self = StObject.set(x, "input", null)
      
      @scala.inline
      def setInputTextSelected(value: IStyle): Self = StObject.set(x, "inputTextSelected", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setInputTextSelectedNull: Self = StObject.set(x, "inputTextSelected", null)
      
      @scala.inline
      def setInputTextSelectedUndefined: Self = StObject.set(x, "inputTextSelected", js.undefined)
      
      @scala.inline
      def setInputUndefined: Self = StObject.set(x, "input", js.undefined)
      
      @scala.inline
      def setLabel(value: IStyle): Self = StObject.set(x, "label", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setLabelDisabled(value: IStyle): Self = StObject.set(x, "labelDisabled", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setLabelDisabledNull: Self = StObject.set(x, "labelDisabled", null)
      
      @scala.inline
      def setLabelDisabledUndefined: Self = StObject.set(x, "labelDisabled", js.undefined)
      
      @scala.inline
      def setLabelNull: Self = StObject.set(x, "label", null)
      
      @scala.inline
      def setLabelUndefined: Self = StObject.set(x, "label", js.undefined)
      
      @scala.inline
      def setLabelWrapper(value: IStyle): Self = StObject.set(x, "labelWrapper", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setLabelWrapperBottom(value: IStyle): Self = StObject.set(x, "labelWrapperBottom", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setLabelWrapperBottomNull: Self = StObject.set(x, "labelWrapperBottom", null)
      
      @scala.inline
      def setLabelWrapperBottomUndefined: Self = StObject.set(x, "labelWrapperBottom", js.undefined)
      
      @scala.inline
      def setLabelWrapperEnd(value: IStyle): Self = StObject.set(x, "labelWrapperEnd", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setLabelWrapperEndNull: Self = StObject.set(x, "labelWrapperEnd", null)
      
      @scala.inline
      def setLabelWrapperEndUndefined: Self = StObject.set(x, "labelWrapperEnd", js.undefined)
      
      @scala.inline
      def setLabelWrapperNull: Self = StObject.set(x, "labelWrapper", null)
      
      @scala.inline
      def setLabelWrapperStart(value: IStyle): Self = StObject.set(x, "labelWrapperStart", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setLabelWrapperStartNull: Self = StObject.set(x, "labelWrapperStart", null)
      
      @scala.inline
      def setLabelWrapperStartUndefined: Self = StObject.set(x, "labelWrapperStart", js.undefined)
      
      @scala.inline
      def setLabelWrapperTop(value: IStyle): Self = StObject.set(x, "labelWrapperTop", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setLabelWrapperTopNull: Self = StObject.set(x, "labelWrapperTop", null)
      
      @scala.inline
      def setLabelWrapperTopUndefined: Self = StObject.set(x, "labelWrapperTop", js.undefined)
      
      @scala.inline
      def setLabelWrapperUndefined: Self = StObject.set(x, "labelWrapper", js.undefined)
      
      @scala.inline
      def setRoot(value: IStyle): Self = StObject.set(x, "root", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setRootNull: Self = StObject.set(x, "root", null)
      
      @scala.inline
      def setRootUndefined: Self = StObject.set(x, "root", js.undefined)
      
      @scala.inline
      def setSpinButtonWrapper(value: IStyle): Self = StObject.set(x, "spinButtonWrapper", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSpinButtonWrapperDisabled(value: IStyle): Self = StObject.set(x, "spinButtonWrapperDisabled", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSpinButtonWrapperDisabledNull: Self = StObject.set(x, "spinButtonWrapperDisabled", null)
      
      @scala.inline
      def setSpinButtonWrapperDisabledUndefined: Self = StObject.set(x, "spinButtonWrapperDisabled", js.undefined)
      
      @scala.inline
      def setSpinButtonWrapperFocused(value: IStyle): Self = StObject.set(x, "spinButtonWrapperFocused", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSpinButtonWrapperFocusedNull: Self = StObject.set(x, "spinButtonWrapperFocused", null)
      
      @scala.inline
      def setSpinButtonWrapperFocusedUndefined: Self = StObject.set(x, "spinButtonWrapperFocused", js.undefined)
      
      @scala.inline
      def setSpinButtonWrapperHovered(value: IStyle): Self = StObject.set(x, "spinButtonWrapperHovered", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSpinButtonWrapperHoveredNull: Self = StObject.set(x, "spinButtonWrapperHovered", null)
      
      @scala.inline
      def setSpinButtonWrapperHoveredUndefined: Self = StObject.set(x, "spinButtonWrapperHovered", js.undefined)
      
      @scala.inline
      def setSpinButtonWrapperNull: Self = StObject.set(x, "spinButtonWrapper", null)
      
      @scala.inline
      def setSpinButtonWrapperTopBottom(value: IStyle): Self = StObject.set(x, "spinButtonWrapperTopBottom", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSpinButtonWrapperTopBottomNull: Self = StObject.set(x, "spinButtonWrapperTopBottom", null)
      
      @scala.inline
      def setSpinButtonWrapperTopBottomUndefined: Self = StObject.set(x, "spinButtonWrapperTopBottom", js.undefined)
      
      @scala.inline
      def setSpinButtonWrapperUndefined: Self = StObject.set(x, "spinButtonWrapper", js.undefined)
    }
  }
}
