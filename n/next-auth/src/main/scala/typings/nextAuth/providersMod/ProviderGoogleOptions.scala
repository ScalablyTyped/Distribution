package typings.nextAuth.providersMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ProviderGoogleOptions extends StObject {
  
  var authorizationUrl: js.UndefOr[String] = js.undefined
  
  var clientId: String
  
  var clientSecret: String
}
object ProviderGoogleOptions {
  
  inline def apply(clientId: String, clientSecret: String): ProviderGoogleOptions = {
    val __obj = js.Dynamic.literal(clientId = clientId.asInstanceOf[js.Any], clientSecret = clientSecret.asInstanceOf[js.Any])
    __obj.asInstanceOf[ProviderGoogleOptions]
  }
  
  extension [Self <: ProviderGoogleOptions](x: Self) {
    
    inline def setAuthorizationUrl(value: String): Self = StObject.set(x, "authorizationUrl", value.asInstanceOf[js.Any])
    
    inline def setAuthorizationUrlUndefined: Self = StObject.set(x, "authorizationUrl", js.undefined)
    
    inline def setClientId(value: String): Self = StObject.set(x, "clientId", value.asInstanceOf[js.Any])
    
    inline def setClientSecret(value: String): Self = StObject.set(x, "clientSecret", value.asInstanceOf[js.Any])
  }
}
