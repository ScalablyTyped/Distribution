package typings.maximMazurokGapiClientIap.gapi.client.iap

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait PolicyDelegationSettings extends js.Object {
  
  /** Permission to check in IAM. */
  var iamPermission: js.UndefOr[String] = js.native
  
  /**
    * The DNS name of the service (e.g. "resourcemanager.googleapis.com"). This should be the domain name part of the full resource names (see https://aip.dev/122#full-resource-names),
    * which is usually the same as IamServiceSpec.service of the service where the resource type is defined.
    */
  var iamServiceName: js.UndefOr[String] = js.native
  
  /** Policy name to be checked */
  var policyName: js.UndefOr[PolicyName] = js.native
  
  /** IAM resource to check permission on */
  var resource: js.UndefOr[Resource] = js.native
}
object PolicyDelegationSettings {
  
  @scala.inline
  def apply(): PolicyDelegationSettings = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PolicyDelegationSettings]
  }
  
  @scala.inline
  implicit class PolicyDelegationSettingsOps[Self <: PolicyDelegationSettings] (val x: Self) extends AnyVal {
    
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
    def setIamPermission(value: String): Self = this.set("iamPermission", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteIamPermission: Self = this.set("iamPermission", js.undefined)
    
    @scala.inline
    def setIamServiceName(value: String): Self = this.set("iamServiceName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteIamServiceName: Self = this.set("iamServiceName", js.undefined)
    
    @scala.inline
    def setPolicyName(value: PolicyName): Self = this.set("policyName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deletePolicyName: Self = this.set("policyName", js.undefined)
    
    @scala.inline
    def setResource(value: Resource): Self = this.set("resource", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteResource: Self = this.set("resource", js.undefined)
  }
}
