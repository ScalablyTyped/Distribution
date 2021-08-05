package typings.nextAuth.providersMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ProviderAppleOptions extends StObject {
  
  var clientId: String
  
  var clientSecret: ProviderAppleSecret
}
object ProviderAppleOptions {
  
  inline def apply(clientId: String, clientSecret: ProviderAppleSecret): ProviderAppleOptions = {
    val __obj = js.Dynamic.literal(clientId = clientId.asInstanceOf[js.Any], clientSecret = clientSecret.asInstanceOf[js.Any])
    __obj.asInstanceOf[ProviderAppleOptions]
  }
  
  extension [Self <: ProviderAppleOptions](x: Self) {
    
    inline def setClientId(value: String): Self = StObject.set(x, "clientId", value.asInstanceOf[js.Any])
    
    inline def setClientSecret(value: ProviderAppleSecret): Self = StObject.set(x, "clientSecret", value.asInstanceOf[js.Any])
  }
}
