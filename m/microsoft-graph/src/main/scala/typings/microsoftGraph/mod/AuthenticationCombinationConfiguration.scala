package typings.microsoftGraph.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait AuthenticationCombinationConfiguration
  extends StObject
     with Entity {
  
  /**
    * Which authentication method combinations this configuration applies to. Must be an allowedCombinations object that's
    * defined for the authenticationStrengthPolicy. The only possible value for fido2combinationConfigurations is 'fido2'.
    */
  var appliesToCombinations: js.UndefOr[js.Array[AuthenticationMethodModes]] = js.undefined
}
object AuthenticationCombinationConfiguration {
  
  inline def apply(): AuthenticationCombinationConfiguration = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[AuthenticationCombinationConfiguration]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: AuthenticationCombinationConfiguration] (val x: Self) extends AnyVal {
    
    inline def setAppliesToCombinations(value: js.Array[AuthenticationMethodModes]): Self = StObject.set(x, "appliesToCombinations", value.asInstanceOf[js.Any])
    
    inline def setAppliesToCombinationsUndefined: Self = StObject.set(x, "appliesToCombinations", js.undefined)
    
    inline def setAppliesToCombinationsVarargs(value: AuthenticationMethodModes*): Self = StObject.set(x, "appliesToCombinations", js.Array(value*))
  }
}
