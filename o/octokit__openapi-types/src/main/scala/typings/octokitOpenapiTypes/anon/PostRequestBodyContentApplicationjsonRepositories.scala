package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait PostRequestBodyContentApplicationjsonRepositories extends StObject {
  
  /** Use a non-scoped user-to-server OAuth access token to create a repository scoped and/or permission scoped user-to-server OAuth access token. You can specify which repositories the token can access and which permissions are granted to the token. You must use [Basic Authentication](https://docs.github.com/rest/overview/other-authentication-methods#basic-authentication) when accessing this endpoint, using the OAuth application's `client_id` and `client_secret` as the username and password. Invalid tokens will return `404 NOT FOUND`. */
  var post: RequestBodyContentApplicationjsonRepositories
}
object PostRequestBodyContentApplicationjsonRepositories {
  
  inline def apply(post: RequestBodyContentApplicationjsonRepositories): PostRequestBodyContentApplicationjsonRepositories = {
    val __obj = js.Dynamic.literal(post = post.asInstanceOf[js.Any])
    __obj.asInstanceOf[PostRequestBodyContentApplicationjsonRepositories]
  }
  
  extension [Self <: PostRequestBodyContentApplicationjsonRepositories](x: Self) {
    
    inline def setPost(value: RequestBodyContentApplicationjsonRepositories): Self = StObject.set(x, "post", value.asInstanceOf[js.Any])
  }
}
