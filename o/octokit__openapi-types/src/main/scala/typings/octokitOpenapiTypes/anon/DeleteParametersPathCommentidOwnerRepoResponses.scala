package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DeleteParametersPathCommentidOwnerRepoResponses extends StObject {
  
  var delete: ParametersPathCommentidOwnerRepoResponses
  
  var get: Responses200Content526
  
  var patch: Responses200Content526422
}
object DeleteParametersPathCommentidOwnerRepoResponses {
  
  inline def apply(
    delete: ParametersPathCommentidOwnerRepoResponses,
    get: Responses200Content526,
    patch: Responses200Content526422
  ): DeleteParametersPathCommentidOwnerRepoResponses = {
    val __obj = js.Dynamic.literal(delete = delete.asInstanceOf[js.Any], get = get.asInstanceOf[js.Any], patch = patch.asInstanceOf[js.Any])
    __obj.asInstanceOf[DeleteParametersPathCommentidOwnerRepoResponses]
  }
  
  extension [Self <: DeleteParametersPathCommentidOwnerRepoResponses](x: Self) {
    
    inline def setDelete(value: ParametersPathCommentidOwnerRepoResponses): Self = StObject.set(x, "delete", value.asInstanceOf[js.Any])
    
    inline def setGet(value: Responses200Content526): Self = StObject.set(x, "get", value.asInstanceOf[js.Any])
    
    inline def setPatch(value: Responses200Content526422): Self = StObject.set(x, "patch", value.asInstanceOf[js.Any])
  }
}
