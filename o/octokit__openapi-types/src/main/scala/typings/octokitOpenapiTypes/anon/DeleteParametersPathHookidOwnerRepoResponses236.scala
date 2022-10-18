package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DeleteParametersPathHookidOwnerRepoResponses236 extends StObject {
  
  var delete: ParametersPathHookidOwnerRepoResponses236
  
  /** Returns a webhook configured in a repository. To get only the webhook `config` properties, see "[Get a webhook configuration for a repository](/rest/reference/repos#get-a-webhook-configuration-for-a-repository)." */
  var get: ParametersPathHookidOwnerRepo
  
  /** Updates a webhook configured in a repository. If you previously had a `secret` set, you must provide the same `secret` or set a new `secret` or the secret will be removed. If you are only updating individual webhook `config` properties, use "[Update a webhook configuration for a repository](/rest/reference/repos#update-a-webhook-configuration-for-a-repository)." */
  var patch: RequestBodyContentApplicationjsonRemoveevents
}
object DeleteParametersPathHookidOwnerRepoResponses236 {
  
  inline def apply(
    delete: ParametersPathHookidOwnerRepoResponses236,
    get: ParametersPathHookidOwnerRepo,
    patch: RequestBodyContentApplicationjsonRemoveevents
  ): DeleteParametersPathHookidOwnerRepoResponses236 = {
    val __obj = js.Dynamic.literal(delete = delete.asInstanceOf[js.Any], get = get.asInstanceOf[js.Any], patch = patch.asInstanceOf[js.Any])
    __obj.asInstanceOf[DeleteParametersPathHookidOwnerRepoResponses236]
  }
  
  extension [Self <: DeleteParametersPathHookidOwnerRepoResponses236](x: Self) {
    
    inline def setDelete(value: ParametersPathHookidOwnerRepoResponses236): Self = StObject.set(x, "delete", value.asInstanceOf[js.Any])
    
    inline def setGet(value: ParametersPathHookidOwnerRepo): Self = StObject.set(x, "get", value.asInstanceOf[js.Any])
    
    inline def setPatch(value: RequestBodyContentApplicationjsonRemoveevents): Self = StObject.set(x, "patch", value.asInstanceOf[js.Any])
  }
}
