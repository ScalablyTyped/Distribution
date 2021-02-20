package typings.nextAuth.providersMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ProviderAppleOptions extends StObject {
  
  var clientId: String = js.native
  
  var clientSecret: ProviderAppleSecret = js.native
}
object ProviderAppleOptions {
  
  @scala.inline
  def apply(clientId: String, clientSecret: ProviderAppleSecret): ProviderAppleOptions = {
    val __obj = js.Dynamic.literal(clientId = clientId.asInstanceOf[js.Any], clientSecret = clientSecret.asInstanceOf[js.Any])
    __obj.asInstanceOf[ProviderAppleOptions]
  }
  
  @scala.inline
  implicit class ProviderAppleOptionsMutableBuilder[Self <: ProviderAppleOptions] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setClientId(value: String): Self = StObject.set(x, "clientId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setClientSecret(value: ProviderAppleSecret): Self = StObject.set(x, "clientSecret", value.asInstanceOf[js.Any])
  }
}
