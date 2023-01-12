package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait PostRequestBodyContentApplicationjsonBodyNameString extends StObject {
  
  /** Creates a user project board. Returns a `410 Gone` status if the user does not have existing classic projects. If you do not have sufficient privileges to perform this action, a `401 Unauthorized` or `410 Gone` status is returned. */
  var post: RequestBodyContentApplicationjsonBodyNameString
}
object PostRequestBodyContentApplicationjsonBodyNameString {
  
  inline def apply(post: RequestBodyContentApplicationjsonBodyNameString): PostRequestBodyContentApplicationjsonBodyNameString = {
    val __obj = js.Dynamic.literal(post = post.asInstanceOf[js.Any])
    __obj.asInstanceOf[PostRequestBodyContentApplicationjsonBodyNameString]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: PostRequestBodyContentApplicationjsonBodyNameString] (val x: Self) extends AnyVal {
    
    inline def setPost(value: RequestBodyContentApplicationjsonBodyNameString): Self = StObject.set(x, "post", value.asInstanceOf[js.Any])
  }
}
