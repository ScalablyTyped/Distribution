package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DeleteParametersPathHookidOwnerResponses6 extends StObject {
  
  var delete: ParametersPathHookidOwnerResponses6
  
  /** Returns a webhook configured in a repository. To get only the webhook `config` properties, see "[Get a webhook configuration for a repository](/rest/reference/repos#get-a-webhook-configuration-for-a-repository)." */
  var get: ParametersPathHookidOwner
  
  /** Updates a webhook configured in a repository. If you previously had a `secret` set, you must provide the same `secret` or set a new `secret` or the secret will be removed. If you are only updating individual webhook `config` properties, use "[Update a webhook configuration for a repository](/rest/reference/repos#update-a-webhook-configuration-for-a-repository)." */
  var patch: RequestBodyContentApplicationjsonAddevents
}
object DeleteParametersPathHookidOwnerResponses6 {
  
  inline def apply(
    delete: ParametersPathHookidOwnerResponses6,
    get: ParametersPathHookidOwner,
    patch: RequestBodyContentApplicationjsonAddevents
  ): DeleteParametersPathHookidOwnerResponses6 = {
    val __obj = js.Dynamic.literal(delete = delete.asInstanceOf[js.Any], get = get.asInstanceOf[js.Any], patch = patch.asInstanceOf[js.Any])
    __obj.asInstanceOf[DeleteParametersPathHookidOwnerResponses6]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: DeleteParametersPathHookidOwnerResponses6] (val x: Self) extends AnyVal {
    
    inline def setDelete(value: ParametersPathHookidOwnerResponses6): Self = StObject.set(x, "delete", value.asInstanceOf[js.Any])
    
    inline def setGet(value: ParametersPathHookidOwner): Self = StObject.set(x, "get", value.asInstanceOf[js.Any])
    
    inline def setPatch(value: RequestBodyContentApplicationjsonAddevents): Self = StObject.set(x, "patch", value.asInstanceOf[js.Any])
  }
}
