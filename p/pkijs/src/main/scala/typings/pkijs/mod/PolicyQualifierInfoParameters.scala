package typings.pkijs.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined pkijs.pkijs.PkiObjectParameters & std.Partial<pkijs.pkijs.IPolicyQualifierInfo> */
trait PolicyQualifierInfoParameters extends StObject {
  
  var policyQualifierId: js.UndefOr[String] = js.undefined
  
  var qualifier: js.UndefOr[SchemaType] = js.undefined
  
  var schema: js.UndefOr[SchemaType] = js.undefined
}
object PolicyQualifierInfoParameters {
  
  inline def apply(): PolicyQualifierInfoParameters = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PolicyQualifierInfoParameters]
  }
  
  extension [Self <: PolicyQualifierInfoParameters](x: Self) {
    
    inline def setPolicyQualifierId(value: String): Self = StObject.set(x, "policyQualifierId", value.asInstanceOf[js.Any])
    
    inline def setPolicyQualifierIdUndefined: Self = StObject.set(x, "policyQualifierId", js.undefined)
    
    inline def setQualifier(value: SchemaType): Self = StObject.set(x, "qualifier", value.asInstanceOf[js.Any])
    
    inline def setQualifierUndefined: Self = StObject.set(x, "qualifier", js.undefined)
    
    inline def setSchema(value: SchemaType): Self = StObject.set(x, "schema", value.asInstanceOf[js.Any])
    
    inline def setSchemaUndefined: Self = StObject.set(x, "schema", js.undefined)
  }
}
