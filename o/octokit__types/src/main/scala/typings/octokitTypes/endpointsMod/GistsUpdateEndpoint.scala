package typings.octokitTypes.endpointsMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait GistsUpdateEndpoint extends StObject {
  
  /**
    * A descriptive name for this gist.
    */
  var description: js.UndefOr[String] = js.native
  
  /**
    * The filenames and content that make up this gist.
    */
  var files: js.UndefOr[GistsUpdateParamsFiles] = js.native
  
  var gist_id: String = js.native
}
object GistsUpdateEndpoint {
  
  @scala.inline
  def apply(gist_id: String): GistsUpdateEndpoint = {
    val __obj = js.Dynamic.literal(gist_id = gist_id.asInstanceOf[js.Any])
    __obj.asInstanceOf[GistsUpdateEndpoint]
  }
  
  @scala.inline
  implicit class GistsUpdateEndpointMutableBuilder[Self <: GistsUpdateEndpoint] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setDescription(value: String): Self = StObject.set(x, "description", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDescriptionUndefined: Self = StObject.set(x, "description", js.undefined)
    
    @scala.inline
    def setFiles(value: GistsUpdateParamsFiles): Self = StObject.set(x, "files", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFilesUndefined: Self = StObject.set(x, "files", js.undefined)
    
    @scala.inline
    def setGist_id(value: String): Self = StObject.set(x, "gist_id", value.asInstanceOf[js.Any])
  }
}
