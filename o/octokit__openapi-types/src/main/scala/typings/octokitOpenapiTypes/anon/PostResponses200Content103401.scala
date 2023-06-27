package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait PostResponses200Content103401 extends StObject {
  
  /**
    * Stop a codespace for the authenticated user
    * @description Stops a user's codespace.
    *
    * You must authenticate using an access token with the `codespace` scope to use this endpoint.
    *
    * GitHub Apps must have write access to the `codespaces_lifecycle_admin` repository permission to use this endpoint.
    */
  var post: Responses200Content103401
}
object PostResponses200Content103401 {
  
  inline def apply(post: Responses200Content103401): PostResponses200Content103401 = {
    val __obj = js.Dynamic.literal(post = post.asInstanceOf[js.Any])
    __obj.asInstanceOf[PostResponses200Content103401]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: PostResponses200Content103401] (val x: Self) extends AnyVal {
    
    inline def setPost(value: Responses200Content103401): Self = StObject.set(x, "post", value.asInstanceOf[js.Any])
  }
}
