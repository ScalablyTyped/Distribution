package typings.openpgp.mod

import typings.openpgp.AnonAeadAlgorithm
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait EncryptResult extends js.Object {
  var sessionKey: AnonAeadAlgorithm
}

object EncryptResult {
  @scala.inline
  def apply(sessionKey: AnonAeadAlgorithm): EncryptResult = {
    val __obj = js.Dynamic.literal(sessionKey = sessionKey.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[EncryptResult]
  }
}

