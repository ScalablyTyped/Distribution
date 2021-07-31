package typings.maximMazurokGapiClientIdentitytoolkit.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DisplayName extends StObject {
  
  /** The user's display name at the IDP. */
  var displayName: js.UndefOr[String] = js.undefined
  
  /** User's identifier at IDP. */
  var federatedId: js.UndefOr[String] = js.undefined
  
  /** The user's photo url at the IDP. */
  var photoUrl: js.UndefOr[String] = js.undefined
  
  /** The IdP ID. For whitelisted IdPs it's a short domain name, e.g., google.com, aol.com, live.net and yahoo.com. For other OpenID IdPs it's the OP identifier. */
  var providerId: js.UndefOr[String] = js.undefined
}
object DisplayName {
  
  @scala.inline
  def apply(): DisplayName = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DisplayName]
  }
  
  @scala.inline
  implicit class DisplayNameMutableBuilder[Self <: DisplayName] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setDisplayName(value: String): Self = StObject.set(x, "displayName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDisplayNameUndefined: Self = StObject.set(x, "displayName", js.undefined)
    
    @scala.inline
    def setFederatedId(value: String): Self = StObject.set(x, "federatedId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFederatedIdUndefined: Self = StObject.set(x, "federatedId", js.undefined)
    
    @scala.inline
    def setPhotoUrl(value: String): Self = StObject.set(x, "photoUrl", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPhotoUrlUndefined: Self = StObject.set(x, "photoUrl", js.undefined)
    
    @scala.inline
    def setProviderId(value: String): Self = StObject.set(x, "providerId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setProviderIdUndefined: Self = StObject.set(x, "providerId", js.undefined)
  }
}
