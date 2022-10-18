package typings.nextAuth.anon

import typings.nextAuth.providersOauthMod.OAuthConfig
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Client[P] extends StObject {
  
  /** `openid-client` Client */
  var client: typings.nextAuth.providersOauthMod.Client
  
  /** Provider is passed for convenience, ans also contains the `callbackUrl`. */
  var provider: OAuthConfig[P] & SigninUrl
}
object Client {
  
  inline def apply[P](client: typings.nextAuth.providersOauthMod.Client, provider: OAuthConfig[P] & SigninUrl): Client[P] = {
    val __obj = js.Dynamic.literal(client = client.asInstanceOf[js.Any], provider = provider.asInstanceOf[js.Any])
    __obj.asInstanceOf[Client[P]]
  }
  
  extension [Self <: Client[?], P](x: Self & Client[P]) {
    
    inline def setClient(value: typings.nextAuth.providersOauthMod.Client): Self = StObject.set(x, "client", value.asInstanceOf[js.Any])
    
    inline def setProvider(value: OAuthConfig[P] & SigninUrl): Self = StObject.set(x, "provider", value.asInstanceOf[js.Any])
  }
}
