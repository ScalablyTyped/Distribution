package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Post extends StObject {
  
  /**
    * Create a GitHub App from a manifest
    * @description Use this endpoint to complete the handshake necessary when implementing the [GitHub App Manifest flow](https://docs.github.com/apps/building-github-apps/creating-github-apps-from-a-manifest/). When you create a GitHub App with the manifest flow, you receive a temporary `code` used to retrieve the GitHub App's `id`, `pem` (private key), and `webhook_secret`.
    */
  var post: Parameters
}
object Post {
  
  inline def apply(post: Parameters): Post = {
    val __obj = js.Dynamic.literal(post = post.asInstanceOf[js.Any])
    __obj.asInstanceOf[Post]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: Post] (val x: Self) extends AnyVal {
    
    inline def setPost(value: Parameters): Self = StObject.set(x, "post", value.asInstanceOf[js.Any])
  }
}
