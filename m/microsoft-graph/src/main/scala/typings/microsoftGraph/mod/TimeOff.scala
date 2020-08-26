package typings.microsoftGraph.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait TimeOff extends ChangeTrackedEntity {
  // The draft version of this timeOff that is viewable by managers. Required.
  var draftTimeOff: js.UndefOr[TimeOffItem] = js.native
  // The shared version of this timeOff that is viewable by both employees and managers. Required.
  var sharedTimeOff: js.UndefOr[TimeOffItem] = js.native
  // ID of the user assigned to the timeOff. Required.
  var userId: js.UndefOr[String] = js.native
}

object TimeOff {
  @scala.inline
  def apply(): TimeOff = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[TimeOff]
  }
  @scala.inline
  implicit class TimeOffOps[Self <: TimeOff] (val x: Self) extends AnyVal {
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
    def setDraftTimeOff(value: TimeOffItem): Self = this.set("draftTimeOff", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDraftTimeOff: Self = this.set("draftTimeOff", js.undefined)
    @scala.inline
    def setSharedTimeOff(value: TimeOffItem): Self = this.set("sharedTimeOff", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteSharedTimeOff: Self = this.set("sharedTimeOff", js.undefined)
    @scala.inline
    def setUserId(value: String): Self = this.set("userId", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteUserId: Self = this.set("userId", js.undefined)
  }
  
}

