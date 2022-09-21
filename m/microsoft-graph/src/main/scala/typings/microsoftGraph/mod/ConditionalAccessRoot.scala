package typings.microsoftGraph.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ConditionalAccessRoot
  extends StObject
     with Entity {
  
  // Read-only. Nullable. Returns a collection of the specified named locations.
  var namedLocations: js.UndefOr[NullableOption[js.Array[NamedLocation]]] = js.undefined
  
  // Read-only. Nullable. Returns a collection of the specified Conditional Access (CA) policies.
  var policies: js.UndefOr[NullableOption[js.Array[ConditionalAccessPolicy]]] = js.undefined
}
object ConditionalAccessRoot {
  
  inline def apply(): ConditionalAccessRoot = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ConditionalAccessRoot]
  }
  
  extension [Self <: ConditionalAccessRoot](x: Self) {
    
    inline def setNamedLocations(value: NullableOption[js.Array[NamedLocation]]): Self = StObject.set(x, "namedLocations", value.asInstanceOf[js.Any])
    
    inline def setNamedLocationsNull: Self = StObject.set(x, "namedLocations", null)
    
    inline def setNamedLocationsUndefined: Self = StObject.set(x, "namedLocations", js.undefined)
    
    inline def setNamedLocationsVarargs(value: NamedLocation*): Self = StObject.set(x, "namedLocations", js.Array(value*))
    
    inline def setPolicies(value: NullableOption[js.Array[ConditionalAccessPolicy]]): Self = StObject.set(x, "policies", value.asInstanceOf[js.Any])
    
    inline def setPoliciesNull: Self = StObject.set(x, "policies", null)
    
    inline def setPoliciesUndefined: Self = StObject.set(x, "policies", js.undefined)
    
    inline def setPoliciesVarargs(value: ConditionalAccessPolicy*): Self = StObject.set(x, "policies", js.Array(value*))
  }
}
