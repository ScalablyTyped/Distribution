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
    val __obj = js.Dynamic.literal(hashAlg = hashAlg, mgf = mgf, saltLen = saltLen)
    __obj.updateDynamic("type")(`type`)
    __obj.asInstanceOf[RsaPSS]
  }
}

