package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GetParametersPathHookidOwnerRepoResponses200Content229 extends StObject {
  
  /**
    * Returns the webhook configuration for a repository. To get more information about the webhook, including the `active` state and `events`, use "[Get a repository webhook](/rest/reference/orgs#get-a-repository-webhook)."
    *
    * Access tokens must have the `read:repo_hook` or `repo` scope, and GitHub Apps must have the `repository_hooks:read` permission.
    */
  var get: ParametersPathHookidOwnerRepoResponses200Content229
  
  /**
    * Updates the webhook configuration for a repository. To update more information about the webhook, including the `active` state and `events`, use "[Update a repository webhook](/rest/reference/orgs#update-a-repository-webhook)."
    *
    * Access tokens must have the `write:repo_hook` or `repo` scope, and GitHub Apps must have the `repository_hooks:write` permission.
    */
  var patch: ParametersPathHookidOwnerRepoRequestBodyContentApplicationjsonSecret
}
object GetParametersPathHookidOwnerRepoResponses200Content229 {
  
  inline def apply(
    get: ParametersPathHookidOwnerRepoResponses200Content229,
    patch: ParametersPathHookidOwnerRepoRequestBodyContentApplicationjsonSecret
  ): GetParametersPathHookidOwnerRepoResponses200Content229 = {
    val __obj = js.Dynamic.literal(get = get.asInstanceOf[js.Any], patch = patch.asInstanceOf[js.Any])
    __obj.asInstanceOf[GetParametersPathHookidOwnerRepoResponses200Content229]
  }
  
  extension [Self <: GetParametersPathHookidOwnerRepoResponses200Content229](x: Self) {
    
    inline def setGet(value: ParametersPathHookidOwnerRepoResponses200Content229): Self = StObject.set(x, "get", value.asInstanceOf[js.Any])
    
    inline def setPatch(value: ParametersPathHookidOwnerRepoRequestBodyContentApplicationjsonSecret): Self = StObject.set(x, "patch", value.asInstanceOf[js.Any])
  }
}
