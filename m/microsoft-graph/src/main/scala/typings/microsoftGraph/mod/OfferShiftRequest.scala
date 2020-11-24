package typings.microsoftGraph.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait OfferShiftRequest extends ScheduleChangeRequest {
  
  /**
    * The Timestamp type represents date and time information using ISO 8601 format and is always in UTC time. For example,
    * midnight UTC on Jan 1, 2014 would look like this: '2014-01-01T00:00:00Z'
    */
  var recipientActionDateTime: js.UndefOr[NullableOption[String]] = js.native
  
  // Custom message sent by recipient of the offer shift request.
  var recipientActionMessage: js.UndefOr[NullableOption[String]] = js.native
  
  // User ID of the recipient of the offer shift request.
  var recipientUserId: js.UndefOr[NullableOption[String]] = js.native
  
  // User ID of the sender of the offer shift request.
  var senderShiftId: js.UndefOr[NullableOption[String]] = js.native
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
    def setRecipientActionDateTime(value: NullableOption[String]): Self = this.set("recipientActionDateTime", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteRecipientActionDateTime: Self = this.set("recipientActionDateTime", js.undefined)
    
    @scala.inline
    def setRecipientActionDateTimeNull: Self = this.set("recipientActionDateTime", null)
    
    @scala.inline
    def setRecipientActionMessage(value: NullableOption[String]): Self = this.set("recipientActionMessage", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteRecipientActionMessage: Self = this.set("recipientActionMessage", js.undefined)
    
    @scala.inline
    def setRecipientActionMessageNull: Self = this.set("recipientActionMessage", null)
    
    @scala.inline
    def setRecipientUserId(value: NullableOption[String]): Self = this.set("recipientUserId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteRecipientUserId: Self = this.set("recipientUserId", js.undefined)
    
    @scala.inline
    def setRecipientUserIdNull: Self = this.set("recipientUserId", null)
    
    @scala.inline
    def setSenderShiftId(value: NullableOption[String]): Self = this.set("senderShiftId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSenderShiftId: Self = this.set("senderShiftId", js.undefined)
    
    @scala.inline
    def setSenderShiftIdNull: Self = this.set("senderShiftId", null)
  }
}
