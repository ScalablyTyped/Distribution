package typings.officeDashUiDashFabricDashReact.libComponentsCalendarCalendarDayMod

import typings.atUifabricUtilities.libCreateRefMod.IRefObject
import typings.officeDashUiDashFabricDashReact.libComponentsCalendarCalendarDotTypesMod.ICalendarFormatDateCallbacks
import typings.officeDashUiDashFabricDashReact.libComponentsCalendarCalendarDotTypesMod.ICalendarIconStrings
import typings.officeDashUiDashFabricDashReact.libComponentsCalendarCalendarDotTypesMod.ICalendarStrings
import typings.officeDashUiDashFabricDashReact.libUtilitiesDateValuesDateValuesMod.DateRangeType
import typings.officeDashUiDashFabricDashReact.libUtilitiesDateValuesDateValuesMod.DayOfWeek
import typings.officeDashUiDashFabricDashReact.libUtilitiesDateValuesDateValuesMod.FirstWeekOfYear
import typings.react.reactMod.ClassAttributes
import typings.std.Date
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ICalendarDayProps extends ClassAttributes[CalendarDay] {
  var allFocusable: js.UndefOr[Boolean] = js.native
  var autoNavigateOnSelection: Boolean = js.native
  var componentRef: js.UndefOr[IRefObject[ICalendarDay]] = js.native
  var dateRangeType: DateRangeType = js.native
  var dateTimeFormatter: ICalendarFormatDateCallbacks = js.native
  var firstDayOfWeek: DayOfWeek = js.native
  var firstWeekOfYear: FirstWeekOfYear = js.native
  var maxDate: js.UndefOr[Date] = js.native
  var minDate: js.UndefOr[Date] = js.native
  var navigatedDate: Date = js.native
  var navigationIcons: ICalendarIconStrings = js.native
  var onDismiss: js.UndefOr[js.Function0[Unit]] = js.native
  var onHeaderSelect: js.UndefOr[js.Function1[/* focus */ Boolean, Unit]] = js.native
  var restrictedDates: js.UndefOr[js.Array[Date]] = js.native
  var selectedDate: Date = js.native
  var showCloseButton: js.UndefOr[Boolean] = js.native
  var showSixWeeksByDefault: js.UndefOr[Boolean] = js.native
  var showWeekNumbers: js.UndefOr[Boolean] = js.native
  var strings: ICalendarStrings = js.native
  var today: js.UndefOr[Date] = js.native
  var workWeekDays: js.UndefOr[js.Array[DayOfWeek]] = js.native
  def onNavigateDate(date: Date, focusOnNavigatedDay: Boolean): Unit = js.native
  def onSelectDate(date: Date): Unit = js.native
  def onSelectDate(date: Date, selectedDateRangeArray: js.Array[Date]): Unit = js.native
}

