package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GetParametersPathHookidResponses200Content2 extends StObject {
  
  /**
    * Get a webhook configuration for an organization
    * @description Returns the webhook configuration for an organization. To get more information about the webhook, including the `active` state and `events`, use "[Get an organization webhook ](/rest/reference/orgs#get-an-organization-webhook)."
    *
    * Access tokens must have the `admin:org_hook` scope, and GitHub Apps must have the `organization_hooks:read` permission.
    */
  var get: ParametersPathHookidResponses200Content2
  
  /**
    * Update a webhook configuration for an organization
    * @description Updates the webhook configuration for an organization. To update more information about the webhook, including the `active` state and `events`, use "[Update an organization webhook ](/rest/reference/orgs#update-an-organization-webhook)."
    *
    * Access tokens must have the `admin:org_hook` scope, and GitHub Apps must have the `organization_hooks:write` permission.
    */
  var patch: ParametersPathHookidRequestBody
}
object GetParametersPathHookidResponses200Content2 {
  
  inline def apply(get: ParametersPathHookidResponses200Content2, patch: ParametersPathHookidRequestBody): GetParametersPathHookidResponses200Content2 = {
    val __obj = js.Dynamic.literal(get = get.asInstanceOf[js.Any], patch = patch.asInstanceOf[js.Any])
    __obj.asInstanceOf[GetParametersPathHookidResponses200Content2]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: GetParametersPathHookidResponses200Content2] (val x: Self) extends AnyVal {
    
    inline def setGet(value: ParametersPathHookidResponses200Content2): Self = StObject.set(x, "get", value.asInstanceOf[js.Any])
    
    inline def setPatch(value: ParametersPathHookidRequestBody): Self = StObject.set(x, "patch", value.asInstanceOf[js.Any])
  }
}
