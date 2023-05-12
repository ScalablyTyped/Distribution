package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GetParametersPathHookidOwnerResponses200Content2 extends StObject {
  
  /**
    * Get a webhook configuration for a repository
    * @description Returns the webhook configuration for a repository. To get more information about the webhook, including the `active` state and `events`, use "[Get a repository webhook](/rest/reference/orgs#get-a-repository-webhook)."
    *
    * Access tokens must have the `read:repo_hook` or `repo` scope, and GitHub Apps must have the `repository_hooks:read` permission.
    */
  var get: ParametersPathHookidOwnerResponses200Content2
  
  /**
    * Update a webhook configuration for a repository
    * @description Updates the webhook configuration for a repository. To update more information about the webhook, including the `active` state and `events`, use "[Update a repository webhook](/rest/reference/orgs#update-a-repository-webhook)."
    *
    * Access tokens must have the `write:repo_hook` or `repo` scope, and GitHub Apps must have the `repository_hooks:write` permission.
    */
  var patch: ParametersPathHookidOwnerRequestBody
}
object GetParametersPathHookidOwnerResponses200Content2 {
  
  inline def apply(get: ParametersPathHookidOwnerResponses200Content2, patch: ParametersPathHookidOwnerRequestBody): GetParametersPathHookidOwnerResponses200Content2 = {
    val __obj = js.Dynamic.literal(get = get.asInstanceOf[js.Any], patch = patch.asInstanceOf[js.Any])
    __obj.asInstanceOf[GetParametersPathHookidOwnerResponses200Content2]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: GetParametersPathHookidOwnerResponses200Content2] (val x: Self) extends AnyVal {
    
    inline def setGet(value: ParametersPathHookidOwnerResponses200Content2): Self = StObject.set(x, "get", value.asInstanceOf[js.Any])
    
    inline def setPatch(value: ParametersPathHookidOwnerRequestBody): Self = StObject.set(x, "patch", value.asInstanceOf[js.Any])
  }
}
