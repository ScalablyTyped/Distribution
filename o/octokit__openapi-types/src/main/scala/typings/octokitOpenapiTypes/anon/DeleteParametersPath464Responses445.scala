package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DeleteParametersPath464Responses445 extends StObject {
  
  /**
    * Delete a public SSH key for the authenticated user
    * @description Removes a public SSH key from the authenticated user's GitHub account. Requires that you are authenticated via Basic Auth or via OAuth with at least `admin:public_key` [scope](https://docs.github.com/apps/building-oauth-apps/understanding-scopes-for-oauth-apps/).
    */
  var delete: ParametersPath464Responses445
  
  /**
    * Get a public SSH key for the authenticated user
    * @description View extended details for a single public SSH key. Requires that you are authenticated via Basic Auth or via OAuth with at least `read:public_key` [scope](https://docs.github.com/apps/building-oauth-apps/understanding-scopes-for-oauth-apps/).
    */
  var get: ParametersPath464
}
object DeleteParametersPath464Responses445 {
  
  inline def apply(delete: ParametersPath464Responses445, get: ParametersPath464): DeleteParametersPath464Responses445 = {
    val __obj = js.Dynamic.literal(delete = delete.asInstanceOf[js.Any], get = get.asInstanceOf[js.Any])
    __obj.asInstanceOf[DeleteParametersPath464Responses445]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: DeleteParametersPath464Responses445] (val x: Self) extends AnyVal {
    
    inline def setDelete(value: ParametersPath464Responses445): Self = StObject.set(x, "delete", value.asInstanceOf[js.Any])
    
    inline def setGet(value: ParametersPath464): Self = StObject.set(x, "get", value.asInstanceOf[js.Any])
  }
}
