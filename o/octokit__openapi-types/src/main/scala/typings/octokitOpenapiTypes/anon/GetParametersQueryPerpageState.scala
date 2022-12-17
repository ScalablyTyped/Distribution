package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GetParametersQueryPerpageState extends StObject {
  
  /** Lists the projects in an organization. Returns a `404 Not Found` status if projects are disabled in the organization. If you do not have sufficient privileges to perform this action, a `401 Unauthorized` or `410 Gone` status is returned. */
  var get: ParametersQueryPerpageState
  
  /** Creates an organization project board. Returns a `410 Gone` status if projects are disabled in the organization or if the organization does not have existing classic projects. If you do not have sufficient privileges to perform this action, a `401 Unauthorized` or `410 Gone` status is returned. */
  var post: RequestBodyContentApplicationjsonBodyName
}
object GetParametersQueryPerpageState {
  
  inline def apply(get: ParametersQueryPerpageState, post: RequestBodyContentApplicationjsonBodyName): GetParametersQueryPerpageState = {
    val __obj = js.Dynamic.literal(get = get.asInstanceOf[js.Any], post = post.asInstanceOf[js.Any])
    __obj.asInstanceOf[GetParametersQueryPerpageState]
  }
  
  extension [Self <: GetParametersQueryPerpageState](x: Self) {
    
    inline def setGet(value: ParametersQueryPerpageState): Self = StObject.set(x, "get", value.asInstanceOf[js.Any])
    
    inline def setPost(value: RequestBodyContentApplicationjsonBodyName): Self = StObject.set(x, "post", value.asInstanceOf[js.Any])
  }
}
