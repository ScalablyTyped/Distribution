package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait PostRequestBodyContentApplicationjsonNewowner extends StObject {
  
  /** A transfer request will need to be accepted by the new owner when transferring a personal repository to another user. The response will contain the original `owner`, and the transfer will continue asynchronously. For more details on the requirements to transfer personal and organization-owned repositories, see [about repository transfers](https://docs.github.com/articles/about-repository-transfers/). */
  var post: RequestBodyContentApplicationjsonNewowner
}
object PostRequestBodyContentApplicationjsonNewowner {
  
  inline def apply(post: RequestBodyContentApplicationjsonNewowner): PostRequestBodyContentApplicationjsonNewowner = {
    val __obj = js.Dynamic.literal(post = post.asInstanceOf[js.Any])
    __obj.asInstanceOf[PostRequestBodyContentApplicationjsonNewowner]
  }
  
  extension [Self <: PostRequestBodyContentApplicationjsonNewowner](x: Self) {
    
    inline def setPost(value: RequestBodyContentApplicationjsonNewowner): Self = StObject.set(x, "post", value.asInstanceOf[js.Any])
  }
}
