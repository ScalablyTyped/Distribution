package typings.maximMazurokGapiClientPrivateca.gapi.client.privateca

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait CertificateDescription extends StObject {
  
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
  implicit class CertificateDescriptionMutableBuilder[Self <: CertificateDescription] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAiaIssuingCertificateUrls(value: js.Array[String]): Self = StObject.set(x, "aiaIssuingCertificateUrls", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAiaIssuingCertificateUrlsUndefined: Self = StObject.set(x, "aiaIssuingCertificateUrls", js.undefined)
    
    @scala.inline
    def setAiaIssuingCertificateUrlsVarargs(value: String*): Self = StObject.set(x, "aiaIssuingCertificateUrls", js.Array(value :_*))
    
    @scala.inline
    def setAuthorityKeyId(value: KeyId): Self = StObject.set(x, "authorityKeyId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAuthorityKeyIdUndefined: Self = StObject.set(x, "authorityKeyId", js.undefined)
    
    @scala.inline
    def setCertFingerprint(value: CertificateFingerprint): Self = StObject.set(x, "certFingerprint", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCertFingerprintUndefined: Self = StObject.set(x, "certFingerprint", js.undefined)
    
    @scala.inline
    def setConfigValues(value: ReusableConfigValues): Self = StObject.set(x, "configValues", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setConfigValuesUndefined: Self = StObject.set(x, "configValues", js.undefined)
    
    @scala.inline
    def setCrlDistributionPoints(value: js.Array[String]): Self = StObject.set(x, "crlDistributionPoints", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCrlDistributionPointsUndefined: Self = StObject.set(x, "crlDistributionPoints", js.undefined)
    
    @scala.inline
    def setCrlDistributionPointsVarargs(value: String*): Self = StObject.set(x, "crlDistributionPoints", js.Array(value :_*))
    
    @scala.inline
    def setPublicKey(value: PublicKey): Self = StObject.set(x, "publicKey", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPublicKeyUndefined: Self = StObject.set(x, "publicKey", js.undefined)
    
    @scala.inline
    def setSubjectDescription(value: SubjectDescription): Self = StObject.set(x, "subjectDescription", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSubjectDescriptionUndefined: Self = StObject.set(x, "subjectDescription", js.undefined)
    
    @scala.inline
    def setSubjectKeyId(value: KeyId): Self = StObject.set(x, "subjectKeyId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSubjectKeyIdUndefined: Self = StObject.set(x, "subjectKeyId", js.undefined)
  }
}
