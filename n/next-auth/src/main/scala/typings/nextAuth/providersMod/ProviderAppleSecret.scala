package typings.nextAuth.providersMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ProviderAppleSecret extends StObject {
  
  var appleId: String
  
  var keyId: String
  
  var privateKey: String
  
  var teamId: String
}
object ProviderAppleSecret {
  
  inline def apply(appleId: String, keyId: String, privateKey: String, teamId: String): ProviderAppleSecret = {
    val __obj = js.Dynamic.literal(appleId = appleId.asInstanceOf[js.Any], keyId = keyId.asInstanceOf[js.Any], privateKey = privateKey.asInstanceOf[js.Any], teamId = teamId.asInstanceOf[js.Any])
    __obj.asInstanceOf[ProviderAppleSecret]
  }
  
  extension [Self <: ProviderAppleSecret](x: Self) {
    
    inline def setAppleId(value: String): Self = StObject.set(x, "appleId", value.asInstanceOf[js.Any])
    
    inline def setKeyId(value: String): Self = StObject.set(x, "keyId", value.asInstanceOf[js.Any])
    
    inline def setPrivateKey(value: String): Self = StObject.set(x, "privateKey", value.asInstanceOf[js.Any])
    
    inline def setTeamId(value: String): Self = StObject.set(x, "teamId", value.asInstanceOf[js.Any])
  }
}
