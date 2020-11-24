package typings.maximMazurokGapiClientPolicytroubleshooter.gapi.client.policytroubleshooter

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait GoogleCloudPolicytroubleshooterV1TroubleshootIamPolicyResponse extends js.Object {
  
  /** Indicates whether the member has the specified permission for the specified resource, based on evaluating all of the applicable IAM policies. */
  var access: js.UndefOr[String] = js.native
  
  /**
    * List of IAM policies that were evaluated to check the member's permissions, with annotations to indicate how each policy contributed to the final result. The list of policies can
    * include the policy for the resource itself. It can also include policies that are inherited from higher levels of the resource hierarchy, including the organization, the folder, and
    * the project. To learn more about the resource hierarchy, see https://cloud.google.com/iam/help/resource-hierarchy.
    */
  var explainedPolicies: js.UndefOr[js.Array[GoogleCloudPolicytroubleshooterV1ExplainedPolicy]] = js.native
}
object GoogleCloudPolicytroubleshooterV1TroubleshootIamPolicyResponse {
  
  @scala.inline
  def apply(): GoogleCloudPolicytroubleshooterV1TroubleshootIamPolicyResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GoogleCloudPolicytroubleshooterV1TroubleshootIamPolicyResponse]
  }
  
  @scala.inline
  implicit class GoogleCloudPolicytroubleshooterV1TroubleshootIamPolicyResponseOps[Self <: GoogleCloudPolicytroubleshooterV1TroubleshootIamPolicyResponse] (val x: Self) extends AnyVal {
    
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
    def setAccess(value: String): Self = this.set("access", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteAccess: Self = this.set("access", js.undefined)
    
    @scala.inline
    def setExplainedPoliciesVarargs(value: GoogleCloudPolicytroubleshooterV1ExplainedPolicy*): Self = this.set("explainedPolicies", js.Array(value :_*))
    
    @scala.inline
    def setExplainedPolicies(value: js.Array[GoogleCloudPolicytroubleshooterV1ExplainedPolicy]): Self = this.set("explainedPolicies", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteExplainedPolicies: Self = this.set("explainedPolicies", js.undefined)
  }
}
