package typings.microsoftGraph.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait AppliedConditionalAccessPolicy extends js.Object {
  
  // Refers to the Name of the conditional access policy (example: 'Require MFA for Salesforce').
  var displayName: js.UndefOr[NullableOption[String]] = js.native
  
  /**
    * Refers to the grant controls enforced by the conditional access policy (example: 'Require multi-factor
    * authentication').
    */
  var enforcedGrantControls: js.UndefOr[NullableOption[js.Array[String]]] = js.native
  
  // Refers to the session controls enforced by the conditional access policy (example: 'Require app enforced controls').
  var enforcedSessionControls: js.UndefOr[NullableOption[js.Array[String]]] = js.native
  
  // Unique GUID of the conditional access policy.
  var id: js.UndefOr[NullableOption[String]] = js.native
  
  /**
    * Indicates the result of the CA policy that was triggered. Possible values are:successfailurenotApplied - Policy isn't
    * applied because policy conditions were not met.notEnabled - This is due to the policy in disabled state.
    */
  var result: js.UndefOr[NullableOption[AppliedConditionalAccessPolicyResult]] = js.native
}
object AppliedConditionalAccessPolicy {
  
  @scala.inline
  def apply(): AppliedConditionalAccessPolicy = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[AppliedConditionalAccessPolicy]
  }
  
  @scala.inline
  implicit class AppliedConditionalAccessPolicyOps[Self <: AppliedConditionalAccessPolicy] (val x: Self) extends AnyVal {
    
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
    def setDisplayName(value: NullableOption[String]): Self = this.set("displayName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDisplayName: Self = this.set("displayName", js.undefined)
    
    @scala.inline
    def setDisplayNameNull: Self = this.set("displayName", null)
    
    @scala.inline
    def setEnforcedGrantControlsVarargs(value: String*): Self = this.set("enforcedGrantControls", js.Array(value :_*))
    
    @scala.inline
    def setEnforcedGrantControls(value: NullableOption[js.Array[String]]): Self = this.set("enforcedGrantControls", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteEnforcedGrantControls: Self = this.set("enforcedGrantControls", js.undefined)
    
    @scala.inline
    def setEnforcedGrantControlsNull: Self = this.set("enforcedGrantControls", null)
    
    @scala.inline
    def setEnforcedSessionControlsVarargs(value: String*): Self = this.set("enforcedSessionControls", js.Array(value :_*))
    
    @scala.inline
    def setEnforcedSessionControls(value: NullableOption[js.Array[String]]): Self = this.set("enforcedSessionControls", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteEnforcedSessionControls: Self = this.set("enforcedSessionControls", js.undefined)
    
    @scala.inline
    def setEnforcedSessionControlsNull: Self = this.set("enforcedSessionControls", null)
    
    @scala.inline
    def setId(value: NullableOption[String]): Self = this.set("id", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteId: Self = this.set("id", js.undefined)
    
    @scala.inline
    def setIdNull: Self = this.set("id", null)
    
    @scala.inline
    def setResult(value: NullableOption[AppliedConditionalAccessPolicyResult]): Self = this.set("result", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteResult: Self = this.set("result", js.undefined)
    
    @scala.inline
    def setResultNull: Self = this.set("result", null)
  }
}
