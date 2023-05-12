package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait PostRequestBodyContentApplicationjsonRepositories extends StObject {
  
  /**
    * Create a scoped access token
    * @description Use a non-scoped user-to-server access token to create a repository scoped and/or permission scoped user-to-server access token. You can specify which repositories the token can access and which permissions are granted to the token. You must use [Basic Authentication](https://docs.github.com/rest/overview/other-authentication-methods#basic-authentication) when accessing this endpoint, using the `client_id` and `client_secret` of the GitHub App as the username and password. Invalid tokens will return `404 NOT FOUND`.
    */
  var post: RequestBodyContentApplicationjsonRepositories
}
object PostRequestBodyContentApplicationjsonRepositories {
  
  inline def apply(post: RequestBodyContentApplicationjsonRepositories): PostRequestBodyContentApplicationjsonRepositories = {
    val __obj = js.Dynamic.literal(post = post.asInstanceOf[js.Any])
    __obj.asInstanceOf[PostRequestBodyContentApplicationjsonRepositories]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: PostRequestBodyContentApplicationjsonRepositories] (val x: Self) extends AnyVal {
    
    inline def setPost(value: RequestBodyContentApplicationjsonRepositories): Self = StObject.set(x, "post", value.asInstanceOf[js.Any])
  }
}
