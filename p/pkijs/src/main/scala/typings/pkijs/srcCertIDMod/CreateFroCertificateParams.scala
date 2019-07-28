package typings.pkijs.srcCertIDMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait CreateFroCertificateParams extends js.Object {
  var hashAlgorithm: String
  var issuerCertificate: typings.pkijs.srcCertificateMod.default
}

object CreateFroCertificateParams {
  @scala.inline
  def apply(hashAlgorithm: String, issuerCertificate: typings.pkijs.srcCertificateMod.default): CreateFroCertificateParams = {
    val __obj = js.Dynamic.literal(hashAlgorithm = hashAlgorithm, issuerCertificate = issuerCertificate)
  
    __obj.asInstanceOf[CreateFroCertificateParams]
  }
}

