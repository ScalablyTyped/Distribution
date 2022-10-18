package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DeleteParametersPath633Responses616 extends StObject {
  
  /** Removes a public SSH key from the authenticated user's GitHub account. Requires that you are authenticated via Basic Auth or via OAuth with at least `admin:public_key` [scope](https://docs.github.com/apps/building-oauth-apps/understanding-scopes-for-oauth-apps/). */
  var delete: ParametersPath633Responses616
  
  /** View extended details for a single public SSH key. Requires that you are authenticated via Basic Auth or via OAuth with at least `read:public_key` [scope](https://docs.github.com/apps/building-oauth-apps/understanding-scopes-for-oauth-apps/). */
  var get: ParametersPath633
}
object DeleteParametersPath633Responses616 {
  
  inline def apply(delete: ParametersPath633Responses616, get: ParametersPath633): DeleteParametersPath633Responses616 = {
    val __obj = js.Dynamic.literal(delete = delete.asInstanceOf[js.Any], get = get.asInstanceOf[js.Any])
    __obj.asInstanceOf[DeleteParametersPath633Responses616]
  }
  
  extension [Self <: DeleteParametersPath633Responses616](x: Self) {
    
    inline def setDelete(value: ParametersPath633Responses616): Self = StObject.set(x, "delete", value.asInstanceOf[js.Any])
    
    inline def setGet(value: ParametersPath633): Self = StObject.set(x, "get", value.asInstanceOf[js.Any])
  }
}
