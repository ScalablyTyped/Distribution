package typings.openpgp

import typings.openpgp.openpgpBooleans.`true`
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonPassphrase extends js.Object {
  var passphrase: String
  var sign: `true`
}

object AnonPassphrase {
  @scala.inline
  def apply(passphrase: String, sign: `true`): AnonPassphrase = {
    val __obj = js.Dynamic.literal(passphrase = passphrase.asInstanceOf[js.Any], sign = sign.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[AnonPassphrase]
  }
}

