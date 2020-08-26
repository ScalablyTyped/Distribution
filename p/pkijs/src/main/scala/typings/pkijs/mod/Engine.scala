package typings.pkijs.mod

import typings.std.Crypto
import typings.std.SubtleCrypto
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Engine extends js.Object {
  var crypto: Crypto = js.native
  var name: String = js.native
  var subtle: SubtleCrypto = js.native
}

object Engine {
  @scala.inline
  def apply(crypto: Crypto, name: String, subtle: SubtleCrypto): Engine = {
    val __obj = js.Dynamic.literal(crypto = crypto.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], subtle = subtle.asInstanceOf[js.Any])
    __obj.asInstanceOf[Engine]
  }
  @scala.inline
  implicit class EngineOps[Self <: Engine] (val x: Self) extends AnyVal {
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
    def setCrypto(value: Crypto): Self = this.set("crypto", value.asInstanceOf[js.Any])
    @scala.inline
    def setName(value: String): Self = this.set("name", value.asInstanceOf[js.Any])
    @scala.inline
    def setSubtle(value: SubtleCrypto): Self = this.set("subtle", value.asInstanceOf[js.Any])
  }
  
}

