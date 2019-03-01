package typings
package pkcs11jsLib.Pkcs11JsNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait RsaOAEP extends IParams {
  var hashAlg: scala.Double
  var mgf: scala.Double
  var source: scala.Double
  var sourceData: js.UndefOr[nodeLib.Buffer] = js.undefined
}

object RsaOAEP {
  @scala.inline
  def apply(
    hashAlg: scala.Double,
    mgf: scala.Double,
    source: scala.Double,
    `type`: scala.Double,
    sourceData: nodeLib.Buffer = null
  ): RsaOAEP = {
    val __obj = js.Dynamic.literal(`type` = `type`)
    __obj.updateDynamic("hashAlg")(hashAlg)
    __obj.updateDynamic("mgf")(mgf)
    __obj.updateDynamic("source")(source)
    if (sourceData != null) __obj.updateDynamic("sourceData")(sourceData)
    __obj.asInstanceOf[RsaOAEP]
  }
}

