package typings.maximMazurokGapiClientNotebooks.gapi.client.notebooks

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait VmImage extends StObject {
  
  /** Use this VM image family to find the image; the newest image in this family will be used. */
  var imageFamily: js.UndefOr[String] = js.undefined
  
  /** Use VM image name to find the image. */
  var imageName: js.UndefOr[String] = js.undefined
  
  /** Required. The name of the Google Cloud project that this VM image belongs to. Format: `{project_id}` */
  var project: js.UndefOr[String] = js.undefined
}
object VmImage {
  
  inline def apply(): VmImage = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[VmImage]
  }
  
  extension [Self <: VmImage](x: Self) {
    
    inline def setImageFamily(value: String): Self = StObject.set(x, "imageFamily", value.asInstanceOf[js.Any])
    
    inline def setImageFamilyUndefined: Self = StObject.set(x, "imageFamily", js.undefined)
    
    inline def setImageName(value: String): Self = StObject.set(x, "imageName", value.asInstanceOf[js.Any])
    
    inline def setImageNameUndefined: Self = StObject.set(x, "imageName", js.undefined)
    
    inline def setProject(value: String): Self = StObject.set(x, "project", value.asInstanceOf[js.Any])
    
    inline def setProjectUndefined: Self = StObject.set(x, "project", js.undefined)
  }
}
