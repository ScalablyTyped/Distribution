package typings.pkijs.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait CertificatePoliciesJson extends StObject {
  
  var certificatePolicies: js.Array[PolicyInformationJson]
}
object CertificatePoliciesJson {
  
  inline def apply(certificatePolicies: js.Array[PolicyInformationJson]): CertificatePoliciesJson = {
    val __obj = js.Dynamic.literal(certificatePolicies = certificatePolicies.asInstanceOf[js.Any])
    __obj.asInstanceOf[CertificatePoliciesJson]
  }
  
  extension [Self <: CertificatePoliciesJson](x: Self) {
    
    inline def setCertificatePolicies(value: js.Array[PolicyInformationJson]): Self = StObject.set(x, "certificatePolicies", value.asInstanceOf[js.Any])
    
    inline def setCertificatePoliciesVarargs(value: PolicyInformationJson*): Self = StObject.set(x, "certificatePolicies", js.Array(value*))
  }
}
