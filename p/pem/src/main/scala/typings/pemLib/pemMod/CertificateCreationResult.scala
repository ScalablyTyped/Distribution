package typings
package pemLib.pemMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait CertificateCreationResult extends js.Object {
  var certificate: js.Any
  var clientKey: java.lang.String
  var csr: java.lang.String
  var serviceKey: java.lang.String
}

object CertificateCreationResult {
  @scala.inline
  def apply(
    certificate: js.Any,
    clientKey: java.lang.String,
    csr: java.lang.String,
    serviceKey: java.lang.String
  ): CertificateCreationResult = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("certificate")(certificate)
    __obj.updateDynamic("clientKey")(clientKey)
    __obj.updateDynamic("csr")(csr)
    __obj.updateDynamic("serviceKey")(serviceKey)
    __obj.asInstanceOf[CertificateCreationResult]
  }
}

