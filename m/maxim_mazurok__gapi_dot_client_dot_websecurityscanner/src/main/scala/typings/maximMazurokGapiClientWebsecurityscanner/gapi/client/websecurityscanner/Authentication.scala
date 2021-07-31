package typings.maximMazurokGapiClientWebsecurityscanner.gapi.client.websecurityscanner

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Authentication extends StObject {
  
  /** Authentication using a custom account. */
  var customAccount: js.UndefOr[CustomAccount] = js.undefined
  
  /** Authentication using a Google account. */
  var googleAccount: js.UndefOr[GoogleAccount] = js.undefined
  
  /** Authentication using Identity-Aware-Proxy (IAP). */
  var iapCredential: js.UndefOr[IapCredential] = js.undefined
}
object Authentication {
  
  @scala.inline
  def apply(): Authentication = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Authentication]
  }
  
  @scala.inline
  implicit class AuthenticationMutableBuilder[Self <: Authentication] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setCustomAccount(value: CustomAccount): Self = StObject.set(x, "customAccount", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCustomAccountUndefined: Self = StObject.set(x, "customAccount", js.undefined)
    
    @scala.inline
    def setGoogleAccount(value: GoogleAccount): Self = StObject.set(x, "googleAccount", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setGoogleAccountUndefined: Self = StObject.set(x, "googleAccount", js.undefined)
    
    @scala.inline
    def setIapCredential(value: IapCredential): Self = StObject.set(x, "iapCredential", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIapCredentialUndefined: Self = StObject.set(x, "iapCredential", js.undefined)
  }
}
