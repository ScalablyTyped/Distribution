package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DeleteParametersPathSshsigningkeyidResponses349 extends StObject {
  
  /** Deletes an SSH signing key from the authenticated user's GitHub account. You must authenticate with Basic Authentication, or you must authenticate with OAuth with at least `admin:ssh_signing_key` scope. For more information, see "[Understanding scopes for OAuth apps](https://docs.github.com/apps/building-oauth-apps/understanding-scopes-for-oauth-apps/)." */
  var delete: ParametersPathSshsigningkeyidResponses349
  
  /** Gets extended details for an SSH signing key. You must authenticate with Basic Authentication, or you must authenticate with OAuth with at least `read:ssh_signing_key` scope. For more information, see "[Understanding scopes for OAuth apps](https://docs.github.com/apps/building-oauth-apps/understanding-scopes-for-oauth-apps/)." */
  var get: ParametersPathSshsigningkeyid
}
object DeleteParametersPathSshsigningkeyidResponses349 {
  
  inline def apply(delete: ParametersPathSshsigningkeyidResponses349, get: ParametersPathSshsigningkeyid): DeleteParametersPathSshsigningkeyidResponses349 = {
    val __obj = js.Dynamic.literal(delete = delete.asInstanceOf[js.Any], get = get.asInstanceOf[js.Any])
    __obj.asInstanceOf[DeleteParametersPathSshsigningkeyidResponses349]
  }
  
  extension [Self <: DeleteParametersPathSshsigningkeyidResponses349](x: Self) {
    
    inline def setDelete(value: ParametersPathSshsigningkeyidResponses349): Self = StObject.set(x, "delete", value.asInstanceOf[js.Any])
    
    inline def setGet(value: ParametersPathSshsigningkeyid): Self = StObject.set(x, "get", value.asInstanceOf[js.Any])
  }
}
