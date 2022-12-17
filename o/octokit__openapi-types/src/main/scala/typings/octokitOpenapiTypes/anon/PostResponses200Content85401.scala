package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait PostResponses200Content85401 extends StObject {
  
  /**
    * Stops a user's codespace.
    *
    * You must authenticate using an access token with the `codespace` scope to use this endpoint.
    *
    * GitHub Apps must have write access to the `codespaces_lifecycle_admin` repository permission to use this endpoint.
    */
  var post: Responses200Content85401
}
object PostResponses200Content85401 {
  
  inline def apply(post: Responses200Content85401): PostResponses200Content85401 = {
    val __obj = js.Dynamic.literal(post = post.asInstanceOf[js.Any])
    __obj.asInstanceOf[PostResponses200Content85401]
  }
  
  extension [Self <: PostResponses200Content85401](x: Self) {
    
    inline def setPost(value: Responses200Content85401): Self = StObject.set(x, "post", value.asInstanceOf[js.Any])
  }
}
