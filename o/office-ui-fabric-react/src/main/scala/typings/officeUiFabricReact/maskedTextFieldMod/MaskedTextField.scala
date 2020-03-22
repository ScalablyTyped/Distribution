package typings.officeUiFabricReact.maskedTextFieldMod

import typings.officeUiFabricReact.textFieldTypesMod.ITextField
import typings.officeUiFabricReact.textFieldTypesMod.ITextFieldProps
import typings.react.mod.Component
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("office-ui-fabric-react/lib/components/TextField/MaskedTextField/MaskedTextField", "MaskedTextField")
@js.native
class MaskedTextField protected ()
  extends Component[ITextFieldProps, IMaskedTextFieldState, js.Any]
     with ITextField {
  def this(props: ITextFieldProps) = this()
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
  /** Gets the selection end of the text field. Returns -1 if there is no selection. */
  /* CompleteClass */
  override var selectionEnd: Double | Null = js.native
  /** Gets the selection start of the text field. Returns -1 if there is no selection. */
  /* CompleteClass */
  override var selectionStart: Double | Null = js.native
  @JSName("UNSAFE_componentWillReceiveProps")
  def UNSAFE_componentWillReceiveProps_MMaskedTextField(newProps: ITextFieldProps): Unit = js.native
  /** Blurs the input */
  /* CompleteClass */
  override def blur(): Unit = js.native
  @JSName("componentDidUpdate")
  def componentDidUpdate_MMaskedTextField(): Unit = js.native
  /** Sets focus to the input. */
  /* CompleteClass */
  override def focus(): Unit = js.native
  /** Select the value of the text field. */
  /* CompleteClass */
  override def select(): Unit = js.native
  /** Sets the selection end of the text field to a specified value. */
  /* CompleteClass */
  override def setSelectionEnd(value: Double): Unit = js.native
  /**
    * Sets the start and end positions of a selection in a text field.
    * Call with start and end set to the same value to set the cursor position.
    * @param start - Index of the start of the selection.
    * @param end - Index of the end of the selection.
    */
  /* CompleteClass */
  override def setSelectionRange(start: Double, end: Double): Unit = js.native
  /** Sets the selection start of the text field to a specified value. */
  /* CompleteClass */
  override def setSelectionStart(value: Double): Unit = js.native
  def setValue(newValue: String): Unit = js.native
}

/* static members */
@JSImport("office-ui-fabric-react/lib/components/TextField/MaskedTextField/MaskedTextField", "MaskedTextField")
@js.native
object MaskedTextField extends js.Object {
  var defaultProps: ITextFieldProps = js.native
}

