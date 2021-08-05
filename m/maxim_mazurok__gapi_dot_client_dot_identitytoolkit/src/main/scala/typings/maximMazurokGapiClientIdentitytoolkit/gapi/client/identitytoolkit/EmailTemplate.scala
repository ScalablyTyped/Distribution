package typings.maximMazurokGapiClientIdentitytoolkit.gapi.client.identitytoolkit

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait EmailTemplate extends StObject {
  
  /** Email body. */
  var body: js.UndefOr[String] = js.undefined
  
  /** Email body format. */
  var format: js.UndefOr[String] = js.undefined
  
  /** From address of the email. */
  var from: js.UndefOr[String] = js.undefined
  
  /** From display name. */
  var fromDisplayName: js.UndefOr[String] = js.undefined
  
  /** Reply-to address. */
  var replyTo: js.UndefOr[String] = js.undefined
  
  /** Subject of the email. */
  var subject: js.UndefOr[String] = js.undefined
}
object EmailTemplate {
  
  inline def apply(): EmailTemplate = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[EmailTemplate]
  }
  
  extension [Self <: EmailTemplate](x: Self) {
    
    inline def setBody(value: String): Self = StObject.set(x, "body", value.asInstanceOf[js.Any])
    
    inline def setBodyUndefined: Self = StObject.set(x, "body", js.undefined)
    
    inline def setFormat(value: String): Self = StObject.set(x, "format", value.asInstanceOf[js.Any])
    
    inline def setFormatUndefined: Self = StObject.set(x, "format", js.undefined)
    
    inline def setFrom(value: String): Self = StObject.set(x, "from", value.asInstanceOf[js.Any])
    
    inline def setFromDisplayName(value: String): Self = StObject.set(x, "fromDisplayName", value.asInstanceOf[js.Any])
    
    inline def setFromDisplayNameUndefined: Self = StObject.set(x, "fromDisplayName", js.undefined)
    
    inline def setFromUndefined: Self = StObject.set(x, "from", js.undefined)
    
    inline def setReplyTo(value: String): Self = StObject.set(x, "replyTo", value.asInstanceOf[js.Any])
    
    inline def setReplyToUndefined: Self = StObject.set(x, "replyTo", js.undefined)
    
    inline def setSubject(value: String): Self = StObject.set(x, "subject", value.asInstanceOf[js.Any])
    
    inline def setSubjectUndefined: Self = StObject.set(x, "subject", js.undefined)
  }
}
