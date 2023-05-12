package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait PostRequestBodyContentApplicationjsonEncoding extends StObject {
  
  /** Create a blob */
  var post: RequestBodyContentApplicationjsonEncoding
}
object PostRequestBodyContentApplicationjsonEncoding {
  
  inline def apply(post: RequestBodyContentApplicationjsonEncoding): PostRequestBodyContentApplicationjsonEncoding = {
    val __obj = js.Dynamic.literal(post = post.asInstanceOf[js.Any])
    __obj.asInstanceOf[PostRequestBodyContentApplicationjsonEncoding]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: PostRequestBodyContentApplicationjsonEncoding] (val x: Self) extends AnyVal {
    
    inline def setPost(value: RequestBodyContentApplicationjsonEncoding): Self = StObject.set(x, "post", value.asInstanceOf[js.Any])
  }
}
