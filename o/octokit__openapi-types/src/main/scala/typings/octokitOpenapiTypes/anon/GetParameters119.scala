package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GetParameters119 extends StObject {
  
  /**
    * List organization projects
    * @description Lists the projects in an organization. Returns a `404 Not Found` status if projects are disabled in the organization. If you do not have sufficient privileges to perform this action, a `401 Unauthorized` or `410 Gone` status is returned.
    */
  var get: Parameters119
  
  /**
    * Create an organization project
    * @description Creates an organization project board. Returns a `410 Gone` status if projects are disabled in the organization or if the organization does not have existing classic projects. If you do not have sufficient privileges to perform this action, a `401 Unauthorized` or `410 Gone` status is returned.
    */
  var post: RequestBodyContentApplicationjsonBodyName
}
object GetParameters119 {
  
  inline def apply(get: Parameters119, post: RequestBodyContentApplicationjsonBodyName): GetParameters119 = {
    val __obj = js.Dynamic.literal(get = get.asInstanceOf[js.Any], post = post.asInstanceOf[js.Any])
    __obj.asInstanceOf[GetParameters119]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: GetParameters119] (val x: Self) extends AnyVal {
    
    inline def setGet(value: Parameters119): Self = StObject.set(x, "get", value.asInstanceOf[js.Any])
    
    inline def setPost(value: RequestBodyContentApplicationjsonBodyName): Self = StObject.set(x, "post", value.asInstanceOf[js.Any])
  }
}
