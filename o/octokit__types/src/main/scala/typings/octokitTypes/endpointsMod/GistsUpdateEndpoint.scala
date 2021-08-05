package typings.octokitTypes.endpointsMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GistsUpdateEndpoint extends StObject {
  
  /**
    * A descriptive name for this gist.
    */
  var description: js.UndefOr[String] = js.undefined
  
  /**
    * The filenames and content that make up this gist.
    */
  var files: js.UndefOr[GistsUpdateParamsFiles] = js.undefined
  
  var gist_id: String
}
object GistsUpdateEndpoint {
  
  inline def apply(gist_id: String): GistsUpdateEndpoint = {
    val __obj = js.Dynamic.literal(gist_id = gist_id.asInstanceOf[js.Any])
    __obj.asInstanceOf[GistsUpdateEndpoint]
  }
  
  extension [Self <: GistsUpdateEndpoint](x: Self) {
    
    inline def setDescription(value: String): Self = StObject.set(x, "description", value.asInstanceOf[js.Any])
    
    inline def setDescriptionUndefined: Self = StObject.set(x, "description", js.undefined)
    
    inline def setFiles(value: GistsUpdateParamsFiles): Self = StObject.set(x, "files", value.asInstanceOf[js.Any])
    
    inline def setFilesUndefined: Self = StObject.set(x, "files", js.undefined)
    
    inline def setGist_id(value: String): Self = StObject.set(x, "gist_id", value.asInstanceOf[js.Any])
  }
}
