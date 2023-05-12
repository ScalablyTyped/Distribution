package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GetResponses200Content315 extends StObject {
  
  /**
    * Delete a review comment for a pull request
    * @description Deletes a review comment.
    */
  var delete: ParametersPathCommentidOwnerResponses7
  
  /**
    * Get a review comment for a pull request
    * @description Provides details for a review comment.
    */
  var get: Responses200Content315
  
  /**
    * Update a review comment for a pull request
    * @description Enables you to edit a review comment.
    */
  var patch: Responses316
}
object GetResponses200Content315 {
  
  inline def apply(delete: ParametersPathCommentidOwnerResponses7, get: Responses200Content315, patch: Responses316): GetResponses200Content315 = {
    val __obj = js.Dynamic.literal(delete = delete.asInstanceOf[js.Any], get = get.asInstanceOf[js.Any], patch = patch.asInstanceOf[js.Any])
    __obj.asInstanceOf[GetResponses200Content315]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: GetResponses200Content315] (val x: Self) extends AnyVal {
    
    inline def setDelete(value: ParametersPathCommentidOwnerResponses7): Self = StObject.set(x, "delete", value.asInstanceOf[js.Any])
    
    inline def setGet(value: Responses200Content315): Self = StObject.set(x, "get", value.asInstanceOf[js.Any])
    
    inline def setPatch(value: Responses316): Self = StObject.set(x, "patch", value.asInstanceOf[js.Any])
  }
}
