package typings.officeDashUiDashFabricDashReact.libComponentsAutofillAutofillMod

import typings.officeDashUiDashFabricDashReact.Anon_EnableAutofillOnKeyPress
import typings.officeDashUiDashFabricDashReact.libComponentsAutofillAutofillDotTypesMod.IAutofill
import typings.officeDashUiDashFabricDashReact.libComponentsAutofillAutofillDotTypesMod.IAutofillProps
import typings.officeDashUiDashFabricDashReact.libUtilitiesMod.BaseComponent
import typings.std.HTMLInputElement
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("office-ui-fabric-react/lib/components/Autofill/Autofill", "Autofill")
@js.native
class Autofill protected ()
  extends BaseComponent[IAutofillProps, IAutofillState]
     with IAutofill {
  def this(props: IAutofillProps) = this()
  var _autoFillEnabled: js.Any = js.native
  var _doesTextStartWith: js.Any = js.native
  var _getCurrentInputValue: js.Any = js.native
  /**
    * Returns a string that should be used as the display value.
    * It evaluates this based on whether or not the suggested value starts with the input value
    * and whether or not autofill is enabled.
    * @param inputValue - the value that the input currently has.
    * @param suggestedDisplayValue - the possible full value
    */
  var _getDisplayValue: js.Any = js.native
  var _inputElement: js.Any = js.native
  var _notifyInputChange: js.Any = js.native
  var _onChanged: js.Any = js.native
  var _onClick: js.Any = js.native
  var _onCompositionEnd: js.Any = js.native
  var _onCompositionStart: js.Any = js.native
  var _onInputChanged: js.Any = js.native
  var _onKeyDown: js.Any = js.native
  /**
    * Attempts to enable autofill. Whether or not autofill is enabled depends on the input value,
    * whether or not any text is selected, and only if the new input value is longer than the old input value.
    * Autofill should never be set to true if the value is composing. Once compositionEnd is called, then
    * it should be completed.
    * See https://developer.mozilla.org/en-US/docs/Web/API/CompositionEvent for more information on composition.
    * @param newValue - new input value
    * @param oldValue - old input value
    * @param isComposing - if true then the text is actively being composed and it has not completed.
    * @param isComposed - if the text is a composed text value.
    */
  var _tryEnableAutofill: js.Any = js.native
  /**
    * Updates the current input value as well as getting a new display value.
    * @param newValue - The new value from the input
    */
  var _updateValue: js.Any = js.native
  var _value: js.Any = js.native
  /**
    * The current index of the cursor in the input area. Returns -1 if the input element
    * is not ready.
    */
  /* CompleteClass */
  override var cursorLocation: Double | Null = js.native
  /**
    * The current input element.
    */
  /* CompleteClass */
  override var inputElement: HTMLInputElement | Null = js.native
  /**
    * A boolean for whether or not there is a value selected in the input area.
    */
  /* CompleteClass */
  override var isValueSelected: Boolean = js.native
  /**
    * the current index of where the selection ends. Returns -1 if the input element
    * is not ready.
    */
  /* CompleteClass */
  override var selectionEnd: Double | Null = js.native
  /**
    * The current index of where the selection starts. Returns -1 if the input element
    * is not ready.
    */
  /* CompleteClass */
  override var selectionStart: Double | Null = js.native
  /**
    * The current text value that the user has entered.
    */
  /* CompleteClass */
  override var value: String = js.native
  @JSName("UNSAFE_componentWillReceiveProps")
  def UNSAFE_componentWillReceiveProps_MAutofill(nextProps: IAutofillProps): Unit = js.native
  /**
    * Clear all text in the input. Sets value to '';
    */
  /* CompleteClass */
  override def clear(): Unit = js.native
  @JSName("componentDidUpdate")
  def componentDidUpdate_MAutofill(): Unit = js.native
  /**
    * Focus the input element.
    */
  /* CompleteClass */
  override def focus(): Unit = js.native
}

/* static members */
@JSImport("office-ui-fabric-react/lib/components/Autofill/Autofill", "Autofill")
@js.native
object Autofill extends js.Object {
  var defaultProps: Anon_EnableAutofillOnKeyPress = js.native
}

