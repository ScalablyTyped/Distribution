package typings.microsoftGraph.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait OfferShiftRequest
  extends StObject
     with ScheduleChangeRequest {
  
  /**
    * The Timestamp type represents date and time information using ISO 8601 format and is always in UTC time. For example,
    * midnight UTC on Jan 1, 2014 would look like this: '2014-01-01T00:00:00Z'
    */
  var recipientActionDateTime: js.UndefOr[NullableOption[String]] = js.undefined
  
  // Custom message sent by recipient of the offer shift request.
  var recipientActionMessage: js.UndefOr[NullableOption[String]] = js.undefined
  
  // User ID of the recipient of the offer shift request.
  var recipientUserId: js.UndefOr[NullableOption[String]] = js.undefined
  
  // User ID of the sender of the offer shift request.
  var senderShiftId: js.UndefOr[NullableOption[String]] = js.undefined
}
object OfferShiftRequest {
  
  @scala.inline
  def apply(): OfferShiftRequest = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[OfferShiftRequest]
  }
  
  @scala.inline
  implicit class OfferShiftRequestMutableBuilder[Self <: OfferShiftRequest] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setRecipientActionDateTime(value: NullableOption[String]): Self = StObject.set(x, "recipientActionDateTime", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRecipientActionDateTimeNull: Self = StObject.set(x, "recipientActionDateTime", null)
    
    @scala.inline
    def setRecipientActionDateTimeUndefined: Self = StObject.set(x, "recipientActionDateTime", js.undefined)
    
    @scala.inline
    def setRecipientActionMessage(value: NullableOption[String]): Self = StObject.set(x, "recipientActionMessage", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRecipientActionMessageNull: Self = StObject.set(x, "recipientActionMessage", null)
    
    @scala.inline
    def setRecipientActionMessageUndefined: Self = StObject.set(x, "recipientActionMessage", js.undefined)
    
    @scala.inline
    def setRecipientUserId(value: NullableOption[String]): Self = StObject.set(x, "recipientUserId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRecipientUserIdNull: Self = StObject.set(x, "recipientUserId", null)
    
    @scala.inline
    def setRecipientUserIdUndefined: Self = StObject.set(x, "recipientUserId", js.undefined)
    
    @scala.inline
    def setSenderShiftId(value: NullableOption[String]): Self = StObject.set(x, "senderShiftId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSenderShiftIdNull: Self = StObject.set(x, "senderShiftId", null)
    
    @scala.inline
    def setSenderShiftIdUndefined: Self = StObject.set(x, "senderShiftId", js.undefined)
  }
}
