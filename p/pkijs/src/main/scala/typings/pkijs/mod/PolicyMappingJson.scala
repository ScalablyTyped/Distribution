package typings.pkijs.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait PolicyMappingJson extends StObject {
  
  var issuerDomainPolicy: String
  
  var subjectDomainPolicy: String
}
object PolicyMappingJson {
  
  inline def apply(issuerDomainPolicy: String, subjectDomainPolicy: String): PolicyMappingJson = {
    val __obj = js.Dynamic.literal(issuerDomainPolicy = issuerDomainPolicy.asInstanceOf[js.Any], subjectDomainPolicy = subjectDomainPolicy.asInstanceOf[js.Any])
    __obj.asInstanceOf[PolicyMappingJson]
  }
  
  extension [Self <: PolicyMappingJson](x: Self) {
    
    inline def setIssuerDomainPolicy(value: String): Self = StObject.set(x, "issuerDomainPolicy", value.asInstanceOf[js.Any])
    
    inline def setSubjectDomainPolicy(value: String): Self = StObject.set(x, "subjectDomainPolicy", value.asInstanceOf[js.Any])
  }
}
