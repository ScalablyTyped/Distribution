package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait PostRequestBodyContent318 extends StObject {
  
  /**
    * Create a codespace from a pull request
    * @description Creates a codespace owned by the authenticated user for the specified pull request.
    *
    * You must authenticate using an access token with the `codespace` scope to use this endpoint.
    *
    * GitHub Apps must have write access to the `codespaces` repository permission to use this endpoint.
    */
  var post: RequestBodyContent318
}
object PostRequestBodyContent318 {
  
  inline def apply(post: RequestBodyContent318): PostRequestBodyContent318 = {
    val __obj = js.Dynamic.literal(post = post.asInstanceOf[js.Any])
    __obj.asInstanceOf[PostRequestBodyContent318]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: PostRequestBodyContent318] (val x: Self) extends AnyVal {
    
    inline def setPost(value: RequestBodyContent318): Self = StObject.set(x, "post", value.asInstanceOf[js.Any])
  }
}
