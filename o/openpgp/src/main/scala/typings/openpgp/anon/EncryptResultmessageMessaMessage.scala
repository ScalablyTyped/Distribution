package typings.openpgp.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined openpgp.openpgp.EncryptResult & {  message :openpgp.openpgp.message.Message,   signature :openpgp.openpgp.signature.Signature} */
@js.native
trait EncryptResultmessageMessaMessage extends StObject {
  
  var message: typings.openpgp.mod.message.Message = js.native
  
  var sessionKey: AeadAlgorithm = js.native
  
  var signature: typings.openpgp.mod.signature.Signature = js.native
}
object EncryptResultmessageMessaMessage {
  
  @scala.inline
  def apply(
    message: typings.openpgp.mod.message.Message,
    sessionKey: AeadAlgorithm,
    signature: typings.openpgp.mod.signature.Signature
  ): EncryptResultmessageMessaMessage = {
    val __obj = js.Dynamic.literal(message = message.asInstanceOf[js.Any], sessionKey = sessionKey.asInstanceOf[js.Any], signature = signature.asInstanceOf[js.Any])
    __obj.asInstanceOf[EncryptResultmessageMessaMessage]
  }
  
  @scala.inline
  implicit class EncryptResultmessageMessaMessageMutableBuilder[Self <: EncryptResultmessageMessaMessage] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setMessage(value: typings.openpgp.mod.message.Message): Self = StObject.set(x, "message", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSessionKey(value: AeadAlgorithm): Self = StObject.set(x, "sessionKey", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSignature(value: typings.openpgp.mod.signature.Signature): Self = StObject.set(x, "signature", value.asInstanceOf[js.Any])
  }
}
