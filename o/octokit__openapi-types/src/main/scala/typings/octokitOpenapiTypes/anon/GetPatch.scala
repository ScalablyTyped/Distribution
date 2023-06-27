package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GetPatch extends StObject {
  
  /** Delete a gist comment */
  var delete: ParametersPathCommentidResponses304403404
  
  /** Get a gist comment */
  var get: ParametersPathCommentid
  
  /** Update a gist comment */
  var patch: Responses20027404
}
object GetPatch {
  
  inline def apply(
    delete: ParametersPathCommentidResponses304403404,
    get: ParametersPathCommentid,
    patch: Responses20027404
  ): GetPatch = {
    val __obj = js.Dynamic.literal(delete = delete.asInstanceOf[js.Any], get = get.asInstanceOf[js.Any], patch = patch.asInstanceOf[js.Any])
    __obj.asInstanceOf[GetPatch]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: GetPatch] (val x: Self) extends AnyVal {
    
    inline def setDelete(value: ParametersPathCommentidResponses304403404): Self = StObject.set(x, "delete", value.asInstanceOf[js.Any])
    
    inline def setGet(value: ParametersPathCommentid): Self = StObject.set(x, "get", value.asInstanceOf[js.Any])
    
    inline def setPatch(value: Responses20027404): Self = StObject.set(x, "patch", value.asInstanceOf[js.Any])
  }
}
