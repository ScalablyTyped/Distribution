package typings.pem.pemMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait CertificateCreationResult extends js.Object {
  var certificate: js.Any
  var clientKey: String
  var csr: String
  var serviceKey: String
}

object CertificateCreationResult {
  @scala.inline
  def apply(certificate: js.Any, clientKey: String, csr: String, serviceKey: String): CertificateCreationResult = {
    val __obj = js.Dynamic.literal(certificate = certificate, clientKey = clientKey, csr = csr, serviceKey = serviceKey)
  
    __obj.asInstanceOf[CertificateCreationResult]
  }
}

