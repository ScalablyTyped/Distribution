package typings.pkcs11js.Pkcs11JsNs

import typings.node.Buffer
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait RsaOAEP extends IParams {
  var hashAlg: Double
  var mgf: Double
  var source: Double
  var sourceData: js.UndefOr[Buffer] = js.undefined
}

object RsaOAEP {
  @scala.inline
  def apply(hashAlg: Double, mgf: Double, source: Double, `type`: Double, sourceData: Buffer = null): RsaOAEP = {
    val __obj = js.Dynamic.literal(hashAlg = hashAlg, mgf = mgf, source = source)
    __obj.updateDynamic("type")(`type`)
    if (sourceData != null) __obj.updateDynamic("sourceData")(sourceData)
    __obj.asInstanceOf[RsaOAEP]
  }
}

