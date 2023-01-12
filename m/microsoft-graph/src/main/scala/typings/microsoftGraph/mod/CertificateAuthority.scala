package typings.microsoftGraph.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait CertificateAuthority extends StObject {
  
  // Required. The base64 encoded string representing the public certificate.
  var certificate: js.UndefOr[String] = js.undefined
  
  // The URL of the certificate revocation list.
  var certificateRevocationListUrl: js.UndefOr[NullableOption[String]] = js.undefined
  
  /**
    * The URL contains the list of all revoked certificates since the last time a full certificate revocaton list was
    * created.
    */
  var deltaCertificateRevocationListUrl: js.UndefOr[NullableOption[String]] = js.undefined
  
  /**
    * Required. true if the trusted certificate is a root authority, false if the trusted certificate is an intermediate
    * authority.
    */
  var isRootAuthority: js.UndefOr[Boolean] = js.undefined
  
  // The issuer of the certificate, calculated from the certificate value. Read-only.
  var issuer: js.UndefOr[String] = js.undefined
  
  // The subject key identifier of the certificate, calculated from the certificate value. Read-only.
  var issuerSki: js.UndefOr[String] = js.undefined
}
object CertificateAuthority {
  
  inline def apply(): CertificateAuthority = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[CertificateAuthority]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: CertificateAuthority] (val x: Self) extends AnyVal {
    
    inline def setCertificate(value: String): Self = StObject.set(x, "certificate", value.asInstanceOf[js.Any])
    
    inline def setCertificateRevocationListUrl(value: NullableOption[String]): Self = StObject.set(x, "certificateRevocationListUrl", value.asInstanceOf[js.Any])
    
    inline def setCertificateRevocationListUrlNull: Self = StObject.set(x, "certificateRevocationListUrl", null)
    
    inline def setCertificateRevocationListUrlUndefined: Self = StObject.set(x, "certificateRevocationListUrl", js.undefined)
    
    inline def setCertificateUndefined: Self = StObject.set(x, "certificate", js.undefined)
    
    inline def setDeltaCertificateRevocationListUrl(value: NullableOption[String]): Self = StObject.set(x, "deltaCertificateRevocationListUrl", value.asInstanceOf[js.Any])
    
    inline def setDeltaCertificateRevocationListUrlNull: Self = StObject.set(x, "deltaCertificateRevocationListUrl", null)
    
    inline def setDeltaCertificateRevocationListUrlUndefined: Self = StObject.set(x, "deltaCertificateRevocationListUrl", js.undefined)
    
    inline def setIsRootAuthority(value: Boolean): Self = StObject.set(x, "isRootAuthority", value.asInstanceOf[js.Any])
    
    inline def setIsRootAuthorityUndefined: Self = StObject.set(x, "isRootAuthority", js.undefined)
    
    inline def setIssuer(value: String): Self = StObject.set(x, "issuer", value.asInstanceOf[js.Any])
    
    inline def setIssuerSki(value: String): Self = StObject.set(x, "issuerSki", value.asInstanceOf[js.Any])
    
    inline def setIssuerSkiUndefined: Self = StObject.set(x, "issuerSki", js.undefined)
    
    inline def setIssuerUndefined: Self = StObject.set(x, "issuer", js.undefined)
  }
}
