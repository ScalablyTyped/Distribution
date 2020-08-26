package typings.pkcs11js.Pkcs11Js

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait RsaPSS extends IParams {
  var hashAlg: Double = js.native
  var mgf: Double = js.native
  var saltLen: Double = js.native
}

object RsaPSS {
  @scala.inline
  def apply(hashAlg: Double, mgf: Double, saltLen: Double, `type`: Double): RsaPSS = {
    val __obj = js.Dynamic.literal(hashAlg = hashAlg.asInstanceOf[js.Any], mgf = mgf.asInstanceOf[js.Any], saltLen = saltLen.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[RsaPSS]
  }
  @scala.inline
  implicit class RsaPSSOps[Self <: RsaPSS] (val x: Self) extends AnyVal {
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
    def setHashAlg(value: Double): Self = this.set("hashAlg", value.asInstanceOf[js.Any])
    @scala.inline
    def setMgf(value: Double): Self = this.set("mgf", value.asInstanceOf[js.Any])
    @scala.inline
    def setSaltLen(value: Double): Self = this.set("saltLen", value.asInstanceOf[js.Any])
  }
  
}

