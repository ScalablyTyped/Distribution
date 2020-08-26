package typings.pkcs11js.Pkcs11Js

import typings.node.Buffer
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait RsaOAEP extends IParams {
  var hashAlg: Double = js.native
  var mgf: Double = js.native
  var source: Double = js.native
  var sourceData: js.UndefOr[Buffer] = js.native
}

object RsaOAEP {
  @scala.inline
  def apply(hashAlg: Double, mgf: Double, source: Double, `type`: Double): RsaOAEP = {
    val __obj = js.Dynamic.literal(hashAlg = hashAlg.asInstanceOf[js.Any], mgf = mgf.asInstanceOf[js.Any], source = source.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[RsaOAEP]
  }
  @scala.inline
  implicit class RsaOAEPOps[Self <: RsaOAEP] (val x: Self) extends AnyVal {
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
    def setSource(value: Double): Self = this.set("source", value.asInstanceOf[js.Any])
    @scala.inline
    def setSourceData(value: Buffer): Self = this.set("sourceData", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteSourceData: Self = this.set("sourceData", js.undefined)
  }
  
}

