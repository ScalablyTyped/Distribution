package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DeleteGetPatch extends StObject {
  
  var delete: ParametersPathCommentidGistidResponses275
  
  var get: ParametersPathCommentidGistid
  
  var patch: Responses200278404
}
object DeleteGetPatch {
  
  inline def apply(
    delete: ParametersPathCommentidGistidResponses275,
    get: ParametersPathCommentidGistid,
    patch: Responses200278404
  ): DeleteGetPatch = {
    val __obj = js.Dynamic.literal(delete = delete.asInstanceOf[js.Any], get = get.asInstanceOf[js.Any], patch = patch.asInstanceOf[js.Any])
    __obj.asInstanceOf[DeleteGetPatch]
  }
  
  extension [Self <: DeleteGetPatch](x: Self) {
    
    inline def setDelete(value: ParametersPathCommentidGistidResponses275): Self = StObject.set(x, "delete", value.asInstanceOf[js.Any])
    
    inline def setGet(value: ParametersPathCommentidGistid): Self = StObject.set(x, "get", value.asInstanceOf[js.Any])
    
    inline def setPatch(value: Responses200278404): Self = StObject.set(x, "patch", value.asInstanceOf[js.Any])
  }
}
