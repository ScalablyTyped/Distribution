package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait PostResponses202Content598 extends StObject {
  
  /** A transfer request will need to be accepted by the new owner when transferring a personal repository to another user. The response will contain the original `owner`, and the transfer will continue asynchronously. For more details on the requirements to transfer personal and organization-owned repositories, see [about repository transfers](https://docs.github.com/articles/about-repository-transfers/). */
  var post: Responses202Content598
}
object PostResponses202Content598 {
  
  inline def apply(post: Responses202Content598): PostResponses202Content598 = {
    val __obj = js.Dynamic.literal(post = post.asInstanceOf[js.Any])
    __obj.asInstanceOf[PostResponses202Content598]
  }
  
  extension [Self <: PostResponses202Content598](x: Self) {
    
    inline def setPost(value: Responses202Content598): Self = StObject.set(x, "post", value.asInstanceOf[js.Any])
  }
}
