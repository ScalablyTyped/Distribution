package typings.maximMazurokGapiClientPrivateca.gapi.client.privateca

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait CertificateConfig extends js.Object {
  
  /**
    * Optional. The public key that corresponds to this config. This is, for example, used when issuing Certificates, but not when creating a self-signed CertificateAuthority or
    * CertificateAuthority CSR.
    */
  var publicKey: js.UndefOr[PublicKey] = js.native
  
  /** Required. Describes how some of the technical fields in a certificate should be populated. */
  var reusableConfig: js.UndefOr[ReusableConfigWrapper] = js.native
  
  /** Required. Specifies some of the values in a certificate that are related to the subject. */
  var subjectConfig: js.UndefOr[SubjectConfig] = js.native
}
object CertificateConfig {
  
  @scala.inline
  def apply(): CertificateConfig = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[CertificateConfig]
  }
  
  @scala.inline
  implicit class CertificateConfigOps[Self <: CertificateConfig] (val x: Self) extends AnyVal {
    
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
    def setPublicKey(value: PublicKey): Self = this.set("publicKey", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deletePublicKey: Self = this.set("publicKey", js.undefined)
    
    @scala.inline
    def setReusableConfig(value: ReusableConfigWrapper): Self = this.set("reusableConfig", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteReusableConfig: Self = this.set("reusableConfig", js.undefined)
    
    @scala.inline
    def setSubjectConfig(value: SubjectConfig): Self = this.set("subjectConfig", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSubjectConfig: Self = this.set("subjectConfig", js.undefined)
  }
}
