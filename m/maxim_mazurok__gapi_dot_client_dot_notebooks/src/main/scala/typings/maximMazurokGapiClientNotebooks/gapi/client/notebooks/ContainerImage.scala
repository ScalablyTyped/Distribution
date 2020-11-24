package typings.maximMazurokGapiClientNotebooks.gapi.client.notebooks

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ContainerImage extends js.Object {
  
  /** Required. The path to the container image repository. For example: `gcr.io/{project_id}/{image_name}` */
  var repository: js.UndefOr[String] = js.native
  
  /** The tag of the container image. If not specified, this defaults to the latest tag. */
  var tag: js.UndefOr[String] = js.native
}
object ContainerImage {
  
  @scala.inline
  def apply(): ContainerImage = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ContainerImage]
  }
  
  @scala.inline
  implicit class ContainerImageOps[Self <: ContainerImage] (val x: Self) extends AnyVal {
    
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
    def setRepository(value: String): Self = this.set("repository", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteRepository: Self = this.set("repository", js.undefined)
    
    @scala.inline
    def setTag(value: String): Self = this.set("tag", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteTag: Self = this.set("tag", js.undefined)
  }
}
