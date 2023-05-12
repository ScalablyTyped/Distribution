package typings.microsoftGraph.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ConditionalAccessGrantControls extends StObject {
  
  var authenticationStrength: js.UndefOr[NullableOption[AuthenticationStrengthPolicy]] = js.undefined
  
  /**
    * List of values of built-in controls required by the policy. Possible values: block, mfa, compliantDevice,
    * domainJoinedDevice, approvedApplication, compliantApplication, passwordChange, unknownFutureValue.
    */
  var builtInControls: js.UndefOr[js.Array[ConditionalAccessGrantControl]] = js.undefined
  
  // List of custom controls IDs required by the policy. For more information, see Custom controls.
  var customAuthenticationFactors: js.UndefOr[js.Array[String]] = js.undefined
  
  // Defines the relationship of the grant controls. Possible values: AND, OR.
  var operator: js.UndefOr[NullableOption[String]] = js.undefined
  
  // List of terms of use IDs required by the policy.
  var termsOfUse: js.UndefOr[js.Array[String]] = js.undefined
}
object ConditionalAccessGrantControls {
  
  inline def apply(): ConditionalAccessGrantControls = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ConditionalAccessGrantControls]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: ConditionalAccessGrantControls] (val x: Self) extends AnyVal {
    
    inline def setAuthenticationStrength(value: NullableOption[AuthenticationStrengthPolicy]): Self = StObject.set(x, "authenticationStrength", value.asInstanceOf[js.Any])
    
    inline def setAuthenticationStrengthNull: Self = StObject.set(x, "authenticationStrength", null)
    
    inline def setAuthenticationStrengthUndefined: Self = StObject.set(x, "authenticationStrength", js.undefined)
    
    inline def setBuiltInControls(value: js.Array[ConditionalAccessGrantControl]): Self = StObject.set(x, "builtInControls", value.asInstanceOf[js.Any])
    
    inline def setBuiltInControlsUndefined: Self = StObject.set(x, "builtInControls", js.undefined)
    
    inline def setBuiltInControlsVarargs(value: ConditionalAccessGrantControl*): Self = StObject.set(x, "builtInControls", js.Array(value*))
    
    inline def setCustomAuthenticationFactors(value: js.Array[String]): Self = StObject.set(x, "customAuthenticationFactors", value.asInstanceOf[js.Any])
    
    inline def setCustomAuthenticationFactorsUndefined: Self = StObject.set(x, "customAuthenticationFactors", js.undefined)
    
    inline def setCustomAuthenticationFactorsVarargs(value: String*): Self = StObject.set(x, "customAuthenticationFactors", js.Array(value*))
    
    inline def setOperator(value: NullableOption[String]): Self = StObject.set(x, "operator", value.asInstanceOf[js.Any])
    
    inline def setOperatorNull: Self = StObject.set(x, "operator", null)
    
    inline def setOperatorUndefined: Self = StObject.set(x, "operator", js.undefined)
    
    inline def setTermsOfUse(value: js.Array[String]): Self = StObject.set(x, "termsOfUse", value.asInstanceOf[js.Any])
    
    inline def setTermsOfUseUndefined: Self = StObject.set(x, "termsOfUse", js.undefined)
    
    inline def setTermsOfUseVarargs(value: String*): Self = StObject.set(x, "termsOfUse", js.Array(value*))
  }
}
