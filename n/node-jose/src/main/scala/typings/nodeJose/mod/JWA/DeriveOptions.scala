package typings.nodeJose.mod.JWA

import typings.node.Buffer
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DeriveOptions extends js.Object {
   // public key used in ecdh
  var hash: js.UndefOr[Buffer] = js.native
   // salt value used in hkdf
  var info: js.UndefOr[Buffer] = js.native
  var length: js.UndefOr[Double] = js.native
   // key length
  var otherInfo: js.UndefOr[Buffer] = js.native
   // info used in concatkdf
  var public: js.UndefOr[Buffer] = js.native
   // hash used in ecdh
  var salt: js.UndefOr[Buffer] = js.native
}

object DeriveOptions {
  @scala.inline
  def apply(): DeriveOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DeriveOptions]
  }
  @scala.inline
  implicit class DeriveOptionsOps[Self <: DeriveOptions] (val x: Self) extends AnyVal {
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
    def setHash(value: Buffer): Self = this.set("hash", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteHash: Self = this.set("hash", js.undefined)
    @scala.inline
    def setInfo(value: Buffer): Self = this.set("info", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteInfo: Self = this.set("info", js.undefined)
    @scala.inline
    def setLength(value: Double): Self = this.set("length", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteLength: Self = this.set("length", js.undefined)
    @scala.inline
    def setOtherInfo(value: Buffer): Self = this.set("otherInfo", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteOtherInfo: Self = this.set("otherInfo", js.undefined)
    @scala.inline
    def setPublic(value: Buffer): Self = this.set("public", value.asInstanceOf[js.Any])
    @scala.inline
    def deletePublic: Self = this.set("public", js.undefined)
    @scala.inline
    def setSalt(value: Buffer): Self = this.set("salt", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteSalt: Self = this.set("salt", js.undefined)
  }
  
}

