package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Post extends StObject {
  
  /** Use this endpoint to complete the handshake necessary when implementing the [GitHub App Manifest flow](https://docs.github.com/apps/building-github-apps/creating-github-apps-from-a-manifest/). When you create a GitHub App with the manifest flow, you receive a temporary `code` used to retrieve the GitHub App's `id`, `pem` (private key), and `webhook_secret`. */
  var post: ParametersPathCodeString
}
object Post {
  
  inline def apply(post: ParametersPathCodeString): Post = {
    val __obj = js.Dynamic.literal(post = post.asInstanceOf[js.Any])
    __obj.asInstanceOf[Post]
  }
  
  extension [Self <: Post](x: Self) {
    
    inline def setPost(value: ParametersPathCodeString): Self = StObject.set(x, "post", value.asInstanceOf[js.Any])
  }
}
