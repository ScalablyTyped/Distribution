package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GetResponses200Content369 extends StObject {
  
  /**
    * Delete a review comment for a pull request
    * @description Deletes a review comment.
    */
  var delete: ParametersPathCommentidOwnerResponses9
  
  /**
    * Get a review comment for a pull request
    * @description Provides details for a review comment.
    */
  var get: Responses200Content369
  
  /**
    * Update a review comment for a pull request
    * @description Enables you to edit a review comment.
    */
  var patch: Responses370
}
object GetResponses200Content369 {
  
  inline def apply(delete: ParametersPathCommentidOwnerResponses9, get: Responses200Content369, patch: Responses370): GetResponses200Content369 = {
    val __obj = js.Dynamic.literal(delete = delete.asInstanceOf[js.Any], get = get.asInstanceOf[js.Any], patch = patch.asInstanceOf[js.Any])
    __obj.asInstanceOf[GetResponses200Content369]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: GetResponses200Content369] (val x: Self) extends AnyVal {
    
    inline def setDelete(value: ParametersPathCommentidOwnerResponses9): Self = StObject.set(x, "delete", value.asInstanceOf[js.Any])
    
    inline def setGet(value: Responses200Content369): Self = StObject.set(x, "get", value.asInstanceOf[js.Any])
    
    inline def setPatch(value: Responses370): Self = StObject.set(x, "patch", value.asInstanceOf[js.Any])
  }
}
