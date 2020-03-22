package typings.officeUiFabricReact.calendarCalendarMod

import typings.officeUiFabricReact.calendarTypesMod.ICalendar
import typings.officeUiFabricReact.calendarTypesMod.ICalendarProps
import typings.react.mod.Component
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("office-ui-fabric-react/lib/components/Calendar/Calendar", "Calendar")
@js.native
class Calendar protected ()
  extends Component[ICalendarProps, ICalendarState, js.Any]
     with ICalendar {
  def this(props: ICalendarProps) = this()
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
  @JSName("UNSAFE_componentWillReceiveProps")
  def UNSAFE_componentWillReceiveProps_MCalendar(nextProps: ICalendarProps): Unit = js.native
  @JSName("componentDidUpdate")
  def componentDidUpdate_MCalendar(): Unit = js.native
  /** Sets focus to the selected date. */
  /* CompleteClass */
  override def focus(): Unit = js.native
}

/* static members */
@JSImport("office-ui-fabric-react/lib/components/Calendar/Calendar", "Calendar")
@js.native
object Calendar extends js.Object {
  var defaultProps: ICalendarProps = js.native
}

