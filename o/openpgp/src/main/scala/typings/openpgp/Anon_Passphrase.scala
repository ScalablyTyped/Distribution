package typings.openpgp

import typings.openpgp.openpgpNumbers.`true`
import typings.openpgp.openpgpStrings.string
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Passphrase extends js.Object {
  var passphrase: string
  var sign: `true`
}

object Anon_Passphrase {
  @scala.inline
  def apply(passphrase: string, sign: `true`): Anon_Passphrase = {
    val __obj = js.Dynamic.literal(passphrase = passphrase.asInstanceOf[js.Any], sign = sign.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[Anon_Passphrase]
  }
}

