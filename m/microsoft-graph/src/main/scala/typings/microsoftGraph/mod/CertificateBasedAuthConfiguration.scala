package typings.microsoftGraph.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait CertificateBasedAuthConfiguration
  extends StObject
     with Entity {
  
  // Collection of certificate authorities which creates a trusted certificate chain.
  var certificateAuthorities: js.UndefOr[js.Array[CertificateAuthority]] = js.undefined
}
object CertificateBasedAuthConfiguration {
  
  inline def apply(): CertificateBasedAuthConfiguration = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[CertificateBasedAuthConfiguration]
  }
  
  extension [Self <: CertificateBasedAuthConfiguration](x: Self) {
    
    inline def setCertificateAuthorities(value: js.Array[CertificateAuthority]): Self = StObject.set(x, "certificateAuthorities", value.asInstanceOf[js.Any])
    
    inline def setCertificateAuthoritiesUndefined: Self = StObject.set(x, "certificateAuthorities", js.undefined)
    
    inline def setCertificateAuthoritiesVarargs(value: CertificateAuthority*): Self = StObject.set(x, "certificateAuthorities", js.Array(value*))
  }
}
