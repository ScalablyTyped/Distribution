package typings
package officeDashUiDashFabricDashReactLib.libComponentsCalendarCalendarMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("office-ui-fabric-react/lib/components/Calendar/Calendar", "Calendar")
@js.native
class Calendar protected ()
  extends officeDashUiDashFabricDashReactLib.libUtilitiesMod.BaseComponent[
      officeDashUiDashFabricDashReactLib.libComponentsCalendarCalendarDotTypesMod.ICalendarProps, 
      ICalendarState
    ]
     with officeDashUiDashFabricDashReactLib.libComponentsCalendarCalendarDotTypesMod.ICalendar {
  def this(props: officeDashUiDashFabricDashReactLib.libComponentsCalendarCalendarDotTypesMod.ICalendarProps) = this()
  var _dayPicker: js.Any = js.native
  var _focusOnUpdate: js.Any = js.native
  var _handleEscKey: js.Any = js.native
  var _monthPicker: js.Any = js.native
  var _navigateDayPickerDay: js.Any = js.native
  var _navigateMonthPickerDay: js.Any = js.native
  var _onDatePickerPopupKeyDown: js.Any = js.native
  var _onGotoToday: js.Any = js.native
  var _onGotoTodayClick: js.Any = js.native
  var _onGotoTodayKeyDown: js.Any = js.native
  var _onHeaderSelect: js.Any = js.native
  var _onNavigateDayDate: js.Any = js.native
  var _onNavigateMonthDate: js.Any = js.native
  var _onSelectDate: js.Any = js.native
  @JSName("componentDidUpdate")
  def componentDidUpdate_MCalendar(): scala.Unit = js.native
  @JSName("componentWillReceiveProps")
  def componentWillReceiveProps_MCalendar(
    nextProps: officeDashUiDashFabricDashReactLib.libComponentsCalendarCalendarDotTypesMod.ICalendarProps
  ): scala.Unit = js.native
  /** Sets focus to the selected date. */
  /* CompleteClass */
  override def focus(): scala.Unit = js.native
}

/* static members */
@JSImport("office-ui-fabric-react/lib/components/Calendar/Calendar", "Calendar")
@js.native
object Calendar extends js.Object {
  var defaultProps: officeDashUiDashFabricDashReactLib.libComponentsCalendarCalendarDotTypesMod.ICalendarProps = js.native
}

