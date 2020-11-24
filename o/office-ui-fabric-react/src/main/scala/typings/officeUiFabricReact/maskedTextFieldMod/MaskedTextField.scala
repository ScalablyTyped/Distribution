package typings.officeUiFabricReact.maskedTextFieldMod

import typings.officeUiFabricReact.textFieldTypesMod.IMaskedTextFieldProps
import typings.officeUiFabricReact.textFieldTypesMod.ITextField
import typings.react.mod.Component
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("office-ui-fabric-react/lib/components/TextField/MaskedTextField/MaskedTextField", "MaskedTextField")
@js.native
class MaskedTextField protected ()
  extends Component[IMaskedTextFieldProps, IMaskedTextFieldState, js.Any]
     with ITextField {
  def this(props: IMaskedTextFieldProps) = this()
  
  @JSName("UNSAFE_componentWillReceiveProps")
  def UNSAFE_componentWillReceiveProps_MMaskedTextField(newProps: IMaskedTextFieldProps): Unit = js.native
  
  /** The stored selection data prior to input change events. */
  var _changeSelectionData: js.Any = js.native
  
  /** True if the TextField is focused */
  var _isFocused: js.Any = js.native
  
  /**
    *  An array of data containing information regarding the format characters,
    *  their indices inside the display text, and their corresponding values.
    * @example
    * ```
    *  [
    *    { value: '1', displayIndex: 16, format: /[0-9]/ },
    *    { value: '2', displayIndex: 17, format: /[0-9]/ },
    *    { displayIndex: 18, format: /[0-9]/ },
    *    { value: '4', displayIndex: 22, format: /[0-9]/ },
    *    ...
    *  ]
    * ```
    */
  var _maskCharData: js.Any = js.native
  
  /** True if the TextField was not focused and it was clicked into */
  var _moveCursorOnMouseUp: js.Any = js.native
  
  var _onBlur: js.Any = js.native
  
  var _onFocus: js.Any = js.native
  
  var _onInputChange: js.Any = js.native
  
  var _onKeyDown: js.Any = js.native
  
  var _onMouseDown: js.Any = js.native
  
  var _onMouseUp: js.Any = js.native
  
  var _onPaste: js.Any = js.native
  
  var _textField: js.Any = js.native
  
  @JSName("componentDidUpdate")
  def componentDidUpdate_MMaskedTextField(): Unit = js.native
  
  def setValue(newValue: String): Unit = js.native
}
/* static members */
@JSImport("office-ui-fabric-react/lib/components/TextField/MaskedTextField/MaskedTextField", "MaskedTextField")
@js.native
object MaskedTextField extends js.Object {
  
  var defaultProps: IMaskedTextFieldProps = js.native
}
