package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DeleteParametersPath78Responses extends StObject {
  
  /**
    * Delete an organization variable
    * @description Deletes an organization variable using the variable name.
    * You must authenticate using an access token with the `admin:org` scope to use this endpoint.
    * GitHub Apps must have the `organization_actions_variables:write` organization permission to use this endpoint.
    */
  var delete: ParametersPath78Responses
  
  /**
    * Get an organization variable
    * @description Gets a specific variable in an organization. You must authenticate using an access token with the `admin:org` scope to use this endpoint. GitHub Apps must have the `organization_actions_variables:read` organization permission to use this endpoint.
    */
  var get: ParametersPath78
  
  /**
    * Update an organization variable
    * @description Updates an organization variable that you can reference in a GitHub Actions workflow.
    * You must authenticate using an access token with the `admin:org` scope to use this endpoint.
    * GitHub Apps must have the `organization_actions_variables:write` organization permission to use this endpoint.
    */
  var patch: RequestBodyContentApplicationjsonVisibility
}
object DeleteParametersPath78Responses {
  
  inline def apply(
    delete: ParametersPath78Responses,
    get: ParametersPath78,
    patch: RequestBodyContentApplicationjsonVisibility
  ): DeleteParametersPath78Responses = {
    val __obj = js.Dynamic.literal(delete = delete.asInstanceOf[js.Any], get = get.asInstanceOf[js.Any], patch = patch.asInstanceOf[js.Any])
    __obj.asInstanceOf[DeleteParametersPath78Responses]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: DeleteParametersPath78Responses] (val x: Self) extends AnyVal {
    
    inline def setDelete(value: ParametersPath78Responses): Self = StObject.set(x, "delete", value.asInstanceOf[js.Any])
    
    inline def setGet(value: ParametersPath78): Self = StObject.set(x, "get", value.asInstanceOf[js.Any])
    
    inline def setPatch(value: RequestBodyContentApplicationjsonVisibility): Self = StObject.set(x, "patch", value.asInstanceOf[js.Any])
  }
}
