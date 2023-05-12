package typings.microsoftGraph.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait AuthenticationStrengthPolicy
  extends StObject
     with Entity {
  
  // A collection of authentication method modes that are required be used to satify this authentication strength.
  var allowedCombinations: js.UndefOr[js.Array[AuthenticationMethodModes]] = js.undefined
  
  /**
    * Settings that may be used to require specific types or instances of an authentication method to be used when
    * authenticating with a specified combination of authentication methods.
    */
  var combinationConfigurations: js.UndefOr[NullableOption[js.Array[AuthenticationCombinationConfiguration]]] = js.undefined
  
  // The datetime when this policy was created.
  var createdDateTime: js.UndefOr[String] = js.undefined
  
  // The human-readable description of this policy.
  var description: js.UndefOr[NullableOption[String]] = js.undefined
  
  // The human-readable display name of this policy. Supports $filter (eq, ne, not , and in).
  var displayName: js.UndefOr[String] = js.undefined
  
  // The datetime when this policy was last modified.
  var modifiedDateTime: js.UndefOr[String] = js.undefined
  
  /**
    * A descriptor of whether this policy is built into Azure AD or created by an admin for the tenant. The possible values
    * are: builtIn, custom, unknownFutureValue. Supports $filter (eq, ne, not , and in).
    */
  var policyType: js.UndefOr[AuthenticationStrengthPolicyType] = js.undefined
  
  /**
    * A descriptor of whether this authentication strength grants the MFA claim upon successful satisfaction. The possible
    * values are: none, mfa, unknownFutureValue.
    */
  var requirementsSatisfied: js.UndefOr[AuthenticationStrengthRequirements] = js.undefined
}
object AuthenticationStrengthPolicy {
  
  inline def apply(): AuthenticationStrengthPolicy = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[AuthenticationStrengthPolicy]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: AuthenticationStrengthPolicy] (val x: Self) extends AnyVal {
    
    inline def setAllowedCombinations(value: js.Array[AuthenticationMethodModes]): Self = StObject.set(x, "allowedCombinations", value.asInstanceOf[js.Any])
    
    inline def setAllowedCombinationsUndefined: Self = StObject.set(x, "allowedCombinations", js.undefined)
    
    inline def setAllowedCombinationsVarargs(value: AuthenticationMethodModes*): Self = StObject.set(x, "allowedCombinations", js.Array(value*))
    
    inline def setCombinationConfigurations(value: NullableOption[js.Array[AuthenticationCombinationConfiguration]]): Self = StObject.set(x, "combinationConfigurations", value.asInstanceOf[js.Any])
    
    inline def setCombinationConfigurationsNull: Self = StObject.set(x, "combinationConfigurations", null)
    
    inline def setCombinationConfigurationsUndefined: Self = StObject.set(x, "combinationConfigurations", js.undefined)
    
    inline def setCombinationConfigurationsVarargs(value: AuthenticationCombinationConfiguration*): Self = StObject.set(x, "combinationConfigurations", js.Array(value*))
    
    inline def setCreatedDateTime(value: String): Self = StObject.set(x, "createdDateTime", value.asInstanceOf[js.Any])
    
    inline def setCreatedDateTimeUndefined: Self = StObject.set(x, "createdDateTime", js.undefined)
    
    inline def setDescription(value: NullableOption[String]): Self = StObject.set(x, "description", value.asInstanceOf[js.Any])
    
    inline def setDescriptionNull: Self = StObject.set(x, "description", null)
    
    inline def setDescriptionUndefined: Self = StObject.set(x, "description", js.undefined)
    
    inline def setDisplayName(value: String): Self = StObject.set(x, "displayName", value.asInstanceOf[js.Any])
    
    inline def setDisplayNameUndefined: Self = StObject.set(x, "displayName", js.undefined)
    
    inline def setModifiedDateTime(value: String): Self = StObject.set(x, "modifiedDateTime", value.asInstanceOf[js.Any])
    
    inline def setModifiedDateTimeUndefined: Self = StObject.set(x, "modifiedDateTime", js.undefined)
    
    inline def setPolicyType(value: AuthenticationStrengthPolicyType): Self = StObject.set(x, "policyType", value.asInstanceOf[js.Any])
    
    inline def setPolicyTypeUndefined: Self = StObject.set(x, "policyType", js.undefined)
    
    inline def setRequirementsSatisfied(value: AuthenticationStrengthRequirements): Self = StObject.set(x, "requirementsSatisfied", value.asInstanceOf[js.Any])
    
    inline def setRequirementsSatisfiedUndefined: Self = StObject.set(x, "requirementsSatisfied", js.undefined)
  }
}
