package typings.microsoftGraph.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ConditionalAccessGrantControls extends StObject {
  
  /**
    * List of values of built-in controls required by the policy. Possible values: Block, Mfa, CompliantDevice,
    * DomainJoinedDevice, ApprovedApplication, CompliantApplication
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
  
  @scala.inline
  def apply(): ConditionalAccessGrantControls = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ConditionalAccessGrantControls]
  }
  
  @scala.inline
  implicit class ConditionalAccessGrantControlsMutableBuilder[Self <: ConditionalAccessGrantControls] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setBuiltInControls(value: js.Array[ConditionalAccessGrantControl]): Self = StObject.set(x, "builtInControls", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setBuiltInControlsUndefined: Self = StObject.set(x, "builtInControls", js.undefined)
    
    @scala.inline
    def setBuiltInControlsVarargs(value: ConditionalAccessGrantControl*): Self = StObject.set(x, "builtInControls", js.Array(value :_*))
    
    @scala.inline
    def setCustomAuthenticationFactors(value: js.Array[String]): Self = StObject.set(x, "customAuthenticationFactors", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCustomAuthenticationFactorsUndefined: Self = StObject.set(x, "customAuthenticationFactors", js.undefined)
    
    @scala.inline
    def setCustomAuthenticationFactorsVarargs(value: String*): Self = StObject.set(x, "customAuthenticationFactors", js.Array(value :_*))
    
    @scala.inline
    def setOperator(value: NullableOption[String]): Self = StObject.set(x, "operator", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOperatorNull: Self = StObject.set(x, "operator", null)
    
    @scala.inline
    def setOperatorUndefined: Self = StObject.set(x, "operator", js.undefined)
    
    @scala.inline
    def setTermsOfUse(value: js.Array[String]): Self = StObject.set(x, "termsOfUse", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTermsOfUseUndefined: Self = StObject.set(x, "termsOfUse", js.undefined)
    
    @scala.inline
    def setTermsOfUseVarargs(value: String*): Self = StObject.set(x, "termsOfUse", js.Array(value :_*))
  }
}
