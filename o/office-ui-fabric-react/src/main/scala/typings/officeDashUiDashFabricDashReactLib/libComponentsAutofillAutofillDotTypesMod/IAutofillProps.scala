package typings
package officeDashUiDashFabricDashReactLib.libComponentsAutofillAutofillDotTypesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._


trait IAutofillProps
  extends reactLib.reactMod.ReactNs.InputHTMLAttributes[
      reactLib.HTMLInputElement | officeDashUiDashFabricDashReactLib.libComponentsAutofillAutofillMod.Autofill
    ] {
  /**
       * Gets the compoonent ref.
       */
  var componentRef: js.UndefOr[atUifabricUtilitiesLib.libCreateRefMod.IRefObject[IAutofill]] = js.undefined
  /**
       * The default value to be visible. This is different from placeholder
       * because it actually sets the current value of the picker
       * Note: This will only be set upon component creation
       * and will not update with subsequent prop updates.
       */
  var defaultVisibleValue: js.UndefOr[java.lang.String] = js.undefined
  /**
       * When the user uses left arrow, right arrow, clicks, or deletes text autofill is disabled
       * Since the user has taken control. It is automatically reenabled when the user enters text and the
       * cursor is at the end of the text in the input box. This specifies other key presses that will reenabled
       * autofill.
       * @defaultvalue [KeyCodes.down, KeyCodes.up]
       */
  var enableAutofillOnKeyPress: js.UndefOr[js.Array[atUifabricUtilitiesLib.libKeyCodesMod.KeyCodes]] = js.undefined
  /**
       * A callback used to modify the input string.
       */
  var onInputChange: js.UndefOr[js.Function1[/* value */ java.lang.String, java.lang.String]] = js.undefined
  /**
       * A callback for when the current input value changes.
       */
  var onInputValueChange: js.UndefOr[js.Function1[/* newValue */ js.UndefOr[java.lang.String], scala.Unit]] = js.undefined
  /**
       * Should the value of the input be selected? True if we're focused on our input, false otherwise.
       * We need to explicitly not select the text in the autofill if we are no longer focused.
       * In IE11, selecting a input will also focus the input, causing other element's focus to be stolen.
       */
  var preventValueSelection: js.UndefOr[scala.Boolean] = js.undefined
  /**
       * Handler for checking if the full value of the input should
       * be seleced in componentDidUpdate
       *
       * @returns - should the full value of the input be selected?
       */
  var shouldSelectFullInputValueInComponentDidUpdate: js.UndefOr[js.Function0[scala.Boolean]] = js.undefined
  /**
       * The suggested autofill value that will display.
       */
  var suggestedDisplayValue: js.UndefOr[java.lang.String] = js.undefined
  /**
       * Handler for checking and updating the value if needed
       * in componentWillReceiveProps
       *
       * @param defaultVisibleValue - The defaultVisibleValue that got passed
       *  in to the auto fill's componentWillReceiveProps
       * @returns - the updated value to set, if needed
       */
  var updateValueInWillReceiveProps: js.UndefOr[js.Function0[java.lang.String | scala.Null]] = js.undefined
}

