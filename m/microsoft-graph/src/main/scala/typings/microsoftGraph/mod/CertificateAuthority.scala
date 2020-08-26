package typings.microsoftGraph.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait CertificateAuthority extends js.Object {
  // Required. The base64 encoded string representing the public certificate.
  var certificate: js.UndefOr[Double] = js.native
  // The URL of the certificate revocation list.
  var certificateRevocationListUrl: js.UndefOr[String] = js.native
  /**
    * The URL contains the list of all revoked certificates since the last time a full certificate revocaton list was
    * created.
    */
  var deltaCertificateRevocationListUrl: js.UndefOr[String] = js.native
  /**
    * Required. true if the trusted certificate is a root authority, false if the trusted certificate is an intermediate
    * authority.
    */
  var isRootAuthority: js.UndefOr[Boolean] = js.native
  // The issuer of the certificate, calculated from the certificate value. Read-only.
  var issuer: js.UndefOr[String] = js.native
  // The subject key identifier of the certificate, calculated from the certificate value. Read-only.
  var issuerSki: js.UndefOr[String] = js.native
}

object CertificateAuthority {
  @scala.inline
  def apply(): CertificateAuthority = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[CertificateAuthority]
  }
  @scala.inline
  implicit class CertificateAuthorityOps[Self <: CertificateAuthority] (val x: Self) extends AnyVal {
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
    def setCertificate(value: Double): Self = this.set("certificate", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteCertificate: Self = this.set("certificate", js.undefined)
    @scala.inline
    def setCertificateRevocationListUrl(value: String): Self = this.set("certificateRevocationListUrl", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteCertificateRevocationListUrl: Self = this.set("certificateRevocationListUrl", js.undefined)
    @scala.inline
    def setDeltaCertificateRevocationListUrl(value: String): Self = this.set("deltaCertificateRevocationListUrl", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDeltaCertificateRevocationListUrl: Self = this.set("deltaCertificateRevocationListUrl", js.undefined)
    @scala.inline
    def setIsRootAuthority(value: Boolean): Self = this.set("isRootAuthority", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteIsRootAuthority: Self = this.set("isRootAuthority", js.undefined)
    @scala.inline
    def setIssuer(value: String): Self = this.set("issuer", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteIssuer: Self = this.set("issuer", js.undefined)
    @scala.inline
    def setIssuerSki(value: String): Self = this.set("issuerSki", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteIssuerSki: Self = this.set("issuerSki", js.undefined)
  }
  
}

