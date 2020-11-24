package typings.nextAuth.providersMod

import typings.nextAuth.nextAuthStrings.`identity-server4`
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ProviderIS4Options extends js.Object {
  
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
  implicit class ProviderIS4OptionsOps[Self <: ProviderIS4Options] (val x: Self) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setClientId(value: String): Self = this.set("clientId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setClientSecret(value: String): Self = this.set("clientSecret", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDomain(value: String): Self = this.set("domain", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setId(value: `identity-server4`): Self = this.set("id", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setName(value: typings.nextAuth.nextAuthStrings.IdentityServer4): Self = this.set("name", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setScope(value: String): Self = this.set("scope", value.asInstanceOf[js.Any])
  }
}
