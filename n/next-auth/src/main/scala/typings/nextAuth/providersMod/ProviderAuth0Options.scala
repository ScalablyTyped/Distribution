package typings.nextAuth.providersMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ProviderAuth0Options extends StObject {
  
  var clientId: String
  
  var clientSecret: String
  
  var domain: String
}
object ProviderAuth0Options {
  
  @scala.inline
  def apply(clientId: String, clientSecret: String, domain: String): ProviderAuth0Options = {
    val __obj = js.Dynamic.literal(clientId = clientId.asInstanceOf[js.Any], clientSecret = clientSecret.asInstanceOf[js.Any], domain = domain.asInstanceOf[js.Any])
    __obj.asInstanceOf[ProviderAuth0Options]
  }
  
  @scala.inline
  implicit class ProviderAuth0OptionsMutableBuilder[Self <: ProviderAuth0Options] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setClientId(value: String): Self = StObject.set(x, "clientId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setClientSecret(value: String): Self = StObject.set(x, "clientSecret", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDomain(value: String): Self = StObject.set(x, "domain", value.asInstanceOf[js.Any])
  }
}
