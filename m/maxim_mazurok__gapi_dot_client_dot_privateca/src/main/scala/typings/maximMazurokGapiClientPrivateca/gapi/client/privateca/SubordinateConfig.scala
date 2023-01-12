package typings.maximMazurokGapiClientPrivateca.gapi.client.privateca

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SubordinateConfig extends StObject {
  
  /**
    * Required. This can refer to a CertificateAuthority that was used to create a subordinate CertificateAuthority. This field is used for information and usability purposes only. The
    * resource name is in the format `projects/ *‍/locations/ *‍/caPools/ *‍/certificateAuthorities/ *`.
    */
  var certificateAuthority: js.UndefOr[String] = js.undefined
  
  /** Required. Contains the PEM certificate chain for the issuers of this CertificateAuthority, but not pem certificate for this CA itself. */
  var pemIssuerChain: js.UndefOr[SubordinateConfigChain] = js.undefined
}
object SubordinateConfig {
  
  inline def apply(): SubordinateConfig = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SubordinateConfig]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: SubordinateConfig] (val x: Self) extends AnyVal {
    
    inline def setCertificateAuthority(value: String): Self = StObject.set(x, "certificateAuthority", value.asInstanceOf[js.Any])
    
    inline def setCertificateAuthorityUndefined: Self = StObject.set(x, "certificateAuthority", js.undefined)
    
    inline def setPemIssuerChain(value: SubordinateConfigChain): Self = StObject.set(x, "pemIssuerChain", value.asInstanceOf[js.Any])
    
    inline def setPemIssuerChainUndefined: Self = StObject.set(x, "pemIssuerChain", js.undefined)
  }
}
