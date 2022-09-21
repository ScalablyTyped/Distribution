package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DeleteParametersPathGpgkeyidResponses140 extends StObject {
  
  /** Removes a GPG key from the authenticated user's GitHub account. Requires that you are authenticated via Basic Auth or via OAuth with at least `admin:gpg_key` [scope](https://docs.github.com/apps/building-oauth-apps/understanding-scopes-for-oauth-apps/). */
  var delete: ParametersPathGpgkeyidResponses140
  
  /** View extended details for a single GPG key. Requires that you are authenticated via Basic Auth or via OAuth with at least `read:gpg_key` [scope](https://docs.github.com/apps/building-oauth-apps/understanding-scopes-for-oauth-apps/). */
  var get: ParametersPathGpgkeyid
}
object DeleteParametersPathGpgkeyidResponses140 {
  
  inline def apply(delete: ParametersPathGpgkeyidResponses140, get: ParametersPathGpgkeyid): DeleteParametersPathGpgkeyidResponses140 = {
    val __obj = js.Dynamic.literal(delete = delete.asInstanceOf[js.Any], get = get.asInstanceOf[js.Any])
    __obj.asInstanceOf[DeleteParametersPathGpgkeyidResponses140]
  }
  
  extension [Self <: DeleteParametersPathGpgkeyidResponses140](x: Self) {
    
    inline def setDelete(value: ParametersPathGpgkeyidResponses140): Self = StObject.set(x, "delete", value.asInstanceOf[js.Any])
    
    inline def setGet(value: ParametersPathGpgkeyid): Self = StObject.set(x, "get", value.asInstanceOf[js.Any])
  }
}
