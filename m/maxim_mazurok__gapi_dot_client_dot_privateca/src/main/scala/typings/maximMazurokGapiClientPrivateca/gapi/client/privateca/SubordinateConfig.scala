package typings.maximMazurokGapiClientPrivateca.gapi.client.privateca

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait SubordinateConfig extends js.Object {
  
  /**
    * Required. This can refer to a CertificateAuthority in the same project that was used to create a subordinate CertificateAuthority. This field is used for information and usability
    * purposes only. The resource name is in the format `projects/∗/locations/∗/certificateAuthorities/ *`.
    */
  var certificateAuthority: js.UndefOr[String] = js.native
  
  /** Required. Contains the PEM certificate chain for the issuers of this CertificateAuthority, but not pem certificate for this CA itself. */
  var pemIssuerChain: js.UndefOr[SubordinateConfigChain] = js.native
}
object SubordinateConfig {
  
  @scala.inline
  def apply(): SubordinateConfig = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SubordinateConfig]
  }
  
  @scala.inline
  implicit class SubordinateConfigOps[Self <: SubordinateConfig] (val x: Self) extends AnyVal {
    
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
    def setCertificateAuthority(value: String): Self = this.set("certificateAuthority", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteCertificateAuthority: Self = this.set("certificateAuthority", js.undefined)
    
    @scala.inline
    def setPemIssuerChain(value: SubordinateConfigChain): Self = this.set("pemIssuerChain", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deletePemIssuerChain: Self = this.set("pemIssuerChain", js.undefined)
  }
}
