package typings.microsoftGraph.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait CertificateBasedAuthConfiguration extends Entity {
  
  // Collection of certificate authorities which creates a trusted certificate chain.
  var certificateAuthorities: js.UndefOr[js.Array[CertificateAuthority]] = js.native
}
object CertificateBasedAuthConfiguration {
  
  @scala.inline
  def apply(): CertificateBasedAuthConfiguration = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[CertificateBasedAuthConfiguration]
  }
  
  @scala.inline
  implicit class CertificateBasedAuthConfigurationMutableBuilder[Self <: CertificateBasedAuthConfiguration] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setCertificateAuthorities(value: js.Array[CertificateAuthority]): Self = StObject.set(x, "certificateAuthorities", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCertificateAuthoritiesUndefined: Self = StObject.set(x, "certificateAuthorities", js.undefined)
    
    @scala.inline
    def setCertificateAuthoritiesVarargs(value: CertificateAuthority*): Self = StObject.set(x, "certificateAuthorities", js.Array(value :_*))
  }
}
