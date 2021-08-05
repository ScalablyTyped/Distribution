package typings.openpgp.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined openpgp.openpgp.EncryptResult & {  message :openpgp.openpgp.message.Message,   signature :openpgp.openpgp.signature.Signature} */
trait EncryptResultmessageMessaMessage extends StObject {
  
  var message: typings.openpgp.mod.message.Message
  
  var sessionKey: AeadAlgorithm
  
  var signature: typings.openpgp.mod.signature.Signature
}
object EncryptResultmessageMessaMessage {
  
  inline def apply(
    message: typings.openpgp.mod.message.Message,
    sessionKey: AeadAlgorithm,
    signature: typings.openpgp.mod.signature.Signature
  ): EncryptResultmessageMessaMessage = {
    val __obj = js.Dynamic.literal(message = message.asInstanceOf[js.Any], sessionKey = sessionKey.asInstanceOf[js.Any], signature = signature.asInstanceOf[js.Any])
    __obj.asInstanceOf[EncryptResultmessageMessaMessage]
  }
  
  extension [Self <: EncryptResultmessageMessaMessage](x: Self) {
    
    inline def setMessage(value: typings.openpgp.mod.message.Message): Self = StObject.set(x, "message", value.asInstanceOf[js.Any])
    
    inline def setSessionKey(value: AeadAlgorithm): Self = StObject.set(x, "sessionKey", value.asInstanceOf[js.Any])
    
    inline def setSignature(value: typings.openpgp.mod.signature.Signature): Self = StObject.set(x, "signature", value.asInstanceOf[js.Any])
  }
}
