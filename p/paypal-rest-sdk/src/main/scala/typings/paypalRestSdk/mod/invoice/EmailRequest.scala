package typings.paypalRestSdk.mod.invoice

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait EmailRequest extends StObject {
  
  var cc_emails: js.UndefOr[js.Array[String]] = js.native
  
  var note: js.UndefOr[String] = js.native
  
  var send_to_merchant: js.UndefOr[Boolean] = js.native
  
  var send_to_payer: js.UndefOr[Boolean] = js.native
  
  var subject: js.UndefOr[String] = js.native
}
object EmailRequest {
  
  @scala.inline
  def apply(): EmailRequest = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[EmailRequest]
  }
  
  @scala.inline
  implicit class EmailRequestMutableBuilder[Self <: EmailRequest] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setCc_emails(value: js.Array[String]): Self = StObject.set(x, "cc_emails", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCc_emailsUndefined: Self = StObject.set(x, "cc_emails", js.undefined)
    
    @scala.inline
    def setCc_emailsVarargs(value: String*): Self = StObject.set(x, "cc_emails", js.Array(value :_*))
    
    @scala.inline
    def setNote(value: String): Self = StObject.set(x, "note", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNoteUndefined: Self = StObject.set(x, "note", js.undefined)
    
    @scala.inline
    def setSend_to_merchant(value: Boolean): Self = StObject.set(x, "send_to_merchant", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSend_to_merchantUndefined: Self = StObject.set(x, "send_to_merchant", js.undefined)
    
    @scala.inline
    def setSend_to_payer(value: Boolean): Self = StObject.set(x, "send_to_payer", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSend_to_payerUndefined: Self = StObject.set(x, "send_to_payer", js.undefined)
    
    @scala.inline
    def setSubject(value: String): Self = StObject.set(x, "subject", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSubjectUndefined: Self = StObject.set(x, "subject", js.undefined)
  }
}
