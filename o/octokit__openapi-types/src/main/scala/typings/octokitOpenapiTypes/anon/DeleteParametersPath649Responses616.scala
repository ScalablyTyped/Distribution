package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DeleteParametersPath649Responses616 extends StObject {
  
  /** Deletes an SSH signing key from the authenticated user's GitHub account. You must authenticate with Basic Authentication, or you must authenticate with OAuth with at least `admin:ssh_signing_key` scope. For more information, see "[Understanding scopes for OAuth apps](https://docs.github.com/apps/building-oauth-apps/understanding-scopes-for-oauth-apps/)." */
  var delete: ParametersPath649Responses616
  
  /** Gets extended details for an SSH signing key. You must authenticate with Basic Authentication, or you must authenticate with OAuth with at least `read:ssh_signing_key` scope. For more information, see "[Understanding scopes for OAuth apps](https://docs.github.com/apps/building-oauth-apps/understanding-scopes-for-oauth-apps/)." */
  var get: ParametersPath649
}
object DeleteParametersPath649Responses616 {
  
  inline def apply(delete: ParametersPath649Responses616, get: ParametersPath649): DeleteParametersPath649Responses616 = {
    val __obj = js.Dynamic.literal(delete = delete.asInstanceOf[js.Any], get = get.asInstanceOf[js.Any])
    __obj.asInstanceOf[DeleteParametersPath649Responses616]
  }
  
  extension [Self <: DeleteParametersPath649Responses616](x: Self) {
    
    inline def setDelete(value: ParametersPath649Responses616): Self = StObject.set(x, "delete", value.asInstanceOf[js.Any])
    
    inline def setGet(value: ParametersPath649): Self = StObject.set(x, "get", value.asInstanceOf[js.Any])
  }
}
