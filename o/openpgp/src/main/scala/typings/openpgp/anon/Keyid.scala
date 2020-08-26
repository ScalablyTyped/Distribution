package typings.openpgp.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Keyid extends js.Object {
  var keyid: typings.openpgp.mod.`type`.keyid.Keyid = js.native
  var valid: Boolean = js.native
}

object Keyid {
  @scala.inline
  def apply(keyid: typings.openpgp.mod.`type`.keyid.Keyid, valid: Boolean): Keyid = {
    val __obj = js.Dynamic.literal(keyid = keyid.asInstanceOf[js.Any], valid = valid.asInstanceOf[js.Any])
    __obj.asInstanceOf[Keyid]
  }
  @scala.inline
  implicit class KeyidOps[Self <: Keyid] (val x: Self) extends AnyVal {
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
    def setKeyid(value: typings.openpgp.mod.`type`.keyid.Keyid): Self = this.set("keyid", value.asInstanceOf[js.Any])
    @scala.inline
    def setValid(value: Boolean): Self = this.set("valid", value.asInstanceOf[js.Any])
  }
  
}

