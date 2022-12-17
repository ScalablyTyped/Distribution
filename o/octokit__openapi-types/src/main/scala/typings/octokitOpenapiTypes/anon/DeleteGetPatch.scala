package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DeleteGetPatch extends StObject {
  
  var delete: ParametersPathCommentidResponses304403404
  
  var get: ParametersPathCommentid
  
  var patch: Responses20036404
}
object DeleteGetPatch {
  
  inline def apply(
    delete: ParametersPathCommentidResponses304403404,
    get: ParametersPathCommentid,
    patch: Responses20036404
  ): DeleteGetPatch = {
    val __obj = js.Dynamic.literal(delete = delete.asInstanceOf[js.Any], get = get.asInstanceOf[js.Any], patch = patch.asInstanceOf[js.Any])
    __obj.asInstanceOf[DeleteGetPatch]
  }
  
  extension [Self <: DeleteGetPatch](x: Self) {
    
    inline def setDelete(value: ParametersPathCommentidResponses304403404): Self = StObject.set(x, "delete", value.asInstanceOf[js.Any])
    
    inline def setGet(value: ParametersPathCommentid): Self = StObject.set(x, "get", value.asInstanceOf[js.Any])
    
    inline def setPatch(value: Responses20036404): Self = StObject.set(x, "patch", value.asInstanceOf[js.Any])
  }
}
