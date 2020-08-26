package typings.mkcert.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait CertificateInfo extends js.Object {
  var caCert: String = js.native
  var caKey: String = js.native
  var domains: js.Array[String] = js.native
  var validityDays: Double = js.native
}

object CertificateInfo {
  @scala.inline
  def apply(caCert: String, caKey: String, domains: js.Array[String], validityDays: Double): CertificateInfo = {
    val __obj = js.Dynamic.literal(caCert = caCert.asInstanceOf[js.Any], caKey = caKey.asInstanceOf[js.Any], domains = domains.asInstanceOf[js.Any], validityDays = validityDays.asInstanceOf[js.Any])
    __obj.asInstanceOf[CertificateInfo]
  }
  @scala.inline
  implicit class CertificateInfoOps[Self <: CertificateInfo] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setCaCert(value: String): Self = this.set("caCert", value.asInstanceOf[js.Any])
    @scala.inline
    def setCaKey(value: String): Self = this.set("caKey", value.asInstanceOf[js.Any])
    @scala.inline
    def setDomainsVarargs(value: String*): Self = this.set("domains", js.Array(value :_*))
    @scala.inline
    def setDomains(value: js.Array[String]): Self = this.set("domains", value.asInstanceOf[js.Any])
    @scala.inline
    def setValidityDays(value: Double): Self = this.set("validityDays", value.asInstanceOf[js.Any])
  }
  
}

