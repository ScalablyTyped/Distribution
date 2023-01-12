package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait PostRequestBodyContentApplicationjsonBase extends StObject {
  
  var post: RequestBodyContentApplicationjsonBase
}
object PostRequestBodyContentApplicationjsonBase {
  
  inline def apply(post: RequestBodyContentApplicationjsonBase): PostRequestBodyContentApplicationjsonBase = {
    val __obj = js.Dynamic.literal(post = post.asInstanceOf[js.Any])
    __obj.asInstanceOf[PostRequestBodyContentApplicationjsonBase]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: PostRequestBodyContentApplicationjsonBase] (val x: Self) extends AnyVal {
    
    inline def setPost(value: RequestBodyContentApplicationjsonBase): Self = StObject.set(x, "post", value.asInstanceOf[js.Any])
  }
}
