package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait PostRequestBodyContentApplicationjsonPosition extends StObject {
  
  var post: RequestBodyContentApplicationjsonPosition
}
object PostRequestBodyContentApplicationjsonPosition {
  
  inline def apply(post: RequestBodyContentApplicationjsonPosition): PostRequestBodyContentApplicationjsonPosition = {
    val __obj = js.Dynamic.literal(post = post.asInstanceOf[js.Any])
    __obj.asInstanceOf[PostRequestBodyContentApplicationjsonPosition]
  }
  
  extension [Self <: PostRequestBodyContentApplicationjsonPosition](x: Self) {
    
    inline def setPost(value: RequestBodyContentApplicationjsonPosition): Self = StObject.set(x, "post", value.asInstanceOf[js.Any])
  }
}
