package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait PostResponses200Content568403 extends StObject {
  
  /** Submits a pending review for a pull request. For more information about creating a pending review for a pull request, see "[Create a review for a pull request](https://docs.github.com/rest/pulls#create-a-review-for-a-pull-request)." */
  var post: Responses200Content568403
}
object PostResponses200Content568403 {
  
  inline def apply(post: Responses200Content568403): PostResponses200Content568403 = {
    val __obj = js.Dynamic.literal(post = post.asInstanceOf[js.Any])
    __obj.asInstanceOf[PostResponses200Content568403]
  }
  
  extension [Self <: PostResponses200Content568403](x: Self) {
    
    inline def setPost(value: Responses200Content568403): Self = StObject.set(x, "post", value.asInstanceOf[js.Any])
  }
}
