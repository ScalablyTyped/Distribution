package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DeleteParametersPathSshsigningkeyidResponses362 extends StObject {
  
  /** Deletes an SSH signing key from the authenticated user's GitHub account. You must authenticate with Basic Authentication, or you must authenticate with OAuth with at least `admin:ssh_signing_key` scope. For more information, see "[Understanding scopes for OAuth apps](https://docs.github.com/apps/building-oauth-apps/understanding-scopes-for-oauth-apps/)." */
  var delete: ParametersPathSshsigningkeyidResponses362
  
  /** Gets extended details for an SSH signing key. You must authenticate with Basic Authentication, or you must authenticate with OAuth with at least `read:ssh_signing_key` scope. For more information, see "[Understanding scopes for OAuth apps](https://docs.github.com/apps/building-oauth-apps/understanding-scopes-for-oauth-apps/)." */
  var get: ParametersPathSshsigningkeyid
}
object DeleteParametersPathSshsigningkeyidResponses362 {
  
  inline def apply(delete: ParametersPathSshsigningkeyidResponses362, get: ParametersPathSshsigningkeyid): DeleteParametersPathSshsigningkeyidResponses362 = {
    val __obj = js.Dynamic.literal(delete = delete.asInstanceOf[js.Any], get = get.asInstanceOf[js.Any])
    __obj.asInstanceOf[DeleteParametersPathSshsigningkeyidResponses362]
  }
  
  extension [Self <: DeleteParametersPathSshsigningkeyidResponses362](x: Self) {
    
    inline def setDelete(value: ParametersPathSshsigningkeyidResponses362): Self = StObject.set(x, "delete", value.asInstanceOf[js.Any])
    
    inline def setGet(value: ParametersPathSshsigningkeyid): Self = StObject.set(x, "get", value.asInstanceOf[js.Any])
  }
}
