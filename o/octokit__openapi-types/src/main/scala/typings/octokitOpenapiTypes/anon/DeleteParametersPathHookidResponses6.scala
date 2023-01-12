package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DeleteParametersPathHookidResponses6 extends StObject {
  
  var delete: ParametersPathHookidResponses6
  
  /** Returns a webhook configured in an organization. To get only the webhook `config` properties, see "[Get a webhook configuration for an organization](/rest/reference/orgs#get-a-webhook-configuration-for-an-organization)." */
  var get: ParametersPathHookid
  
  /** Updates a webhook configured in an organization. When you update a webhook, the `secret` will be overwritten. If you previously had a `secret` set, you must provide the same `secret` or set a new `secret` or the secret will be removed. If you are only updating individual webhook `config` properties, use "[Update a webhook configuration for an organization](/rest/reference/orgs#update-a-webhook-configuration-for-an-organization)." */
  var patch: RequestBodyContentApplicationjsonConfig
}
object DeleteParametersPathHookidResponses6 {
  
  inline def apply(
    delete: ParametersPathHookidResponses6,
    get: ParametersPathHookid,
    patch: RequestBodyContentApplicationjsonConfig
  ): DeleteParametersPathHookidResponses6 = {
    val __obj = js.Dynamic.literal(delete = delete.asInstanceOf[js.Any], get = get.asInstanceOf[js.Any], patch = patch.asInstanceOf[js.Any])
    __obj.asInstanceOf[DeleteParametersPathHookidResponses6]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: DeleteParametersPathHookidResponses6] (val x: Self) extends AnyVal {
    
    inline def setDelete(value: ParametersPathHookidResponses6): Self = StObject.set(x, "delete", value.asInstanceOf[js.Any])
    
    inline def setGet(value: ParametersPathHookid): Self = StObject.set(x, "get", value.asInstanceOf[js.Any])
    
    inline def setPatch(value: RequestBodyContentApplicationjsonConfig): Self = StObject.set(x, "patch", value.asInstanceOf[js.Any])
  }
}
