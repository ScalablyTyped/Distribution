package typings.maximMazurokGapiClientGmail.gapi.client.gmail

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Delegate extends StObject {
  
  /** The email address of the delegate. */
  var delegateEmail: js.UndefOr[String] = js.undefined
  
  /** Indicates whether this address has been verified and can act as a delegate for the account. Read-only. */
  var verificationStatus: js.UndefOr[String] = js.undefined
}
object Delegate {
  
  @scala.inline
  def apply(): Delegate = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Delegate]
  }
  
  @scala.inline
  implicit class DelegateMutableBuilder[Self <: Delegate] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setDelegateEmail(value: String): Self = StObject.set(x, "delegateEmail", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDelegateEmailUndefined: Self = StObject.set(x, "delegateEmail", js.undefined)
    
    @scala.inline
    def setVerificationStatus(value: String): Self = StObject.set(x, "verificationStatus", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setVerificationStatusUndefined: Self = StObject.set(x, "verificationStatus", js.undefined)
  }
}
