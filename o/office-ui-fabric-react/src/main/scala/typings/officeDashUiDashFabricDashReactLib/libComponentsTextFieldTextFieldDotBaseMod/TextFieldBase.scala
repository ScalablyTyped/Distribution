package typings
package officeDashUiDashFabricDashReactLib.libComponentsTextFieldTextFieldDotBaseMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("office-ui-fabric-react/lib/components/TextField/TextField.base", "TextFieldBase")
@js.native
class TextFieldBase protected ()
  extends officeDashUiDashFabricDashReactLib.libUtilitiesMod.BaseComponent[
      officeDashUiDashFabricDashReactLib.libComponentsTextFieldTextFieldDotTypesMod.ITextFieldProps, 
      ITextFieldState
    ]
     with officeDashUiDashFabricDashReactLib.libComponentsTextFieldTextFieldDotTypesMod.ITextField {
  def this(props: officeDashUiDashFabricDashReactLib.libComponentsTextFieldTextFieldDotTypesMod.ITextFieldProps) = this()
  var _classNames: js.Any = js.native
  var _delayedValidate: js.Any = js.native
  var _descriptionId: js.Any = js.native
  val _errorMessage: js.Any = js.native
  var _id: js.Any = js.native
  /**
    * If a custom description render function is supplied then treat description as always available.
    * Otherwise defer to the presence of description or error message text.
    */
  val _isDescriptionAvailable: js.Any = js.native
  var _isMounted: js.Any = js.native
  var _lastValidation: js.Any = js.native
  var _latestValidateValue: js.Any = js.native
  var _latestValue: js.Any = js.native
  var _onBlur: js.Any = js.native
  var _onFocus: js.Any = js.native
  var _onInputChange: js.Any = js.native
  var _onRenderDescription: js.Any = js.native
  var _onRenderLabel: js.Any = js.native
  /**
    * If set, the text field is changing between single- and multi-line, so we'll need to reset
    * selection/cursor after the change completes.
    */
  var _selectionBeforeInputTypeChange: js.Any = js.native
  /**
    * If true, the text field is changing between single- and multi-line, so we'll need to reset
    * focus after the change completes.
    */
  var _shouldResetFocusAfterRender: js.Any = js.native
  var _textElement: js.Any = js.native
  /** Gets the selection end of the text field. Returns -1 if there is no selection. */
  /* CompleteClass */
  override var selectionEnd: scala.Double | scala.Null = js.native
  /** Gets the selection start of the text field. Returns -1 if there is no selection. */
  /* CompleteClass */
  override var selectionStart: scala.Double | scala.Null = js.native
  /** Gets the current value of the input. */
  /* CompleteClass */
  override var value: js.UndefOr[java.lang.String] = js.native
  /* private */ def _adjustInputHeight(): js.Any = js.native
  /* private */ def _notifyAfterValidate(value: js.Any, errorMessage: js.Any): js.Any = js.native
  /* private */ def _onRenderAddon(props: js.Any): js.Any = js.native
  /* private */ def _onRenderPrefix(props: js.Any): js.Any = js.native
  /* private */ def _onRenderSuffix(props: js.Any): js.Any = js.native
  /* private */ def _renderInput(): js.Any = js.native
  /* private */ def _renderTextArea(): js.Any = js.native
  /* private */ def _setValue(): js.Any = js.native
  /* private */ def _setValue(value: js.Any): js.Any = js.native
  /* private */ def _validate(value: js.Any): js.Any = js.native
  /** Blurs the input */
  /* CompleteClass */
  override def blur(): scala.Unit = js.native
  @JSName("componentDidMount")
  def componentDidMount_MTextFieldBase(): scala.Unit = js.native
  @JSName("componentDidUpdate")
  def componentDidUpdate_MTextFieldBase(): scala.Unit = js.native
  @JSName("componentWillReceiveProps")
  def componentWillReceiveProps_MTextFieldBase(
    newProps: officeDashUiDashFabricDashReactLib.libComponentsTextFieldTextFieldDotTypesMod.ITextFieldProps
  ): scala.Unit = js.native
  @JSName("componentWillUnmount")
  def componentWillUnmount_MTextFieldBase(): scala.Unit = js.native
  /** Sets focus to the input. */
  /* CompleteClass */
  override def focus(): scala.Unit = js.native
  /** Select the value of the text field. */
  /* CompleteClass */
  override def select(): scala.Unit = js.native
  /** Sets the selection end of the text field to a specified value. */
  /* CompleteClass */
  override def setSelectionEnd(value: scala.Double): scala.Unit = js.native
  /**
    * Sets the start and end positions of a selection in a text field.
    * Call with start and end set to the same value to set the cursor position.
    * @param start - Index of the start of the selection.
    * @param end - Index of the end of the selection.
    */
  /* CompleteClass */
  override def setSelectionRange(start: scala.Double, end: scala.Double): scala.Unit = js.native
  /** Sets the selection start of the text field to a specified value. */
  /* CompleteClass */
  override def setSelectionStart(value: scala.Double): scala.Unit = js.native
}

/* static members */
@JSImport("office-ui-fabric-react/lib/components/TextField/TextField.base", "TextFieldBase")
@js.native
object TextFieldBase extends js.Object {
  var defaultProps: officeDashUiDashFabricDashReactLib.libComponentsTextFieldTextFieldDotTypesMod.ITextFieldProps = js.native
}

