package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait PostResponses201202401 extends StObject {
  
  /**
    * Creates a codespace owned by the authenticated user for the specified pull request.
    *
    * You must authenticate using an access token with the `codespace` scope to use this endpoint.
    *
    * GitHub Apps must have write access to the `codespaces` repository permission to use this endpoint.
    */
  var post: Responses201202401
}
object PostResponses201202401 {
  
  inline def apply(post: Responses201202401): PostResponses201202401 = {
    val __obj = js.Dynamic.literal(post = post.asInstanceOf[js.Any])
    __obj.asInstanceOf[PostResponses201202401]
  }
  
  extension [Self <: PostResponses201202401](x: Self) {
    
    inline def setPost(value: Responses201202401): Self = StObject.set(x, "post", value.asInstanceOf[js.Any])
  }
}
