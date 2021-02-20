package typings.nodeTelegramBotApi.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait EncryptedCredentials extends StObject {
  
  var data: String = js.native
  
  var hash: String = js.native
  
  var secret: String = js.native
}
object EncryptedCredentials {
  
  @scala.inline
  def apply(data: String, hash: String, secret: String): EncryptedCredentials = {
    val __obj = js.Dynamic.literal(data = data.asInstanceOf[js.Any], hash = hash.asInstanceOf[js.Any], secret = secret.asInstanceOf[js.Any])
    __obj.asInstanceOf[EncryptedCredentials]
  }
  
  @scala.inline
  implicit class EncryptedCredentialsMutableBuilder[Self <: EncryptedCredentials] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setData(value: String): Self = StObject.set(x, "data", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setHash(value: String): Self = StObject.set(x, "hash", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSecret(value: String): Self = StObject.set(x, "secret", value.asInstanceOf[js.Any])
  }
}
