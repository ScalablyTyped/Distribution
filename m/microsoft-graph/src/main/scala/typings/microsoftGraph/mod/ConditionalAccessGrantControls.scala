package typings.microsoftGraph.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ConditionalAccessGrantControls extends js.Object {
  
  /**
    * List of values of built-in controls required by the policy. Possible values: Block, Mfa, CompliantDevice,
    * DomainJoinedDevice, ApprovedApplication, CompliantApplication
    */
  var builtInControls: js.UndefOr[js.Array[ConditionalAccessGrantControl]] = js.native
  
  // List of custom controls IDs required by the policy. For more information, see Custom controls.
  var customAuthenticationFactors: js.UndefOr[js.Array[String]] = js.native
  
  // Defines the relationship of the grant controls. Possible values: AND, OR.
  var operator: js.UndefOr[NullableOption[String]] = js.native
  
  // List of terms of use IDs required by the policy.
  var termsOfUse: js.UndefOr[js.Array[String]] = js.native
}
object ConditionalAccessGrantControls {
  
  @scala.inline
  def apply(): ConditionalAccessGrantControls = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ConditionalAccessGrantControls]
  }
  
  @scala.inline
  implicit class ConditionalAccessGrantControlsOps[Self <: ConditionalAccessGrantControls] (val x: Self) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setBuiltInControlsVarargs(value: ConditionalAccessGrantControl*): Self = this.set("builtInControls", js.Array(value :_*))
    
    @scala.inline
    def setBuiltInControls(value: js.Array[ConditionalAccessGrantControl]): Self = this.set("builtInControls", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteBuiltInControls: Self = this.set("builtInControls", js.undefined)
    
    @scala.inline
    def setCustomAuthenticationFactorsVarargs(value: String*): Self = this.set("customAuthenticationFactors", js.Array(value :_*))
    
    @scala.inline
    def setCustomAuthenticationFactors(value: js.Array[String]): Self = this.set("customAuthenticationFactors", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteCustomAuthenticationFactors: Self = this.set("customAuthenticationFactors", js.undefined)
    
    @scala.inline
    def setOperator(value: NullableOption[String]): Self = this.set("operator", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteOperator: Self = this.set("operator", js.undefined)
    
    @scala.inline
    def setOperatorNull: Self = this.set("operator", null)
    
    @scala.inline
    def setTermsOfUseVarargs(value: String*): Self = this.set("termsOfUse", js.Array(value :_*))
    
    @scala.inline
    def setTermsOfUse(value: js.Array[String]): Self = this.set("termsOfUse", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteTermsOfUse: Self = this.set("termsOfUse", js.undefined)
  }
}
