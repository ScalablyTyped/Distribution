package typings.microsoftGraph.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait EnterpriseCodeSigningCertificate
  extends StObject
     with Entity {
  
  /**
    * The Windows Enterprise Code-Signing Certificate in the raw data format. Set to null once certificate has been uploaded
    * and other properties have been populated.
    */
  var content: js.UndefOr[NullableOption[String]] = js.undefined
  
  /**
    * The cert expiration date and time (using ISO 8601 format, in UTC time). Uploading a valid cert file through the Intune
    * admin console will automatically populate this value in the HTTP response. Supports: $filter, $select, $top, $OrderBy,
    * $skip. $Search is not supported.
    */
  var expirationDateTime: js.UndefOr[String] = js.undefined
  
  /**
    * The issuer value for the cert. This might contain information such as country (C), state or province (S), locality (L),
    * common name of the cert (CN), organization (O), and organizational unit (OU). Uploading a valid cert file through the
    * Intune admin console will automatically populate this value in the HTTP response. Supports: $filter, $select, $top,
    * $OrderBy, $skip. $Search is not supported.
    */
  var issuer: js.UndefOr[NullableOption[String]] = js.undefined
  
  /**
    * The issuer name for the cert. This might contain information such as country (C), state or province (S), locality (L),
    * common name of the cert (CN), organization (O), and organizational unit (OU). Uploading a valid cert file through the
    * Intune admin console will automatically populate this value in the HTTP response. Supports: $filter, $select, $top,
    * $OrderBy, $skip. $Search is not supported.
    */
  var issuerName: js.UndefOr[NullableOption[String]] = js.undefined
  
  /**
    * Whether the Certificate Status Provisioned or not Provisioned. Possible values are: notProvisioned, provisioned.
    * Default is notProvisioned. Uploading a valid cert file through the Intune admin console will automatically populate
    * this value in the HTTP response. Supports: $filter, $select, $top, $OrderBy, $skip. $Search is not supported. Possible
    * values are: notProvisioned, provisioned.
    */
  var status: js.UndefOr[CertificateStatus] = js.undefined
  
  /**
    * The subject value for the cert. This might contain information such as country (C), state or province (S), locality
    * (L), common name of the cert (CN), organization (O), and organizational unit (OU). Uploading a valid cert file through
    * the Intune admin console will automatically populate this value in the HTTP response. Supports: $filter, $select, $top,
    * $OrderBy, $skip. $Search is not supported.
    */
  var subject: js.UndefOr[NullableOption[String]] = js.undefined
  
  /**
    * The subject name for the cert. This might contain information such as country (C), state or province (S), locality (L),
    * common name of the cert (CN), organization (O), and organizational unit (OU). Uploading a valid cert file through the
    * Intune admin console will automatically populate this value in the HTTP response. Supports: $filter, $select, $top,
    * $OrderBy, $skip. $Search is not supported.
    */
  var subjectName: js.UndefOr[NullableOption[String]] = js.undefined
  
  /**
    * The date time of CodeSigning Cert when it is uploaded (using ISO 8601 format, in UTC time). Uploading a valid cert file
    * through the Intune admin console will automatically populate this value in the HTTP response. Supports: $filter,
    * $select, $top, $OrderBy, $skip. $Search is not supported.
    */
  var uploadDateTime: js.UndefOr[String] = js.undefined
}
object EnterpriseCodeSigningCertificate {
  
  inline def apply(): EnterpriseCodeSigningCertificate = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[EnterpriseCodeSigningCertificate]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: EnterpriseCodeSigningCertificate] (val x: Self) extends AnyVal {
    
    inline def setContent(value: NullableOption[String]): Self = StObject.set(x, "content", value.asInstanceOf[js.Any])
    
    inline def setContentNull: Self = StObject.set(x, "content", null)
    
    inline def setContentUndefined: Self = StObject.set(x, "content", js.undefined)
    
    inline def setExpirationDateTime(value: String): Self = StObject.set(x, "expirationDateTime", value.asInstanceOf[js.Any])
    
    inline def setExpirationDateTimeUndefined: Self = StObject.set(x, "expirationDateTime", js.undefined)
    
    inline def setIssuer(value: NullableOption[String]): Self = StObject.set(x, "issuer", value.asInstanceOf[js.Any])
    
    inline def setIssuerName(value: NullableOption[String]): Self = StObject.set(x, "issuerName", value.asInstanceOf[js.Any])
    
    inline def setIssuerNameNull: Self = StObject.set(x, "issuerName", null)
    
    inline def setIssuerNameUndefined: Self = StObject.set(x, "issuerName", js.undefined)
    
    inline def setIssuerNull: Self = StObject.set(x, "issuer", null)
    
    inline def setIssuerUndefined: Self = StObject.set(x, "issuer", js.undefined)
    
    inline def setStatus(value: CertificateStatus): Self = StObject.set(x, "status", value.asInstanceOf[js.Any])
    
    inline def setStatusUndefined: Self = StObject.set(x, "status", js.undefined)
    
    inline def setSubject(value: NullableOption[String]): Self = StObject.set(x, "subject", value.asInstanceOf[js.Any])
    
    inline def setSubjectName(value: NullableOption[String]): Self = StObject.set(x, "subjectName", value.asInstanceOf[js.Any])
    
    inline def setSubjectNameNull: Self = StObject.set(x, "subjectName", null)
    
    inline def setSubjectNameUndefined: Self = StObject.set(x, "subjectName", js.undefined)
    
    inline def setSubjectNull: Self = StObject.set(x, "subject", null)
    
    inline def setSubjectUndefined: Self = StObject.set(x, "subject", js.undefined)
    
    inline def setUploadDateTime(value: String): Self = StObject.set(x, "uploadDateTime", value.asInstanceOf[js.Any])
    
    inline def setUploadDateTimeUndefined: Self = StObject.set(x, "uploadDateTime", js.undefined)
  }
}
