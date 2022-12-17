package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StringDictionary
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Dictkey
  extends StObject
     with /* key */ StringDictionary[Any] {
  
  var client_id: String
  
  var client_secret: String
  
  var pem: String
  
  var webhook_secret: String | Null
}
object Dictkey {
  
  inline def apply(client_id: String, client_secret: String, pem: String): Dictkey = {
    val __obj = js.Dynamic.literal(client_id = client_id.asInstanceOf[js.Any], client_secret = client_secret.asInstanceOf[js.Any], pem = pem.asInstanceOf[js.Any], webhook_secret = null)
    __obj.asInstanceOf[Dictkey]
  }
  
  extension [Self <: Dictkey](x: Self) {
    
    inline def setClient_id(value: String): Self = StObject.set(x, "client_id", value.asInstanceOf[js.Any])
    
    inline def setClient_secret(value: String): Self = StObject.set(x, "client_secret", value.asInstanceOf[js.Any])
    
    inline def setPem(value: String): Self = StObject.set(x, "pem", value.asInstanceOf[js.Any])
    
    inline def setWebhook_secret(value: String): Self = StObject.set(x, "webhook_secret", value.asInstanceOf[js.Any])
    
    inline def setWebhook_secretNull: Self = StObject.set(x, "webhook_secret", null)
  }
}
