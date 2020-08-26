package typings.pkcs11js.Pkcs11Js

import typings.node.Buffer
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ECDH1 extends IParams {
  var kdf: Double = js.native
  var publicData: Buffer = js.native
  var sharedData: js.UndefOr[Buffer] = js.native
}

object ECDH1 {
  @scala.inline
  def apply(kdf: Double, publicData: Buffer, `type`: Double): ECDH1 = {
    val __obj = js.Dynamic.literal(kdf = kdf.asInstanceOf[js.Any], publicData = publicData.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[ECDH1]
  }
  @scala.inline
  implicit class ECDH1Ops[Self <: ECDH1] (val x: Self) extends AnyVal {
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
    def setKdf(value: Double): Self = this.set("kdf", value.asInstanceOf[js.Any])
    @scala.inline
    def setPublicData(value: Buffer): Self = this.set("publicData", value.asInstanceOf[js.Any])
    @scala.inline
    def setSharedData(value: Buffer): Self = this.set("sharedData", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteSharedData: Self = this.set("sharedData", js.undefined)
  }
  
}

