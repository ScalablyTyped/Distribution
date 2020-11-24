package typings.maximMazurokGapiClientPolicytroubleshooter.gapi.client.policytroubleshooter

import org.scalablytyped.runtime.TopLevel
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait GoogleCloudPolicytroubleshooterV1BindingExplanation extends js.Object {
  
  /**
    * Required. Indicates whether _this binding_ provides the specified permission to the specified member for the specified resource. This field does _not_ indicate whether the member
    * actually has the permission for the resource. There might be another binding that overrides this binding. To determine whether the member actually has the permission, use the
    * `access` field in the TroubleshootIamPolicyResponse.
    */
  var access: js.UndefOr[String] = js.native
  
  /** A condition expression that prevents access unless the expression evaluates to `true`. To learn about IAM Conditions, see http://cloud.google.com/iam/help/conditions/overview. */
  var condition: js.UndefOr[GoogleTypeExpr] = js.native
  
  /**
    * Indicates whether each member in the binding includes the member specified in the request, either directly or indirectly. Each key identifies a member in the binding, and each value
    * indicates whether the member in the binding includes the member in the request. For example, suppose that a binding includes the following members: * `user:alice@example.com` *
    * `group:product-eng@example.com` You want to troubleshoot access for `user:bob@example.com`. This user is a member of the group `group:product-eng@example.com`. For the first member
    * in the binding, the key is `user:alice@example.com`, and the `membership` field in the value is set to `MEMBERSHIP_NOT_INCLUDED`. For the second member in the binding, the key is
    * `group:product-eng@example.com`, and the `membership` field in the value is set to `MEMBERSHIP_INCLUDED`.
    */
  var memberships: js.UndefOr[
    /* import warning: importer.ImportType#apply c Unsupported type mapping: 
  {[ P in string ]: @maxim_mazurok/gapi.client.policytroubleshooter.gapi.client.policytroubleshooter.GoogleCloudPolicytroubleshooterV1BindingExplanationAnnotatedMembership}
    */ typings.maximMazurokGapiClientPolicytroubleshooter.maximMazurokGapiClientPolicytroubleshooterStrings.GoogleCloudPolicytroubleshooterV1BindingExplanation with TopLevel[js.Any]
  ] = js.native
  
  /** The relevance of this binding to the overall determination for the entire policy. */
  var relevance: js.UndefOr[String] = js.native
  
  /**
    * The role that this binding grants. For example, `roles/compute.serviceAgent`. For a complete list of predefined IAM roles, as well as the permissions in each role, see
    * https://cloud.google.com/iam/help/roles/reference.
    */
  var role: js.UndefOr[String] = js.native
  
  /** Indicates whether the role granted by this binding contains the specified permission. */
  var rolePermission: js.UndefOr[String] = js.native
  
  /** The relevance of the permission's existence, or nonexistence, in the role to the overall determination for the entire policy. */
  var rolePermissionRelevance: js.UndefOr[String] = js.native
}
object GoogleCloudPolicytroubleshooterV1BindingExplanation {
  
  @scala.inline
  def apply(): GoogleCloudPolicytroubleshooterV1BindingExplanation = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GoogleCloudPolicytroubleshooterV1BindingExplanation]
  }
  
  @scala.inline
  implicit class GoogleCloudPolicytroubleshooterV1BindingExplanationOps[Self <: GoogleCloudPolicytroubleshooterV1BindingExplanation] (val x: Self) extends AnyVal {
    
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
    def setCondition(value: GoogleTypeExpr): Self = this.set("condition", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteCondition: Self = this.set("condition", js.undefined)
    
    @scala.inline
    def setMemberships(
      value: /* import warning: importer.ImportType#apply c Unsupported type mapping: 
    {[ P in string ]: @maxim_mazurok/gapi.client.policytroubleshooter.gapi.client.policytroubleshooter.GoogleCloudPolicytroubleshooterV1BindingExplanationAnnotatedMembership}
      */ typings.maximMazurokGapiClientPolicytroubleshooter.maximMazurokGapiClientPolicytroubleshooterStrings.GoogleCloudPolicytroubleshooterV1BindingExplanation with TopLevel[js.Any]
    ): Self = this.set("memberships", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteMemberships: Self = this.set("memberships", js.undefined)
    
    @scala.inline
    def setRelevance(value: String): Self = this.set("relevance", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteRelevance: Self = this.set("relevance", js.undefined)
    
    @scala.inline
    def setRole(value: String): Self = this.set("role", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteRole: Self = this.set("role", js.undefined)
    
    @scala.inline
    def setRolePermission(value: String): Self = this.set("rolePermission", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteRolePermission: Self = this.set("rolePermission", js.undefined)
    
    @scala.inline
    def setRolePermissionRelevance(value: String): Self = this.set("rolePermissionRelevance", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteRolePermissionRelevance: Self = this.set("rolePermissionRelevance", js.undefined)
  }
}
