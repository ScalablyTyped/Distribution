package typings.maximMazurokGapiClientPrivateca.gapi.client.privateca

import org.scalablytyped.runtime.TopLevel
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Certificate extends js.Object {
  
  /** Output only. A structured description of the issued X.509 certificate. */
  var certificateDescription: js.UndefOr[CertificateDescription] = js.native
  
  /** Immutable. A description of the certificate and key that does not require X.509 or ASN.1. */
  var config: js.UndefOr[CertificateConfig] = js.native
  
  /** Output only. The time at which this Certificate was created. */
  var createTime: js.UndefOr[String] = js.native
  
  /** Optional. Labels with user-defined metadata. */
  var labels: js.UndefOr[
    /* import warning: importer.ImportType#apply c Unsupported type mapping: 
  {[ P in string ]: string}
    */ typings.maximMazurokGapiClientPrivateca.maximMazurokGapiClientPrivatecaStrings.Certificate with TopLevel[js.Any]
  ] = js.native
  
  /**
    * Required. Immutable. The desired lifetime of a certificate. Used to create the "not_before_time" and "not_after_time" fields inside an X.509 certificate. Note that the lifetime may
    * be truncated if it would extend past the life of any certificate authority in the issuing chain.
    */
  var lifetime: js.UndefOr[String] = js.native
  
  /** Output only. The resource path for this Certificate in the format `projects/∗/locations/∗/certificateAuthorities/∗/certificates/ *`. */
  var name: js.UndefOr[String] = js.native
  
  /** Output only. The pem-encoded, signed X.509 certificate. */
  var pemCertificate: js.UndefOr[String] = js.native
  
  /** Output only. The chain that may be used to verify the X.509 certificate. Expected to be in issuer-to-root order according to RFC 5246. */
  var pemCertificateChain: js.UndefOr[js.Array[String]] = js.native
  
  /** Immutable. A pem-encoded X.509 certificate signing request (CSR). */
  var pemCsr: js.UndefOr[String] = js.native
  
  /** Output only. Details regarding the revocation of this Certificate. This Certificate is considered revoked if and only if this field is present. */
  var revocationDetails: js.UndefOr[RevocationDetails] = js.native
  
  /** Output only. The time at which this Certificate was updated. */
  var updateTime: js.UndefOr[String] = js.native
}
object Certificate {
  
  @scala.inline
  def apply(): Certificate = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Certificate]
  }
  
  @scala.inline
  implicit class CertificateOps[Self <: Certificate] (val x: Self) extends AnyVal {
    
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
    def setCertificateDescription(value: CertificateDescription): Self = this.set("certificateDescription", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteCertificateDescription: Self = this.set("certificateDescription", js.undefined)
    
    @scala.inline
    def setConfig(value: CertificateConfig): Self = this.set("config", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteConfig: Self = this.set("config", js.undefined)
    
    @scala.inline
    def setCreateTime(value: String): Self = this.set("createTime", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteCreateTime: Self = this.set("createTime", js.undefined)
    
    @scala.inline
    def setLabels(
      value: /* import warning: importer.ImportType#apply c Unsupported type mapping: 
    {[ P in string ]: string}
      */ typings.maximMazurokGapiClientPrivateca.maximMazurokGapiClientPrivatecaStrings.Certificate with TopLevel[js.Any]
    ): Self = this.set("labels", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteLabels: Self = this.set("labels", js.undefined)
    
    @scala.inline
    def setLifetime(value: String): Self = this.set("lifetime", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteLifetime: Self = this.set("lifetime", js.undefined)
    
    @scala.inline
    def setName(value: String): Self = this.set("name", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteName: Self = this.set("name", js.undefined)
    
    @scala.inline
    def setPemCertificate(value: String): Self = this.set("pemCertificate", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deletePemCertificate: Self = this.set("pemCertificate", js.undefined)
    
    @scala.inline
    def setPemCertificateChainVarargs(value: String*): Self = this.set("pemCertificateChain", js.Array(value :_*))
    
    @scala.inline
    def setPemCertificateChain(value: js.Array[String]): Self = this.set("pemCertificateChain", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deletePemCertificateChain: Self = this.set("pemCertificateChain", js.undefined)
    
    @scala.inline
    def setPemCsr(value: String): Self = this.set("pemCsr", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deletePemCsr: Self = this.set("pemCsr", js.undefined)
    
    @scala.inline
    def setRevocationDetails(value: RevocationDetails): Self = this.set("revocationDetails", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteRevocationDetails: Self = this.set("revocationDetails", js.undefined)
    
    @scala.inline
    def setUpdateTime(value: String): Self = this.set("updateTime", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteUpdateTime: Self = this.set("updateTime", js.undefined)
  }
}
