package typings.pkcs11js.Pkcs11Js

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
    val __obj = js.Dynamic.literal(hashAlg = hashAlg.asInstanceOf[js.Any], mgf = mgf.asInstanceOf[js.Any], source = source.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    if (sourceData != null) __obj.updateDynamic("sourceData")(sourceData.asInstanceOf[js.Any])
    __obj.asInstanceOf[RsaOAEP]
  }
}

