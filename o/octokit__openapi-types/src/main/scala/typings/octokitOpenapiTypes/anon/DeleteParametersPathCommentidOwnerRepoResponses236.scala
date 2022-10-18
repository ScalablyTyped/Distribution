package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DeleteParametersPathCommentidOwnerRepoResponses236 extends StObject {
  
  var delete: ParametersPathCommentidOwnerRepoResponses236
  
  var get: ParametersPathCommentidOwnerRepo
  
  var patch: Responses200Content467
}
object DeleteParametersPathCommentidOwnerRepoResponses236 {
  
  inline def apply(
    delete: ParametersPathCommentidOwnerRepoResponses236,
    get: ParametersPathCommentidOwnerRepo,
    patch: Responses200Content467
  ): DeleteParametersPathCommentidOwnerRepoResponses236 = {
    val __obj = js.Dynamic.literal(delete = delete.asInstanceOf[js.Any], get = get.asInstanceOf[js.Any], patch = patch.asInstanceOf[js.Any])
    __obj.asInstanceOf[DeleteParametersPathCommentidOwnerRepoResponses236]
  }
  
  extension [Self <: DeleteParametersPathCommentidOwnerRepoResponses236](x: Self) {
    
    inline def setDelete(value: ParametersPathCommentidOwnerRepoResponses236): Self = StObject.set(x, "delete", value.asInstanceOf[js.Any])
    
    inline def setGet(value: ParametersPathCommentidOwnerRepo): Self = StObject.set(x, "get", value.asInstanceOf[js.Any])
    
    inline def setPatch(value: Responses200Content467): Self = StObject.set(x, "patch", value.asInstanceOf[js.Any])
  }
}
