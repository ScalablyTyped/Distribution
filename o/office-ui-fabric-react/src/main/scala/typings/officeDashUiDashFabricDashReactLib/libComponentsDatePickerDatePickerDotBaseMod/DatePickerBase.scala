package typings
package officeDashUiDashFabricDashReactLib.libComponentsDatePickerDatePickerDotBaseMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("office-ui-fabric-react/lib/components/DatePicker/DatePicker.base", "DatePickerBase")
@js.native
class DatePickerBase protected ()
  extends officeDashUiDashFabricDashReactLib.libUtilitiesMod.BaseComponent[
      officeDashUiDashFabricDashReactLib.libComponentsDatePickerDatePickerDotTypesMod.IDatePickerProps, 
      IDatePickerState
    ]
     with officeDashUiDashFabricDashReactLib.libComponentsDatePickerDatePickerDotTypesMod.IDatePicker {
  def this(props: officeDashUiDashFabricDashReactLib.libComponentsDatePickerDatePickerDotTypesMod.IDatePickerProps) = this()
  var _calendar: js.Any = js.native
  /**
    * Callback for closing the calendar callout
    */
  var _calendarDismissed: js.Any = js.native
  var _datePickerDiv: js.Any = js.native
  var _dismissDatePickerPopup: js.Any = js.native
  var _handleEscKey: js.Any = js.native
  var _id: js.Any = js.native
  var _onCalloutPositioned: js.Any = js.native
  var _onIconClick: js.Any = js.native
  var _onSelectDate: js.Any = js.native
  var _onTextFieldBlur: js.Any = js.native
  var _onTextFieldChanged: js.Any = js.native
  var _onTextFieldClick: js.Any = js.native
  var _onTextFieldFocus: js.Any = js.native
  var _onTextFieldKeyDown: js.Any = js.native
  var _preventFocusOpeningPicker: js.Any = js.native
  var _textField: js.Any = js.native
  var _validateTextInput: js.Any = js.native
  /* private */ def _getDefaultState(): js.Any = js.native
  /* private */ def _getDefaultState(props: js.Any): js.Any = js.native
  /* private */ def _isDateOutOfBounds(date: js.Any): js.Any = js.native
  /* private */ def _isDateOutOfBounds(date: js.Any, minDate: js.Any): js.Any = js.native
  /* private */ def _isDateOutOfBounds(date: js.Any, minDate: js.Any, maxDate: js.Any): js.Any = js.native
  /* private */ def _showDatePickerPopup(): js.Any = js.native
  @JSName("componentDidUpdate")
  def componentDidUpdate_MDatePickerBase(
    prevProps: officeDashUiDashFabricDashReactLib.libComponentsDatePickerDatePickerDotTypesMod.IDatePickerProps,
    prevState: IDatePickerState
  ): scala.Unit = js.native
  @JSName("componentWillReceiveProps")
  def componentWillReceiveProps_MDatePickerBase(
    nextProps: officeDashUiDashFabricDashReactLib.libComponentsDatePickerDatePickerDotTypesMod.IDatePickerProps
  ): scala.Unit = js.native
  /** Sets focus to the text field */
  /* CompleteClass */
  override def focus(): scala.Unit = js.native
  /** Reset the state of the picker to the default */
  /* CompleteClass */
  override def reset(): scala.Unit = js.native
}

/* static members */
@JSImport("office-ui-fabric-react/lib/components/DatePicker/DatePicker.base", "DatePickerBase")
@js.native
object DatePickerBase extends js.Object {
  var defaultProps: officeDashUiDashFabricDashReactLib.libComponentsDatePickerDatePickerDotTypesMod.IDatePickerProps = js.native
}

