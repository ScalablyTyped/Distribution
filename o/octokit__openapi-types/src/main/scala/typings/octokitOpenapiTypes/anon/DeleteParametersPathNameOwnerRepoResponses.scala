package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DeleteParametersPathNameOwnerRepoResponses extends StObject {
  
  /**
    * Delete a repository variable
    * @description Deletes a repository variable using the variable name.
    * You must authenticate using an access token with the `repo` scope to use this endpoint.
    * GitHub Apps must have the `actions_variables:write` repository permission to use this endpoint.
    */
  var delete: ParametersPathNameOwnerRepoResponses
  
  /**
    * Get a repository variable
    * @description Gets a specific variable in a repository. You must authenticate using an access token with the `repo` scope to use this endpoint. GitHub Apps must have the `actions_variables:read` repository permission to use this endpoint.
    */
  var get: ParametersPathNameOwnerRepo
  
  /**
    * Update a repository variable
    * @description Updates a repository variable that you can reference in a GitHub Actions workflow.
    * You must authenticate using an access token with the `repo` scope to use this endpoint.
    * GitHub Apps must have the `actions_variables:write` repository permission to use this endpoint.
    */
  var patch: RequestBodyContentApplicationjson165
}
object DeleteParametersPathNameOwnerRepoResponses {
  
  inline def apply(
    delete: ParametersPathNameOwnerRepoResponses,
    get: ParametersPathNameOwnerRepo,
    patch: RequestBodyContentApplicationjson165
  ): DeleteParametersPathNameOwnerRepoResponses = {
    val __obj = js.Dynamic.literal(delete = delete.asInstanceOf[js.Any], get = get.asInstanceOf[js.Any], patch = patch.asInstanceOf[js.Any])
    __obj.asInstanceOf[DeleteParametersPathNameOwnerRepoResponses]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: DeleteParametersPathNameOwnerRepoResponses] (val x: Self) extends AnyVal {
    
    inline def setDelete(value: ParametersPathNameOwnerRepoResponses): Self = StObject.set(x, "delete", value.asInstanceOf[js.Any])
    
    inline def setGet(value: ParametersPathNameOwnerRepo): Self = StObject.set(x, "get", value.asInstanceOf[js.Any])
    
    inline def setPatch(value: RequestBodyContentApplicationjson165): Self = StObject.set(x, "patch", value.asInstanceOf[js.Any])
  }
}
