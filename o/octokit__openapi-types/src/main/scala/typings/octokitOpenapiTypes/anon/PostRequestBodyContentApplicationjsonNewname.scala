package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait PostRequestBodyContentApplicationjsonNewname extends StObject {
  
  /**
    * Renames a branch in a repository.
    *
    * **Note:** Although the API responds immediately, the branch rename process might take some extra time to complete in the background. You won't be able to push to the old branch name while the rename process is in progress. For more information, see "[Renaming a branch](https://docs.github.com/github/administering-a-repository/renaming-a-branch)".
    *
    * The permissions required to use this endpoint depends on whether you are renaming the default branch.
    *
    * To rename a non-default branch:
    *
    * * Users must have push access.
    * * GitHub Apps must have the `contents:write` repository permission.
    *
    * To rename the default branch:
    *
    * * Users must have admin or owner permissions.
    * * GitHub Apps must have the `administration:write` repository permission.
    */
  var post: RequestBodyContentApplicationjsonNewname
}
object PostRequestBodyContentApplicationjsonNewname {
  
  inline def apply(post: RequestBodyContentApplicationjsonNewname): PostRequestBodyContentApplicationjsonNewname = {
    val __obj = js.Dynamic.literal(post = post.asInstanceOf[js.Any])
    __obj.asInstanceOf[PostRequestBodyContentApplicationjsonNewname]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: PostRequestBodyContentApplicationjsonNewname] (val x: Self) extends AnyVal {
    
    inline def setPost(value: RequestBodyContentApplicationjsonNewname): Self = StObject.set(x, "post", value.asInstanceOf[js.Any])
  }
}
