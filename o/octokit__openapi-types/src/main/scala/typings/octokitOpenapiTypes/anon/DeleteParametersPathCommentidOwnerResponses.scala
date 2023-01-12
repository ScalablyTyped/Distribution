package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DeleteParametersPathCommentidOwnerResponses extends StObject {
  
  var delete: ParametersPathCommentidOwnerResponses
  
  var get: Responses200Content257
  
  var patch: Responses200Content257422
}
object DeleteParametersPathCommentidOwnerResponses {
  
  inline def apply(
    delete: ParametersPathCommentidOwnerResponses,
    get: Responses200Content257,
    patch: Responses200Content257422
  ): DeleteParametersPathCommentidOwnerResponses = {
    val __obj = js.Dynamic.literal(delete = delete.asInstanceOf[js.Any], get = get.asInstanceOf[js.Any], patch = patch.asInstanceOf[js.Any])
    __obj.asInstanceOf[DeleteParametersPathCommentidOwnerResponses]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: DeleteParametersPathCommentidOwnerResponses] (val x: Self) extends AnyVal {
    
    inline def setDelete(value: ParametersPathCommentidOwnerResponses): Self = StObject.set(x, "delete", value.asInstanceOf[js.Any])
    
    inline def setGet(value: Responses200Content257): Self = StObject.set(x, "get", value.asInstanceOf[js.Any])
    
    inline def setPatch(value: Responses200Content257422): Self = StObject.set(x, "patch", value.asInstanceOf[js.Any])
  }
}
