package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DeleteParametersPathHookidOrgResponses236 extends StObject {
  
  var delete: ParametersPathHookidOrgResponses236
  
  /** Returns a webhook configured in an organization. To get only the webhook `config` properties, see "[Get a webhook configuration for an organization](/rest/reference/orgs#get-a-webhook-configuration-for-an-organization)." */
  var get: ParametersPathHookidOrg
  
  /** Updates a webhook configured in an organization. When you update a webhook, the `secret` will be overwritten. If you previously had a `secret` set, you must provide the same `secret` or set a new `secret` or the secret will be removed. If you are only updating individual webhook `config` properties, use "[Update a webhook configuration for an organization](/rest/reference/orgs#update-a-webhook-configuration-for-an-organization)." */
  var patch: RequestBodyContentApplicationjsonConfigEventsName
}
object DeleteParametersPathHookidOrgResponses236 {
  
  inline def apply(
    delete: ParametersPathHookidOrgResponses236,
    get: ParametersPathHookidOrg,
    patch: RequestBodyContentApplicationjsonConfigEventsName
  ): DeleteParametersPathHookidOrgResponses236 = {
    val __obj = js.Dynamic.literal(delete = delete.asInstanceOf[js.Any], get = get.asInstanceOf[js.Any], patch = patch.asInstanceOf[js.Any])
    __obj.asInstanceOf[DeleteParametersPathHookidOrgResponses236]
  }
  
  extension [Self <: DeleteParametersPathHookidOrgResponses236](x: Self) {
    
    inline def setDelete(value: ParametersPathHookidOrgResponses236): Self = StObject.set(x, "delete", value.asInstanceOf[js.Any])
    
    inline def setGet(value: ParametersPathHookidOrg): Self = StObject.set(x, "get", value.asInstanceOf[js.Any])
    
    inline def setPatch(value: RequestBodyContentApplicationjsonConfigEventsName): Self = StObject.set(x, "patch", value.asInstanceOf[js.Any])
  }
}
