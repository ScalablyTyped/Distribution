package typings.officeUiFabricReact.textFieldBaseMod

import typings.officeUiFabricReact.textFieldTypesMod.ITextField
import typings.officeUiFabricReact.textFieldTypesMod.ITextFieldProps
import typings.react.mod.Component
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("office-ui-fabric-react/lib/components/TextField/TextField.base", "TextFieldBase")
@js.native
class TextFieldBase protected ()
  extends Component[ITextFieldProps, ITextFieldState, ITextFieldSnapshot]
     with ITextField {
  def this(props: ITextFieldProps) = this()
  var _adjustInputHeight: js.Any = js.native
  var _async: js.Any = js.native
  var _classNames: js.Any = js.native
  var _delayedValidate: js.Any = js.native
  var _descriptionId: js.Any = js.native
  /**
    * Current error message from either `props.errorMessage` or the result of `props.onGetErrorMessage`.
    *
    * - If there is no validation error or we have not validated the input value, errorMessage is an empty string.
    * - If we have done the validation and there is validation error, errorMessage is the validation error message.
    */
  val _errorMessage: js.Any = js.native
  /** Fallback ID if none is provided in props. Access proper value via `this._id`. */
  var _fallbackId: js.Any = js.native
  var _hasWarnedNullValue: js.Any = js.native
  /** Returns `props.id` if available, or a fallback if not. */
  val _id: js.Any = js.native
  val _isControlled: js.Any = js.native
  /**
    * If a custom description render function is supplied then treat description as always available.
    * Otherwise defer to the presence of description or error message text.
    */
  val _isDescriptionAvailable: js.Any = js.native
  var _labelId: js.Any = js.native
  /** Most recent value from a change or input event, to help avoid processing events twice */
  var _lastChangeValue: js.Any = js.native
  var _lastValidation: js.Any = js.native
  var _latestValidateValue: js.Any = js.native
  var _notifyAfterValidate: js.Any = js.native
  var _onBlur: js.Any = js.native
  var _onFocus: js.Any = js.native
  var _onInputChange: js.Any = js.native
  var _onRenderDescription: js.Any = js.native
  var _onRenderLabel: js.Any = js.native
  var _onRenderPrefix: js.Any = js.native
  var _onRenderSuffix: js.Any = js.native
  var _renderInput: js.Any = js.native
  var _renderTextArea: js.Any = js.native
  var _textElement: js.Any = js.native
  var _validate: js.Any = js.native
  var _warnControlledUsage: js.Any = js.native
  /** Gets the selection end of the text field. Returns -1 if there is no selection. */
  /* CompleteClass */
  override var selectionEnd: Double | Null = js.native
  /** Gets the selection start of the text field. Returns -1 if there is no selection. */
  /* CompleteClass */
  override var selectionStart: Double | Null = js.native
  /** Blurs the input */
  /* CompleteClass */
  override def blur(): Unit = js.native
  @JSName("componentDidMount")
  def componentDidMount_MTextFieldBase(): Unit = js.native
  @JSName("componentDidUpdate")
  def componentDidUpdate_MTextFieldBase(prevProps: ITextFieldProps, prevState: ITextFieldState, snapshot: ITextFieldSnapshot): Unit = js.native
  @JSName("componentWillUnmount")
  def componentWillUnmount_MTextFieldBase(): Unit = js.native
  /** Sets focus to the input. */
  /* CompleteClass */
  override def focus(): Unit = js.native
  @JSName("getSnapshotBeforeUpdate")
  def getSnapshotBeforeUpdate_MTextFieldBase(prevProps: ITextFieldProps, prevState: ITextFieldState): ITextFieldSnapshot | Null = js.native
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
}

/* static members */
@JSImport("office-ui-fabric-react/lib/components/TextField/TextField.base", "TextFieldBase")
@js.native
object TextFieldBase extends js.Object {
  var defaultProps: ITextFieldProps = js.native
}

