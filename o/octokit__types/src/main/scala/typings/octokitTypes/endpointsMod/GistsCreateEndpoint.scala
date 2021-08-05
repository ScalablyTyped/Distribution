package typings.octokitTypes.endpointsMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GistsCreateEndpoint extends StObject {
  
  /**
    * A descriptive name for this gist.
    */
  var description: js.UndefOr[String] = js.undefined
  
  /**
    * The filenames and content of each file in the gist. The keys in the `files` object represent the filename and have the type `string`.
    */
  var files: GistsCreateParamsFiles
  
  /**
    * When `true`, the gist will be public and available for anyone to see.
    */
  var public: js.UndefOr[Boolean] = js.undefined
}
object GistsCreateEndpoint {
  
  inline def apply(files: GistsCreateParamsFiles): GistsCreateEndpoint = {
    val __obj = js.Dynamic.literal(files = files.asInstanceOf[js.Any])
    __obj.asInstanceOf[GistsCreateEndpoint]
  }
  
  extension [Self <: GistsCreateEndpoint](x: Self) {
    
    inline def setDescription(value: String): Self = StObject.set(x, "description", value.asInstanceOf[js.Any])
    
    inline def setDescriptionUndefined: Self = StObject.set(x, "description", js.undefined)
    
    inline def setFiles(value: GistsCreateParamsFiles): Self = StObject.set(x, "files", value.asInstanceOf[js.Any])
    
    inline def setPublic(value: Boolean): Self = StObject.set(x, "public", value.asInstanceOf[js.Any])
    
    inline def setPublicUndefined: Self = StObject.set(x, "public", js.undefined)
  }
}
