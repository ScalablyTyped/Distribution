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
  
  /** Required. Describes how some of the technical fields in a certificate should be populated. */
  var reusableConfig: js.UndefOr[ReusableConfigWrapper] = js.undefined
  
  /** Required. Specifies some of the values in a certificate that are related to the subject. */
  var subjectConfig: js.UndefOr[SubjectConfig] = js.undefined
}
object CertificateConfig {
  
  @scala.inline
  def apply(): CertificateConfig = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[CertificateConfig]
  }
  
  @scala.inline
  implicit class CertificateConfigMutableBuilder[Self <: CertificateConfig] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setPublicKey(value: PublicKey): Self = StObject.set(x, "publicKey", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPublicKeyUndefined: Self = StObject.set(x, "publicKey", js.undefined)
    
    @scala.inline
    def setReusableConfig(value: ReusableConfigWrapper): Self = StObject.set(x, "reusableConfig", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setReusableConfigUndefined: Self = StObject.set(x, "reusableConfig", js.undefined)
    
    @scala.inline
    def setSubjectConfig(value: SubjectConfig): Self = StObject.set(x, "subjectConfig", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSubjectConfigUndefined: Self = StObject.set(x, "subjectConfig", js.undefined)
  }
}
