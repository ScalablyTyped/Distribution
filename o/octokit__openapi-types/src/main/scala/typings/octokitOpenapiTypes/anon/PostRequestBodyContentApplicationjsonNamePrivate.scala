package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait PostRequestBodyContentApplicationjsonNamePrivate extends StObject {
  
  /**
    * Create a repository from an unpublished codespace
    * @description Publishes an unpublished codespace, creating a new repository and assigning it to the codespace.
    *
    * The codespace's token is granted write permissions to the repository, allowing the user to push their changes.
    *
    * This will fail for a codespace that is already published, meaning it has an associated repository.
    *
    * You must authenticate using a personal access token with the `codespace` scope to use this endpoint.
    *
    * GitHub Apps must have write access to the `codespaces` repository permission to use this endpoint.
    */
  var post: RequestBodyContentApplicationjsonNamePrivate
}
object PostRequestBodyContentApplicationjsonNamePrivate {
  
  inline def apply(post: RequestBodyContentApplicationjsonNamePrivate): PostRequestBodyContentApplicationjsonNamePrivate = {
    val __obj = js.Dynamic.literal(post = post.asInstanceOf[js.Any])
    __obj.asInstanceOf[PostRequestBodyContentApplicationjsonNamePrivate]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: PostRequestBodyContentApplicationjsonNamePrivate] (val x: Self) extends AnyVal {
    
    inline def setPost(value: RequestBodyContentApplicationjsonNamePrivate): Self = StObject.set(x, "post", value.asInstanceOf[js.Any])
  }
}
