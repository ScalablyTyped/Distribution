package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DeleteParametersPath389Responses371 extends StObject {
  
  /**
    * Delete a public SSH key for the authenticated user
    * @description Removes a public SSH key from the authenticated user's GitHub account. Requires that you are authenticated via Basic Auth or via OAuth with at least `admin:public_key` [scope](https://docs.github.com/apps/building-oauth-apps/understanding-scopes-for-oauth-apps/).
    */
  var delete: ParametersPath389Responses371
  
  /**
    * Get a public SSH key for the authenticated user
    * @description View extended details for a single public SSH key. Requires that you are authenticated via Basic Auth or via OAuth with at least `read:public_key` [scope](https://docs.github.com/apps/building-oauth-apps/understanding-scopes-for-oauth-apps/).
    */
  var get: ParametersPath389
}
object DeleteParametersPath389Responses371 {
  
  inline def apply(delete: ParametersPath389Responses371, get: ParametersPath389): DeleteParametersPath389Responses371 = {
    val __obj = js.Dynamic.literal(delete = delete.asInstanceOf[js.Any], get = get.asInstanceOf[js.Any])
    __obj.asInstanceOf[DeleteParametersPath389Responses371]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: DeleteParametersPath389Responses371] (val x: Self) extends AnyVal {
    
    inline def setDelete(value: ParametersPath389Responses371): Self = StObject.set(x, "delete", value.asInstanceOf[js.Any])
    
    inline def setGet(value: ParametersPath389): Self = StObject.set(x, "get", value.asInstanceOf[js.Any])
  }
}
