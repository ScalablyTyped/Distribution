package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DeleteParametersPathHookidOwnerResponses9 extends StObject {
  
  /** Delete a repository webhook */
  var delete: ParametersPathHookidOwnerResponses9
  
  /**
    * Get a repository webhook
    * @description Returns a webhook configured in a repository. To get only the webhook `config` properties, see "[Get a webhook configuration for a repository](/rest/reference/repos#get-a-webhook-configuration-for-a-repository)."
    */
  var get: ParametersPathHookidOwner
  
  /**
    * Update a repository webhook
    * @description Updates a webhook configured in a repository. If you previously had a `secret` set, you must provide the same `secret` or set a new `secret` or the secret will be removed. If you are only updating individual webhook `config` properties, use "[Update a webhook configuration for a repository](/rest/reference/repos#update-a-webhook-configuration-for-a-repository)."
    */
  var patch: RequestBodyContentApplicationjsonAddevents
}
object DeleteParametersPathHookidOwnerResponses9 {
  
  inline def apply(
    delete: ParametersPathHookidOwnerResponses9,
    get: ParametersPathHookidOwner,
    patch: RequestBodyContentApplicationjsonAddevents
  ): DeleteParametersPathHookidOwnerResponses9 = {
    val __obj = js.Dynamic.literal(delete = delete.asInstanceOf[js.Any], get = get.asInstanceOf[js.Any], patch = patch.asInstanceOf[js.Any])
    __obj.asInstanceOf[DeleteParametersPathHookidOwnerResponses9]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: DeleteParametersPathHookidOwnerResponses9] (val x: Self) extends AnyVal {
    
    inline def setDelete(value: ParametersPathHookidOwnerResponses9): Self = StObject.set(x, "delete", value.asInstanceOf[js.Any])
    
    inline def setGet(value: ParametersPathHookidOwner): Self = StObject.set(x, "get", value.asInstanceOf[js.Any])
    
    inline def setPatch(value: RequestBodyContentApplicationjsonAddevents): Self = StObject.set(x, "patch", value.asInstanceOf[js.Any])
  }
}
