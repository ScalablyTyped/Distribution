package typings.microsoftGraph.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait OfferShiftRequest
  extends StObject
     with ScheduleChangeRequest {
  
  /**
    * The Timestamp type represents date and time information using ISO 8601 format and is always in UTC time. For example,
    * midnight UTC on Jan 1, 2014 is 2014-01-01T00:00:00Z
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
  
  inline def apply(): OfferShiftRequest = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[OfferShiftRequest]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: OfferShiftRequest] (val x: Self) extends AnyVal {
    
    inline def setRecipientActionDateTime(value: NullableOption[String]): Self = StObject.set(x, "recipientActionDateTime", value.asInstanceOf[js.Any])
    
    inline def setRecipientActionDateTimeNull: Self = StObject.set(x, "recipientActionDateTime", null)
    
    inline def setRecipientActionDateTimeUndefined: Self = StObject.set(x, "recipientActionDateTime", js.undefined)
    
    inline def setRecipientActionMessage(value: NullableOption[String]): Self = StObject.set(x, "recipientActionMessage", value.asInstanceOf[js.Any])
    
    inline def setRecipientActionMessageNull: Self = StObject.set(x, "recipientActionMessage", null)
    
    inline def setRecipientActionMessageUndefined: Self = StObject.set(x, "recipientActionMessage", js.undefined)
    
    inline def setRecipientUserId(value: NullableOption[String]): Self = StObject.set(x, "recipientUserId", value.asInstanceOf[js.Any])
    
    inline def setRecipientUserIdNull: Self = StObject.set(x, "recipientUserId", null)
    
    inline def setRecipientUserIdUndefined: Self = StObject.set(x, "recipientUserId", js.undefined)
    
    inline def setSenderShiftId(value: NullableOption[String]): Self = StObject.set(x, "senderShiftId", value.asInstanceOf[js.Any])
    
    inline def setSenderShiftIdNull: Self = StObject.set(x, "senderShiftId", null)
    
    inline def setSenderShiftIdUndefined: Self = StObject.set(x, "senderShiftId", js.undefined)
  }
}
