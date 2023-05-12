package typings.microsoftGraph.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait UpdateAllowedCombinationsResult extends StObject {
  
  // Information about why the updateAllowedCombinations action was successful or failed.
  var additionalInformation: js.UndefOr[NullableOption[String]] = js.undefined
  
  // References to existing Conditional Access policies that use this authentication strength.
  var conditionalAccessReferences: js.UndefOr[NullableOption[js.Array[String]]] = js.undefined
  
  // The list of current authentication method combinations allowed by the authentication strength.
  var currentCombinations: js.UndefOr[js.Array[AuthenticationMethodModes]] = js.undefined
  
  /**
    * The list of former authentication method combinations allowed by the authentication strength before they were updated
    * through the updateAllowedCombinations action.
    */
  var previousCombinations: js.UndefOr[js.Array[AuthenticationMethodModes]] = js.undefined
}
object UpdateAllowedCombinationsResult {
  
  inline def apply(): UpdateAllowedCombinationsResult = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[UpdateAllowedCombinationsResult]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: UpdateAllowedCombinationsResult] (val x: Self) extends AnyVal {
    
    inline def setAdditionalInformation(value: NullableOption[String]): Self = StObject.set(x, "additionalInformation", value.asInstanceOf[js.Any])
    
    inline def setAdditionalInformationNull: Self = StObject.set(x, "additionalInformation", null)
    
    inline def setAdditionalInformationUndefined: Self = StObject.set(x, "additionalInformation", js.undefined)
    
    inline def setConditionalAccessReferences(value: NullableOption[js.Array[String]]): Self = StObject.set(x, "conditionalAccessReferences", value.asInstanceOf[js.Any])
    
    inline def setConditionalAccessReferencesNull: Self = StObject.set(x, "conditionalAccessReferences", null)
    
    inline def setConditionalAccessReferencesUndefined: Self = StObject.set(x, "conditionalAccessReferences", js.undefined)
    
    inline def setConditionalAccessReferencesVarargs(value: String*): Self = StObject.set(x, "conditionalAccessReferences", js.Array(value*))
    
    inline def setCurrentCombinations(value: js.Array[AuthenticationMethodModes]): Self = StObject.set(x, "currentCombinations", value.asInstanceOf[js.Any])
    
    inline def setCurrentCombinationsUndefined: Self = StObject.set(x, "currentCombinations", js.undefined)
    
    inline def setCurrentCombinationsVarargs(value: AuthenticationMethodModes*): Self = StObject.set(x, "currentCombinations", js.Array(value*))
    
    inline def setPreviousCombinations(value: js.Array[AuthenticationMethodModes]): Self = StObject.set(x, "previousCombinations", value.asInstanceOf[js.Any])
    
    inline def setPreviousCombinationsUndefined: Self = StObject.set(x, "previousCombinations", js.undefined)
    
    inline def setPreviousCombinationsVarargs(value: AuthenticationMethodModes*): Self = StObject.set(x, "previousCombinations", js.Array(value*))
  }
}
