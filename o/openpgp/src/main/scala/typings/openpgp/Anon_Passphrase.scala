package typings.openpgp

import typings.openpgp.openpgpBooleans.`true`
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Passphrase extends js.Object {
  var passphrase: String
  var sign: `true`
}

object Anon_Passphrase {
  @scala.inline
  def apply(passphrase: String, sign: `true`): Anon_Passphrase = {
    val __obj = js.Dynamic.literal(passphrase = passphrase.asInstanceOf[js.Any], sign = sign.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[Anon_Passphrase]
  }
}

