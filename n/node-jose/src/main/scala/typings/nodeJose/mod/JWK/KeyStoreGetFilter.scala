package typings.nodeJose.mod.JWK

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait KeyStoreGetFilter extends js.Object {
  var alg: js.UndefOr[String] = js.native
  var kty: js.UndefOr[String] = js.native
  var use: js.UndefOr[KeyUse] = js.native
}

object KeyStoreGetFilter {
  @scala.inline
  def apply(): KeyStoreGetFilter = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[KeyStoreGetFilter]
  }
  @scala.inline
  implicit class KeyStoreGetFilterOps[Self <: KeyStoreGetFilter] (val x: Self) extends AnyVal {
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
    def setAlg(value: String): Self = this.set("alg", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteAlg: Self = this.set("alg", js.undefined)
    @scala.inline
    def setKty(value: String): Self = this.set("kty", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteKty: Self = this.set("kty", js.undefined)
    @scala.inline
    def setUse(value: KeyUse): Self = this.set("use", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteUse: Self = this.set("use", js.undefined)
  }
  
}

