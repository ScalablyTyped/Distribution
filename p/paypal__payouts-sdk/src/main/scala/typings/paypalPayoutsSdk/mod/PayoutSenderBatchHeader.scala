package typings.paypalPayoutsSdk.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait PayoutSenderBatchHeader extends StObject {
  
  var email_message: js.UndefOr[String] = js.undefined
  
  var email_subject: js.UndefOr[String] = js.undefined
  
  var recipient_type: js.UndefOr[RecipientType] = js.undefined
  
  var sender_batch_id: js.UndefOr[String] = js.undefined
}
object PayoutSenderBatchHeader {
  
  inline def apply(): PayoutSenderBatchHeader = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PayoutSenderBatchHeader]
  }
  
  extension [Self <: PayoutSenderBatchHeader](x: Self) {
    
    inline def setEmail_message(value: String): Self = StObject.set(x, "email_message", value.asInstanceOf[js.Any])
    
    inline def setEmail_messageUndefined: Self = StObject.set(x, "email_message", js.undefined)
    
    inline def setEmail_subject(value: String): Self = StObject.set(x, "email_subject", value.asInstanceOf[js.Any])
    
    inline def setEmail_subjectUndefined: Self = StObject.set(x, "email_subject", js.undefined)
    
    inline def setRecipient_type(value: RecipientType): Self = StObject.set(x, "recipient_type", value.asInstanceOf[js.Any])
    
    inline def setRecipient_typeUndefined: Self = StObject.set(x, "recipient_type", js.undefined)
    
    inline def setSender_batch_id(value: String): Self = StObject.set(x, "sender_batch_id", value.asInstanceOf[js.Any])
    
    inline def setSender_batch_idUndefined: Self = StObject.set(x, "sender_batch_id", js.undefined)
  }
}
