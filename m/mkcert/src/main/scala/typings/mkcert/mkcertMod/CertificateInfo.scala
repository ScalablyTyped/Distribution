package typings.mkcert.mkcertMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait CertificateInfo extends js.Object {
  var caCert: String
  var caKey: String
  var domains: js.Array[String]
  var validityDays: Double
}

object CertificateInfo {
  @scala.inline
  def apply(caCert: String, caKey: String, domains: js.Array[String], validityDays: Double): CertificateInfo = {
    val __obj = js.Dynamic.literal(caCert = caCert.asInstanceOf[js.Any], caKey = caKey.asInstanceOf[js.Any], domains = domains.asInstanceOf[js.Any], validityDays = validityDays.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[CertificateInfo]
  }
}

