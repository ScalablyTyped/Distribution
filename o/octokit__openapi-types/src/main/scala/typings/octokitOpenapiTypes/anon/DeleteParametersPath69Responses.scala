package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DeleteParametersPath69Responses extends StObject {
  
  /**
    * Delete an organization variable
    * @description Deletes an organization variable using the variable name.
    * You must authenticate using an access token with the `admin:org` scope to use this endpoint.
    * GitHub Apps must have the `organization_actions_variables:write` organization permission to use this endpoint.
    */
  var delete: ParametersPath69Responses
  
  /**
    * Get an organization variable
    * @description Gets a specific variable in an organization. You must authenticate using an access token with the `admin:org` scope to use this endpoint. GitHub Apps must have the `organization_actions_variables:read` organization permission to use this endpoint.
    */
  var get: ParametersPath69
  
  /**
    * Update an organization variable
    * @description Updates an organization variable that you can reference in a GitHub Actions workflow.
    * You must authenticate using an access token with the `admin:org` scope to use this endpoint.
    * GitHub Apps must have the `organization_actions_variables:write` organization permission to use this endpoint.
    */
  var patch: RequestBodyContentApplicationjsonVisibility
}
object DeleteParametersPath69Responses {
  
  inline def apply(
    delete: ParametersPath69Responses,
    get: ParametersPath69,
    patch: RequestBodyContentApplicationjsonVisibility
  ): DeleteParametersPath69Responses = {
    val __obj = js.Dynamic.literal(delete = delete.asInstanceOf[js.Any], get = get.asInstanceOf[js.Any], patch = patch.asInstanceOf[js.Any])
    __obj.asInstanceOf[DeleteParametersPath69Responses]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: DeleteParametersPath69Responses] (val x: Self) extends AnyVal {
    
    inline def setDelete(value: ParametersPath69Responses): Self = StObject.set(x, "delete", value.asInstanceOf[js.Any])
    
    inline def setGet(value: ParametersPath69): Self = StObject.set(x, "get", value.asInstanceOf[js.Any])
    
    inline def setPatch(value: RequestBodyContentApplicationjsonVisibility): Self = StObject.set(x, "patch", value.asInstanceOf[js.Any])
  }
}
