package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GetParametersPath292Query358 extends StObject {
  
  /** Lists the projects in a repository. Returns a `404 Not Found` status if projects are disabled in the repository. If you do not have sufficient privileges to perform this action, a `401 Unauthorized` or `410 Gone` status is returned. */
  var get: ParametersPath292Query358
  
  /** Creates a repository project board. Returns a `410 Gone` status if projects are disabled in the repository or if the repository does not have existing classic projects. If you do not have sufficient privileges to perform this action, a `401 Unauthorized` or `410 Gone` status is returned. */
  var post: Parameters395RequestBodyContentApplicationjsonBodyNameString
}
object GetParametersPath292Query358 {
  
  inline def apply(get: ParametersPath292Query358, post: Parameters395RequestBodyContentApplicationjsonBodyNameString): GetParametersPath292Query358 = {
    val __obj = js.Dynamic.literal(get = get.asInstanceOf[js.Any], post = post.asInstanceOf[js.Any])
    __obj.asInstanceOf[GetParametersPath292Query358]
  }
  
  extension [Self <: GetParametersPath292Query358](x: Self) {
    
    inline def setGet(value: ParametersPath292Query358): Self = StObject.set(x, "get", value.asInstanceOf[js.Any])
    
    inline def setPost(value: Parameters395RequestBodyContentApplicationjsonBodyNameString): Self = StObject.set(x, "post", value.asInstanceOf[js.Any])
  }
}
