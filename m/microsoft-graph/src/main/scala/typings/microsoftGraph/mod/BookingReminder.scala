package typings.microsoftGraph.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait BookingReminder extends StObject {
  
  // The message in the reminder.
  var message: js.UndefOr[String] = js.undefined
  
  /**
    * The amount of time before the start of an appointment that the reminder should be sent. It's denoted in ISO 8601
    * format.
    */
  var offset: js.UndefOr[String] = js.undefined
  
  // The persons who should receive the reminder. Possible values are: allAttendees, staff, customer, unknownFutureValue.
  var recipients: js.UndefOr[BookingReminderRecipients] = js.undefined
}
object BookingReminder {
  
  inline def apply(): BookingReminder = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[BookingReminder]
  }
  
  extension [Self <: BookingReminder](x: Self) {
    
    inline def setMessage(value: String): Self = StObject.set(x, "message", value.asInstanceOf[js.Any])
    
    inline def setMessageUndefined: Self = StObject.set(x, "message", js.undefined)
    
    inline def setOffset(value: String): Self = StObject.set(x, "offset", value.asInstanceOf[js.Any])
    
    inline def setOffsetUndefined: Self = StObject.set(x, "offset", js.undefined)
    
    inline def setRecipients(value: BookingReminderRecipients): Self = StObject.set(x, "recipients", value.asInstanceOf[js.Any])
    
    inline def setRecipientsUndefined: Self = StObject.set(x, "recipients", js.undefined)
  }
}
