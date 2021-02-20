package typings.openpgp.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined openpgp.openpgp.EncryptResult & {  message :openpgp.openpgp.message.Message} */
@js.native
trait EncryptResultmessageMessa extends StObject {
  
  var message: typings.openpgp.mod.message.Message = js.native
  
  var sessionKey: AeadAlgorithm = js.native
}
object EncryptResultmessageMessa {
  
  @scala.inline
  def apply(message: typings.openpgp.mod.message.Message, sessionKey: AeadAlgorithm): EncryptResultmessageMessa = {
    val __obj = js.Dynamic.literal(message = message.asInstanceOf[js.Any], sessionKey = sessionKey.asInstanceOf[js.Any])
    __obj.asInstanceOf[EncryptResultmessageMessa]
  }
  
  @scala.inline
  implicit class EncryptResultmessageMessaMutableBuilder[Self <: EncryptResultmessageMessa] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setMessage(value: typings.openpgp.mod.message.Message): Self = StObject.set(x, "message", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSessionKey(value: AeadAlgorithm): Self = StObject.set(x, "sessionKey", value.asInstanceOf[js.Any])
  }
}
