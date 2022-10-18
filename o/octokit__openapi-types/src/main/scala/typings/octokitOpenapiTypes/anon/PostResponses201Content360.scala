package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait PostResponses201Content360 extends StObject {
  
  /** Creates a user project board. Returns a `410 Gone` status if the user does not have existing classic projects. If you do not have sufficient privileges to perform this action, a `401 Unauthorized` or `410 Gone` status is returned. */
  var post: Responses201Content360
}
object PostResponses201Content360 {
  
  inline def apply(post: Responses201Content360): PostResponses201Content360 = {
    val __obj = js.Dynamic.literal(post = post.asInstanceOf[js.Any])
    __obj.asInstanceOf[PostResponses201Content360]
  }
  
  extension [Self <: PostResponses201Content360](x: Self) {
    
    inline def setPost(value: Responses201Content360): Self = StObject.set(x, "post", value.asInstanceOf[js.Any])
  }
}
