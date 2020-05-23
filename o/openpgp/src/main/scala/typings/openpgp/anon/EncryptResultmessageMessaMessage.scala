package typings.openpgp.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Inlined openpgp.openpgp.EncryptResult & {  message  :openpgp.openpgp.message.Message,   signature  :openpgp.openpgp.signature.Signature} */
trait EncryptResultmessageMessaMessage extends js.Object {
  var message: typings.openpgp.mod.message.Message
  var sessionKey: AeadAlgorithm
  var signature: typings.openpgp.mod.signature.Signature
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
}

