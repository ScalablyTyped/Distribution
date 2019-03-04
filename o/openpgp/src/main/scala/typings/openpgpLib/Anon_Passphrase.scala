package typings
package openpgpLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Passphrase extends js.Object {
  var passphrase: js.UndefOr[java.lang.String | js.Array[java.lang.String]] = js.undefined
  var privateKey: openpgpLib.openpgpMod.keyNs.Key
}

object Anon_Passphrase {
  @scala.inline
  def apply(
    privateKey: openpgpLib.openpgpMod.keyNs.Key,
    passphrase: java.lang.String | js.Array[java.lang.String] = null
  ): Anon_Passphrase = {
    val __obj = js.Dynamic.literal(privateKey = privateKey)
    if (passphrase != null) __obj.updateDynamic("passphrase")(passphrase.asInstanceOf[js.Any])
    __obj.asInstanceOf[Anon_Passphrase]
  }
}

