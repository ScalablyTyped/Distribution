package typings
package officeDashUiDashFabricDashReactLib.libComponentsTextFieldTextFieldDotTypesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ITextFieldProps
  extends reactLib.reactMod.ReactNs.AllHTMLAttributes[reactLib.HTMLInputElement | reactLib.HTMLTextAreaElement] {
  /**
    * @deprecated Use `prefix` instead.
    */
  var addonString: js.UndefOr[java.lang.String] = js.undefined
  /**
    * Aria label for the text field.
    */
  var ariaLabel: js.UndefOr[java.lang.String] = js.undefined
  /**
    * Whether or not to auto adjust text field height. Applies only to multiline text field.
    * @defaultvalue false
    */
  var autoAdjustHeight: js.UndefOr[scala.Boolean] = js.undefined
  /**
    * Whether or not the text field is borderless.
    * @defaultvalue false
    */
  var borderless: js.UndefOr[scala.Boolean] = js.undefined
  /**
    * @deprecated Serves no function.
    */
  var componentId: js.UndefOr[java.lang.String] = js.undefined
  /**
    * Optional callback to access the ITextField component. Use this instead of ref for accessing
    * the public methods and properties of the component.
    */
  var componentRef: js.UndefOr[atUifabricUtilitiesLib.libCreateRefMod.IRefObject[ITextField]] = js.undefined
  /**
    * Default value of the text field. Only provide this if the text field is an uncontrolled component;
    * otherwise, use the `value` property.
    */
  @JSName("defaultValue")
  var defaultValue_ITextFieldProps: js.UndefOr[java.lang.String] = js.undefined
  /**
    * Text field will start to validate after users stop typing for `deferredValidationTime` milliseconds.
    * @defaultvalue 200
    */
  var deferredValidationTime: js.UndefOr[scala.Double] = js.undefined
  /**
    * Description displayed below the text field to provide additional details about what text to enter.
    */
  var description: js.UndefOr[java.lang.String] = js.undefined
  /**
    * Static error message displayed below the text field. Use `onGetErrorMessage` to dynamically
    * change the error message displayed (if any) based on the current value.
    */
  var errorMessage: js.UndefOr[java.lang.String] = js.undefined
  /**
    * @deprecated Use `iconProps` instead.
    */
  var iconClass: js.UndefOr[java.lang.String] = js.undefined
  /**
    * Props for an optional icon, displayed in the far right end of the text field.
    */
  var iconProps: js.UndefOr[officeDashUiDashFabricDashReactLib.libComponentsIconIconDotTypesMod.IIconProps] = js.undefined
  /**
    * Optional class name that is added specifically to the input/textarea element.
    */
  var inputClassName: js.UndefOr[java.lang.String] = js.undefined
  /**
    * The masking string that defines the mask's behavior.
    * A backslash will escape any character.
    * Special format characters are:
    * '9': [0-9]
    * 'a': [a-zA-Z]
    * '*': [a-zA-Z0-9]
    *
    * @example `Phone Number: (999) 999-9999`
    */
  var mask: js.UndefOr[java.lang.String] = js.undefined
  /**
    * The character to show in place of unfilled characters of the mask.
    * @defaultvalue '_'
    */
  var maskChar: js.UndefOr[java.lang.String] = js.undefined
  /**
    * An object defining the format characters and corresponding regexp values.
    * Default format characters: \{
    *  '9': /[0-9]/,
    *  'a': /[a-zA-Z]/,
    *  '*': /[a-zA-Z0-9]/
    * \}
    */
  var maskFormat: js.UndefOr[org.scalablytyped.runtime.StringDictionary[stdLib.RegExp]] = js.undefined
  /**
    * Whether or not the text field is a multiline text field.
    * @defaultvalue false
    */
  var multiline: js.UndefOr[scala.Boolean] = js.undefined
  /**
    * Called after the input's value updates but before re-rendering.
    * @param newValue - The new value. Type should be string.
    */
  var onBeforeChange: js.UndefOr[js.Function1[/* newValue */ js.Any, scala.Unit]] = js.undefined
  /**
    * Callback for when the input value changes.
    */
  @JSName("onChange")
  var onChange_ITextFieldProps: js.UndefOr[
    js.Function2[
      /* event */ reactLib.reactMod.ReactNs.FormEvent[reactLib.HTMLInputElement | reactLib.HTMLTextAreaElement], 
      /* newValue */ js.UndefOr[java.lang.String], 
      scala.Unit
    ]
  ] = js.undefined
  /**
    * @deprecated Use `onChange` instead.
    */
  var onChanged: js.UndefOr[js.Function1[/* newValue */ js.Any, scala.Unit]] = js.undefined
  /**
    * Function used to determine whether the input value is valid and get an error message if not.
    *
    *   When it returns string:
    *   - If valid, it returns empty string.
    *   - If invalid, it returns the error message string and the text field will
    *     show a red border and show an error message below the text field.
    *
    *   When it returns Promise<string>:
    *   - The resolved value is display as error message.
    *   - The rejected, the value is thrown away.
    *
    */
  var onGetErrorMessage: js.UndefOr[
    js.Function1[
      /* value */ java.lang.String, 
      js.UndefOr[java.lang.String | js.Thenable[java.lang.String]]
    ]
  ] = js.undefined
  /**
    * Function called after validation completes.
    */
  var onNotifyValidationResult: js.UndefOr[
    js.Function2[
      /* errorMessage */ java.lang.String, 
      /* value */ js.UndefOr[java.lang.String], 
      scala.Unit
    ]
  ] = js.undefined
  /**
    * @deprecated Use `onRenderPrefix` instead.
    */
  var onRenderAddon: js.UndefOr[atUifabricUtilitiesLib.libIRenderFunctionMod.IRenderFunction[ITextFieldProps]] = js.undefined
  /**
    * Custom renderer for the description.
    */
  var onRenderDescription: js.UndefOr[atUifabricUtilitiesLib.libIRenderFunctionMod.IRenderFunction[ITextFieldProps]] = js.undefined
  /**
    * Custom renderer for the label.
    */
  var onRenderLabel: js.UndefOr[atUifabricUtilitiesLib.libIRenderFunctionMod.IRenderFunction[ITextFieldProps]] = js.undefined
  /**
    * Custom render function for prefix.
    */
  var onRenderPrefix: js.UndefOr[atUifabricUtilitiesLib.libIRenderFunctionMod.IRenderFunction[ITextFieldProps]] = js.undefined
  /**
    * Custom render function for suffix.
    */
  var onRenderSuffix: js.UndefOr[atUifabricUtilitiesLib.libIRenderFunctionMod.IRenderFunction[ITextFieldProps]] = js.undefined
  /**
    * Whether or not the multiline text field is resizable.
    * @defaultvalue true
    */
  var resizable: js.UndefOr[scala.Boolean] = js.undefined
  /**
    * Call to provide customized styling that will layer on top of the variant rules.
    */
  var styles: js.UndefOr[
    atUifabricMergeDashStylesLib.libIStyleFunctionMod.IStyleFunctionOrObject[ITextFieldStyleProps, ITextFieldStyles]
  ] = js.undefined
  /**
    * Suffix displayed after the text field contents. This is not included in the value.
    */
  var suffix: js.UndefOr[java.lang.String] = js.undefined
  /**
    * Theme (provided through customization).
    */
  var theme: js.UndefOr[atUifabricStylingLib.libInterfacesIThemeMod.ITheme] = js.undefined
  /**
    * Whether or not the text field is underlined.
    * @defaultvalue false
    */
  var underlined: js.UndefOr[scala.Boolean] = js.undefined
  /**
    * Run validation only on input focus.
    * @defaultvalue false
    */
  var validateOnFocusIn: js.UndefOr[scala.Boolean] = js.undefined
  /**
    * Run validation only on input focus out.
    * @defaultvalue false
    */
  var validateOnFocusOut: js.UndefOr[scala.Boolean] = js.undefined
  /**
    * Disable on-load validation.
    * @defaultvalue true
    */
  var validateOnLoad: js.UndefOr[scala.Boolean] = js.undefined
  /**
    * Current value of the text field. Only provide this if the text field is a controlled component where you
    * are maintaining its current state; otherwise, use the `defaultValue` property.
    */
  @JSName("value")
  var value_ITextFieldProps: js.UndefOr[java.lang.String] = js.undefined
}

