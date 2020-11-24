package typings.maximMazurokGapiClientPrivateca.gapi.client.privateca

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait CertificateDescription extends js.Object {
  
  /** Describes lists of issuer CA certificate URLs that appear in the "Authority Information Access" extension in the certificate. */
  var aiaIssuingCertificateUrls: js.UndefOr[js.Array[String]] = js.native
  
  /** Identifies the subject_key_id of the parent certificate, per https://tools.ietf.org/html/rfc5280#section-4.2.1.1 */
  var authorityKeyId: js.UndefOr[KeyId] = js.native
  
  /** The hash of the x.509 certificate. */
  var certFingerprint: js.UndefOr[CertificateFingerprint] = js.native
  
  /** Describes some of the technical fields in a certificate. */
  var configValues: js.UndefOr[ReusableConfigValues] = js.native
  
  /** Describes a list of locations to obtain CRL information, i.e. the DistributionPoint.fullName described by https://tools.ietf.org/html/rfc5280#section-4.2.1.13 */
  var crlDistributionPoints: js.UndefOr[js.Array[String]] = js.native
  
  /** The public key that corresponds to an issued certificate. */
  var publicKey: js.UndefOr[PublicKey] = js.native
  
  /** Describes some of the values in a certificate that are related to the subject and lifetime. */
  var subjectDescription: js.UndefOr[SubjectDescription] = js.native
  
  /** Provides a means of identifiying certificates that contain a particular public key, per https://tools.ietf.org/html/rfc5280#section-4.2.1.2. */
  var subjectKeyId: js.UndefOr[KeyId] = js.native
}
object CertificateDescription {
  
  @scala.inline
  def apply(): CertificateDescription = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[CertificateDescription]
  }
  
  @scala.inline
  implicit class CertificateDescriptionOps[Self <: CertificateDescription] (val x: Self) extends AnyVal {
    
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
    def setAiaIssuingCertificateUrlsVarargs(value: String*): Self = this.set("aiaIssuingCertificateUrls", js.Array(value :_*))
    
    @scala.inline
    def setAiaIssuingCertificateUrls(value: js.Array[String]): Self = this.set("aiaIssuingCertificateUrls", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteAiaIssuingCertificateUrls: Self = this.set("aiaIssuingCertificateUrls", js.undefined)
    
    @scala.inline
    def setAuthorityKeyId(value: KeyId): Self = this.set("authorityKeyId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteAuthorityKeyId: Self = this.set("authorityKeyId", js.undefined)
    
    @scala.inline
    def setCertFingerprint(value: CertificateFingerprint): Self = this.set("certFingerprint", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteCertFingerprint: Self = this.set("certFingerprint", js.undefined)
    
    @scala.inline
    def setConfigValues(value: ReusableConfigValues): Self = this.set("configValues", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteConfigValues: Self = this.set("configValues", js.undefined)
    
    @scala.inline
    def setCrlDistributionPointsVarargs(value: String*): Self = this.set("crlDistributionPoints", js.Array(value :_*))
    
    @scala.inline
    def setCrlDistributionPoints(value: js.Array[String]): Self = this.set("crlDistributionPoints", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteCrlDistributionPoints: Self = this.set("crlDistributionPoints", js.undefined)
    
    @scala.inline
    def setPublicKey(value: PublicKey): Self = this.set("publicKey", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deletePublicKey: Self = this.set("publicKey", js.undefined)
    
    @scala.inline
    def setSubjectDescription(value: SubjectDescription): Self = this.set("subjectDescription", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSubjectDescription: Self = this.set("subjectDescription", js.undefined)
    
    @scala.inline
    def setSubjectKeyId(value: KeyId): Self = this.set("subjectKeyId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSubjectKeyId: Self = this.set("subjectKeyId", js.undefined)
  }
}
