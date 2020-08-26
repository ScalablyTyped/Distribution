package typings.openpgp.anon

import typings.openpgp.openpgpBooleans.`true`
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Passphrase extends js.Object {
  var passphrase: String = js.native
  var sign: `true` = js.native
}

object Passphrase {
  @scala.inline
  def apply(passphrase: String, sign: `true`): Passphrase = {
    val __obj = js.Dynamic.literal(passphrase = passphrase.asInstanceOf[js.Any], sign = sign.asInstanceOf[js.Any])
    __obj.asInstanceOf[Passphrase]
  }
  @scala.inline
  implicit class PassphraseOps[Self <: Passphrase] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setPassphrase(value: String): Self = this.set("passphrase", value.asInstanceOf[js.Any])
    @scala.inline
    def setSign(value: `true`): Self = this.set("sign", value.asInstanceOf[js.Any])
  }
  
}

