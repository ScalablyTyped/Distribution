package typings.maximMazurokGapiClientManagedidentities.gapi.client.managedidentities

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait LDAPSSettings extends StObject {
  
  /** Output only. The certificate used to configure LDAPS. Certificates can be chained with a maximum length of 15. */
  var certificate: js.UndefOr[Certificate] = js.undefined
  
  /** Input only. The password used to encrypt the uploaded PFX certificate. */
  var certificatePassword: js.UndefOr[String] = js.undefined
  
  /**
    * Input only. The uploaded PKCS12-formatted certificate to configure LDAPS with. It will enable the domain controllers in this domain to accept LDAPS connections (either LDAP over
    * SSL/TLS or the StartTLS operation). A valid certificate chain must form a valid x.509 certificate chain (or be comprised of a single self-signed certificate. It must be encrypted
    * with either: 1) PBES2 + PBKDF2 + AES256 encryption and SHA256 PRF; or 2) pbeWithSHA1And3-KeyTripleDES-CBC Private key must be included for the leaf / single self-signed certificate.
    * Note: For a fqdn your-example-domain.com, the wildcard fqdn is *.your-example-domain.com. Specifically the leaf certificate must have: - Either a blank subject or a subject with CN
    * matching the wildcard fqdn. - Exactly two SANs - the fqdn and wildcard fqdn. - Encipherment and digital key signature key usages. - Server authentication extended key usage
    * (OID=1.3.6.1.5.5.7.3.1) - Private key must be in one of the following formats: RSA, ECDSA, ED25519. - Private key must have appropriate key length: 2048 for RSA, 256 for ECDSA -
    * Signature algorithm of the leaf certificate cannot be MD2, MD5 or SHA1.
    */
  var certificatePfx: js.UndefOr[String] = js.undefined
  
  /** The resource name of the LDAPS settings. Uses the form: `projects/{project}/locations/{location}/domains/{domain}`. */
  var name: js.UndefOr[String] = js.undefined
  
  /** Output only. The current state of this LDAPS settings. */
  var state: js.UndefOr[String] = js.undefined
  
  /** Output only. Last update time. */
  var updateTime: js.UndefOr[String] = js.undefined
}
object LDAPSSettings {
  
  inline def apply(): LDAPSSettings = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[LDAPSSettings]
  }
  
  extension [Self <: LDAPSSettings](x: Self) {
    
    inline def setCertificate(value: Certificate): Self = StObject.set(x, "certificate", value.asInstanceOf[js.Any])
    
    inline def setCertificatePassword(value: String): Self = StObject.set(x, "certificatePassword", value.asInstanceOf[js.Any])
    
    inline def setCertificatePasswordUndefined: Self = StObject.set(x, "certificatePassword", js.undefined)
    
    inline def setCertificatePfx(value: String): Self = StObject.set(x, "certificatePfx", value.asInstanceOf[js.Any])
    
    inline def setCertificatePfxUndefined: Self = StObject.set(x, "certificatePfx", js.undefined)
    
    inline def setCertificateUndefined: Self = StObject.set(x, "certificate", js.undefined)
    
    inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    inline def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
    
    inline def setState(value: String): Self = StObject.set(x, "state", value.asInstanceOf[js.Any])
    
    inline def setStateUndefined: Self = StObject.set(x, "state", js.undefined)
    
    inline def setUpdateTime(value: String): Self = StObject.set(x, "updateTime", value.asInstanceOf[js.Any])
    
    inline def setUpdateTimeUndefined: Self = StObject.set(x, "updateTime", js.undefined)
  }
}
