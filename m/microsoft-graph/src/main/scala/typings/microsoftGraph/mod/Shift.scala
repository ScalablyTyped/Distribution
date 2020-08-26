package typings.microsoftGraph.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Shift extends ChangeTrackedEntity {
  // The draft version of this shift that is viewable by managers. Required.
  var draftShift: js.UndefOr[ShiftItem] = js.native
  // ID of the scheduling group the shift is part of. Required.
  var schedulingGroupId: js.UndefOr[String] = js.native
  // The shared version of this shift that is viewable by both employees and managers. Required.
  var sharedShift: js.UndefOr[ShiftItem] = js.native
  // ID of the user assigned to the shift. Required.
  var userId: js.UndefOr[String] = js.native
}

object Shift {
  @scala.inline
  def apply(): Shift = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Shift]
  }
  @scala.inline
  implicit class ShiftOps[Self <: Shift] (val x: Self) extends AnyVal {
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
    def setDraftShift(value: ShiftItem): Self = this.set("draftShift", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDraftShift: Self = this.set("draftShift", js.undefined)
    @scala.inline
    def setSchedulingGroupId(value: String): Self = this.set("schedulingGroupId", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteSchedulingGroupId: Self = this.set("schedulingGroupId", js.undefined)
    @scala.inline
    def setSharedShift(value: ShiftItem): Self = this.set("sharedShift", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteSharedShift: Self = this.set("sharedShift", js.undefined)
    @scala.inline
    def setUserId(value: String): Self = this.set("userId", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteUserId: Self = this.set("userId", js.undefined)
  }
  
}

