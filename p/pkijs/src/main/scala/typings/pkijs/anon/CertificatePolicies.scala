package typings.pkijs.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait CertificatePolicies extends StObject {
  
  var certificatePolicies: js.UndefOr[String] = js.undefined
}
object CertificatePolicies {
  
  inline def apply(): CertificatePolicies = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[CertificatePolicies]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: CertificatePolicies] (val x: Self) extends AnyVal {
    
    inline def setCertificatePolicies(value: String): Self = StObject.set(x, "certificatePolicies", value.asInstanceOf[js.Any])
    
    inline def setCertificatePoliciesUndefined: Self = StObject.set(x, "certificatePolicies", js.undefined)
  }
}
