package typings.nextAuth.providersMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ProviderYandexOptions extends StObject {
  
  var clientId: String
  
  var clientSecret: String
}
object ProviderYandexOptions {
  
  @scala.inline
  def apply(clientId: String, clientSecret: String): ProviderYandexOptions = {
    val __obj = js.Dynamic.literal(clientId = clientId.asInstanceOf[js.Any], clientSecret = clientSecret.asInstanceOf[js.Any])
    __obj.asInstanceOf[ProviderYandexOptions]
  }
  
  @scala.inline
  implicit class ProviderYandexOptionsMutableBuilder[Self <: ProviderYandexOptions] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setClientId(value: String): Self = StObject.set(x, "clientId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setClientSecret(value: String): Self = StObject.set(x, "clientSecret", value.asInstanceOf[js.Any])
  }
}
