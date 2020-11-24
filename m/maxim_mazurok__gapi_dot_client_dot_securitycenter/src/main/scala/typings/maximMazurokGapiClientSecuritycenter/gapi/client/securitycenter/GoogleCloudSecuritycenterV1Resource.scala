package typings.maximMazurokGapiClientSecuritycenter.gapi.client.securitycenter

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait GoogleCloudSecuritycenterV1Resource extends js.Object {
  
  /** The full resource name of the resource. See: https://cloud.google.com/apis/design/resource_names#full_resource_name */
  var name: js.UndefOr[String] = js.native
  
  /** The full resource name of resource's parent. */
  var parent: js.UndefOr[String] = js.native
  
  /** The human readable name of resource's parent. */
  var parentDisplayName: js.UndefOr[String] = js.native
  
  /** The full resource name of project that the resource belongs to. */
  var project: js.UndefOr[String] = js.native
  
  /** The human readable name of project that the resource belongs to. */
  var projectDisplayName: js.UndefOr[String] = js.native
}
object GoogleCloudSecuritycenterV1Resource {
  
  @scala.inline
  def apply(): GoogleCloudSecuritycenterV1Resource = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GoogleCloudSecuritycenterV1Resource]
  }
  
  @scala.inline
  implicit class GoogleCloudSecuritycenterV1ResourceOps[Self <: GoogleCloudSecuritycenterV1Resource] (val x: Self) extends AnyVal {
    
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
    def setName(value: String): Self = this.set("name", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteName: Self = this.set("name", js.undefined)
    
    @scala.inline
    def setParent(value: String): Self = this.set("parent", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteParent: Self = this.set("parent", js.undefined)
    
    @scala.inline
    def setParentDisplayName(value: String): Self = this.set("parentDisplayName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteParentDisplayName: Self = this.set("parentDisplayName", js.undefined)
    
    @scala.inline
    def setProject(value: String): Self = this.set("project", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteProject: Self = this.set("project", js.undefined)
    
    @scala.inline
    def setProjectDisplayName(value: String): Self = this.set("projectDisplayName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteProjectDisplayName: Self = this.set("projectDisplayName", js.undefined)
  }
}
