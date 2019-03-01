package typings
package pkijsLib.srcCertIDMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait CreateFroCertificateParams extends js.Object {
  var hashAlgorithm: java.lang.String
  var issuerCertificate: pkijsLib.srcCertificateMod.default
}

object CreateFroCertificateParams {
  @scala.inline
  def apply(hashAlgorithm: java.lang.String, issuerCertificate: pkijsLib.srcCertificateMod.default): CreateFroCertificateParams = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("hashAlgorithm")(hashAlgorithm)
    __obj.updateDynamic("issuerCertificate")(issuerCertificate)
    __obj.asInstanceOf[CreateFroCertificateParams]
  }
}

