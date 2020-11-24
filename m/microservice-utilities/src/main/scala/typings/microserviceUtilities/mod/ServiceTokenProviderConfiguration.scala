package typings.microserviceUtilities.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ServiceTokenProviderConfiguration extends js.Object {
  
  var audience: String = js.native
  
  var clientId: String = js.native
  
  var encryptedClientSecret: String = js.native
  
  var tokenEndpoint: String = js.native
}
object ServiceTokenProviderConfiguration {
  
  @scala.inline
  def apply(audience: String, clientId: String, encryptedClientSecret: String, tokenEndpoint: String): ServiceTokenProviderConfiguration = {
    val __obj = js.Dynamic.literal(audience = audience.asInstanceOf[js.Any], clientId = clientId.asInstanceOf[js.Any], encryptedClientSecret = encryptedClientSecret.asInstanceOf[js.Any], tokenEndpoint = tokenEndpoint.asInstanceOf[js.Any])
    __obj.asInstanceOf[ServiceTokenProviderConfiguration]
  }
  
  @scala.inline
  implicit class ServiceTokenProviderConfigurationOps[Self <: ServiceTokenProviderConfiguration] (val x: Self) extends AnyVal {
    
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
    def setAudience(value: String): Self = this.set("audience", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setClientId(value: String): Self = this.set("clientId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setEncryptedClientSecret(value: String): Self = this.set("encryptedClientSecret", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTokenEndpoint(value: String): Self = this.set("tokenEndpoint", value.asInstanceOf[js.Any])
  }
}
