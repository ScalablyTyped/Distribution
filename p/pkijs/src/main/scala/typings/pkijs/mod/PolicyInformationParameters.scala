package typings.pkijs.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined pkijs.pkijs.PkiObjectParameters & std.Partial<pkijs.pkijs.IPolicyInformation> */
trait PolicyInformationParameters extends StObject {
  
  var policyIdentifier: js.UndefOr[String] = js.undefined
  
  var policyQualifiers: js.UndefOr[js.Array[PolicyQualifierInfo]] = js.undefined
  
  var schema: js.UndefOr[SchemaType] = js.undefined
}
object PolicyInformationParameters {
  
  inline def apply(): PolicyInformationParameters = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PolicyInformationParameters]
  }
  
  extension [Self <: PolicyInformationParameters](x: Self) {
    
    inline def setPolicyIdentifier(value: String): Self = StObject.set(x, "policyIdentifier", value.asInstanceOf[js.Any])
    
    inline def setPolicyIdentifierUndefined: Self = StObject.set(x, "policyIdentifier", js.undefined)
    
    inline def setPolicyQualifiers(value: js.Array[PolicyQualifierInfo]): Self = StObject.set(x, "policyQualifiers", value.asInstanceOf[js.Any])
    
    inline def setPolicyQualifiersUndefined: Self = StObject.set(x, "policyQualifiers", js.undefined)
    
    inline def setPolicyQualifiersVarargs(value: PolicyQualifierInfo*): Self = StObject.set(x, "policyQualifiers", js.Array(value*))
    
    inline def setSchema(value: SchemaType): Self = StObject.set(x, "schema", value.asInstanceOf[js.Any])
    
    inline def setSchemaUndefined: Self = StObject.set(x, "schema", js.undefined)
  }
}
