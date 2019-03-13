package typings
package mkcertLib.mkcertMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait CertificateInfo extends js.Object {
  var caCert: java.lang.String
  var caKey: java.lang.String
  var domains: js.Array[java.lang.String]
  var validityDays: scala.Double
}

object CertificateInfo {
  @scala.inline
  def apply(
    caCert: java.lang.String,
    caKey: java.lang.String,
    domains: js.Array[java.lang.String],
    validityDays: scala.Double
  ): CertificateInfo = {
    val __obj = js.Dynamic.literal(caCert = caCert, caKey = caKey, domains = domains, validityDays = validityDays)
  
    __obj.asInstanceOf[CertificateInfo]
  }
}

