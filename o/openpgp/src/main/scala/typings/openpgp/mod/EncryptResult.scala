package typings.openpgp.mod

import typings.openpgp.anon.AeadAlgorithm
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait EncryptResult extends js.Object {
  var sessionKey: AeadAlgorithm
}

object EncryptResult {
  @scala.inline
  def apply(sessionKey: AeadAlgorithm): EncryptResult = {
    val __obj = js.Dynamic.literal(sessionKey = sessionKey.asInstanceOf[js.Any])
    __obj.asInstanceOf[EncryptResult]
  }
}

