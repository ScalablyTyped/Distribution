package typings.microsoftGraph.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ConditionalAccessRoot
  extends StObject
     with Entity {
  
  // Read-only. Nullable. Returns a collection of the specified authentication context class references.
  var authenticationContextClassReferences: js.UndefOr[NullableOption[js.Array[AuthenticationContextClassReference]]] = js.undefined
  
  var authenticationStrength: js.UndefOr[NullableOption[AuthenticationStrengthRoot]] = js.undefined
  
  // Read-only. Nullable. Returns a collection of the specified named locations.
  var namedLocations: js.UndefOr[NullableOption[js.Array[NamedLocation]]] = js.undefined
  
  // Read-only. Nullable. Returns a collection of the specified Conditional Access (CA) policies.
  var policies: js.UndefOr[NullableOption[js.Array[ConditionalAccessPolicy]]] = js.undefined
  
  // Read-only. Nullable. Returns a collection of the specified Conditional Access templates.
  var templates: js.UndefOr[NullableOption[js.Array[ConditionalAccessTemplate]]] = js.undefined
}
object ConditionalAccessRoot {
  
  inline def apply(): ConditionalAccessRoot = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ConditionalAccessRoot]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: ConditionalAccessRoot] (val x: Self) extends AnyVal {
    
    inline def setAuthenticationContextClassReferences(value: NullableOption[js.Array[AuthenticationContextClassReference]]): Self = StObject.set(x, "authenticationContextClassReferences", value.asInstanceOf[js.Any])
    
    inline def setAuthenticationContextClassReferencesNull: Self = StObject.set(x, "authenticationContextClassReferences", null)
    
    inline def setAuthenticationContextClassReferencesUndefined: Self = StObject.set(x, "authenticationContextClassReferences", js.undefined)
    
    inline def setAuthenticationContextClassReferencesVarargs(value: AuthenticationContextClassReference*): Self = StObject.set(x, "authenticationContextClassReferences", js.Array(value*))
    
    inline def setAuthenticationStrength(value: NullableOption[AuthenticationStrengthRoot]): Self = StObject.set(x, "authenticationStrength", value.asInstanceOf[js.Any])
    
    inline def setAuthenticationStrengthNull: Self = StObject.set(x, "authenticationStrength", null)
    
    inline def setAuthenticationStrengthUndefined: Self = StObject.set(x, "authenticationStrength", js.undefined)
    
    inline def setNamedLocations(value: NullableOption[js.Array[NamedLocation]]): Self = StObject.set(x, "namedLocations", value.asInstanceOf[js.Any])
    
    inline def setNamedLocationsNull: Self = StObject.set(x, "namedLocations", null)
    
    inline def setNamedLocationsUndefined: Self = StObject.set(x, "namedLocations", js.undefined)
    
    inline def setNamedLocationsVarargs(value: NamedLocation*): Self = StObject.set(x, "namedLocations", js.Array(value*))
    
    inline def setPolicies(value: NullableOption[js.Array[ConditionalAccessPolicy]]): Self = StObject.set(x, "policies", value.asInstanceOf[js.Any])
    
    inline def setPoliciesNull: Self = StObject.set(x, "policies", null)
    
    inline def setPoliciesUndefined: Self = StObject.set(x, "policies", js.undefined)
    
    inline def setPoliciesVarargs(value: ConditionalAccessPolicy*): Self = StObject.set(x, "policies", js.Array(value*))
    
    inline def setTemplates(value: NullableOption[js.Array[ConditionalAccessTemplate]]): Self = StObject.set(x, "templates", value.asInstanceOf[js.Any])
    
    inline def setTemplatesNull: Self = StObject.set(x, "templates", null)
    
    inline def setTemplatesUndefined: Self = StObject.set(x, "templates", js.undefined)
    
    inline def setTemplatesVarargs(value: ConditionalAccessTemplate*): Self = StObject.set(x, "templates", js.Array(value*))
  }
}
