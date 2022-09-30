package typings.pkijs.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ICertificatePolicies extends StObject {
  
  var certificatePolicies: js.Array[PolicyInformation]
}
object ICertificatePolicies {
  
  inline def apply(certificatePolicies: js.Array[PolicyInformation]): ICertificatePolicies = {
    val __obj = js.Dynamic.literal(certificatePolicies = certificatePolicies.asInstanceOf[js.Any])
    __obj.asInstanceOf[ICertificatePolicies]
  }
  
  extension [Self <: ICertificatePolicies](x: Self) {
    
    inline def setCertificatePolicies(value: js.Array[PolicyInformation]): Self = StObject.set(x, "certificatePolicies", value.asInstanceOf[js.Any])
    
    inline def setCertificatePoliciesVarargs(value: PolicyInformation*): Self = StObject.set(x, "certificatePolicies", js.Array(value*))
  }
}
