package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GetResponses200Content560 extends StObject {
  
  /** Deletes a review comment. */
  var delete: ParametersPathCommentidOwnerRepoResponses236
  
  /** Provides details for a review comment. */
  var get: Responses200Content560
  
  /** Enables you to edit a review comment. */
  var patch: Responses561
}
object GetResponses200Content560 {
  
  inline def apply(
    delete: ParametersPathCommentidOwnerRepoResponses236,
    get: Responses200Content560,
    patch: Responses561
  ): GetResponses200Content560 = {
    val __obj = js.Dynamic.literal(delete = delete.asInstanceOf[js.Any], get = get.asInstanceOf[js.Any], patch = patch.asInstanceOf[js.Any])
    __obj.asInstanceOf[GetResponses200Content560]
  }
  
  extension [Self <: GetResponses200Content560](x: Self) {
    
    inline def setDelete(value: ParametersPathCommentidOwnerRepoResponses236): Self = StObject.set(x, "delete", value.asInstanceOf[js.Any])
    
    inline def setGet(value: Responses200Content560): Self = StObject.set(x, "get", value.asInstanceOf[js.Any])
    
    inline def setPatch(value: Responses561): Self = StObject.set(x, "patch", value.asInstanceOf[js.Any])
  }
}
