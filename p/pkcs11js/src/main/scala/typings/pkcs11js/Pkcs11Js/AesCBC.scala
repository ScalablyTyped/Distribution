package typings.pkcs11js.Pkcs11Js

import typings.node.Buffer
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AesCBC extends IParams {
  var data: js.UndefOr[Buffer] = js.native
  var iv: Buffer = js.native
}

object AesCBC {
  @scala.inline
  def apply(iv: Buffer, `type`: Double): AesCBC = {
    val __obj = js.Dynamic.literal(iv = iv.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[AesCBC]
  }
  @scala.inline
  implicit class AesCBCOps[Self <: AesCBC] (val x: Self) extends AnyVal {
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
    def setIv(value: Buffer): Self = this.set("iv", value.asInstanceOf[js.Any])
    @scala.inline
    def setData(value: Buffer): Self = this.set("data", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteData: Self = this.set("data", js.undefined)
  }
  
}

