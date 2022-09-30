package typings.pkijs.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined pkijs.pkijs.PkiObjectParameters & std.Partial<pkijs.pkijs.IPolicyConstraints> */
trait PolicyConstraintsParameters extends StObject {
  
  var inhibitPolicyMapping: js.UndefOr[Double] = js.undefined
  
  var requireExplicitPolicy: js.UndefOr[Double] = js.undefined
  
  var schema: js.UndefOr[SchemaType] = js.undefined
}
object PolicyConstraintsParameters {
  
  inline def apply(): PolicyConstraintsParameters = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PolicyConstraintsParameters]
  }
  
  extension [Self <: PolicyConstraintsParameters](x: Self) {
    
    inline def setInhibitPolicyMapping(value: Double): Self = StObject.set(x, "inhibitPolicyMapping", value.asInstanceOf[js.Any])
    
    inline def setInhibitPolicyMappingUndefined: Self = StObject.set(x, "inhibitPolicyMapping", js.undefined)
    
    inline def setRequireExplicitPolicy(value: Double): Self = StObject.set(x, "requireExplicitPolicy", value.asInstanceOf[js.Any])
    
    inline def setRequireExplicitPolicyUndefined: Self = StObject.set(x, "requireExplicitPolicy", js.undefined)
    
    inline def setSchema(value: SchemaType): Self = StObject.set(x, "schema", value.asInstanceOf[js.Any])
    
    inline def setSchemaUndefined: Self = StObject.set(x, "schema", js.undefined)
  }
}
