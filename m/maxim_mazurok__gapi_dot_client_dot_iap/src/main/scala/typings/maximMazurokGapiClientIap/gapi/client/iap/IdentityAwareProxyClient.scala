package typings.maximMazurokGapiClientIap.gapi.client.iap

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait IdentityAwareProxyClient extends StObject {
  
  /** Human-friendly name given to the OAuth client. */
  var displayName: js.UndefOr[String] = js.undefined
  
  /** Output only. Unique identifier of the OAuth client. */
  var name: js.UndefOr[String] = js.undefined
  
  /** Output only. Client secret of the OAuth client. */
  var secret: js.UndefOr[String] = js.undefined
}
object IdentityAwareProxyClient {
  
  inline def apply(): IdentityAwareProxyClient = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[IdentityAwareProxyClient]
  }
  
  extension [Self <: IdentityAwareProxyClient](x: Self) {
    
    inline def setDisplayName(value: String): Self = StObject.set(x, "displayName", value.asInstanceOf[js.Any])
    
    inline def setDisplayNameUndefined: Self = StObject.set(x, "displayName", js.undefined)
    
    inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    inline def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
    
    inline def setSecret(value: String): Self = StObject.set(x, "secret", value.asInstanceOf[js.Any])
    
    inline def setSecretUndefined: Self = StObject.set(x, "secret", js.undefined)
  }
}
