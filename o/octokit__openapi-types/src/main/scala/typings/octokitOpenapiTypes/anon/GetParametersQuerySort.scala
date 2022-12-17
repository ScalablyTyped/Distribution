package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GetParametersQuerySort extends StObject {
  
  /** Lists repositories for the specified organization. */
  var get: ParametersQuerySort
  
  /**
    * Creates a new repository in the specified organization. The authenticated user must be a member of the organization.
    *
    * **OAuth scope requirements**
    *
    * When using [OAuth](https://docs.github.com/apps/building-oauth-apps/understanding-scopes-for-oauth-apps/), authorizations must include:
    *
    * *   `public_repo` scope or `repo` scope to create a public repository. Note: For GitHub AE, use `repo` scope to create an internal repository.
    * *   `repo` scope to create a private repository
    */
  var post: RequestBodyContentApplicationjsonAllowautomerge
}
object GetParametersQuerySort {
  
  inline def apply(get: ParametersQuerySort, post: RequestBodyContentApplicationjsonAllowautomerge): GetParametersQuerySort = {
    val __obj = js.Dynamic.literal(get = get.asInstanceOf[js.Any], post = post.asInstanceOf[js.Any])
    __obj.asInstanceOf[GetParametersQuerySort]
  }
  
  extension [Self <: GetParametersQuerySort](x: Self) {
    
    inline def setGet(value: ParametersQuerySort): Self = StObject.set(x, "get", value.asInstanceOf[js.Any])
    
    inline def setPost(value: RequestBodyContentApplicationjsonAllowautomerge): Self = StObject.set(x, "post", value.asInstanceOf[js.Any])
  }
}
