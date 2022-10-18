package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait PostResponses200Content544 extends StObject {
  
  /** Sync a branch of a forked repository to keep it up-to-date with the upstream repository. */
  var post: Responses200Content544
}
object PostResponses200Content544 {
  
  inline def apply(post: Responses200Content544): PostResponses200Content544 = {
    val __obj = js.Dynamic.literal(post = post.asInstanceOf[js.Any])
    __obj.asInstanceOf[PostResponses200Content544]
  }
  
  extension [Self <: PostResponses200Content544](x: Self) {
    
    inline def setPost(value: Responses200Content544): Self = StObject.set(x, "post", value.asInstanceOf[js.Any])
  }
}
