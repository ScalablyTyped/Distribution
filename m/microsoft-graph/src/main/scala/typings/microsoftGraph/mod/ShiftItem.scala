package typings.microsoftGraph.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ShiftItem extends ScheduleEntity {
  /**
    * An incremental part of a shift which can cover details of when and where an employee is during their shift. For
    * example, an assignment or a scheduled break or lunch. Required.
    */
  var activities: js.UndefOr[js.Array[ShiftActivity]] = js.native
  // The shift label of the shiftItem.
  var displayName: js.UndefOr[String] = js.native
  // The shift notes for the shiftItem.
  var notes: js.UndefOr[String] = js.native
}

object ShiftItem {
  @scala.inline
  def apply(): ShiftItem = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ShiftItem]
  }
  @scala.inline
  implicit class ShiftItemOps[Self <: ShiftItem] (val x: Self) extends AnyVal {
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
    def setActivitiesVarargs(value: ShiftActivity*): Self = this.set("activities", js.Array(value :_*))
    @scala.inline
    def setActivities(value: js.Array[ShiftActivity]): Self = this.set("activities", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteActivities: Self = this.set("activities", js.undefined)
    @scala.inline
    def setDisplayName(value: String): Self = this.set("displayName", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDisplayName: Self = this.set("displayName", js.undefined)
    @scala.inline
    def setNotes(value: String): Self = this.set("notes", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteNotes: Self = this.set("notes", js.undefined)
  }
  
}

