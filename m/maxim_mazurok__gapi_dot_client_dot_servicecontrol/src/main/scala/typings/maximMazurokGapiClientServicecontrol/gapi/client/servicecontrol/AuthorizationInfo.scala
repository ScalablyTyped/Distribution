package typings.maximMazurokGapiClientServicecontrol.gapi.client.servicecontrol

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait AuthorizationInfo extends js.Object {
  
  /** Whether or not authorization for `resource` and `permission` was granted. */
  var granted: js.UndefOr[Boolean] = js.native
  
  /** The required IAM permission. */
  var permission: js.UndefOr[String] = js.native
  
  /** The resource being accessed, as a REST-style string. For example: bigquery.googleapis.com/projects/PROJECTID/datasets/DATASETID */
  var resource: js.UndefOr[String] = js.native
  
  /**
    * Resource attributes used in IAM condition evaluation. This field contains resource attributes like resource type and resource name. To get the whole view of the attributes used in
    * IAM condition evaluation, the user must also look into `AuditLog.request_metadata.request_attributes`.
    */
  var resourceAttributes: js.UndefOr[Resource] = js.native
}
object AuthorizationInfo {
  
  @scala.inline
  def apply(): AuthorizationInfo = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[AuthorizationInfo]
  }
  
  @scala.inline
  implicit class AuthorizationInfoOps[Self <: AuthorizationInfo] (val x: Self) extends AnyVal {
    
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
    def setGranted(value: Boolean): Self = this.set("granted", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteGranted: Self = this.set("granted", js.undefined)
    
    @scala.inline
    def setPermission(value: String): Self = this.set("permission", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deletePermission: Self = this.set("permission", js.undefined)
    
    @scala.inline
    def setResource(value: String): Self = this.set("resource", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteResource: Self = this.set("resource", js.undefined)
    
    @scala.inline
    def setResourceAttributes(value: Resource): Self = this.set("resourceAttributes", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteResourceAttributes: Self = this.set("resourceAttributes", js.undefined)
  }
}
