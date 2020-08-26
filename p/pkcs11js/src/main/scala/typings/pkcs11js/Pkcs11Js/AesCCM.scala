package typings.pkcs11js.Pkcs11Js

import typings.node.Buffer
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AesCCM extends IParams {
  var aad: js.UndefOr[Buffer] = js.native
  var dataLen: Double = js.native
  var macLen: Double = js.native
  var nonce: js.UndefOr[Buffer] = js.native
}

object AesCCM {
  @scala.inline
  def apply(dataLen: Double, macLen: Double, `type`: Double): AesCCM = {
    val __obj = js.Dynamic.literal(dataLen = dataLen.asInstanceOf[js.Any], macLen = macLen.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[AesCCM]
  }
  @scala.inline
  implicit class AesCCMOps[Self <: AesCCM] (val x: Self) extends AnyVal {
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
    def setDataLen(value: Double): Self = this.set("dataLen", value.asInstanceOf[js.Any])
    @scala.inline
    def setMacLen(value: Double): Self = this.set("macLen", value.asInstanceOf[js.Any])
    @scala.inline
    def setAad(value: Buffer): Self = this.set("aad", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteAad: Self = this.set("aad", js.undefined)
    @scala.inline
    def setNonce(value: Buffer): Self = this.set("nonce", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteNonce: Self = this.set("nonce", js.undefined)
  }
  
}

