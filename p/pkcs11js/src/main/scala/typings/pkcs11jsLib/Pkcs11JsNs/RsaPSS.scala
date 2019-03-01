package typings
package pkcs11jsLib.Pkcs11JsNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait RsaPSS extends IParams {
  var hashAlg: scala.Double
  var mgf: scala.Double
  var saltLen: scala.Double
}

object RsaPSS {
  @scala.inline
  def apply(hashAlg: scala.Double, mgf: scala.Double, saltLen: scala.Double, `type`: scala.Double): RsaPSS = {
    val __obj = js.Dynamic.literal(`type` = `type`)
    __obj.updateDynamic("hashAlg")(hashAlg)
    __obj.updateDynamic("mgf")(mgf)
    __obj.updateDynamic("saltLen")(saltLen)
    __obj.asInstanceOf[RsaPSS]
  }
}

