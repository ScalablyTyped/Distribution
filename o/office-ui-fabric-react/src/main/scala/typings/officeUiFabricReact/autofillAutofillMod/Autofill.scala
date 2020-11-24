package typings.officeUiFabricReact.autofillAutofillMod

import typings.officeUiFabricReact.anon.EnableAutofillOnKeyPress
import typings.officeUiFabricReact.autofillTypesMod.IAutofill
import typings.officeUiFabricReact.autofillTypesMod.IAutofillProps
import typings.react.mod.Component
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("office-ui-fabric-react/lib/components/Autofill/Autofill", "Autofill")
@js.native
class Autofill protected ()
  extends Component[IAutofillProps, IAutofillState, js.Any]
     with IAutofill {
  def this(props: IAutofillProps) = this()
  
  @JSName("UNSAFE_componentWillReceiveProps")
  def UNSAFE_componentWillReceiveProps_MAutofill(nextProps: IAutofillProps): Unit = js.native
  
  var _async: js.Any = js.native
  
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
  
  var _isComposing: js.Any = js.native
  
  var _notifyInputChange: js.Any = js.native
  
  var _onChanged: js.Any = js.native
  
  var _onClick: js.Any = js.native
  
  var _onCompositionEnd: js.Any = js.native
  
  var _onCompositionStart: js.Any = js.native
  
  var _onCompositionUpdate: js.Any = js.native
  
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
  
  @JSName("componentDidUpdate")
  def componentDidUpdate_MAutofill(): Unit = js.native
  
  @JSName("componentWillUnmount")
  def componentWillUnmount_MAutofill(): Unit = js.native
}
/* static members */
@JSImport("office-ui-fabric-react/lib/components/Autofill/Autofill", "Autofill")
@js.native
object Autofill extends js.Object {
  
  var defaultProps: EnableAutofillOnKeyPress = js.native
}
