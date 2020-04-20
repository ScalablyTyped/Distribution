package typings.openpgp

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Inlined openpgp.openpgp.EncryptResult & {  data  :string} */
trait EncryptResultdatastring extends js.Object {
  var data: String
  var sessionKey: AnonAeadAlgorithm
}

object EncryptResultdatastring {
  @scala.inline
  def apply(data: String, sessionKey: AnonAeadAlgorithm): EncryptResultdatastring = {
    val __obj = js.Dynamic.literal(data = data.asInstanceOf[js.Any], sessionKey = sessionKey.asInstanceOf[js.Any])
    __obj.asInstanceOf[EncryptResultdatastring]
  }
}

