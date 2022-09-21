package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DeleteParametersPathCommentidOwnerResponses6 extends StObject {
  
  var delete: ParametersPathCommentidOwnerResponses6
  
  var get: ParametersPathCommentidOwner
  
  var patch: Responses200Content210
}
object DeleteParametersPathCommentidOwnerResponses6 {
  
  inline def apply(
    delete: ParametersPathCommentidOwnerResponses6,
    get: ParametersPathCommentidOwner,
    patch: Responses200Content210
  ): DeleteParametersPathCommentidOwnerResponses6 = {
    val __obj = js.Dynamic.literal(delete = delete.asInstanceOf[js.Any], get = get.asInstanceOf[js.Any], patch = patch.asInstanceOf[js.Any])
    __obj.asInstanceOf[DeleteParametersPathCommentidOwnerResponses6]
  }
  
  extension [Self <: DeleteParametersPathCommentidOwnerResponses6](x: Self) {
    
    inline def setDelete(value: ParametersPathCommentidOwnerResponses6): Self = StObject.set(x, "delete", value.asInstanceOf[js.Any])
    
    inline def setGet(value: ParametersPathCommentidOwner): Self = StObject.set(x, "get", value.asInstanceOf[js.Any])
    
    inline def setPatch(value: Responses200Content210): Self = StObject.set(x, "patch", value.asInstanceOf[js.Any])
  }
}
