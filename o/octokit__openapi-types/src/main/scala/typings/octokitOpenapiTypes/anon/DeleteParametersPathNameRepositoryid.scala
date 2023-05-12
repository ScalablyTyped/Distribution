package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DeleteParametersPathNameRepositoryid extends StObject {
  
  /**
    * Delete an environment variable
    * @description Deletes an environment variable using the variable name.
    * You must authenticate using an access token with the `repo` scope to use this endpoint.
    * GitHub Apps must have the `environment:write` repository permission to use this endpoint.
    */
  var delete: ParametersPathNameRepositoryid
  
  /**
    * Get an environment variable
    * @description Gets a specific variable in an environment. You must authenticate using an access token with the `repo` scope to use this endpoint. GitHub Apps must have the `environments:read` repository permission to use this endpoint.
    */
  var get: ParametersPathEnvironmentnameName
  
  /**
    * Update an environment variable
    * @description Updates an environment variable that you can reference in a GitHub Actions workflow.
    * You must authenticate using an access token with the `repo` scope to use this endpoint.
    * GitHub Apps must have the `environment:write` repository permission to use this endpoint.
    */
  var patch: ParametersPathNameRepositoryidRequestBodyContentApplicationjson165
}
object DeleteParametersPathNameRepositoryid {
  
  inline def apply(
    delete: ParametersPathNameRepositoryid,
    get: ParametersPathEnvironmentnameName,
    patch: ParametersPathNameRepositoryidRequestBodyContentApplicationjson165
  ): DeleteParametersPathNameRepositoryid = {
    val __obj = js.Dynamic.literal(delete = delete.asInstanceOf[js.Any], get = get.asInstanceOf[js.Any], patch = patch.asInstanceOf[js.Any])
    __obj.asInstanceOf[DeleteParametersPathNameRepositoryid]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: DeleteParametersPathNameRepositoryid] (val x: Self) extends AnyVal {
    
    inline def setDelete(value: ParametersPathNameRepositoryid): Self = StObject.set(x, "delete", value.asInstanceOf[js.Any])
    
    inline def setGet(value: ParametersPathEnvironmentnameName): Self = StObject.set(x, "get", value.asInstanceOf[js.Any])
    
    inline def setPatch(value: ParametersPathNameRepositoryidRequestBodyContentApplicationjson165): Self = StObject.set(x, "patch", value.asInstanceOf[js.Any])
  }
}
