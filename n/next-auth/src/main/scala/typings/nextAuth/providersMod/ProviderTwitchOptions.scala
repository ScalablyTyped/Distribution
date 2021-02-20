package typings.nextAuth.providersMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ProviderTwitchOptions extends StObject {
  
  var clientId: String = js.native
  
  var clientSecret: String = js.native
}
object ProviderTwitchOptions {
  
  @scala.inline
  def apply(clientId: String, clientSecret: String): ProviderTwitchOptions = {
    val __obj = js.Dynamic.literal(clientId = clientId.asInstanceOf[js.Any], clientSecret = clientSecret.asInstanceOf[js.Any])
    __obj.asInstanceOf[ProviderTwitchOptions]
  }
  
  @scala.inline
  implicit class ProviderTwitchOptionsMutableBuilder[Self <: ProviderTwitchOptions] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setClientId(value: String): Self = StObject.set(x, "clientId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setClientSecret(value: String): Self = StObject.set(x, "clientSecret", value.asInstanceOf[js.Any])
  }
}
