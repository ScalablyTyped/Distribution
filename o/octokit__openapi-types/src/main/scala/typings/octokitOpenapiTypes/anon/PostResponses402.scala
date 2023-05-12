package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait PostResponses402 extends StObject {
  
  /**
    * Start a codespace for the authenticated user
    * @description Starts a user's codespace.
    *
    * You must authenticate using an access token with the `codespace` scope to use this endpoint.
    *
    * GitHub Apps must have write access to the `codespaces_lifecycle_admin` repository permission to use this endpoint.
    */
  var post: Responses402
}
object PostResponses402 {
  
  inline def apply(post: Responses402): PostResponses402 = {
    val __obj = js.Dynamic.literal(post = post.asInstanceOf[js.Any])
    __obj.asInstanceOf[PostResponses402]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: PostResponses402] (val x: Self) extends AnyVal {
    
    inline def setPost(value: Responses402): Self = StObject.set(x, "post", value.asInstanceOf[js.Any])
  }
}
