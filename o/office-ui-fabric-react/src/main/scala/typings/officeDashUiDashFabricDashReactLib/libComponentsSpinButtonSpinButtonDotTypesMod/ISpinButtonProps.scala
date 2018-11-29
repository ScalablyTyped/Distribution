package typings
package officeDashUiDashFabricDashReactLib.libComponentsSpinButtonSpinButtonDotTypesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._


trait ISpinButtonProps extends js.Object {
  /**
       * A description of the SpinButton for the benefit of screen readers.
       */
  var ariaLabel: js.UndefOr[java.lang.String] = js.undefined
  /**
       * The position in the parent set (if in a set) for aria-posinset.
       */
  var ariaPositionInSet: js.UndefOr[scala.Double] = js.undefined
  /**
       * The total size of the parent set (if in a set) for aria-setsize.
       */
  var ariaSetSize: js.UndefOr[scala.Double] = js.undefined
  /**
       * Sets the aria-valuenow of the spin button. The component must be
       * controlled by the creator who controls the value externally.
       * ariaValueNow would be the numeric form of value.
       */
  var ariaValueNow: js.UndefOr[scala.Double] = js.undefined
  var ariaValueText: js.UndefOr[java.lang.String] = js.undefined
  /**
       * Optional className for SpinButton.
       */
  var className: js.UndefOr[java.lang.String] = js.undefined
  /**
       * Gets the component ref.
       */
  var componentRef: js.UndefOr[js.Function1[/* component */ js.UndefOr[ISpinButton | scala.Null], scala.Unit]] = js.undefined
  /**
       * Accessibile label text for the decrement button for the benefit of the screen reader.
       */
  var decrementButtonAriaLabel: js.UndefOr[java.lang.String] = js.undefined
  /**
       * Icon for the decrement button of the spinButton
       */
  var decrementButtonIcon: js.UndefOr[officeDashUiDashFabricDashReactLib.libComponentsIconIconDotTypesMod.IIconProps] = js.undefined
  /**
       * The initial value of the SpinButton. Use this if you intend for the SpinButton to be an uncontrolled component.
       * This value is mutually exclusive to value. Use one or the other.
       * @defaultvalue 0
       */
  var defaultValue: js.UndefOr[java.lang.String] = js.undefined
  /**
       * Whether or not the SpinButton is disabled.
       */
  var disabled: js.UndefOr[scala.Boolean] = js.undefined
  /**
       * Custom styles for the downArrow button.
       *
       * Note: The buttons are in a checked state when arrow keys are used to
       * incremenent/decrement the spinButton. Use rootChecked instead of rootPressed
       * for styling when that is the case.
       */
  var downArrowButtonStyles: js.UndefOr[
    stdLib.Partial[
      officeDashUiDashFabricDashReactLib.libComponentsButtonButtonDotTypesMod.IButtonStyles
    ]
  ] = js.undefined
  /**
       * Custom function for providing the classNames for the spinbutton. Can be used to provide
       * all styles for the component instead of applying them on top of the default styles.
       */
  var getClassNames: js.UndefOr[
    js.Function6[
      /* theme */ atUifabricStylingLib.libInterfacesIThemeMod.ITheme, 
      /* disabled */ scala.Boolean, 
      /* isFocused */ scala.Boolean, 
      /* keyboardSpinDirection */ officeDashUiDashFabricDashReactLib.libComponentsSpinButtonSpinButtonMod.KeyboardSpinDirection, 
      /* labelPosition */ js.UndefOr[
        officeDashUiDashFabricDashReactLib.libUtilitiesPositioningPositioningDotTypesMod.Position
      ], 
      /* className */ js.UndefOr[java.lang.String], 
      officeDashUiDashFabricDashReactLib.libComponentsSpinButtonSpinButtonDotClassNamesMod.ISpinButtonClassNames
    ]
  ] = js.undefined
  /**
       * Icon that goes along with the label for the whole SpinButton
       */
  var iconProps: js.UndefOr[officeDashUiDashFabricDashReactLib.libComponentsIconIconDotTypesMod.IIconProps] = js.undefined
  /**
       * Accessibile label text for the increment button for the benefit of the screen reader.
       */
  var incrementButtonAriaLabel: js.UndefOr[java.lang.String] = js.undefined
  /**
       * Icon for the increment button of the spinButton
       */
  var incrementButtonIcon: js.UndefOr[officeDashUiDashFabricDashReactLib.libComponentsIconIconDotTypesMod.IIconProps] = js.undefined
  /**
       * Optional keytip for this spin button
       */
  var keytipProps: js.UndefOr[
    officeDashUiDashFabricDashReactLib.libComponentsKeytipKeytipDotTypesMod.IKeytipProps
  ] = js.undefined
  /**
       * Descriptive label for the SpinButton.
       */
  var label: java.lang.String
  /**
       * @defaultvalue Left
       */
  var labelPosition: js.UndefOr[
    officeDashUiDashFabricDashReactLib.libUtilitiesPositioningPositioningDotTypesMod.Position
  ] = js.undefined
  /**
       * The max value of the SpinButton.
       * @defaultvalue 10
       */
  var max: js.UndefOr[scala.Double] = js.undefined
  /**
       * The min value of the SpinButton.
       * @defaultvalue 0
       */
  var min: js.UndefOr[scala.Double] = js.undefined
  /**
       * A callback for when the user moves the focus away from the picker
       */
  var onBlur: js.UndefOr[reactLib.reactMod.ReactNs.FocusEventHandler[reactLib.HTMLInputElement]] = js.undefined
  /**
       * This callback is triggered when the decrement button is pressed or if the user presses down arrow
       * with focus on the input of the spinButton
       * @returns If a string is returned, it will be used as the value of the SpinButton.
       */
  var onDecrement: js.UndefOr[js.Function1[/* value */ java.lang.String, java.lang.String | scala.Unit]] = js.undefined
  /**
       * A callback for when the user put focus on the picker
       */
  var onFocus: js.UndefOr[reactLib.reactMod.ReactNs.FocusEventHandler[reactLib.HTMLInputElement]] = js.undefined
  /**
       * This callback is triggered when the increment button is pressed or if the user presses up arrow
       * with focus on the input of the spinButton
       * @returns If a string is returned, it will be used as the value of the SpinButton.
       */
  var onIncrement: js.UndefOr[js.Function1[/* value */ java.lang.String, java.lang.String | scala.Unit]] = js.undefined
  /**
       * This callback is triggered when the value inside the SpinButton should be validated.
       * @param value - The value entered in the SpinButton to validate
       * @param event - The event that triggered this validate, if any. (For accessibility)
       * @returns If a string is returned, it will be used as the value of the SpinButton.
       */
  var onValidate: js.UndefOr[
    js.Function2[
      /* value */ java.lang.String, 
      /* event */ js.UndefOr[reactLib.reactMod.ReactNs.SyntheticEvent[reactLib.HTMLElement]], 
      java.lang.String | scala.Unit
    ]
  ] = js.undefined
  /**
       * To how many decimal places the value should be rounded to.
       * The default value is calculated based on the precision of step.
       * IE: if step = 1, precision = 0. step = 0.0089, precision = 4. step = 300, precision = 2. step = 23.00, precision = 2.
       */
  var precision: js.UndefOr[scala.Double] = js.undefined
  /**
       * The difference between the two adjacent values of the SpinButton.
       * This value is sued to calculate the precision of the input if no
       * precision is given. The precision calculated this way will always
       * be \>= 0.
       * @defaultvalue 1
       */
  var step: js.UndefOr[scala.Double] = js.undefined
  /**
       * Custom styling for individual elements within the button DOM.
       */
  var styles: js.UndefOr[stdLib.Partial[ISpinButtonStyles]] = js.undefined
  /**
       * Theme provided by HOC.
       */
  var theme: js.UndefOr[atUifabricStylingLib.libInterfacesIThemeMod.ITheme] = js.undefined
  /**
       * A title for the SpinButton used for a more descriptive name that's also visible on its tooltip.
       */
  var title: js.UndefOr[java.lang.String] = js.undefined
  /**
       * Custom styles for the upArrow button.
       *
       * Note: The buttons are in a checked state when arrow keys are used to
       * incremenent/decrement the spinButton. Use rootChecked instead of rootPressed
       * for styling when that is the case.
       */
  var upArrowButtonStyles: js.UndefOr[
    stdLib.Partial[
      officeDashUiDashFabricDashReactLib.libComponentsButtonButtonDotTypesMod.IButtonStyles
    ]
  ] = js.undefined
  /**
       * The value of the SpinButton. Use this if you intend to pass in a new value as a result of onChange events.
       * This value is mutually exclusive to defaultValue. Use one or the other.
       */
  var value: js.UndefOr[java.lang.String] = js.undefined
}

