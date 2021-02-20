package typings.maximMazurokGapiClientNotebooks.gapi.client.notebooks

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ContainerImage extends StObject {
  
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
  implicit class ContainerImageMutableBuilder[Self <: ContainerImage] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setRepository(value: String): Self = StObject.set(x, "repository", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRepositoryUndefined: Self = StObject.set(x, "repository", js.undefined)
    
    @scala.inline
    def setTag(value: String): Self = StObject.set(x, "tag", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTagUndefined: Self = StObject.set(x, "tag", js.undefined)
  }
}
