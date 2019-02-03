package typings
package officeDashUiDashFabricDashReactLib.libComponentsTextFieldMaskedTextFieldMaskedTextFieldMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("office-ui-fabric-react/lib/components/TextField/MaskedTextField/MaskedTextField", "MaskedTextField")
@js.native
class MaskedTextField protected ()
  extends officeDashUiDashFabricDashReactLib.libUtilitiesMod.BaseComponent[
      officeDashUiDashFabricDashReactLib.libComponentsTextFieldTextFieldDotTypesMod.ITextFieldProps, 
      IMaskedTextFieldState
    ]
     with officeDashUiDashFabricDashReactLib.libComponentsTextFieldTextFieldDotTypesMod.ITextField {
  def this(props: officeDashUiDashFabricDashReactLib.libComponentsTextFieldTextFieldDotTypesMod.ITextFieldProps) = this()
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
  var _textField: js.Any = js.native
  /** Gets the selection end of the text field. Returns -1 if there is no selection. */
  /* CompleteClass */
  override var selectionEnd: scala.Double | scala.Null = js.native
  /** Gets the selection start of the text field. Returns -1 if there is no selection. */
  /* CompleteClass */
  override var selectionStart: scala.Double | scala.Null = js.native
  /** Gets the current value of the input. */
  /* CompleteClass */
  override var value: js.UndefOr[java.lang.String] = js.native
  /* private */ def _onBeforeChange(value: js.Any): js.Any = js.native
  /* private */ def _onBlur(event: js.Any): js.Any = js.native
  /* private */ def _onFocus(event: js.Any): js.Any = js.native
  /* private */ def _onInputChange(ev: js.Any, value: js.Any): js.Any = js.native
  /* private */ def _onKeyDown(event: js.Any): js.Any = js.native
  /* private */ def _onMouseDown(event: js.Any): js.Any = js.native
  /* private */ def _onMouseUp(event: js.Any): js.Any = js.native
  /* private */ def _onPaste(event: js.Any): js.Any = js.native
  /** Blurs the input */
  /* CompleteClass */
  override def blur(): scala.Unit = js.native
  @JSName("componentDidUpdate")
  def componentDidUpdate_MMaskedTextField(): scala.Unit = js.native
  @JSName("componentWillReceiveProps")
  def componentWillReceiveProps_MMaskedTextField(
    newProps: officeDashUiDashFabricDashReactLib.libComponentsTextFieldTextFieldDotTypesMod.ITextFieldProps
  ): scala.Unit = js.native
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
  /**
    *
    */
  def setValue(newValue: java.lang.String): scala.Unit = js.native
}

/* static members */
@JSImport("office-ui-fabric-react/lib/components/TextField/MaskedTextField/MaskedTextField", "MaskedTextField")
@js.native
object MaskedTextField extends js.Object {
  var defaultProps: officeDashUiDashFabricDashReactLib.libComponentsTextFieldTextFieldDotTypesMod.ITextFieldProps = js.native
}

