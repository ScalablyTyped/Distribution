package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DeleteParametersPathCommentidOwnerResponses extends StObject {
  
  var delete: ParametersPathCommentidOwnerResponses
  
  var get: Responses200Content264
  
  var patch: Responses200Content264422
}
object DeleteParametersPathCommentidOwnerResponses {
  
  inline def apply(
    delete: ParametersPathCommentidOwnerResponses,
    get: Responses200Content264,
    patch: Responses200Content264422
  ): DeleteParametersPathCommentidOwnerResponses = {
    val __obj = js.Dynamic.literal(delete = delete.asInstanceOf[js.Any], get = get.asInstanceOf[js.Any], patch = patch.asInstanceOf[js.Any])
    __obj.asInstanceOf[DeleteParametersPathCommentidOwnerResponses]
  }
  
  extension [Self <: DeleteParametersPathCommentidOwnerResponses](x: Self) {
    
    inline def setDelete(value: ParametersPathCommentidOwnerResponses): Self = StObject.set(x, "delete", value.asInstanceOf[js.Any])
    
    inline def setGet(value: Responses200Content264): Self = StObject.set(x, "get", value.asInstanceOf[js.Any])
    
    inline def setPatch(value: Responses200Content264422): Self = StObject.set(x, "patch", value.asInstanceOf[js.Any])
  }
}
