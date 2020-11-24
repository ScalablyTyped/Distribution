package typings.officeUiFabricReact.spinButtonSpinButtonMod

import typings.officeUiFabricReact.spinButtonTypesMod.ISpinButton
import typings.officeUiFabricReact.spinButtonTypesMod.ISpinButtonProps
import typings.react.mod.Component
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("office-ui-fabric-react/lib/components/SpinButton/SpinButton", "SpinButton")
@js.native
class SpinButton protected ()
  extends Component[ISpinButtonProps, ISpinButtonState, js.Any]
     with ISpinButton {
  def this(props: ISpinButtonProps) = this()
  
  /**
    * Invoked when a component is receiving new props. This method is not called for the initial render.
    */
  @JSName("UNSAFE_componentWillReceiveProps")
  def UNSAFE_componentWillReceiveProps_MSpinButton(newProps: ISpinButtonProps): Unit = js.native
  
  var _async: js.Any = js.native
  
  var _calculatePrecision: js.Any = js.native
  
  var _currentStepFunctionHandle: js.Any = js.native
  
  /**
    * Increment function to use if one is not passed in
    */
  var _defaultOnDecrement: js.Any = js.native
  
  /**
    * Increment function to use if one is not passed in
    */
  var _defaultOnIncrement: js.Any = js.native
  
  /**
    * Validate function to use if one is not passed in
    */
  var _defaultOnValidate: js.Any = js.native
  
  /**
    * Handle keydown on the text field. We need to update
    * the value when up or down arrow are depressed
    * @param event - the keyboardEvent that was fired
    */
  var _handleKeyDown: js.Any = js.native
  
  /**
    * Make sure that we have stopped spinning on keyUp
    * if the up or down arrow fired this event
    * @param event - keyboard event
    */
  var _handleKeyUp: js.Any = js.native
  
  var _initialStepDelay: js.Any = js.native
  
  var _input: js.Any = js.native
  
  var _inputId: js.Any = js.native
  
  var _labelId: js.Any = js.native
  
  var _lastValidValue: js.Any = js.native
  
  var _onBlur: js.Any = js.native
  
  var _onChange: js.Any = js.native
  
  var _onDecrement: js.Any = js.native
  
  var _onDecrementMouseDown: js.Any = js.native
  
  var _onFocus: js.Any = js.native
  
  var _onIncrement: js.Any = js.native
  
  var _onIncrementMouseDown: js.Any = js.native
  
  /**
    * The method is needed to ensure we are updating the actual input value.
    * without this our value will never change (and validation will not have the correct number)
    * @param event - the event that was fired
    */
  var _onInputChange: js.Any = js.native
  
  var _onValidate: js.Any = js.native
  
  var _precision: js.Any = js.native
  
  var _spinningByMouse: js.Any = js.native
  
  var _stepDelay: js.Any = js.native
  
  /**
    * Stop spinning (clear any currently pending update and set spinning to false)
    */
  var _stop: js.Any = js.native
  
  /**
    * Update the value with the given stepFunction
    * @param shouldSpin - should we fire off another updateValue when we are done here? This should be true
    * when spinning in response to a mouseDown
    * @param stepFunction - function to use to step by
    * @param event - The event that triggered the updateValue
    */
  var _updateValue: js.Any = js.native
  
  /**
    * This is used when validating text entry in the input on blur or when enter key is pressed
    * (not when changed via the buttons).
    * @param event - the event that fired
    */
  var _validate: js.Any = js.native
  
  var _valueToValidate: js.Any = js.native
  
  @JSName("componentWillUnmount")
  def componentWillUnmount_MSpinButton(): Unit = js.native
}
/* static members */
@JSImport("office-ui-fabric-react/lib/components/SpinButton/SpinButton", "SpinButton")
@js.native
object SpinButton extends js.Object {
  
  var defaultProps: DefaultProps = js.native
}
