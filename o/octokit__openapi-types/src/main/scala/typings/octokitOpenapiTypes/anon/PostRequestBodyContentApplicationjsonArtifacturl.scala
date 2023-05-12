package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait PostRequestBodyContentApplicationjsonArtifacturl extends StObject {
  
  /**
    * Create a GitHub Pages deployment
    * @description Create a GitHub Pages deployment for a repository.
    *
    * Users must have write permissions. GitHub Apps must have the `pages:write` permission to use this endpoint.
    */
  var post: RequestBodyContentApplicationjsonArtifacturl
}
object PostRequestBodyContentApplicationjsonArtifacturl {
  
  inline def apply(post: RequestBodyContentApplicationjsonArtifacturl): PostRequestBodyContentApplicationjsonArtifacturl = {
    val __obj = js.Dynamic.literal(post = post.asInstanceOf[js.Any])
    __obj.asInstanceOf[PostRequestBodyContentApplicationjsonArtifacturl]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: PostRequestBodyContentApplicationjsonArtifacturl] (val x: Self) extends AnyVal {
    
    inline def setPost(value: RequestBodyContentApplicationjsonArtifacturl): Self = StObject.set(x, "post", value.asInstanceOf[js.Any])
  }
}
