package typings.nodeTelegramBotApi.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait EncryptedCredentials extends StObject {
  
  var data: String
  
  var hash: String
  
  var secret: String
}
object EncryptedCredentials {
  
  inline def apply(data: String, hash: String, secret: String): EncryptedCredentials = {
    val __obj = js.Dynamic.literal(data = data.asInstanceOf[js.Any], hash = hash.asInstanceOf[js.Any], secret = secret.asInstanceOf[js.Any])
    __obj.asInstanceOf[EncryptedCredentials]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: EncryptedCredentials] (val x: Self) extends AnyVal {
    
    inline def setData(value: String): Self = StObject.set(x, "data", value.asInstanceOf[js.Any])
    
    inline def setHash(value: String): Self = StObject.set(x, "hash", value.asInstanceOf[js.Any])
    
    inline def setSecret(value: String): Self = StObject.set(x, "secret", value.asInstanceOf[js.Any])
  }
}
