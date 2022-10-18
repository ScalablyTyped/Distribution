package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait PostRequestBodyContent486 extends StObject {
  
  /** Create a new snapshot of a repository's dependencies. You must authenticate using an access token with the `repo` scope to use this endpoint for a repository that the requesting user has access to. */
  var post: RequestBodyContent486
}
object PostRequestBodyContent486 {
  
  inline def apply(post: RequestBodyContent486): PostRequestBodyContent486 = {
    val __obj = js.Dynamic.literal(post = post.asInstanceOf[js.Any])
    __obj.asInstanceOf[PostRequestBodyContent486]
  }
  
  extension [Self <: PostRequestBodyContent486](x: Self) {
    
    inline def setPost(value: RequestBodyContent486): Self = StObject.set(x, "post", value.asInstanceOf[js.Any])
  }
}
