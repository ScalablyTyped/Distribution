package typings.nextAuth.providersMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ProviderBattleNetOptions extends StObject {
  
  var clientId: String
  
  var clientSecret: String
  
  var region: String
}
object ProviderBattleNetOptions {
  
  @scala.inline
  def apply(clientId: String, clientSecret: String, region: String): ProviderBattleNetOptions = {
    val __obj = js.Dynamic.literal(clientId = clientId.asInstanceOf[js.Any], clientSecret = clientSecret.asInstanceOf[js.Any], region = region.asInstanceOf[js.Any])
    __obj.asInstanceOf[ProviderBattleNetOptions]
  }
  
  @scala.inline
  implicit class ProviderBattleNetOptionsMutableBuilder[Self <: ProviderBattleNetOptions] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setClientId(value: String): Self = StObject.set(x, "clientId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setClientSecret(value: String): Self = StObject.set(x, "clientSecret", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRegion(value: String): Self = StObject.set(x, "region", value.asInstanceOf[js.Any])
  }
}
