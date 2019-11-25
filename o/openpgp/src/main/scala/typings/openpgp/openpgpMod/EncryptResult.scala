package typings.openpgp.openpgpMod

import typings.openpgp.Anon_AeadAlgorithm
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait EncryptResult extends js.Object {
  var sessionKey: Anon_AeadAlgorithm
}

object EncryptResult {
  @scala.inline
  def apply(sessionKey: Anon_AeadAlgorithm): EncryptResult = {
    val __obj = js.Dynamic.literal(sessionKey = sessionKey.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[EncryptResult]
  }
}

