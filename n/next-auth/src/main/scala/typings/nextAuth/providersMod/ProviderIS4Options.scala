package typings.nextAuth.providersMod

import typings.nextAuth.nextAuthStrings.`identity-server4`
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ProviderIS4Options extends StObject {
  
  var clientId: String
  
  var clientSecret: String
  
  var domain: String
  
  var id: `identity-server4`
  
  var name: typings.nextAuth.nextAuthStrings.IdentityServer4
  
  var scope: String
}
object ProviderIS4Options {
  
  inline def apply(clientId: String, clientSecret: String, domain: String, scope: String): ProviderIS4Options = {
    val __obj = js.Dynamic.literal(clientId = clientId.asInstanceOf[js.Any], clientSecret = clientSecret.asInstanceOf[js.Any], domain = domain.asInstanceOf[js.Any], id = "identity-server4", name = "IdentityServer4", scope = scope.asInstanceOf[js.Any])
    __obj.asInstanceOf[ProviderIS4Options]
  }
  
  extension [Self <: ProviderIS4Options](x: Self) {
    
    inline def setClientId(value: String): Self = StObject.set(x, "clientId", value.asInstanceOf[js.Any])
    
    inline def setClientSecret(value: String): Self = StObject.set(x, "clientSecret", value.asInstanceOf[js.Any])
    
    inline def setDomain(value: String): Self = StObject.set(x, "domain", value.asInstanceOf[js.Any])
    
    inline def setId(value: `identity-server4`): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
    
    inline def setName(value: typings.nextAuth.nextAuthStrings.IdentityServer4): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    inline def setScope(value: String): Self = StObject.set(x, "scope", value.asInstanceOf[js.Any])
  }
}
