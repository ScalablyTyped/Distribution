package typings.maximMazurokGapiClientNotebooks.gapi.client.notebooks

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Environment extends js.Object {
  
  /** Use a container image to start the notebook instance. */
  var containerImage: js.UndefOr[ContainerImage] = js.native
  
  /** Output only. The time at which this environment was created. */
  var createTime: js.UndefOr[String] = js.native
  
  /** A brief description of this environment. */
  var description: js.UndefOr[String] = js.native
  
  /** Display name of this environment for the UI. */
  var displayName: js.UndefOr[String] = js.native
  
  /** Output only. Name of this environment. Format: `projects/{project_id}/locations/{location}/environments/{environment_id}` */
  var name: js.UndefOr[String] = js.native
  
  /** Path to a Bash script that automatically runs after a notebook instance fully boots up. The path must be a URL or Cloud Storage path. Example: `"gs://path-to-file/file-name"` */
  var postStartupScript: js.UndefOr[String] = js.native
  
  /** Use a Compute Engine VM image to start the notebook instance. */
  var vmImage: js.UndefOr[VmImage] = js.native
}
object Environment {
  
  @scala.inline
  def apply(): Environment = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Environment]
  }
  
  @scala.inline
  implicit class EnvironmentOps[Self <: Environment] (val x: Self) extends AnyVal {
    
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
    def setContainerImage(value: ContainerImage): Self = this.set("containerImage", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteContainerImage: Self = this.set("containerImage", js.undefined)
    
    @scala.inline
    def setCreateTime(value: String): Self = this.set("createTime", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteCreateTime: Self = this.set("createTime", js.undefined)
    
    @scala.inline
    def setDescription(value: String): Self = this.set("description", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDescription: Self = this.set("description", js.undefined)
    
    @scala.inline
    def setDisplayName(value: String): Self = this.set("displayName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDisplayName: Self = this.set("displayName", js.undefined)
    
    @scala.inline
    def setName(value: String): Self = this.set("name", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteName: Self = this.set("name", js.undefined)
    
    @scala.inline
    def setPostStartupScript(value: String): Self = this.set("postStartupScript", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deletePostStartupScript: Self = this.set("postStartupScript", js.undefined)
    
    @scala.inline
    def setVmImage(value: VmImage): Self = this.set("vmImage", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteVmImage: Self = this.set("vmImage", js.undefined)
  }
}
