package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DeleteParametersPath627Responses391 extends StObject {
  
  /** Removes a GPG key from the authenticated user's GitHub account. Requires that you are authenticated via Basic Auth or via OAuth with at least `admin:gpg_key` [scope](https://docs.github.com/apps/building-oauth-apps/understanding-scopes-for-oauth-apps/). */
  var delete: ParametersPath627Responses391
  
  /** View extended details for a single GPG key. Requires that you are authenticated via Basic Auth or via OAuth with at least `read:gpg_key` [scope](https://docs.github.com/apps/building-oauth-apps/understanding-scopes-for-oauth-apps/). */
  var get: ParametersPath627
}
object DeleteParametersPath627Responses391 {
  
  inline def apply(delete: ParametersPath627Responses391, get: ParametersPath627): DeleteParametersPath627Responses391 = {
    val __obj = js.Dynamic.literal(delete = delete.asInstanceOf[js.Any], get = get.asInstanceOf[js.Any])
    __obj.asInstanceOf[DeleteParametersPath627Responses391]
  }
  
  extension [Self <: DeleteParametersPath627Responses391](x: Self) {
    
    inline def setDelete(value: ParametersPath627Responses391): Self = StObject.set(x, "delete", value.asInstanceOf[js.Any])
    
    inline def setGet(value: ParametersPath627): Self = StObject.set(x, "get", value.asInstanceOf[js.Any])
  }
}
