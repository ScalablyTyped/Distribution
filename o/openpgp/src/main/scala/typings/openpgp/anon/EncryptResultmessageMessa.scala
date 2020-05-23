package typings.openpgp.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Inlined openpgp.openpgp.EncryptResult & {  message  :openpgp.openpgp.message.Message} */
trait EncryptResultmessageMessa extends js.Object {
  var message: typings.openpgp.mod.message.Message
  var sessionKey: AeadAlgorithm
}

object EncryptResultmessageMessa {
  @scala.inline
  def apply(message: typings.openpgp.mod.message.Message, sessionKey: AeadAlgorithm): EncryptResultmessageMessa = {
    val __obj = js.Dynamic.literal(message = message.asInstanceOf[js.Any], sessionKey = sessionKey.asInstanceOf[js.Any])
    __obj.asInstanceOf[EncryptResultmessageMessa]
  }
}

