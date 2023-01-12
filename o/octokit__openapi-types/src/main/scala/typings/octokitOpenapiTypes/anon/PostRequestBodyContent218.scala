package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait PostRequestBodyContent218 extends StObject {
  
  /** Create a new snapshot of a repository's dependencies. You must authenticate using an access token with the `repo` scope to use this endpoint for a repository that the requesting user has access to. */
  var post: RequestBodyContent218
}
object PostRequestBodyContent218 {
  
  inline def apply(post: RequestBodyContent218): PostRequestBodyContent218 = {
    val __obj = js.Dynamic.literal(post = post.asInstanceOf[js.Any])
    __obj.asInstanceOf[PostRequestBodyContent218]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: PostRequestBodyContent218] (val x: Self) extends AnyVal {
    
    inline def setPost(value: RequestBodyContent218): Self = StObject.set(x, "post", value.asInstanceOf[js.Any])
  }
}
