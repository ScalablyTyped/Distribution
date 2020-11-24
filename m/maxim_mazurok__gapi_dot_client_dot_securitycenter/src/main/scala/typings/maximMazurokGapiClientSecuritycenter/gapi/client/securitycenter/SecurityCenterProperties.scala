package typings.maximMazurokGapiClientSecuritycenter.gapi.client.securitycenter

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait SecurityCenterProperties extends js.Object {
  
  /** The user defined display name for this resource. */
  var resourceDisplayName: js.UndefOr[String] = js.native
  
  /**
    * The full resource name of the Google Cloud resource this asset represents. This field is immutable after create time. See:
    * https://cloud.google.com/apis/design/resource_names#full_resource_name
    */
  var resourceName: js.UndefOr[String] = js.native
  
  /** Owners of the Google Cloud resource. */
  var resourceOwners: js.UndefOr[js.Array[String]] = js.native
  
  /** The full resource name of the immediate parent of the resource. See: https://cloud.google.com/apis/design/resource_names#full_resource_name */
  var resourceParent: js.UndefOr[String] = js.native
  
  /** The user defined display name for the parent of this resource. */
  var resourceParentDisplayName: js.UndefOr[String] = js.native
  
  /** The full resource name of the project the resource belongs to. See: https://cloud.google.com/apis/design/resource_names#full_resource_name */
  var resourceProject: js.UndefOr[String] = js.native
  
  /** The user defined display name for the project of this resource. */
  var resourceProjectDisplayName: js.UndefOr[String] = js.native
  
  /**
    * The type of the Google Cloud resource. Examples include: APPLICATION, PROJECT, and ORGANIZATION. This is a case insensitive field defined by Security Command Center and/or the
    * producer of the resource and is immutable after create time.
    */
  var resourceType: js.UndefOr[String] = js.native
}
object SecurityCenterProperties {
  
  @scala.inline
  def apply(): SecurityCenterProperties = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SecurityCenterProperties]
  }
  
  @scala.inline
  implicit class SecurityCenterPropertiesOps[Self <: SecurityCenterProperties] (val x: Self) extends AnyVal {
    
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
    def setResourceDisplayName(value: String): Self = this.set("resourceDisplayName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteResourceDisplayName: Self = this.set("resourceDisplayName", js.undefined)
    
    @scala.inline
    def setResourceName(value: String): Self = this.set("resourceName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteResourceName: Self = this.set("resourceName", js.undefined)
    
    @scala.inline
    def setResourceOwnersVarargs(value: String*): Self = this.set("resourceOwners", js.Array(value :_*))
    
    @scala.inline
    def setResourceOwners(value: js.Array[String]): Self = this.set("resourceOwners", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteResourceOwners: Self = this.set("resourceOwners", js.undefined)
    
    @scala.inline
    def setResourceParent(value: String): Self = this.set("resourceParent", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteResourceParent: Self = this.set("resourceParent", js.undefined)
    
    @scala.inline
    def setResourceParentDisplayName(value: String): Self = this.set("resourceParentDisplayName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteResourceParentDisplayName: Self = this.set("resourceParentDisplayName", js.undefined)
    
    @scala.inline
    def setResourceProject(value: String): Self = this.set("resourceProject", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteResourceProject: Self = this.set("resourceProject", js.undefined)
    
    @scala.inline
    def setResourceProjectDisplayName(value: String): Self = this.set("resourceProjectDisplayName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteResourceProjectDisplayName: Self = this.set("resourceProjectDisplayName", js.undefined)
    
    @scala.inline
    def setResourceType(value: String): Self = this.set("resourceType", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteResourceType: Self = this.set("resourceType", js.undefined)
  }
}
