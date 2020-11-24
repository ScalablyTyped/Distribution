package typings.openpgp.anon

import typings.openpgp.mod.ReadableStream
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined openpgp.openpgp.EncryptResult & {  data :string | openpgp.openpgp.ReadableStream<std.String>,   message :openpgp.openpgp.message.Message,   signature :string | openpgp.openpgp.ReadableStream<std.String> | openpgp.openpgp.signature.Signature} */
@js.native
trait EncryptResultdatastringRe extends js.Object {
  
  var data: String | ReadableStream[String] = js.native
  
  var message: typings.openpgp.mod.message.Message = js.native
  
  var sessionKey: AeadAlgorithm = js.native
  
  var signature: String | ReadableStream[String] | typings.openpgp.mod.signature.Signature = js.native
}
object EncryptResultdatastringRe {
  
  @scala.inline
  def apply(
    data: String | ReadableStream[String],
    message: typings.openpgp.mod.message.Message,
    sessionKey: AeadAlgorithm,
    signature: String | ReadableStream[String] | typings.openpgp.mod.signature.Signature
  ): EncryptResultdatastringRe = {
    val __obj = js.Dynamic.literal(data = data.asInstanceOf[js.Any], message = message.asInstanceOf[js.Any], sessionKey = sessionKey.asInstanceOf[js.Any], signature = signature.asInstanceOf[js.Any])
    __obj.asInstanceOf[EncryptResultdatastringRe]
  }
  
  @scala.inline
  implicit class EncryptResultdatastringReOps[Self <: EncryptResultdatastringRe] (val x: Self) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setData(value: String | ReadableStream[String]): Self = this.set("data", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMessage(value: typings.openpgp.mod.message.Message): Self = this.set("message", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSessionKey(value: AeadAlgorithm): Self = this.set("sessionKey", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSignature(value: String | ReadableStream[String] | typings.openpgp.mod.signature.Signature): Self = this.set("signature", value.asInstanceOf[js.Any])
  }
}
