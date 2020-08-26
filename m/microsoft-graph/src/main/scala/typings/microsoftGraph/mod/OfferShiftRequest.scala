package typings.microsoftGraph.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait OfferShiftRequest extends ScheduleChangeRequest {
  /**
    * The Timestamp type represents date and time information using ISO 8601 format and is always in UTC time. For example,
    * midnight UTC on Jan 1, 2014 would look like this: '2014-01-01T00:00:00Z'
    */
  var recipientActionDateTime: js.UndefOr[String] = js.native
  // Custom message sent by recipient of the offer shift request.
  var recipientActionMessage: js.UndefOr[String] = js.native
  // User ID of the recipient of the offer shift request.
  var recipientUserId: js.UndefOr[String] = js.native
  // User ID of the sender of the offer shift request.
  var senderShiftId: js.UndefOr[String] = js.native
}

object OfferShiftRequest {
  @scala.inline
  def apply(): OfferShiftRequest = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[OfferShiftRequest]
  }
  @scala.inline
  implicit class OfferShiftRequestOps[Self <: OfferShiftRequest] (val x: Self) extends AnyVal {
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
    def setRecipientActionDateTime(value: String): Self = this.set("recipientActionDateTime", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteRecipientActionDateTime: Self = this.set("recipientActionDateTime", js.undefined)
    @scala.inline
    def setRecipientActionMessage(value: String): Self = this.set("recipientActionMessage", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteRecipientActionMessage: Self = this.set("recipientActionMessage", js.undefined)
    @scala.inline
    def setRecipientUserId(value: String): Self = this.set("recipientUserId", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteRecipientUserId: Self = this.set("recipientUserId", js.undefined)
    @scala.inline
    def setSenderShiftId(value: String): Self = this.set("senderShiftId", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteSenderShiftId: Self = this.set("senderShiftId", js.undefined)
  }
  
}

