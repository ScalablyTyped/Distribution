package typings.microsoftGraph.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait SecureScoreControlStateUpdate extends js.Object {
  // Assigns the control to the user who will take the action.
  var assignedTo: js.UndefOr[String] = js.native
  // Provides optional comment about the control.
  var comment: js.UndefOr[String] = js.native
  // State of the control, which can be modified via a PATCH command (for example, ignored, thirdParty).
  var state: js.UndefOr[String] = js.native
  // ID of the user who updated tenant state.
  var updatedBy: js.UndefOr[String] = js.native
  // Time at which the control state was updated.
  var updatedDateTime: js.UndefOr[String] = js.native
}

object SecureScoreControlStateUpdate {
  @scala.inline
  def apply(): SecureScoreControlStateUpdate = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SecureScoreControlStateUpdate]
  }
  @scala.inline
  implicit class SecureScoreControlStateUpdateOps[Self <: SecureScoreControlStateUpdate] (val x: Self) extends AnyVal {
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
    def setAssignedTo(value: String): Self = this.set("assignedTo", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteAssignedTo: Self = this.set("assignedTo", js.undefined)
    @scala.inline
    def setComment(value: String): Self = this.set("comment", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteComment: Self = this.set("comment", js.undefined)
    @scala.inline
    def setState(value: String): Self = this.set("state", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteState: Self = this.set("state", js.undefined)
    @scala.inline
    def setUpdatedBy(value: String): Self = this.set("updatedBy", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteUpdatedBy: Self = this.set("updatedBy", js.undefined)
    @scala.inline
    def setUpdatedDateTime(value: String): Self = this.set("updatedDateTime", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteUpdatedDateTime: Self = this.set("updatedDateTime", js.undefined)
  }
  
}

