package typings.maximMazurokGapiClientPolicytroubleshooter.gapi.client.policytroubleshooter

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait GoogleCloudPolicytroubleshooterV1AccessTuple extends js.Object {
  
  /**
    * Required. The full resource name that identifies the resource. For example, `//compute.googleapis.com/projects/my-project/zones/us-central1-a/instances/my-instance`. For examples of
    * full resource names for Google Cloud services, see https://cloud.google.com/iam/help/troubleshooter/full-resource-names.
    */
  var fullResourceName: js.UndefOr[String] = js.native
  
  /**
    * Required. The IAM permission to check for the specified member and resource. For a complete list of IAM permissions, see https://cloud.google.com/iam/help/permissions/reference. For
    * a complete list of predefined IAM roles and the permissions in each role, see https://cloud.google.com/iam/help/roles/reference.
    */
  var permission: js.UndefOr[String] = js.native
  
  /**
    * Required. The member, or principal, whose access you want to check, in the form of the email address that represents that member. For example, `alice@example.com` or
    * `my-service-account@my-project.iam.gserviceaccount.com`. The member must be a Google Account or a service account. Other types of members are not supported.
    */
  var principal: js.UndefOr[String] = js.native
}
object GoogleCloudPolicytroubleshooterV1AccessTuple {
  
  @scala.inline
  def apply(): GoogleCloudPolicytroubleshooterV1AccessTuple = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GoogleCloudPolicytroubleshooterV1AccessTuple]
  }
  
  @scala.inline
  implicit class GoogleCloudPolicytroubleshooterV1AccessTupleOps[Self <: GoogleCloudPolicytroubleshooterV1AccessTuple] (val x: Self) extends AnyVal {
    
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
    def setFullResourceName(value: String): Self = this.set("fullResourceName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteFullResourceName: Self = this.set("fullResourceName", js.undefined)
    
    @scala.inline
    def setPermission(value: String): Self = this.set("permission", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deletePermission: Self = this.set("permission", js.undefined)
    
    @scala.inline
    def setPrincipal(value: String): Self = this.set("principal", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deletePrincipal: Self = this.set("principal", js.undefined)
  }
}
