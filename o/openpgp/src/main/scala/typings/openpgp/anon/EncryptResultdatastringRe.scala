package typings.openpgp.anon

import typings.openpgp.mod.ReadableStream
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined openpgp.openpgp.EncryptResult & {  data :string | openpgp.openpgp.ReadableStream<std.String>,   message :openpgp.openpgp.message.Message,   signature :string | openpgp.openpgp.ReadableStream<std.String> | openpgp.openpgp.signature.Signature} */
trait EncryptResultdatastringRe extends StObject {
  
  var data: String | ReadableStream[String]
  
  var message: typings.openpgp.mod.message.Message
  
  var sessionKey: AeadAlgorithm
  
  var signature: String | ReadableStream[String] | typings.openpgp.mod.signature.Signature
}
object EncryptResultdatastringRe {
  
  inline def apply(
    data: String | ReadableStream[String],
    message: typings.openpgp.mod.message.Message,
    sessionKey: AeadAlgorithm,
    signature: String | ReadableStream[String] | typings.openpgp.mod.signature.Signature
  ): EncryptResultdatastringRe = {
    val __obj = js.Dynamic.literal(data = data.asInstanceOf[js.Any], message = message.asInstanceOf[js.Any], sessionKey = sessionKey.asInstanceOf[js.Any], signature = signature.asInstanceOf[js.Any])
    __obj.asInstanceOf[EncryptResultdatastringRe]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: EncryptResultdatastringRe] (val x: Self) extends AnyVal {
    
    inline def setData(value: String | ReadableStream[String]): Self = StObject.set(x, "data", value.asInstanceOf[js.Any])
    
    inline def setMessage(value: typings.openpgp.mod.message.Message): Self = StObject.set(x, "message", value.asInstanceOf[js.Any])
    
    inline def setSessionKey(value: AeadAlgorithm): Self = StObject.set(x, "sessionKey", value.asInstanceOf[js.Any])
    
    inline def setSignature(value: String | ReadableStream[String] | typings.openpgp.mod.signature.Signature): Self = StObject.set(x, "signature", value.asInstanceOf[js.Any])
  }
}
