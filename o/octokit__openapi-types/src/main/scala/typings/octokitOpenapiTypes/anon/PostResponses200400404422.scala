package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait PostResponses200400404422 extends StObject {
  
  /**
    * Create a GitHub Pages deployment for a repository.
    *
    * Users must have write permissions. GitHub Apps must have the `pages:write` permission to use this endpoint.
    */
  var post: Responses200400404422
}
object PostResponses200400404422 {
  
  inline def apply(post: Responses200400404422): PostResponses200400404422 = {
    val __obj = js.Dynamic.literal(post = post.asInstanceOf[js.Any])
    __obj.asInstanceOf[PostResponses200400404422]
  }
  
  extension [Self <: PostResponses200400404422](x: Self) {
    
    inline def setPost(value: Responses200400404422): Self = StObject.set(x, "post", value.asInstanceOf[js.Any])
  }
}
