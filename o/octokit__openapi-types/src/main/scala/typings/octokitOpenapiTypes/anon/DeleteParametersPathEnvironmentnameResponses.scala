package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DeleteParametersPathEnvironmentnameResponses extends StObject {
  
  /**
    * Delete an environment
    * @description You must authenticate using an access token with the repo scope to use this endpoint.
    */
  var delete: ParametersPathEnvironmentnameResponses
  
  /**
    * Get an environment
    * @description **Note:** To get information about name patterns that branches must match in order to deploy to this environment, see "[Get a deployment branch policy](/rest/deployments/branch-policies#get-a-deployment-branch-policy)."
    *
    * Anyone with read access to the repository can use this endpoint. If the
    * repository is private, you must use an access token with the `repo` scope. GitHub
    * Apps must have the `actions:read` permission to use this endpoint.
    */
  var get: ParametersPathEnvironmentname
  
  /**
    * Create or update an environment
    * @description Create or update an environment with protection rules, such as required reviewers. For more information about environment protection rules, see "[Environments](/actions/reference/environments#environment-protection-rules)."
    *
    * **Note:** To create or update name patterns that branches must match in order to deploy to this environment, see "[Deployment branch policies](/rest/deployments/branch-policies)."
    *
    * **Note:** To create or update secrets for an environment, see "[Secrets](/rest/reference/actions#secrets)."
    *
    * You must authenticate using an access token with the `repo` scope to use this endpoint. GitHub Apps must have the `administration:write` permission for the repository to use this endpoint.
    */
  var put: Responses422Content36
}
object DeleteParametersPathEnvironmentnameResponses {
  
  inline def apply(
    delete: ParametersPathEnvironmentnameResponses,
    get: ParametersPathEnvironmentname,
    put: Responses422Content36
  ): DeleteParametersPathEnvironmentnameResponses = {
    val __obj = js.Dynamic.literal(delete = delete.asInstanceOf[js.Any], get = get.asInstanceOf[js.Any], put = put.asInstanceOf[js.Any])
    __obj.asInstanceOf[DeleteParametersPathEnvironmentnameResponses]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: DeleteParametersPathEnvironmentnameResponses] (val x: Self) extends AnyVal {
    
    inline def setDelete(value: ParametersPathEnvironmentnameResponses): Self = StObject.set(x, "delete", value.asInstanceOf[js.Any])
    
    inline def setGet(value: ParametersPathEnvironmentname): Self = StObject.set(x, "get", value.asInstanceOf[js.Any])
    
    inline def setPut(value: Responses422Content36): Self = StObject.set(x, "put", value.asInstanceOf[js.Any])
  }
}
