package typings.maximMazurokGapiClientPrivateca.gapi.client.privateca

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait CertificateDescription extends StObject {
  
  /** Describes lists of issuer CA certificate URLs that appear in the "Authority Information Access" extension in the certificate. */
  var aiaIssuingCertificateUrls: js.UndefOr[js.Array[String]] = js.undefined
  
  /** Identifies the subject_key_id of the parent certificate, per https://tools.ietf.org/html/rfc5280#section-4.2.1.1 */
  var authorityKeyId: js.UndefOr[KeyId] = js.undefined
  
  /** The hash of the x.509 certificate. */
  var certFingerprint: js.UndefOr[CertificateFingerprint] = js.undefined
  
  /** Describes a list of locations to obtain CRL information, i.e. the DistributionPoint.fullName described by https://tools.ietf.org/html/rfc5280#section-4.2.1.13 */
  var crlDistributionPoints: js.UndefOr[js.Array[String]] = js.undefined
  
  /** The public key that corresponds to an issued certificate. */
  var publicKey: js.UndefOr[PublicKey] = js.undefined
  
  /** Describes some of the values in a certificate that are related to the subject and lifetime. */
  var subjectDescription: js.UndefOr[SubjectDescription] = js.undefined
  
  /** Provides a means of identifiying certificates that contain a particular public key, per https://tools.ietf.org/html/rfc5280#section-4.2.1.2. */
  var subjectKeyId: js.UndefOr[KeyId] = js.undefined
  
  /** Describes some of the technical X.509 fields in a certificate. */
  var x509Description: js.UndefOr[X509Parameters] = js.undefined
}
object CertificateDescription {
  
  inline def apply(): CertificateDescription = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[CertificateDescription]
  }
  
  extension [Self <: CertificateDescription](x: Self) {
    
    inline def setAiaIssuingCertificateUrls(value: js.Array[String]): Self = StObject.set(x, "aiaIssuingCertificateUrls", value.asInstanceOf[js.Any])
    
    inline def setAiaIssuingCertificateUrlsUndefined: Self = StObject.set(x, "aiaIssuingCertificateUrls", js.undefined)
    
    inline def setAiaIssuingCertificateUrlsVarargs(value: String*): Self = StObject.set(x, "aiaIssuingCertificateUrls", js.Array(value*))
    
    inline def setAuthorityKeyId(value: KeyId): Self = StObject.set(x, "authorityKeyId", value.asInstanceOf[js.Any])
    
    inline def setAuthorityKeyIdUndefined: Self = StObject.set(x, "authorityKeyId", js.undefined)
    
    inline def setCertFingerprint(value: CertificateFingerprint): Self = StObject.set(x, "certFingerprint", value.asInstanceOf[js.Any])
    
    inline def setCertFingerprintUndefined: Self = StObject.set(x, "certFingerprint", js.undefined)
    
    inline def setCrlDistributionPoints(value: js.Array[String]): Self = StObject.set(x, "crlDistributionPoints", value.asInstanceOf[js.Any])
    
    inline def setCrlDistributionPointsUndefined: Self = StObject.set(x, "crlDistributionPoints", js.undefined)
    
    inline def setCrlDistributionPointsVarargs(value: String*): Self = StObject.set(x, "crlDistributionPoints", js.Array(value*))
    
    inline def setPublicKey(value: PublicKey): Self = StObject.set(x, "publicKey", value.asInstanceOf[js.Any])
    
    inline def setPublicKeyUndefined: Self = StObject.set(x, "publicKey", js.undefined)
    
    inline def setSubjectDescription(value: SubjectDescription): Self = StObject.set(x, "subjectDescription", value.asInstanceOf[js.Any])
    
    inline def setSubjectDescriptionUndefined: Self = StObject.set(x, "subjectDescription", js.undefined)
    
    inline def setSubjectKeyId(value: KeyId): Self = StObject.set(x, "subjectKeyId", value.asInstanceOf[js.Any])
    
    inline def setSubjectKeyIdUndefined: Self = StObject.set(x, "subjectKeyId", js.undefined)
    
    inline def setX509Description(value: X509Parameters): Self = StObject.set(x, "x509Description", value.asInstanceOf[js.Any])
    
    inline def setX509DescriptionUndefined: Self = StObject.set(x, "x509Description", js.undefined)
  }
}
