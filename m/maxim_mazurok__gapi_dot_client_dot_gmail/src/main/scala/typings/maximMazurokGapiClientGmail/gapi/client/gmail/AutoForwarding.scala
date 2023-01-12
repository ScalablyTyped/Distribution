package typings.maximMazurokGapiClientGmail.gapi.client.gmail

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait AutoForwarding extends StObject {
  
  /** The state that a message should be left in after it has been forwarded. */
  var disposition: js.UndefOr[String] = js.undefined
  
  /** Email address to which all incoming messages are forwarded. This email address must be a verified member of the forwarding addresses. */
  var emailAddress: js.UndefOr[String] = js.undefined
  
  /** Whether all incoming mail is automatically forwarded to another address. */
  var enabled: js.UndefOr[Boolean] = js.undefined
}
object AutoForwarding {
  
  inline def apply(): AutoForwarding = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[AutoForwarding]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: AutoForwarding] (val x: Self) extends AnyVal {
    
    inline def setDisposition(value: String): Self = StObject.set(x, "disposition", value.asInstanceOf[js.Any])
    
    inline def setDispositionUndefined: Self = StObject.set(x, "disposition", js.undefined)
    
    inline def setEmailAddress(value: String): Self = StObject.set(x, "emailAddress", value.asInstanceOf[js.Any])
    
    inline def setEmailAddressUndefined: Self = StObject.set(x, "emailAddress", js.undefined)
    
    inline def setEnabled(value: Boolean): Self = StObject.set(x, "enabled", value.asInstanceOf[js.Any])
    
    inline def setEnabledUndefined: Self = StObject.set(x, "enabled", js.undefined)
  }
}
