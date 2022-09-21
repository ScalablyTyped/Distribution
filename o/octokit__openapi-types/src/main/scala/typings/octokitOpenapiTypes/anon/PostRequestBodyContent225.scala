package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait PostRequestBodyContent225 extends StObject {
  
  /** Create a new snapshot of a repository's dependencies. You must authenticate using an access token with the `repo` scope to use this endpoint for a repository that the requesting user has access to. */
  var post: RequestBodyContent225
}
object PostRequestBodyContent225 {
  
  inline def apply(post: RequestBodyContent225): PostRequestBodyContent225 = {
    val __obj = js.Dynamic.literal(post = post.asInstanceOf[js.Any])
    __obj.asInstanceOf[PostRequestBodyContent225]
  }
  
  extension [Self <: PostRequestBodyContent225](x: Self) {
    
    inline def setPost(value: RequestBodyContent225): Self = StObject.set(x, "post", value.asInstanceOf[js.Any])
  }
}
