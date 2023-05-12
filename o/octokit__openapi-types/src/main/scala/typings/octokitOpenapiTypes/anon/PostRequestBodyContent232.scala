package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait PostRequestBodyContent232 extends StObject {
  
  /**
    * Create a snapshot of dependencies for a repository
    * @description Create a new snapshot of a repository's dependencies. You must authenticate using an access token with the `repo` scope to use this endpoint for a repository that the requesting user has access to.
    */
  var post: RequestBodyContent232
}
object PostRequestBodyContent232 {
  
  inline def apply(post: RequestBodyContent232): PostRequestBodyContent232 = {
    val __obj = js.Dynamic.literal(post = post.asInstanceOf[js.Any])
    __obj.asInstanceOf[PostRequestBodyContent232]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: PostRequestBodyContent232] (val x: Self) extends AnyVal {
    
    inline def setPost(value: RequestBodyContent232): Self = StObject.set(x, "post", value.asInstanceOf[js.Any])
  }
}
