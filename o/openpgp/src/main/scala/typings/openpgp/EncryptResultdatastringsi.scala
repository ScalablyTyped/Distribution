package typings.openpgp

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Inlined openpgp.openpgp.EncryptResult & {  data  :string,   signature  :string} */
trait EncryptResultdatastringsi extends js.Object {
  var data: String
  var sessionKey: AnonAeadAlgorithm
  var signature: String
}

object EncryptResultdatastringsi {
  @scala.inline
  def apply(data: String, sessionKey: AnonAeadAlgorithm, signature: String): EncryptResultdatastringsi = {
    val __obj = js.Dynamic.literal(data = data.asInstanceOf[js.Any], sessionKey = sessionKey.asInstanceOf[js.Any], signature = signature.asInstanceOf[js.Any])
    __obj.asInstanceOf[EncryptResultdatastringsi]
  }
}

