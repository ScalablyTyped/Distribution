package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DeleteParametersPathCommentidOwnerResponses extends StObject {
  
  /**
    * Delete an issue comment
    * @description You can use the REST API to delete comments on issues and pull requests. Every pull request is an issue, but not every issue is a pull request.
    */
  var delete: ParametersPathCommentidOwnerResponses
  
  /**
    * Get an issue comment
    * @description You can use the REST API to get comments on issues and pull requests. Every pull request is an issue, but not every issue is a pull request.
    */
  var get: Responses200Content272
  
  /**
    * Update an issue comment
    * @description You can use the REST API to update comments on issues and pull requests. Every pull request is an issue, but not every issue is a pull request.
    */
  var patch: Responses200Content272422
}
object DeleteParametersPathCommentidOwnerResponses {
  
  inline def apply(
    delete: ParametersPathCommentidOwnerResponses,
    get: Responses200Content272,
    patch: Responses200Content272422
  ): DeleteParametersPathCommentidOwnerResponses = {
    val __obj = js.Dynamic.literal(delete = delete.asInstanceOf[js.Any], get = get.asInstanceOf[js.Any], patch = patch.asInstanceOf[js.Any])
    __obj.asInstanceOf[DeleteParametersPathCommentidOwnerResponses]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: DeleteParametersPathCommentidOwnerResponses] (val x: Self) extends AnyVal {
    
    inline def setDelete(value: ParametersPathCommentidOwnerResponses): Self = StObject.set(x, "delete", value.asInstanceOf[js.Any])
    
    inline def setGet(value: Responses200Content272): Self = StObject.set(x, "get", value.asInstanceOf[js.Any])
    
    inline def setPatch(value: Responses200Content272422): Self = StObject.set(x, "patch", value.asInstanceOf[js.Any])
  }
}
