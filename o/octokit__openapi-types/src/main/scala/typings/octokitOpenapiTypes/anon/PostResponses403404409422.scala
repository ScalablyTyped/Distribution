package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait PostResponses403404409422 extends StObject {
  
  var post: Responses403404409422
}
object PostResponses403404409422 {
  
  inline def apply(post: Responses403404409422): PostResponses403404409422 = {
    val __obj = js.Dynamic.literal(post = post.asInstanceOf[js.Any])
    __obj.asInstanceOf[PostResponses403404409422]
  }
  
  extension [Self <: PostResponses403404409422](x: Self) {
    
    inline def setPost(value: Responses403404409422): Self = StObject.set(x, "post", value.asInstanceOf[js.Any])
  }
}
