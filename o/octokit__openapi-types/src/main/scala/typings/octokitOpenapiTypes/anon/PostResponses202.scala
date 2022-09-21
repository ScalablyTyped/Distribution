package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait PostResponses202 extends StObject {
  
  /**
    * Redeliver a delivery for the webhook configured for a GitHub App.
    *
    * You must use a [JWT](https://docs.github.com/apps/building-github-apps/authenticating-with-github-apps/#authenticating-as-a-github-app) to access this endpoint.
    */
  var post: Responses202
}
object PostResponses202 {
  
  inline def apply(post: Responses202): PostResponses202 = {
    val __obj = js.Dynamic.literal(post = post.asInstanceOf[js.Any])
    __obj.asInstanceOf[PostResponses202]
  }
  
  extension [Self <: PostResponses202](x: Self) {
    
    inline def setPost(value: Responses202): Self = StObject.set(x, "post", value.asInstanceOf[js.Any])
  }
}
