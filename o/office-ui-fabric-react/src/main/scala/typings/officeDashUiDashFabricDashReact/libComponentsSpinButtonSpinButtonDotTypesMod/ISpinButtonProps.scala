package typings.officeDashUiDashFabricDashReact.libComponentsSpinButtonSpinButtonDotTypesMod

import typings.atUifabricStyling.libInterfacesIThemeMod.ITheme
import typings.atUifabricUtilities.libCreateRefMod.IRefObject
import typings.officeDashUiDashFabricDashReact.libComponentsButtonButtonDotTypesMod.IButtonProps
import typings.officeDashUiDashFabricDashReact.libComponentsButtonButtonDotTypesMod.IButtonStyles
import typings.officeDashUiDashFabricDashReact.libComponentsIconIconDotTypesMod.IIconProps
import typings.officeDashUiDashFabricDashReact.libComponentsKeytipKeytipDotTypesMod.IKeytipProps
import typings.officeDashUiDashFabricDashReact.libComponentsSpinButtonSpinButtonDotClassNamesMod.ISpinButtonClassNames
import typings.officeDashUiDashFabricDashReact.libComponentsSpinButtonSpinButtonMod.KeyboardSpinDirection
import typings.officeDashUiDashFabricDashReact.libUtilitiesPositioningPositioningDotTypesMod.Position
import typings.react.Event
import typings.react.reactMod.FocusEventHandler
import typings.react.reactMod.InputHTMLAttributes
import typings.react.reactMod.SyntheticEvent
import typings.std.HTMLElement
import typings.std.HTMLInputElement
import typings.std.Partial
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ISpinButtonProps extends js.Object {
  /**
    * Optional prop to add a string id that can be referenced inside the aria-describedby attribute
    */
  var ariaDescribedBy: js.UndefOr[String] = js.undefined
  /**
    * A description of the SpinButton for the benefit of screen readers.
    */
  var ariaLabel: js.UndefOr[String] = js.undefined
  /**
    * The position in the parent set (if in a set) for aria-posinset.
    */
  var ariaPositionInSet: js.UndefOr[Double] = js.undefined
  /**
    * The total size of the parent set (if in a set) for aria-setsize.
    */
  var ariaSetSize: js.UndefOr[Double] = js.undefined
  /**
    * Sets the aria-valuenow of the spin button. The component must be
    * controlled by the creator who controls the value externally.
    * ariaValueNow would be the numeric form of value.
    */
  var ariaValueNow: js.UndefOr[Double] = js.undefined
  var ariaValueText: js.UndefOr[String] = js.undefined
  /**
    * Optional className for SpinButton.
    */
  var className: js.UndefOr[String] = js.undefined
  /**
    * Gets the component ref.
    */
  var componentRef: js.UndefOr[IRefObject[ISpinButton]] = js.undefined
  /**
    * Accessibile label text for the decrement button for the benefit of the screen reader.
    */
  var decrementButtonAriaLabel: js.UndefOr[String] = js.undefined
  /**
    * Icon for the decrement button of the spinButton
    */
  var decrementButtonIcon: js.UndefOr[IIconProps] = js.undefined
  /**
    * The initial value of the SpinButton. Use this if you intend for the SpinButton to be an uncontrolled component.
    * This value is mutually exclusive to value. Use one or the other.
    * @defaultvalue 0
    */
  var defaultValue: js.UndefOr[String] = js.undefined
  /**
    * Whether or not the SpinButton is disabled.
    */
  var disabled: js.UndefOr[Boolean] = js.undefined
  /**
    * Custom styles for the downArrow button.
    *
    * Note: The buttons are in a checked state when arrow keys are used to
    * incremenent/decrement the spinButton. Use rootChecked instead of rootPressed
    * for styling when that is the case.
    */
  var downArrowButtonStyles: js.UndefOr[Partial[IButtonStyles]] = js.undefined
  /**
    * Custom function for providing the classNames for the spinbutton. Can be used to provide
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
    * Optional iconButton props on spin button
    */
  var iconButtonProps: js.UndefOr[IButtonProps] = js.undefined
  /**
    * Icon that goes along with the label for the whole SpinButton
    */
  var iconProps: js.UndefOr[IIconProps] = js.undefined
  /**
    * Accessibile label text for the increment button for the benefit of the screen reader.
    */
  var incrementButtonAriaLabel: js.UndefOr[String] = js.undefined
  /**
    * Icon for the increment button of the spinButton
    */
  var incrementButtonIcon: js.UndefOr[IIconProps] = js.undefined
  /**
    * Optional input props on spin button
    */
  var inputProps: js.UndefOr[InputHTMLAttributes[HTMLElement | HTMLInputElement]] = js.undefined
  /**
    * Optional keytip for this spin button
    */
  var keytipProps: js.UndefOr[IKeytipProps] = js.undefined
  /**
    * Descriptive label for the SpinButton.
    */
  var label: js.UndefOr[String] = js.undefined
  /**
    * @defaultvalue Left
    */
  var labelPosition: js.UndefOr[Position] = js.undefined
  /**
    * The max value of the SpinButton.
    * @defaultvalue 10
    */
  var max: js.UndefOr[Double] = js.undefined
  /**
    * The min value of the SpinButton.
    * @defaultvalue 0
    */
  var min: js.UndefOr[Double] = js.undefined
  /**
    * A callback for when the user moves the focus away from the picker
    */
  var onBlur: js.UndefOr[FocusEventHandler[HTMLInputElement]] = js.undefined
  /**
    * This callback is triggered when the decrement button is pressed or if the user presses down arrow
    * with focus on the input of the spinButton
    * @returns If a string is returned, it will be used as the value of the SpinButton.
    */
  var onDecrement: js.UndefOr[js.Function1[/* value */ String, String | Unit]] = js.undefined
  /**
    * A callback for when the user put focus on the picker
    */
  var onFocus: js.UndefOr[FocusEventHandler[HTMLInputElement]] = js.undefined
  /**
    * This callback is triggered when the increment button is pressed or if the user presses up arrow
    * with focus on the input of the spinButton
    * @returns If a string is returned, it will be used as the value of the SpinButton.
    */
  var onIncrement: js.UndefOr[js.Function1[/* value */ String, String | Unit]] = js.undefined
  /**
    * This callback is triggered when the value inside the SpinButton should be validated.
    * @param value - The value entered in the SpinButton to validate
    * @param event - The event that triggered this validate, if any. (For accessibility)
    * @returns If a string is returned, it will be used as the value of the SpinButton.
    */
  var onValidate: js.UndefOr[
    js.Function2[
      /* value */ String, 
      /* event */ js.UndefOr[SyntheticEvent[HTMLElement, Event]], 
      String | Unit
    ]
  ] = js.undefined
  /**
    * To how many decimal places the value should be rounded to.
    * The default value is calculated based on the precision of step.
    * IE: if step = 1, precision = 0. step = 0.0089, precision = 4. step = 300, precision = 2. step = 23.00, precision = 2.
    */
  var precision: js.UndefOr[Double] = js.undefined
  /**
    * The difference between the two adjacent values of the SpinButton.
    * This value is sued to calculate the precision of the input if no
    * precision is given. The precision calculated this way will always
    * be \>= 0.
    * @defaultvalue 1
    */
  var step: js.UndefOr[Double] = js.undefined
  /**
    * Custom styling for individual elements within the button DOM.
    */
  var styles: js.UndefOr[Partial[ISpinButtonStyles]] = js.undefined
  /**
    * Theme provided by HOC.
    */
  var theme: js.UndefOr[ITheme] = js.undefined
  /**
    * A title for the SpinButton used for a more descriptive name that's also visible on its tooltip.
    */
  var title: js.UndefOr[String] = js.undefined
  /**
    * Custom styles for the upArrow button.
    *
    * Note: The buttons are in a checked state when arrow keys are used to
    * incremenent/decrement the spinButton. Use rootChecked instead of rootPressed
    * for styling when that is the case.
    */
  var upArrowButtonStyles: js.UndefOr[Partial[IButtonStyles]] = js.undefined
  /**
    * The value of the SpinButton. Use this if you intend to pass in a new value as a result of onChange events.
    * This value is mutually exclusive to defaultValue. Use one or the other.
    */
  var value: js.UndefOr[String] = js.undefined
}

object ISpinButtonProps {
  @scala.inline
  def apply(
    ariaDescribedBy: String = null,
    ariaLabel: String = null,
    ariaPositionInSet: Int | Double = null,
    ariaSetSize: Int | Double = null,
    ariaValueNow: Int | Double = null,
    ariaValueText: String = null,
    className: String = null,
    componentRef: IRefObject[ISpinButton] = null,
    decrementButtonAriaLabel: String = null,
    decrementButtonIcon: IIconProps = null,
    defaultValue: String = null,
    disabled: js.UndefOr[Boolean] = js.undefined,
    downArrowButtonStyles: Partial[IButtonStyles] = null,
    getClassNames: (/* theme */ ITheme, /* disabled */ Boolean, /* isFocused */ Boolean, /* keyboardSpinDirection */ KeyboardSpinDirection, /* labelPosition */ js.UndefOr[Position], /* className */ js.UndefOr[String]) => ISpinButtonClassNames = null,
    iconButtonProps: IButtonProps = null,
    iconProps: IIconProps = null,
    incrementButtonAriaLabel: String = null,
    incrementButtonIcon: IIconProps = null,
    inputProps: InputHTMLAttributes[HTMLElement | HTMLInputElement] = null,
    keytipProps: IKeytipProps = null,
    label: String = null,
    labelPosition: Position = null,
    max: Int | Double = null,
    min: Int | Double = null,
    onBlur: FocusEventHandler[HTMLInputElement] = null,
    onDecrement: /* value */ String => String | Unit = null,
    onFocus: FocusEventHandler[HTMLInputElement] = null,
    onIncrement: /* value */ String => String | Unit = null,
    onValidate: (/* value */ String, /* event */ js.UndefOr[SyntheticEvent[HTMLElement, Event]]) => String | Unit = null,
    precision: Int | Double = null,
    step: Int | Double = null,
    styles: Partial[ISpinButtonStyles] = null,
    theme: ITheme = null,
    title: String = null,
    upArrowButtonStyles: Partial[IButtonStyles] = null,
    value: String = null
  ): ISpinButtonProps = {
    val __obj = js.Dynamic.literal()
    if (ariaDescribedBy != null) __obj.updateDynamic("ariaDescribedBy")(ariaDescribedBy)
    if (ariaLabel != null) __obj.updateDynamic("ariaLabel")(ariaLabel)
    if (ariaPositionInSet != null) __obj.updateDynamic("ariaPositionInSet")(ariaPositionInSet.asInstanceOf[js.Any])
    if (ariaSetSize != null) __obj.updateDynamic("ariaSetSize")(ariaSetSize.asInstanceOf[js.Any])
    if (ariaValueNow != null) __obj.updateDynamic("ariaValueNow")(ariaValueNow.asInstanceOf[js.Any])
    if (ariaValueText != null) __obj.updateDynamic("ariaValueText")(ariaValueText)
    if (className != null) __obj.updateDynamic("className")(className)
    if (componentRef != null) __obj.updateDynamic("componentRef")(componentRef.asInstanceOf[js.Any])
    if (decrementButtonAriaLabel != null) __obj.updateDynamic("decrementButtonAriaLabel")(decrementButtonAriaLabel)
    if (decrementButtonIcon != null) __obj.updateDynamic("decrementButtonIcon")(decrementButtonIcon)
    if (defaultValue != null) __obj.updateDynamic("defaultValue")(defaultValue)
    if (!js.isUndefined(disabled)) __obj.updateDynamic("disabled")(disabled)
    if (downArrowButtonStyles != null) __obj.updateDynamic("downArrowButtonStyles")(downArrowButtonStyles)
    if (getClassNames != null) __obj.updateDynamic("getClassNames")(js.Any.fromFunction6(getClassNames))
    if (iconButtonProps != null) __obj.updateDynamic("iconButtonProps")(iconButtonProps)
    if (iconProps != null) __obj.updateDynamic("iconProps")(iconProps)
    if (incrementButtonAriaLabel != null) __obj.updateDynamic("incrementButtonAriaLabel")(incrementButtonAriaLabel)
    if (incrementButtonIcon != null) __obj.updateDynamic("incrementButtonIcon")(incrementButtonIcon)
    if (inputProps != null) __obj.updateDynamic("inputProps")(inputProps)
    if (keytipProps != null) __obj.updateDynamic("keytipProps")(keytipProps)
    if (label != null) __obj.updateDynamic("label")(label)
    if (labelPosition != null) __obj.updateDynamic("labelPosition")(labelPosition)
    if (max != null) __obj.updateDynamic("max")(max.asInstanceOf[js.Any])
    if (min != null) __obj.updateDynamic("min")(min.asInstanceOf[js.Any])
    if (onBlur != null) __obj.updateDynamic("onBlur")(onBlur)
    if (onDecrement != null) __obj.updateDynamic("onDecrement")(js.Any.fromFunction1(onDecrement))
    if (onFocus != null) __obj.updateDynamic("onFocus")(onFocus)
    if (onIncrement != null) __obj.updateDynamic("onIncrement")(js.Any.fromFunction1(onIncrement))
    if (onValidate != null) __obj.updateDynamic("onValidate")(js.Any.fromFunction2(onValidate))
    if (precision != null) __obj.updateDynamic("precision")(precision.asInstanceOf[js.Any])
    if (step != null) __obj.updateDynamic("step")(step.asInstanceOf[js.Any])
    if (styles != null) __obj.updateDynamic("styles")(styles)
    if (theme != null) __obj.updateDynamic("theme")(theme)
    if (title != null) __obj.updateDynamic("title")(title)
    if (upArrowButtonStyles != null) __obj.updateDynamic("upArrowButtonStyles")(upArrowButtonStyles)
    if (value != null) __obj.updateDynamic("value")(value)
    __obj.asInstanceOf[ISpinButtonProps]
  }
}

