package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GetParametersQueryPerpageSortType extends StObject {
  
  /** Lists repositories for the specified organization. */
  var get: ParametersQueryPerpageSortType
  
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
  var post: Responses201Content362
}
object GetParametersQueryPerpageSortType {
  
  inline def apply(get: ParametersQueryPerpageSortType, post: Responses201Content362): GetParametersQueryPerpageSortType = {
    val __obj = js.Dynamic.literal(get = get.asInstanceOf[js.Any], post = post.asInstanceOf[js.Any])
    __obj.asInstanceOf[GetParametersQueryPerpageSortType]
  }
  
  extension [Self <: GetParametersQueryPerpageSortType](x: Self) {
    
    inline def setGet(value: ParametersQueryPerpageSortType): Self = StObject.set(x, "get", value.asInstanceOf[js.Any])
    
    inline def setPost(value: Responses201Content362): Self = StObject.set(x, "post", value.asInstanceOf[js.Any])
  }
}
