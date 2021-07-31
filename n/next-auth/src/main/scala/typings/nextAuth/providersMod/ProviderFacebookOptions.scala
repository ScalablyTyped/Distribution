package typings.nextAuth.providersMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ProviderFacebookOptions extends StObject {
  
  var clientId: String
  
  var clientSecret: String
}
object ProviderFacebookOptions {
  
  @scala.inline
  def apply(clientId: String, clientSecret: String): ProviderFacebookOptions = {
    val __obj = js.Dynamic.literal(clientId = clientId.asInstanceOf[js.Any], clientSecret = clientSecret.asInstanceOf[js.Any])
    __obj.asInstanceOf[ProviderFacebookOptions]
  }
  
  @scala.inline
  implicit class ProviderFacebookOptionsMutableBuilder[Self <: ProviderFacebookOptions] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setClientId(value: String): Self = StObject.set(x, "clientId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setClientSecret(value: String): Self = StObject.set(x, "clientSecret", value.asInstanceOf[js.Any])
  }
}
