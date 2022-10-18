package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait PostRequestBodyContentApplicationjsonPermissionsRepositories extends StObject {
  
  /**
    * Creates an installation access token that enables a GitHub App to make authenticated API requests for the app's installation on an organization or individual account. Installation tokens expire one hour from the time you create them. Using an expired token produces a status code of `401 - Unauthorized`, and requires creating a new installation token. By default the installation token has access to all repositories that the installation can access. To restrict the access to specific repositories, you can provide the `repository_ids` when creating the token. When you omit `repository_ids`, the response does not contain the `repositories` key.
    *
    * You must use a [JWT](https://docs.github.com/apps/building-github-apps/authenticating-with-github-apps/#authenticating-as-a-github-app) to access this endpoint.
    */
  var post: RequestBodyContentApplicationjsonPermissionsRepositories
}
object PostRequestBodyContentApplicationjsonPermissionsRepositories {
  
  inline def apply(post: RequestBodyContentApplicationjsonPermissionsRepositories): PostRequestBodyContentApplicationjsonPermissionsRepositories = {
    val __obj = js.Dynamic.literal(post = post.asInstanceOf[js.Any])
    __obj.asInstanceOf[PostRequestBodyContentApplicationjsonPermissionsRepositories]
  }
  
  extension [Self <: PostRequestBodyContentApplicationjsonPermissionsRepositories](x: Self) {
    
    inline def setPost(value: RequestBodyContentApplicationjsonPermissionsRepositories): Self = StObject.set(x, "post", value.asInstanceOf[js.Any])
  }
}
