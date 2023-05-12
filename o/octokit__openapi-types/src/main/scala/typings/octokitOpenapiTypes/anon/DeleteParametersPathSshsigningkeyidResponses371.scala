package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DeleteParametersPathSshsigningkeyidResponses371 extends StObject {
  
  /**
    * Delete an SSH signing key for the authenticated user
    * @description Deletes an SSH signing key from the authenticated user's GitHub account. You must authenticate with Basic Authentication, or you must authenticate with OAuth with at least `admin:ssh_signing_key` scope. For more information, see "[Understanding scopes for OAuth apps](https://docs.github.com/apps/building-oauth-apps/understanding-scopes-for-oauth-apps/)."
    */
  var delete: ParametersPathSshsigningkeyidResponses371
  
  /**
    * Get an SSH signing key for the authenticated user
    * @description Gets extended details for an SSH signing key. You must authenticate with Basic Authentication, or you must authenticate with OAuth with at least `read:ssh_signing_key` scope. For more information, see "[Understanding scopes for OAuth apps](https://docs.github.com/apps/building-oauth-apps/understanding-scopes-for-oauth-apps/)."
    */
  var get: ParametersPathSshsigningkeyid
}
object DeleteParametersPathSshsigningkeyidResponses371 {
  
  inline def apply(delete: ParametersPathSshsigningkeyidResponses371, get: ParametersPathSshsigningkeyid): DeleteParametersPathSshsigningkeyidResponses371 = {
    val __obj = js.Dynamic.literal(delete = delete.asInstanceOf[js.Any], get = get.asInstanceOf[js.Any])
    __obj.asInstanceOf[DeleteParametersPathSshsigningkeyidResponses371]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: DeleteParametersPathSshsigningkeyidResponses371] (val x: Self) extends AnyVal {
    
    inline def setDelete(value: ParametersPathSshsigningkeyidResponses371): Self = StObject.set(x, "delete", value.asInstanceOf[js.Any])
    
    inline def setGet(value: ParametersPathSshsigningkeyid): Self = StObject.set(x, "get", value.asInstanceOf[js.Any])
  }
}
