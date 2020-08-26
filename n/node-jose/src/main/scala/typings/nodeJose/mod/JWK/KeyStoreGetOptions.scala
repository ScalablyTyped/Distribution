package typings.nodeJose.mod.JWK

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait KeyStoreGetOptions extends KeyStoreGetFilter {
  var kid: String = js.native
}

object KeyStoreGetOptions {
  @scala.inline
  def apply(kid: String): KeyStoreGetOptions = {
    val __obj = js.Dynamic.literal(kid = kid.asInstanceOf[js.Any])
    __obj.asInstanceOf[KeyStoreGetOptions]
  }
  @scala.inline
  implicit class KeyStoreGetOptionsOps[Self <: KeyStoreGetOptions] (val x: Self) extends AnyVal {
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
    def setKid(value: String): Self = this.set("kid", value.asInstanceOf[js.Any])
  }
  
}

