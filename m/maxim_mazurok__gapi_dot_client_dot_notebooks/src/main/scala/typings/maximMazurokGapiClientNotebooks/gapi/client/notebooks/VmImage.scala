package typings.maximMazurokGapiClientNotebooks.gapi.client.notebooks

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait VmImage extends js.Object {
  
  /** Use this VM image family to find the image; the newest image in this family will be used. */
  var imageFamily: js.UndefOr[String] = js.native
  
  /** Use VM image name to find the image. */
  var imageName: js.UndefOr[String] = js.native
  
  /** Required. The name of the Google Cloud project that this VM image belongs to. Format: `projects/{project_id}` */
  var project: js.UndefOr[String] = js.native
}
object VmImage {
  
  @scala.inline
  def apply(): VmImage = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[VmImage]
  }
  
  @scala.inline
  implicit class VmImageOps[Self <: VmImage] (val x: Self) extends AnyVal {
    
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
    def setImageFamily(value: String): Self = this.set("imageFamily", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteImageFamily: Self = this.set("imageFamily", js.undefined)
    
    @scala.inline
    def setImageName(value: String): Self = this.set("imageName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteImageName: Self = this.set("imageName", js.undefined)
    
    @scala.inline
    def setProject(value: String): Self = this.set("project", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteProject: Self = this.set("project", js.undefined)
  }
}
