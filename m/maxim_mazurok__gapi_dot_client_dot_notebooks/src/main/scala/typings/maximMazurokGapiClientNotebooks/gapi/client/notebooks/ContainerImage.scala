package typings.maximMazurokGapiClientNotebooks.gapi.client.notebooks

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ContainerImage extends StObject {
  
  /** Required. The path to the container image repository. For example: `gcr.io/{project_id}/{image_name}` */
  var repository: js.UndefOr[String] = js.undefined
  
  /** The tag of the container image. If not specified, this defaults to the latest tag. */
  var tag: js.UndefOr[String] = js.undefined
}
object ContainerImage {
  
  inline def apply(): ContainerImage = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ContainerImage]
  }
  
  extension [Self <: ContainerImage](x: Self) {
    
    inline def setRepository(value: String): Self = StObject.set(x, "repository", value.asInstanceOf[js.Any])
    
    inline def setRepositoryUndefined: Self = StObject.set(x, "repository", js.undefined)
    
    inline def setTag(value: String): Self = StObject.set(x, "tag", value.asInstanceOf[js.Any])
    
    inline def setTagUndefined: Self = StObject.set(x, "tag", js.undefined)
  }
}
