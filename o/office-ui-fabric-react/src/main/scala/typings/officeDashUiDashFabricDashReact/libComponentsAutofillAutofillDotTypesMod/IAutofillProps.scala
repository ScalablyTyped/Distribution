package typings.officeDashUiDashFabricDashReact.libComponentsAutofillAutofillDotTypesMod

import typings.atUifabricUtilities.libCreateRefMod.IRefObject
import typings.atUifabricUtilities.libKeyCodesMod.KeyCodes
import typings.officeDashUiDashFabricDashReact.libComponentsAutofillAutofillMod.Autofill
import typings.react.reactMod.InputHTMLAttributes
import typings.std.HTMLInputElement
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IAutofillProps extends InputHTMLAttributes[HTMLInputElement | Autofill] {
  /**
    * Gets the compoonent ref.
    */
  var componentRef: js.UndefOr[IRefObject[IAutofill]] = js.undefined
  /**
    * The default value to be visible. This is different from placeholder
    * because it actually sets the current value of the picker
    * Note: This will only be set upon component creation
    * and will not update with subsequent prop updates.
    */
  var defaultVisibleValue: js.UndefOr[String] = js.undefined
  /**
    * When the user uses left arrow, right arrow, clicks, or deletes text autofill is disabled
    * Since the user has taken control. It is automatically reenabled when the user enters text and the
    * cursor is at the end of the text in the input box. This specifies other key presses that will reenabled
    * autofill.
    * @defaultvalue [KeyCodes.down, KeyCodes.up]
    */
  var enableAutofillOnKeyPress: js.UndefOr[js.Array[KeyCodes]] = js.undefined
  /**
    * A callback used to modify the input string.
    */
  var onInputChange: js.UndefOr[js.Function1[/* value */ String, String]] = js.undefined
  /**
    * A callback for when the current input value changes.
    */
  var onInputValueChange: js.UndefOr[js.Function1[/* newValue */ js.UndefOr[String], Unit]] = js.undefined
  /**
    * Should the value of the input be selected? True if we're focused on our input, false otherwise.
    * We need to explicitly not select the text in the autofill if we are no longer focused.
    * In IE11, selecting a input will also focus the input, causing other element's focus to be stolen.
    */
  var preventValueSelection: js.UndefOr[Boolean] = js.undefined
  /**
    * Handler for checking if the full value of the input should
    * be seleced in componentDidUpdate
    *
    * @returns - should the full value of the input be selected?
    */
  var shouldSelectFullInputValueInComponentDidUpdate: js.UndefOr[js.Function0[Boolean]] = js.undefined
  /**
    * The suggested autofill value that will display.
    */
  var suggestedDisplayValue: js.UndefOr[String] = js.undefined
  /**
    * Handler for checking and updating the value if needed
    * in componentWillReceiveProps
    *
    * @param defaultVisibleValue - The defaultVisibleValue that got passed
    *  in to the auto fill's componentWillReceiveProps
    * @returns - the updated value to set, if needed
    */
  var updateValueInWillReceiveProps: js.UndefOr[js.Function0[String | Null]] = js.undefined
}

object IAutofillProps {
  @scala.inline
  def apply(
    InputHTMLAttributes: InputHTMLAttributes[HTMLInputElement | Autofill] = null,
    componentRef: IRefObject[IAutofill] = null,
    defaultVisibleValue: String = null,
    enableAutofillOnKeyPress: js.Array[KeyCodes] = null,
    onInputChange: /* value */ String => String = null,
    onInputValueChange: /* newValue */ js.UndefOr[String] => Unit = null,
    preventValueSelection: js.UndefOr[Boolean] = js.undefined,
    shouldSelectFullInputValueInComponentDidUpdate: () => Boolean = null,
    suggestedDisplayValue: String = null,
    updateValueInWillReceiveProps: () => String | Null = null
  ): IAutofillProps = {
    val __obj = js.Dynamic.literal()
    js.Dynamic.global.Object.assign(__obj, InputHTMLAttributes)
    if (componentRef != null) __obj.updateDynamic("componentRef")(componentRef.asInstanceOf[js.Any])
    if (defaultVisibleValue != null) __obj.updateDynamic("defaultVisibleValue")(defaultVisibleValue)
    if (enableAutofillOnKeyPress != null) __obj.updateDynamic("enableAutofillOnKeyPress")(enableAutofillOnKeyPress)
    if (onInputChange != null) __obj.updateDynamic("onInputChange")(js.Any.fromFunction1(onInputChange))
    if (onInputValueChange != null) __obj.updateDynamic("onInputValueChange")(js.Any.fromFunction1(onInputValueChange))
    if (!js.isUndefined(preventValueSelection)) __obj.updateDynamic("preventValueSelection")(preventValueSelection)
    if (shouldSelectFullInputValueInComponentDidUpdate != null) __obj.updateDynamic("shouldSelectFullInputValueInComponentDidUpdate")(js.Any.fromFunction0(shouldSelectFullInputValueInComponentDidUpdate))
    if (suggestedDisplayValue != null) __obj.updateDynamic("suggestedDisplayValue")(suggestedDisplayValue)
    if (updateValueInWillReceiveProps != null) __obj.updateDynamic("updateValueInWillReceiveProps")(js.Any.fromFunction0(updateValueInWillReceiveProps))
    __obj.asInstanceOf[IAutofillProps]
  }
}

