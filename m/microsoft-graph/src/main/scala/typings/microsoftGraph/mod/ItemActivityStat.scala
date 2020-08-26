package typings.microsoftGraph.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ItemActivityStat extends Entity {
  // Statistics about the access actions in this interval. Read-only.
  var access: js.UndefOr[ItemActionStat] = js.native
  // Exposes the itemActivities represented in this itemActivityStat resource.
  var activities: js.UndefOr[js.Array[ItemActivity]] = js.native
  // Statistics about the create actions in this interval. Read-only.
  var create: js.UndefOr[ItemActionStat] = js.native
  // Statistics about the delete actions in this interval. Read-only.
  var delete: js.UndefOr[ItemActionStat] = js.native
  // Statistics about the edit actions in this interval. Read-only.
  var edit: js.UndefOr[ItemActionStat] = js.native
  // When the interval ends. Read-only.
  var endDateTime: js.UndefOr[String] = js.native
  // Indicates that the statistics in this interval are based on incomplete data. Read-only.
  var incompleteData: js.UndefOr[IncompleteData] = js.native
  // Indicates whether the item is 'trending.' Read-only.
  var isTrending: js.UndefOr[Boolean] = js.native
  // Statistics about the move actions in this interval. Read-only.
  var move: js.UndefOr[ItemActionStat] = js.native
  // When the interval starts. Read-only.
  var startDateTime: js.UndefOr[String] = js.native
}

object ItemActivityStat {
  @scala.inline
  def apply(): ItemActivityStat = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ItemActivityStat]
  }
  @scala.inline
  implicit class ItemActivityStatOps[Self <: ItemActivityStat] (val x: Self) extends AnyVal {
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
    def setAccess(value: ItemActionStat): Self = this.set("access", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteAccess: Self = this.set("access", js.undefined)
    @scala.inline
    def setActivitiesVarargs(value: ItemActivity*): Self = this.set("activities", js.Array(value :_*))
    @scala.inline
    def setActivities(value: js.Array[ItemActivity]): Self = this.set("activities", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteActivities: Self = this.set("activities", js.undefined)
    @scala.inline
    def setCreate(value: ItemActionStat): Self = this.set("create", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteCreate: Self = this.set("create", js.undefined)
    @scala.inline
    def setDelete(value: ItemActionStat): Self = this.set("delete", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDelete: Self = this.set("delete", js.undefined)
    @scala.inline
    def setEdit(value: ItemActionStat): Self = this.set("edit", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteEdit: Self = this.set("edit", js.undefined)
    @scala.inline
    def setEndDateTime(value: String): Self = this.set("endDateTime", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteEndDateTime: Self = this.set("endDateTime", js.undefined)
    @scala.inline
    def setIncompleteData(value: IncompleteData): Self = this.set("incompleteData", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteIncompleteData: Self = this.set("incompleteData", js.undefined)
    @scala.inline
    def setIsTrending(value: Boolean): Self = this.set("isTrending", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteIsTrending: Self = this.set("isTrending", js.undefined)
    @scala.inline
    def setMove(value: ItemActionStat): Self = this.set("move", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteMove: Self = this.set("move", js.undefined)
    @scala.inline
    def setStartDateTime(value: String): Self = this.set("startDateTime", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteStartDateTime: Self = this.set("startDateTime", js.undefined)
  }
  
}

