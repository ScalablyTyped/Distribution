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
  
  @scala.inline
  implicit open class MutableBuilder[Self <: CertificatePoliciesJson] (val x: Self) extends AnyVal {
    
    inline def setCertificatePolicies(value: js.Array[PolicyInformationJson]): Self = StObject.set(x, "certificatePolicies", value.asInstanceOf[js.Any])
    
    inline def setCertificatePoliciesVarargs(value: PolicyInformationJson*): Self = StObject.set(x, "certificatePolicies", js.Array(value*))
  }
}
