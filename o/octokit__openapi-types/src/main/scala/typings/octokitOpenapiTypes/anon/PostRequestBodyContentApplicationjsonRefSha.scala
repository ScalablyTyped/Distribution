package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait PostRequestBodyContentApplicationjsonRefSha extends StObject {
  
  /** Creates a reference for your repository. You are unable to create new references for empty repositories, even if the commit SHA-1 hash used exists. Empty repositories are repositories without branches. */
  var post: RequestBodyContentApplicationjsonRefSha
}
object PostRequestBodyContentApplicationjsonRefSha {
  
  inline def apply(post: RequestBodyContentApplicationjsonRefSha): PostRequestBodyContentApplicationjsonRefSha = {
    val __obj = js.Dynamic.literal(post = post.asInstanceOf[js.Any])
    __obj.asInstanceOf[PostRequestBodyContentApplicationjsonRefSha]
  }
  
  extension [Self <: PostRequestBodyContentApplicationjsonRefSha](x: Self) {
    
    inline def setPost(value: RequestBodyContentApplicationjsonRefSha): Self = StObject.set(x, "post", value.asInstanceOf[js.Any])
  }
}
