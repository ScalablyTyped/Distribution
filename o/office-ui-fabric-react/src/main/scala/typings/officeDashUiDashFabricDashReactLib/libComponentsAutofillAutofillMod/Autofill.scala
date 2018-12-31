package typings
package officeDashUiDashFabricDashReactLib.libComponentsAutofillAutofillMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("office-ui-fabric-react/lib/components/Autofill/Autofill", "Autofill")
@js.native
class Autofill protected ()
  extends officeDashUiDashFabricDashReactLib.libUtilitiesMod.BaseComponent[
      officeDashUiDashFabricDashReactLib.libComponentsAutofillAutofillDotTypesMod.IAutofillProps, 
      IAutofillState
    ]
     with officeDashUiDashFabricDashReactLib.libComponentsAutofillAutofillDotTypesMod.IAutofill {
  def this(props: officeDashUiDashFabricDashReactLib.libComponentsAutofillAutofillDotTypesMod.IAutofillProps) = this()
  var _autoFillEnabled: js.Any = js.native
  var _inputElement: js.Any = js.native
  var _onChanged: js.Any = js.native
  var _onClick: js.Any = js.native
  var _onCompositionEnd: js.Any = js.native
  var _onCompositionStart: js.Any = js.native
  var _onInputChanged: js.Any = js.native
  var _onKeyDown: js.Any = js.native
  /**
    * Updates the current input value as well as getting a new display value.
    * @param newValue The new value from the input
    */
  var _updateValue: js.Any = js.native
  var _value: js.Any = js.native
  /**
    * The current index of the cursor in the input area. Returns -1 if the input element
    * is not ready.
    */
  /* CompleteClass */
  override var cursorLocation: scala.Double | scala.Null = js.native
  /**
    * The current input element.
    */
  /* CompleteClass */
  override var inputElement: reactLib.HTMLInputElement | scala.Null = js.native
  /**
    * A boolean for whether or not there is a value selected in the input area.
    */
  /* CompleteClass */
  override var isValueSelected: scala.Boolean = js.native
  /**
    * the current index of where the selection ends. Returns -1 if the input element
    * is not ready.
    */
  /* CompleteClass */
  override var selectionEnd: scala.Double | scala.Null = js.native
  /**
    * The current index of where the selection starts. Returns -1 if the input element
    * is not ready.
    */
  /* CompleteClass */
  override var selectionStart: scala.Double | scala.Null = js.native
  /**
    * The current text value that the user has entered.
    */
  /* CompleteClass */
  override var value: java.lang.String = js.native
  /* private */ def _doesTextStartWith(text: js.Any, startWith: js.Any): js.Any = js.native
  /* private */ def _getCurrentInputValue(): js.Any = js.native
  /* private */ def _getCurrentInputValue(ev: js.Any): js.Any = js.native
  /**
    * Returns a string that should be used as the display value.
    * It evaluates this based on whether or not the suggested value starts with the input value
    * and whether or not autofill is enabled.
    * @param inputValue the value that the input currently has.
    * @param suggestedDisplayValue the possible full value
    */
  /* private */ def _getDisplayValue(inputValue: js.Any): js.Any = js.native
  /* private */ def _getDisplayValue(inputValue: js.Any, suggestedDisplayValue: js.Any): js.Any = js.native
  /* private */ def _notifyInputChange(newValue: js.Any): js.Any = js.native
  /**
    * Attempts to enable autofill. Whether or not autofill is enabled depends on the input value,
    * whether or not any text is selected, and only if the new input value is longer than the old input value.
    * Autofill should never be set to true if the value is composing. Once compositionEnd is called, then
    * it should be completed.
    * See https://developer.mozilla.org/en-US/docs/Web/API/CompositionEvent for more information on composition.
    * @param newValue
    * @param oldValue
    * @param isComposing if true then the text is actively being composed and it has not completed.
    * @param isComposed if the text is a composed text value.
    */
  /* private */ def _tryEnableAutofill(newValue: js.Any, oldValue: js.Any): js.Any = js.native
  /* private */ def _tryEnableAutofill(newValue: js.Any, oldValue: js.Any, isComposing: js.Any): js.Any = js.native
  /* private */ def _tryEnableAutofill(newValue: js.Any, oldValue: js.Any, isComposing: js.Any, isComposed: js.Any): js.Any = js.native
  /**
    * Clear all text in the input. Sets value to '';
    */
  /* CompleteClass */
  override def clear(): scala.Unit = js.native
  @JSName("componentDidUpdate")
  def componentDidUpdate_MAutofill(): scala.Unit = js.native
  @JSName("componentWillReceiveProps")
  def componentWillReceiveProps_MAutofill(
    nextProps: officeDashUiDashFabricDashReactLib.libComponentsAutofillAutofillDotTypesMod.IAutofillProps
  ): scala.Unit = js.native
  /**
    * Focus the input element.
    */
  /* CompleteClass */
  override def focus(): scala.Unit = js.native
}

@JSImport("office-ui-fabric-react/lib/components/Autofill/Autofill", "Autofill")
@js.native
object Autofill extends js.Object {
  var defaultProps: officeDashUiDashFabricDashReactLib.Anon_EnableAutofillOnKeyPress = js.native
}

