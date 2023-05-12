package typings.microsoftGraph.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait AuthenticationStrengthRoot
  extends StObject
     with Entity {
  
  // Names and descriptions of all valid authentication method modes in the system.
  var authenticationMethodModes: js.UndefOr[NullableOption[js.Array[AuthenticationMethodModeDetail]]] = js.undefined
  
  var combinations: js.UndefOr[js.Array[AuthenticationMethodModes]] = js.undefined
  
  /**
    * A collection of authentication strength policies that exist for this tenant, including both built-in and custom
    * policies.
    */
  var policies: js.UndefOr[NullableOption[js.Array[AuthenticationStrengthPolicy]]] = js.undefined
}
object AuthenticationStrengthRoot {
  
  inline def apply(): AuthenticationStrengthRoot = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[AuthenticationStrengthRoot]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: AuthenticationStrengthRoot] (val x: Self) extends AnyVal {
    
    inline def setAuthenticationMethodModes(value: NullableOption[js.Array[AuthenticationMethodModeDetail]]): Self = StObject.set(x, "authenticationMethodModes", value.asInstanceOf[js.Any])
    
    inline def setAuthenticationMethodModesNull: Self = StObject.set(x, "authenticationMethodModes", null)
    
    inline def setAuthenticationMethodModesUndefined: Self = StObject.set(x, "authenticationMethodModes", js.undefined)
    
    inline def setAuthenticationMethodModesVarargs(value: AuthenticationMethodModeDetail*): Self = StObject.set(x, "authenticationMethodModes", js.Array(value*))
    
    inline def setCombinations(value: js.Array[AuthenticationMethodModes]): Self = StObject.set(x, "combinations", value.asInstanceOf[js.Any])
    
    inline def setCombinationsUndefined: Self = StObject.set(x, "combinations", js.undefined)
    
    inline def setCombinationsVarargs(value: AuthenticationMethodModes*): Self = StObject.set(x, "combinations", js.Array(value*))
    
    inline def setPolicies(value: NullableOption[js.Array[AuthenticationStrengthPolicy]]): Self = StObject.set(x, "policies", value.asInstanceOf[js.Any])
    
    inline def setPoliciesNull: Self = StObject.set(x, "policies", null)
    
    inline def setPoliciesUndefined: Self = StObject.set(x, "policies", js.undefined)
    
    inline def setPoliciesVarargs(value: AuthenticationStrengthPolicy*): Self = StObject.set(x, "policies", js.Array(value*))
  }
}
