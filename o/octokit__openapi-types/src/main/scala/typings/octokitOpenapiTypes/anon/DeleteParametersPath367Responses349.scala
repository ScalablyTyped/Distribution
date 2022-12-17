package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DeleteParametersPath367Responses349 extends StObject {
  
  /** Removes a public SSH key from the authenticated user's GitHub account. Requires that you are authenticated via Basic Auth or via OAuth with at least `admin:public_key` [scope](https://docs.github.com/apps/building-oauth-apps/understanding-scopes-for-oauth-apps/). */
  var delete: ParametersPath367Responses349
  
  /** View extended details for a single public SSH key. Requires that you are authenticated via Basic Auth or via OAuth with at least `read:public_key` [scope](https://docs.github.com/apps/building-oauth-apps/understanding-scopes-for-oauth-apps/). */
  var get: ParametersPath367
}
object DeleteParametersPath367Responses349 {
  
  inline def apply(delete: ParametersPath367Responses349, get: ParametersPath367): DeleteParametersPath367Responses349 = {
    val __obj = js.Dynamic.literal(delete = delete.asInstanceOf[js.Any], get = get.asInstanceOf[js.Any])
    __obj.asInstanceOf[DeleteParametersPath367Responses349]
  }
  
  extension [Self <: DeleteParametersPath367Responses349](x: Self) {
    
    inline def setDelete(value: ParametersPath367Responses349): Self = StObject.set(x, "delete", value.asInstanceOf[js.Any])
    
    inline def setGet(value: ParametersPath367): Self = StObject.set(x, "get", value.asInstanceOf[js.Any])
  }
}
