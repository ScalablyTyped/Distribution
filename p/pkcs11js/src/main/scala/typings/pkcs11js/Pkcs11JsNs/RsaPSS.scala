package typings.pkcs11js.Pkcs11JsNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait RsaPSS extends IParams {
  var hashAlg: Double
  var mgf: Double
  var saltLen: Double
}

object RsaPSS {
  @scala.inline
  def apply(hashAlg: Double, mgf: Double, saltLen: Double, `type`: Double): RsaPSS = {
    val __obj = js.Dynamic.literal(hashAlg = hashAlg, mgf = mgf, saltLen = saltLen)
    __obj.updateDynamic("type")(`type`)
    __obj.asInstanceOf[RsaPSS]
  }
}

