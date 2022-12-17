package typings.pkijs.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait IssuerDomainPolicy extends StObject {
  
  var issuerDomainPolicy: js.UndefOr[String] = js.undefined
  
  var subjectDomainPolicy: js.UndefOr[String] = js.undefined
}
object IssuerDomainPolicy {
  
  inline def apply(): IssuerDomainPolicy = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[IssuerDomainPolicy]
  }
  
  extension [Self <: IssuerDomainPolicy](x: Self) {
    
    inline def setIssuerDomainPolicy(value: String): Self = StObject.set(x, "issuerDomainPolicy", value.asInstanceOf[js.Any])
    
    inline def setIssuerDomainPolicyUndefined: Self = StObject.set(x, "issuerDomainPolicy", js.undefined)
    
    inline def setSubjectDomainPolicy(value: String): Self = StObject.set(x, "subjectDomainPolicy", value.asInstanceOf[js.Any])
    
    inline def setSubjectDomainPolicyUndefined: Self = StObject.set(x, "subjectDomainPolicy", js.undefined)
  }
}
