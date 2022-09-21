package typings.maximMazurokGapiClientPrivateca.gapi.client.privateca

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait CertificateConfig extends StObject {
  
  /**
    * Optional. The public key that corresponds to this config. This is, for example, used when issuing Certificates, but not when creating a self-signed CertificateAuthority or
    * CertificateAuthority CSR.
    */
  var publicKey: js.UndefOr[PublicKey] = js.undefined
  
  /** Required. Specifies some of the values in a certificate that are related to the subject. */
  var subjectConfig: js.UndefOr[SubjectConfig] = js.undefined
  
  /** Required. Describes how some of the technical X.509 fields in a certificate should be populated. */
  var x509Config: js.UndefOr[X509Parameters] = js.undefined
}
object CertificateConfig {
  
  inline def apply(): CertificateConfig = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[CertificateConfig]
  }
  
  extension [Self <: CertificateConfig](x: Self) {
    
    inline def setPublicKey(value: PublicKey): Self = StObject.set(x, "publicKey", value.asInstanceOf[js.Any])
    
    inline def setPublicKeyUndefined: Self = StObject.set(x, "publicKey", js.undefined)
    
    inline def setSubjectConfig(value: SubjectConfig): Self = StObject.set(x, "subjectConfig", value.asInstanceOf[js.Any])
    
    inline def setSubjectConfigUndefined: Self = StObject.set(x, "subjectConfig", js.undefined)
    
    inline def setX509Config(value: X509Parameters): Self = StObject.set(x, "x509Config", value.asInstanceOf[js.Any])
    
    inline def setX509ConfigUndefined: Self = StObject.set(x, "x509Config", js.undefined)
  }
}
