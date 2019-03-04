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
    val __obj = js.Dynamic.literal(hashAlgorithm = hashAlgorithm, issuerCertificate = issuerCertificate)
  
    __obj.asInstanceOf[CreateFroCertificateParams]
  }
}

