package typings
package openpgpLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Passphrase extends js.Object {
  var passphrase: openpgpLib.openpgpLibStrings.string
  var sign: openpgpLib.openpgpLibNumbers.`true`
}

object Anon_Passphrase {
  @scala.inline
  def apply(passphrase: openpgpLib.openpgpLibStrings.string, sign: openpgpLib.openpgpLibNumbers.`true`): Anon_Passphrase = {
    val __obj = js.Dynamic.literal(passphrase = passphrase, sign = sign)
  
    __obj.asInstanceOf[Anon_Passphrase]
  }
}

