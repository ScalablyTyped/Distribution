package typings.microsoftGraph.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait EventMessageRequest extends EventMessage {
  var allowNewTimeProposals: js.UndefOr[Boolean] = js.native
  var meetingRequestType: js.UndefOr[MeetingRequestType] = js.native
  var previousEndDateTime: js.UndefOr[DateTimeTimeZone] = js.native
  var previousLocation: js.UndefOr[Location] = js.native
  var previousStartDateTime: js.UndefOr[DateTimeTimeZone] = js.native
  var responseRequested: js.UndefOr[Boolean] = js.native
}

object EventMessageRequest {
  @scala.inline
  def apply(): EventMessageRequest = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[EventMessageRequest]
  }
  @scala.inline
  implicit class EventMessageRequestOps[Self <: EventMessageRequest] (val x: Self) extends AnyVal {
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
    def setAllowNewTimeProposals(value: Boolean): Self = this.set("allowNewTimeProposals", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteAllowNewTimeProposals: Self = this.set("allowNewTimeProposals", js.undefined)
    @scala.inline
    def setMeetingRequestType(value: MeetingRequestType): Self = this.set("meetingRequestType", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteMeetingRequestType: Self = this.set("meetingRequestType", js.undefined)
    @scala.inline
    def setPreviousEndDateTime(value: DateTimeTimeZone): Self = this.set("previousEndDateTime", value.asInstanceOf[js.Any])
    @scala.inline
    def deletePreviousEndDateTime: Self = this.set("previousEndDateTime", js.undefined)
    @scala.inline
    def setPreviousLocation(value: Location): Self = this.set("previousLocation", value.asInstanceOf[js.Any])
    @scala.inline
    def deletePreviousLocation: Self = this.set("previousLocation", js.undefined)
    @scala.inline
    def setPreviousStartDateTime(value: DateTimeTimeZone): Self = this.set("previousStartDateTime", value.asInstanceOf[js.Any])
    @scala.inline
    def deletePreviousStartDateTime: Self = this.set("previousStartDateTime", js.undefined)
    @scala.inline
    def setResponseRequested(value: Boolean): Self = this.set("responseRequested", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteResponseRequested: Self = this.set("responseRequested", js.undefined)
  }
  
}

