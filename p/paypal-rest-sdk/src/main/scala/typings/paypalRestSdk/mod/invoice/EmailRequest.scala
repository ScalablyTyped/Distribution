package typings.paypalRestSdk.mod.invoice

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait EmailRequest extends StObject {
  
  var cc_emails: js.UndefOr[js.Array[String]] = js.undefined
  
  var note: js.UndefOr[String] = js.undefined
  
  var send_to_merchant: js.UndefOr[Boolean] = js.undefined
  
  var send_to_payer: js.UndefOr[Boolean] = js.undefined
  
  var subject: js.UndefOr[String] = js.undefined
}
object EmailRequest {
  
  inline def apply(): EmailRequest = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[EmailRequest]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: EmailRequest] (val x: Self) extends AnyVal {
    
    inline def setCc_emails(value: js.Array[String]): Self = StObject.set(x, "cc_emails", value.asInstanceOf[js.Any])
    
    inline def setCc_emailsUndefined: Self = StObject.set(x, "cc_emails", js.undefined)
    
    inline def setCc_emailsVarargs(value: String*): Self = StObject.set(x, "cc_emails", js.Array(value*))
    
    inline def setNote(value: String): Self = StObject.set(x, "note", value.asInstanceOf[js.Any])
    
    inline def setNoteUndefined: Self = StObject.set(x, "note", js.undefined)
    
    inline def setSend_to_merchant(value: Boolean): Self = StObject.set(x, "send_to_merchant", value.asInstanceOf[js.Any])
    
    inline def setSend_to_merchantUndefined: Self = StObject.set(x, "send_to_merchant", js.undefined)
    
    inline def setSend_to_payer(value: Boolean): Self = StObject.set(x, "send_to_payer", value.asInstanceOf[js.Any])
    
    inline def setSend_to_payerUndefined: Self = StObject.set(x, "send_to_payer", js.undefined)
    
    inline def setSubject(value: String): Self = StObject.set(x, "subject", value.asInstanceOf[js.Any])
    
    inline def setSubjectUndefined: Self = StObject.set(x, "subject", js.undefined)
  }
}
