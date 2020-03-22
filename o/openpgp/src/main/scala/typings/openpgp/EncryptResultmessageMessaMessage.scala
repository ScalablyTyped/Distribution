package typings.openpgp

import typings.openpgp.mod.message.Message
import typings.openpgp.mod.signature.Signature
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Inlined openpgp.openpgp.EncryptResult & {  message  :openpgp.openpgp.message.Message,   signature  :openpgp.openpgp.signature.Signature} */
trait EncryptResultmessageMessaMessage extends js.Object {
  var message: Message
  var sessionKey: AnonAeadAlgorithm
  var signature: Signature
}

object EncryptResultmessageMessaMessage {
  @scala.inline
  def apply(message: Message, sessionKey: AnonAeadAlgorithm, signature: Signature): EncryptResultmessageMessaMessage = {
    val __obj = js.Dynamic.literal(message = message.asInstanceOf[js.Any], sessionKey = sessionKey.asInstanceOf[js.Any], signature = signature.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[EncryptResultmessageMessaMessage]
  }
}

