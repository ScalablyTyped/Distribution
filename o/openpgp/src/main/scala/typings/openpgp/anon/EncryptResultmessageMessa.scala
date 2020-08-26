package typings.openpgp.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Inlined openpgp.openpgp.EncryptResult & {  message :openpgp.openpgp.message.Message} */
@js.native
trait EncryptResultmessageMessa extends js.Object {
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
  implicit class EncryptResultmessageMessaOps[Self <: EncryptResultmessageMessa] (val x: Self) extends AnyVal {
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
    def setMessage(value: typings.openpgp.mod.message.Message): Self = this.set("message", value.asInstanceOf[js.Any])
    @scala.inline
    def setSessionKey(value: AeadAlgorithm): Self = this.set("sessionKey", value.asInstanceOf[js.Any])
  }
  
}

