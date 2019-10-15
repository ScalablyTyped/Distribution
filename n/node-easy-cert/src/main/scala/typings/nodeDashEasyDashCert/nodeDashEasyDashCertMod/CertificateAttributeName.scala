package typings.nodeDashEasyDashCert.nodeDashEasyDashCertMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait CertificateAttributeName extends CertificateAttribute {
  var name: String
  var value: String
}

object CertificateAttributeName {
  @scala.inline
  def apply(name: String, value: String): CertificateAttributeName = {
    val __obj = js.Dynamic.literal(name = name, value = value)
  
    __obj.asInstanceOf[CertificateAttributeName]
  }
}

