package typings.maximMazurokGapiClientPrivateca.gapi.client.privateca

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SubordinateConfig extends StObject {
  
  /**
    * Required. This can refer to a CertificateAuthority in the same project that was used to create a subordinate CertificateAuthority. This field is used for information and usability
    * purposes only. The resource name is in the format `projects/∗/locations/∗/certificateAuthorities/ *`.
    */
  var certificateAuthority: js.UndefOr[String] = js.undefined
  
  /** Required. Contains the PEM certificate chain for the issuers of this CertificateAuthority, but not pem certificate for this CA itself. */
  var pemIssuerChain: js.UndefOr[SubordinateConfigChain] = js.undefined
}
object SubordinateConfig {
  
  @scala.inline
  def apply(): SubordinateConfig = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SubordinateConfig]
  }
  
  @scala.inline
  implicit class SubordinateConfigMutableBuilder[Self <: SubordinateConfig] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setCertificateAuthority(value: String): Self = StObject.set(x, "certificateAuthority", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCertificateAuthorityUndefined: Self = StObject.set(x, "certificateAuthority", js.undefined)
    
    @scala.inline
    def setPemIssuerChain(value: SubordinateConfigChain): Self = StObject.set(x, "pemIssuerChain", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPemIssuerChainUndefined: Self = StObject.set(x, "pemIssuerChain", js.undefined)
  }
}
