package typings.pkijs.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined pkijs.pkijs.PkiObjectParameters & std.Partial<pkijs.pkijs.IPolicyMapping> */
trait PolicyMappingParameters extends StObject {
  
  var issuerDomainPolicy: js.UndefOr[String] = js.undefined
  
  var schema: js.UndefOr[SchemaType] = js.undefined
  
  var subjectDomainPolicy: js.UndefOr[String] = js.undefined
}
object PolicyMappingParameters {
  
  inline def apply(): PolicyMappingParameters = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PolicyMappingParameters]
  }
  
  extension [Self <: PolicyMappingParameters](x: Self) {
    
    inline def setIssuerDomainPolicy(value: String): Self = StObject.set(x, "issuerDomainPolicy", value.asInstanceOf[js.Any])
    
    inline def setIssuerDomainPolicyUndefined: Self = StObject.set(x, "issuerDomainPolicy", js.undefined)
    
    inline def setSchema(value: SchemaType): Self = StObject.set(x, "schema", value.asInstanceOf[js.Any])
    
    inline def setSchemaUndefined: Self = StObject.set(x, "schema", js.undefined)
    
    inline def setSubjectDomainPolicy(value: String): Self = StObject.set(x, "subjectDomainPolicy", value.asInstanceOf[js.Any])
    
    inline def setSubjectDomainPolicyUndefined: Self = StObject.set(x, "subjectDomainPolicy", js.undefined)
  }
}
