package typings.maximMazurokGapiClientIap.gapi.client.iap

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait IdentityAwareProxyClient extends StObject {
  
  /** Human-friendly name given to the OAuth client. */
  var displayName: js.UndefOr[String] = js.native
  
  /** Output only. Unique identifier of the OAuth client. */
  var name: js.UndefOr[String] = js.native
  
  /** Output only. Client secret of the OAuth client. */
  var secret: js.UndefOr[String] = js.native
}
object IdentityAwareProxyClient {
  
  @scala.inline
  def apply(): IdentityAwareProxyClient = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[IdentityAwareProxyClient]
  }
  
  @scala.inline
  implicit class IdentityAwareProxyClientMutableBuilder[Self <: IdentityAwareProxyClient] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setDisplayName(value: String): Self = StObject.set(x, "displayName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDisplayNameUndefined: Self = StObject.set(x, "displayName", js.undefined)
    
    @scala.inline
    def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
    
    @scala.inline
    def setSecret(value: String): Self = StObject.set(x, "secret", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSecretUndefined: Self = StObject.set(x, "secret", js.undefined)
  }
}
