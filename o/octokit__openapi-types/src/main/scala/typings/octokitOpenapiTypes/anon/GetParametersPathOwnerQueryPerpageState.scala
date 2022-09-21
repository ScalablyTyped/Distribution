package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GetParametersPathOwnerQueryPerpageState extends StObject {
  
  /** Lists the projects in a repository. Returns a `404 Not Found` status if projects are disabled in the repository. If you do not have sufficient privileges to perform this action, a `401 Unauthorized` or `410 Gone` status is returned. */
  var get: ParametersPathOwnerQueryPerpageState
  
  /** Creates a repository project board. Returns a `410 Gone` status if projects are disabled in the repository or if the repository does not have existing classic projects. If you do not have sufficient privileges to perform this action, a `401 Unauthorized` or `410 Gone` status is returned. */
  var post: Responses410
}
object GetParametersPathOwnerQueryPerpageState {
  
  inline def apply(get: ParametersPathOwnerQueryPerpageState, post: Responses410): GetParametersPathOwnerQueryPerpageState = {
    val __obj = js.Dynamic.literal(get = get.asInstanceOf[js.Any], post = post.asInstanceOf[js.Any])
    __obj.asInstanceOf[GetParametersPathOwnerQueryPerpageState]
  }
  
  extension [Self <: GetParametersPathOwnerQueryPerpageState](x: Self) {
    
    inline def setGet(value: ParametersPathOwnerQueryPerpageState): Self = StObject.set(x, "get", value.asInstanceOf[js.Any])
    
    inline def setPost(value: Responses410): Self = StObject.set(x, "post", value.asInstanceOf[js.Any])
  }
}
