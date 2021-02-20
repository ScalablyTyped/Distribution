package typings.nextAuth.providersMod

import typings.nextAuth.nextAuthStrings.`identity-server4`
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ProviderIS4Options extends StObject {
  
  var clientId: String = js.native
  
  var clientSecret: String = js.native
  
  var domain: String = js.native
  
  var id: `identity-server4` = js.native
  
  var name: typings.nextAuth.nextAuthStrings.IdentityServer4 = js.native
  
  var scope: String = js.native
}
object ProviderIS4Options {
  
  @scala.inline
  def apply(
    clientId: String,
    clientSecret: String,
    domain: String,
    id: `identity-server4`,
    name: typings.nextAuth.nextAuthStrings.IdentityServer4,
    scope: String
  ): ProviderIS4Options = {
    val __obj = js.Dynamic.literal(clientId = clientId.asInstanceOf[js.Any], clientSecret = clientSecret.asInstanceOf[js.Any], domain = domain.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], scope = scope.asInstanceOf[js.Any])
    __obj.asInstanceOf[ProviderIS4Options]
  }
  
  @scala.inline
  implicit class ProviderIS4OptionsMutableBuilder[Self <: ProviderIS4Options] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setClientId(value: String): Self = StObject.set(x, "clientId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setClientSecret(value: String): Self = StObject.set(x, "clientSecret", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDomain(value: String): Self = StObject.set(x, "domain", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setId(value: `identity-server4`): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setName(value: typings.nextAuth.nextAuthStrings.IdentityServer4): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setScope(value: String): Self = StObject.set(x, "scope", value.asInstanceOf[js.Any])
  }
}
