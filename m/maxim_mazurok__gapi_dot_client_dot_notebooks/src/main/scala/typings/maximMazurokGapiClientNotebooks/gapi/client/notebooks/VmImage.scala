package typings.maximMazurokGapiClientNotebooks.gapi.client.notebooks

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait VmImage extends StObject {
  
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
  implicit class VmImageMutableBuilder[Self <: VmImage] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setImageFamily(value: String): Self = StObject.set(x, "imageFamily", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setImageFamilyUndefined: Self = StObject.set(x, "imageFamily", js.undefined)
    
    @scala.inline
    def setImageName(value: String): Self = StObject.set(x, "imageName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setImageNameUndefined: Self = StObject.set(x, "imageName", js.undefined)
    
    @scala.inline
    def setProject(value: String): Self = StObject.set(x, "project", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setProjectUndefined: Self = StObject.set(x, "project", js.undefined)
  }
}
