package typings.microsoftGraph.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ScheduleChangeRequest extends ChangeTrackedEntity {
  var assignedTo: js.UndefOr[ScheduleChangeRequestActor] = js.native
  var managerActionDateTime: js.UndefOr[String] = js.native
  var managerActionMessage: js.UndefOr[String] = js.native
  var managerUserId: js.UndefOr[String] = js.native
  var senderDateTime: js.UndefOr[String] = js.native
  var senderMessage: js.UndefOr[String] = js.native
  var senderUserId: js.UndefOr[String] = js.native
  var state: js.UndefOr[ScheduleChangeState] = js.native
}

object ScheduleChangeRequest {
  @scala.inline
  def apply(): ScheduleChangeRequest = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ScheduleChangeRequest]
  }
  @scala.inline
  implicit class ScheduleChangeRequestOps[Self <: ScheduleChangeRequest] (val x: Self) extends AnyVal {
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
    def setAssignedTo(value: ScheduleChangeRequestActor): Self = this.set("assignedTo", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteAssignedTo: Self = this.set("assignedTo", js.undefined)
    @scala.inline
    def setManagerActionDateTime(value: String): Self = this.set("managerActionDateTime", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteManagerActionDateTime: Self = this.set("managerActionDateTime", js.undefined)
    @scala.inline
    def setManagerActionMessage(value: String): Self = this.set("managerActionMessage", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteManagerActionMessage: Self = this.set("managerActionMessage", js.undefined)
    @scala.inline
    def setManagerUserId(value: String): Self = this.set("managerUserId", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteManagerUserId: Self = this.set("managerUserId", js.undefined)
    @scala.inline
    def setSenderDateTime(value: String): Self = this.set("senderDateTime", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteSenderDateTime: Self = this.set("senderDateTime", js.undefined)
    @scala.inline
    def setSenderMessage(value: String): Self = this.set("senderMessage", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteSenderMessage: Self = this.set("senderMessage", js.undefined)
    @scala.inline
    def setSenderUserId(value: String): Self = this.set("senderUserId", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteSenderUserId: Self = this.set("senderUserId", js.undefined)
    @scala.inline
    def setState(value: ScheduleChangeState): Self = this.set("state", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteState: Self = this.set("state", js.undefined)
  }
  
}

