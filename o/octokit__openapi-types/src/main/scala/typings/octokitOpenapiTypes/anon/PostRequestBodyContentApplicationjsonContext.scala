package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait PostRequestBodyContentApplicationjsonContext extends StObject {
  
  var post: RequestBodyContentApplicationjsonContext
}
object PostRequestBodyContentApplicationjsonContext {
  
  inline def apply(post: RequestBodyContentApplicationjsonContext): PostRequestBodyContentApplicationjsonContext = {
    val __obj = js.Dynamic.literal(post = post.asInstanceOf[js.Any])
    __obj.asInstanceOf[PostRequestBodyContentApplicationjsonContext]
  }
  
  extension [Self <: PostRequestBodyContentApplicationjsonContext](x: Self) {
    
    inline def setPost(value: RequestBodyContentApplicationjsonContext): Self = StObject.set(x, "post", value.asInstanceOf[js.Any])
  }
}
