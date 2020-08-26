package typings.meteorSjobs.mod

import typings.std.Date
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait HistoryItem extends js.Object {
  var date: Date = js.native
  var newDue: js.UndefOr[Date] = js.native
  var serverId: String = js.native
  var state: js.UndefOr[JobState] = js.native
  var `type`: js.UndefOr[String] = js.native
}

object HistoryItem {
  @scala.inline
  def apply(date: Date, serverId: String): HistoryItem = {
    val __obj = js.Dynamic.literal(date = date.asInstanceOf[js.Any], serverId = serverId.asInstanceOf[js.Any])
    __obj.asInstanceOf[HistoryItem]
  }
  @scala.inline
  implicit class HistoryItemOps[Self <: HistoryItem] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setDate(value: Date): Self = this.set("date", value.asInstanceOf[js.Any])
    @scala.inline
    def setServerId(value: String): Self = this.set("serverId", value.asInstanceOf[js.Any])
    @scala.inline
    def setNewDue(value: Date): Self = this.set("newDue", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteNewDue: Self = this.set("newDue", js.undefined)
    @scala.inline
    def setState(value: JobState): Self = this.set("state", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteState: Self = this.set("state", js.undefined)
    @scala.inline
    def setType(value: String): Self = this.set("type", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteType: Self = this.set("type", js.undefined)
  }
  
}

