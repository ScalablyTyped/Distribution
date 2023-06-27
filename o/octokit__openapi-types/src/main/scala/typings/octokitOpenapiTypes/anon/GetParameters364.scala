package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GetParameters364 extends StObject {
  
  /**
    * List repository projects
    * @description Lists the projects in a repository. Returns a `404 Not Found` status if projects are disabled in the repository. If you do not have sufficient privileges to perform this action, a `401 Unauthorized` or `410 Gone` status is returned.
    */
  var get: Parameters364
  
  /**
    * Create a repository project
    * @description Creates a repository project board. Returns a `410 Gone` status if projects are disabled in the repository or if the repository does not have existing classic projects. If you do not have sufficient privileges to perform this action, a `401 Unauthorized` or `410 Gone` status is returned.
    */
  var post: Responses410
}
object GetParameters364 {
  
  inline def apply(get: Parameters364, post: Responses410): GetParameters364 = {
    val __obj = js.Dynamic.literal(get = get.asInstanceOf[js.Any], post = post.asInstanceOf[js.Any])
    __obj.asInstanceOf[GetParameters364]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: GetParameters364] (val x: Self) extends AnyVal {
    
    inline def setGet(value: Parameters364): Self = StObject.set(x, "get", value.asInstanceOf[js.Any])
    
    inline def setPost(value: Responses410): Self = StObject.set(x, "post", value.asInstanceOf[js.Any])
  }
}
