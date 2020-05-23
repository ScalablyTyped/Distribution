package typings.openpgp.anon

import typings.openpgp.openpgpBooleans.`true`
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Passphrase extends js.Object {
  var passphrase: String
  var sign: `true`
}

object Passphrase {
  @scala.inline
  def apply(passphrase: String, sign: `true`): Passphrase = {
    val __obj = js.Dynamic.literal(passphrase = passphrase.asInstanceOf[js.Any], sign = sign.asInstanceOf[js.Any])
    __obj.asInstanceOf[Passphrase]
  }
}

