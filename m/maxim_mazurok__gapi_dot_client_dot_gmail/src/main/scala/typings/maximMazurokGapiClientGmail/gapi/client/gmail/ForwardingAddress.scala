package typings.maximMazurokGapiClientGmail.gapi.client.gmail

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ForwardingAddress extends StObject {
  
  /** An email address to which messages can be forwarded. */
  var forwardingEmail: js.UndefOr[String] = js.undefined
  
  /** Indicates whether this address has been verified and is usable for forwarding. Read-only. */
  var verificationStatus: js.UndefOr[String] = js.undefined
}
object ForwardingAddress {
  
  inline def apply(): ForwardingAddress = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ForwardingAddress]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: ForwardingAddress] (val x: Self) extends AnyVal {
    
    inline def setForwardingEmail(value: String): Self = StObject.set(x, "forwardingEmail", value.asInstanceOf[js.Any])
    
    inline def setForwardingEmailUndefined: Self = StObject.set(x, "forwardingEmail", js.undefined)
    
    inline def setVerificationStatus(value: String): Self = StObject.set(x, "verificationStatus", value.asInstanceOf[js.Any])
    
    inline def setVerificationStatusUndefined: Self = StObject.set(x, "verificationStatus", js.undefined)
  }
}
