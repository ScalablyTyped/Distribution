package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait PostRequestBodyContent308 extends StObject {
  
  /**
    * Creates a codespace owned by the authenticated user for the specified pull request.
    *
    * You must authenticate using an access token with the `codespace` scope to use this endpoint.
    *
    * GitHub Apps must have write access to the `codespaces` repository permission to use this endpoint.
    */
  var post: RequestBodyContent308
}
object PostRequestBodyContent308 {
  
  inline def apply(post: RequestBodyContent308): PostRequestBodyContent308 = {
    val __obj = js.Dynamic.literal(post = post.asInstanceOf[js.Any])
    __obj.asInstanceOf[PostRequestBodyContent308]
  }
  
  extension [Self <: PostRequestBodyContent308](x: Self) {
    
    inline def setPost(value: RequestBodyContent308): Self = StObject.set(x, "post", value.asInstanceOf[js.Any])
  }
}
