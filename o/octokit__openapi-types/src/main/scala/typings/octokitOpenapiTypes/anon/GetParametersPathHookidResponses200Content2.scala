package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GetParametersPathHookidResponses200Content2 extends StObject {
  
  /**
    * Returns the webhook configuration for an organization. To get more information about the webhook, including the `active` state and `events`, use "[Get an organization webhook ](/rest/reference/orgs#get-an-organization-webhook)."
    *
    * Access tokens must have the `admin:org_hook` scope, and GitHub Apps must have the `organization_hooks:read` permission.
    */
  var get: ParametersPathHookidResponses200Content2
  
  /**
    * Updates the webhook configuration for an organization. To update more information about the webhook, including the `active` state and `events`, use "[Update an organization webhook ](/rest/reference/orgs#update-an-organization-webhook)."
    *
    * Access tokens must have the `admin:org_hook` scope, and GitHub Apps must have the `organization_hooks:write` permission.
    */
  var patch: RequestBodyContentApplicationjsonContenttype
}
object GetParametersPathHookidResponses200Content2 {
  
  inline def apply(get: ParametersPathHookidResponses200Content2, patch: RequestBodyContentApplicationjsonContenttype): GetParametersPathHookidResponses200Content2 = {
    val __obj = js.Dynamic.literal(get = get.asInstanceOf[js.Any], patch = patch.asInstanceOf[js.Any])
    __obj.asInstanceOf[GetParametersPathHookidResponses200Content2]
  }
  
  extension [Self <: GetParametersPathHookidResponses200Content2](x: Self) {
    
    inline def setGet(value: ParametersPathHookidResponses200Content2): Self = StObject.set(x, "get", value.asInstanceOf[js.Any])
    
    inline def setPatch(value: RequestBodyContentApplicationjsonContenttype): Self = StObject.set(x, "patch", value.asInstanceOf[js.Any])
  }
}
