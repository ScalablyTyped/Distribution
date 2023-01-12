package typings.pkijs.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined pkijs.pkijs.PkiObjectParameters & std.Partial<pkijs.pkijs.ICertificatePolicies> */
trait CertificatePoliciesParameters extends StObject {
  
  var certificatePolicies: js.UndefOr[js.Array[PolicyInformation]] = js.undefined
  
  var schema: js.UndefOr[SchemaType] = js.undefined
}
object CertificatePoliciesParameters {
  
  inline def apply(): CertificatePoliciesParameters = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[CertificatePoliciesParameters]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: CertificatePoliciesParameters] (val x: Self) extends AnyVal {
    
    inline def setCertificatePolicies(value: js.Array[PolicyInformation]): Self = StObject.set(x, "certificatePolicies", value.asInstanceOf[js.Any])
    
    inline def setCertificatePoliciesUndefined: Self = StObject.set(x, "certificatePolicies", js.undefined)
    
    inline def setCertificatePoliciesVarargs(value: PolicyInformation*): Self = StObject.set(x, "certificatePolicies", js.Array(value*))
    
    inline def setSchema(value: SchemaType): Self = StObject.set(x, "schema", value.asInstanceOf[js.Any])
    
    inline def setSchemaUndefined: Self = StObject.set(x, "schema", js.undefined)
  }
}
