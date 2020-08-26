package typings.pem.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait CertificateCreationOptions extends CSRCreationOptions {
  /**
    * extension config file - with '-extensions v3_req'
    */
  var config: js.UndefOr[String] = js.native
  /**
    * CSR for the certificate, if not defined a new one is generated from the provided parameters
    */
  var csr: js.UndefOr[String] = js.native
  /**
    * Certificate expire time in days, defaults to 365
    */
  var days: js.UndefOr[Double] = js.native
  /**
    * extension config file - without '-extensions v3_req'
    */
  var extFile: js.UndefOr[String] = js.native
  /**
    * If set to true and serviceKey is not defined, use clientKey for signing
    */
  var selfSigned: js.UndefOr[Boolean] = js.native
  var serial: js.UndefOr[js.Any] = js.native
  var serviceCertificate: js.UndefOr[js.Any] = js.native
  /**
    * Private key for signing the certificate, if not defined a new one is generated
    */
  var serviceKey: js.UndefOr[String] = js.native
  /**
    * Password of the service key
    */
  var serviceKeyPassword: js.UndefOr[String] = js.native
}

object CertificateCreationOptions {
  @scala.inline
  def apply(): CertificateCreationOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[CertificateCreationOptions]
  }
  @scala.inline
  implicit class CertificateCreationOptionsOps[Self <: CertificateCreationOptions] (val x: Self) extends AnyVal {
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
    def setConfig(value: String): Self = this.set("config", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteConfig: Self = this.set("config", js.undefined)
    @scala.inline
    def setCsr(value: String): Self = this.set("csr", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteCsr: Self = this.set("csr", js.undefined)
    @scala.inline
    def setDays(value: Double): Self = this.set("days", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDays: Self = this.set("days", js.undefined)
    @scala.inline
    def setExtFile(value: String): Self = this.set("extFile", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteExtFile: Self = this.set("extFile", js.undefined)
    @scala.inline
    def setSelfSigned(value: Boolean): Self = this.set("selfSigned", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteSelfSigned: Self = this.set("selfSigned", js.undefined)
    @scala.inline
    def setSerial(value: js.Any): Self = this.set("serial", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteSerial: Self = this.set("serial", js.undefined)
    @scala.inline
    def setServiceCertificate(value: js.Any): Self = this.set("serviceCertificate", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteServiceCertificate: Self = this.set("serviceCertificate", js.undefined)
    @scala.inline
    def setServiceKey(value: String): Self = this.set("serviceKey", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteServiceKey: Self = this.set("serviceKey", js.undefined)
    @scala.inline
    def setServiceKeyPassword(value: String): Self = this.set("serviceKeyPassword", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteServiceKeyPassword: Self = this.set("serviceKeyPassword", js.undefined)
  }
  
}

