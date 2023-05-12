package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait PostResponses403404500 extends StObject {
  
  /**
    * Stop a codespace for an organization user
    * @description Stops a user's codespace.
    *
    * You must authenticate using an access token with the `admin:org` scope to use this endpoint.
    */
  var post: Responses403404500
}
object PostResponses403404500 {
  
  inline def apply(post: Responses403404500): PostResponses403404500 = {
    val __obj = js.Dynamic.literal(post = post.asInstanceOf[js.Any])
    __obj.asInstanceOf[PostResponses403404500]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: PostResponses403404500] (val x: Self) extends AnyVal {
    
    inline def setPost(value: Responses403404500): Self = StObject.set(x, "post", value.asInstanceOf[js.Any])
  }
}
