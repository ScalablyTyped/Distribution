package typings.maximMazurokGapiClientPolicytroubleshooter.gapi.client.policytroubleshooter

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait GoogleCloudPolicytroubleshooterV1ExplainedPolicy extends js.Object {
  
  /**
    * Indicates whether _this policy_ provides the specified permission to the specified member for the specified resource. This field does _not_ indicate whether the member actually has
    * the permission for the resource. There might be another policy that overrides this policy. To determine whether the member actually has the permission, use the `access` field in the
    * TroubleshootIamPolicyResponse.
    */
  var access: js.UndefOr[String] = js.native
  
  /**
    * Details about how each binding in the policy affects the member's ability, or inability, to use the permission for the resource. If the sender of the request does not have access to
    * the policy, this field is omitted.
    */
  var bindingExplanations: js.UndefOr[js.Array[GoogleCloudPolicytroubleshooterV1BindingExplanation]] = js.native
  
  /**
    * The full resource name that identifies the resource. For example, `//compute.googleapis.com/projects/my-project/zones/us-central1-a/instances/my-instance`. If the sender of the
    * request does not have access to the policy, this field is omitted. For examples of full resource names for Google Cloud services, see
    * https://cloud.google.com/iam/help/troubleshooter/full-resource-names.
    */
  var fullResourceName: js.UndefOr[String] = js.native
  
  /** The IAM policy attached to the resource. If the sender of the request does not have access to the policy, this field is empty. */
  var policy: js.UndefOr[GoogleIamV1Policy] = js.native
  
  /**
    * The relevance of this policy to the overall determination in the TroubleshootIamPolicyResponse. If the sender of the request does not have access to the policy, this field is
    * omitted.
    */
  var relevance: js.UndefOr[String] = js.native
}
object GoogleCloudPolicytroubleshooterV1ExplainedPolicy {
  
  @scala.inline
  def apply(): GoogleCloudPolicytroubleshooterV1ExplainedPolicy = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GoogleCloudPolicytroubleshooterV1ExplainedPolicy]
  }
  
  @scala.inline
  implicit class GoogleCloudPolicytroubleshooterV1ExplainedPolicyOps[Self <: GoogleCloudPolicytroubleshooterV1ExplainedPolicy] (val x: Self) extends AnyVal {
    
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
    def setBindingExplanationsVarargs(value: GoogleCloudPolicytroubleshooterV1BindingExplanation*): Self = this.set("bindingExplanations", js.Array(value :_*))
    
    @scala.inline
    def setBindingExplanations(value: js.Array[GoogleCloudPolicytroubleshooterV1BindingExplanation]): Self = this.set("bindingExplanations", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteBindingExplanations: Self = this.set("bindingExplanations", js.undefined)
    
    @scala.inline
    def setFullResourceName(value: String): Self = this.set("fullResourceName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteFullResourceName: Self = this.set("fullResourceName", js.undefined)
    
    @scala.inline
    def setPolicy(value: GoogleIamV1Policy): Self = this.set("policy", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deletePolicy: Self = this.set("policy", js.undefined)
    
    @scala.inline
    def setRelevance(value: String): Self = this.set("relevance", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteRelevance: Self = this.set("relevance", js.undefined)
  }
}
