package typings.officeUiFabricReact.calendarDayMod

import typings.react.mod.SyntheticEvent
import typings.std.Date
import typings.std.Event
import typings.std.HTMLElement
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IDayInfo extends js.Object {
  var date: String
  var isInBounds: Boolean
  var isInMonth: Boolean
  var isSelected: Boolean
  var isToday: Boolean
  var key: String
  var originalDate: Date
  def onSelected(ev: SyntheticEvent[HTMLElement, Event]): Unit
}

object IDayInfo {
  @scala.inline
  def apply(
    date: String,
    isInBounds: Boolean,
    isInMonth: Boolean,
    isSelected: Boolean,
    isToday: Boolean,
    key: String,
    onSelected: SyntheticEvent[HTMLElement, Event] => Unit,
    originalDate: Date
  ): IDayInfo = {
    val __obj = js.Dynamic.literal(date = date.asInstanceOf[js.Any], isInBounds = isInBounds.asInstanceOf[js.Any], isInMonth = isInMonth.asInstanceOf[js.Any], isSelected = isSelected.asInstanceOf[js.Any], isToday = isToday.asInstanceOf[js.Any], key = key.asInstanceOf[js.Any], onSelected = js.Any.fromFunction1(onSelected), originalDate = originalDate.asInstanceOf[js.Any])
    __obj.asInstanceOf[IDayInfo]
  }
}

