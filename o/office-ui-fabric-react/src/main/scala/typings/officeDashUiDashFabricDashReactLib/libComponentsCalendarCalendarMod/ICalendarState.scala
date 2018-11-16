package typings
package officeDashUiDashFabricDashReactLib.libComponentsCalendarCalendarMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._


trait ICalendarState extends js.Object {
  /** State used to show/hide day picker */
  var isDayPickerVisible: js.UndefOr[scala.Boolean] = js.undefined
  /** State used to show/hide month picker */
  var isMonthPickerVisible: js.UndefOr[scala.Boolean] = js.undefined
  /** The currently focused date in the day picker, but not necessarily selected */
  var navigatedDayDate: js.UndefOr[stdLib.Date] = js.undefined
  /** The currently focused date in the month picker, but not necessarily selected */
  var navigatedMonthDate: js.UndefOr[stdLib.Date] = js.undefined
  /** The currently selected date in the calendar */
  var selectedDate: js.UndefOr[stdLib.Date] = js.undefined
}

