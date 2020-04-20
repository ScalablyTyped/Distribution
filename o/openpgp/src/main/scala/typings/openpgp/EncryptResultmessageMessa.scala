package typings.openpgp

import typings.openpgp.mod.message.Message
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Inlined openpgp.openpgp.EncryptResult & {  message  :openpgp.openpgp.message.Message} */
trait EncryptResultmessageMessa extends js.Object {
  var message: Message
  var sessionKey: AnonAeadAlgorithm
}

object EncryptResultmessageMessa {
  @scala.inline
  def apply(message: Message, sessionKey: AnonAeadAlgorithm): EncryptResultmessageMessa = {
    val __obj = js.Dynamic.literal(message = message.asInstanceOf[js.Any], sessionKey = sessionKey.asInstanceOf[js.Any])
    __obj.asInstanceOf[EncryptResultmessageMessa]
  }
}

