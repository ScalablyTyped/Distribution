package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait PostRequestBodyContent299 extends StObject {
  
  /**
    * Creates a codespace owned by the authenticated user for the specified pull request.
    *
    * You must authenticate using an access token with the `codespace` scope to use this endpoint.
    *
    * GitHub Apps must have write access to the `codespaces` repository permission to use this endpoint.
    */
  var post: RequestBodyContent299
}
object PostRequestBodyContent299 {
  
  inline def apply(post: RequestBodyContent299): PostRequestBodyContent299 = {
    val __obj = js.Dynamic.literal(post = post.asInstanceOf[js.Any])
    __obj.asInstanceOf[PostRequestBodyContent299]
  }
  
  extension [Self <: PostRequestBodyContent299](x: Self) {
    
    inline def setPost(value: RequestBodyContent299): Self = StObject.set(x, "post", value.asInstanceOf[js.Any])
  }
}
