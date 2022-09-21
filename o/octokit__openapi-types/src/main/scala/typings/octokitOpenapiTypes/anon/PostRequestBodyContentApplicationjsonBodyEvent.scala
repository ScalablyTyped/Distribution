package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait PostRequestBodyContentApplicationjsonBodyEvent extends StObject {
  
  /** Submits a pending review for a pull request. For more information about creating a pending review for a pull request, see "[Create a review for a pull request](https://docs.github.com/rest/pulls#create-a-review-for-a-pull-request)." */
  var post: RequestBodyContentApplicationjsonBodyEvent
}
object PostRequestBodyContentApplicationjsonBodyEvent {
  
  inline def apply(post: RequestBodyContentApplicationjsonBodyEvent): PostRequestBodyContentApplicationjsonBodyEvent = {
    val __obj = js.Dynamic.literal(post = post.asInstanceOf[js.Any])
    __obj.asInstanceOf[PostRequestBodyContentApplicationjsonBodyEvent]
  }
  
  extension [Self <: PostRequestBodyContentApplicationjsonBodyEvent](x: Self) {
    
    inline def setPost(value: RequestBodyContentApplicationjsonBodyEvent): Self = StObject.set(x, "post", value.asInstanceOf[js.Any])
  }
}
