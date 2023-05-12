package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait PostRequestBodyContentApplicationjsonColumnid extends StObject {
  
  /** Move a project card */
  var post: RequestBodyContentApplicationjsonColumnid
}
object PostRequestBodyContentApplicationjsonColumnid {
  
  inline def apply(post: RequestBodyContentApplicationjsonColumnid): PostRequestBodyContentApplicationjsonColumnid = {
    val __obj = js.Dynamic.literal(post = post.asInstanceOf[js.Any])
    __obj.asInstanceOf[PostRequestBodyContentApplicationjsonColumnid]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: PostRequestBodyContentApplicationjsonColumnid] (val x: Self) extends AnyVal {
    
    inline def setPost(value: RequestBodyContentApplicationjsonColumnid): Self = StObject.set(x, "post", value.asInstanceOf[js.Any])
  }
}
