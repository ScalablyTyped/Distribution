package typings.maximMazurokGapiClientSourcerepo.gapi.client.sourcerepo

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait UpdateProjectConfigRequest extends js.Object {
  
  /** The new configuration for the project. */
  var projectConfig: js.UndefOr[ProjectConfig] = js.native
  
  /** A FieldMask specifying which fields of the project_config to modify. Only the fields in the mask will be modified. If no mask is provided, this request is no-op. */
  var updateMask: js.UndefOr[String] = js.native
}
object UpdateProjectConfigRequest {
  
  @scala.inline
  def apply(): UpdateProjectConfigRequest = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[UpdateProjectConfigRequest]
  }
  
  @scala.inline
  implicit class UpdateProjectConfigRequestOps[Self <: UpdateProjectConfigRequest] (val x: Self) extends AnyVal {
    
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
    def setProjectConfig(value: ProjectConfig): Self = this.set("projectConfig", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteProjectConfig: Self = this.set("projectConfig", js.undefined)
    
    @scala.inline
    def setUpdateMask(value: String): Self = this.set("updateMask", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteUpdateMask: Self = this.set("updateMask", js.undefined)
  }
}
