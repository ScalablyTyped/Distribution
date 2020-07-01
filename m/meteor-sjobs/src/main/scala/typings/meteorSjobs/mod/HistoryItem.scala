package typings.meteorSjobs.mod

import typings.std.Date
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait HistoryItem extends js.Object {
  var date: Date
  var newDue: js.UndefOr[Date] = js.undefined
  var serverId: String
  var state: js.UndefOr[JobState] = js.undefined
  var `type`: js.UndefOr[String] = js.undefined
}

object HistoryItem {
  @scala.inline
  def apply(date: Date, serverId: String, newDue: Date = null, state: JobState = null, `type`: String = null): HistoryItem = {
    val __obj = js.Dynamic.literal(date = date.asInstanceOf[js.Any], serverId = serverId.asInstanceOf[js.Any])
    if (newDue != null) __obj.updateDynamic("newDue")(newDue.asInstanceOf[js.Any])
    if (state != null) __obj.updateDynamic("state")(state.asInstanceOf[js.Any])
    if (`type` != null) __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[HistoryItem]
  }
}

