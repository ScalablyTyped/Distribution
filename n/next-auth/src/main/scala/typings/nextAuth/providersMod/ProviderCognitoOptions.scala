package typings.nextAuth.providersMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ProviderCognitoOptions extends StObject {
  
  var clientId: String
  
  var clientSecret: String
  
  var domain: String
}
object ProviderCognitoOptions {
  
  @scala.inline
  def apply(clientId: String, clientSecret: String, domain: String): ProviderCognitoOptions = {
    val __obj = js.Dynamic.literal(clientId = clientId.asInstanceOf[js.Any], clientSecret = clientSecret.asInstanceOf[js.Any], domain = domain.asInstanceOf[js.Any])
    __obj.asInstanceOf[ProviderCognitoOptions]
  }
  
  @scala.inline
  implicit class ProviderCognitoOptionsMutableBuilder[Self <: ProviderCognitoOptions] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setClientId(value: String): Self = StObject.set(x, "clientId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setClientSecret(value: String): Self = StObject.set(x, "clientSecret", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDomain(value: String): Self = StObject.set(x, "domain", value.asInstanceOf[js.Any])
  }
}
