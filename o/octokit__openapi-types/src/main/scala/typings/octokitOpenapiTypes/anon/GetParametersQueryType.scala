package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GetParametersQueryType extends StObject {
  
  /** Lists repositories for the specified organization. */
  var get: ParametersQueryType
  
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
object GetParametersQueryType {
  
  inline def apply(get: ParametersQueryType, post: RequestBodyContentApplicationjsonAllowautomerge): GetParametersQueryType = {
    val __obj = js.Dynamic.literal(get = get.asInstanceOf[js.Any], post = post.asInstanceOf[js.Any])
    __obj.asInstanceOf[GetParametersQueryType]
  }
  
  extension [Self <: GetParametersQueryType](x: Self) {
    
    inline def setGet(value: ParametersQueryType): Self = StObject.set(x, "get", value.asInstanceOf[js.Any])
    
    inline def setPost(value: RequestBodyContentApplicationjsonAllowautomerge): Self = StObject.set(x, "post", value.asInstanceOf[js.Any])
  }
}
