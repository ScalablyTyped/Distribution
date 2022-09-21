package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GetPostPut extends StObject {
  
  /**
    * Remove all custom labels from a self-hosted runner configured in a
    * repository. Returns the remaining read-only labels from the runner.
    *
    * You must authenticate using an access token with the `repo` scope to use this
    * endpoint.
    */
  var delete: ParametersPathOwnerRepoResponses70
  
  /**
    * Lists all labels for a self-hosted runner configured in a repository.
    *
    * You must authenticate using an access token with the `repo` scope to use this
    * endpoint.
    */
  var get: ParametersPathOwnerRepoResponses24
  
  /**
    * Add custom labels to a self-hosted runner configured in a repository.
    *
    * You must authenticate using an access token with the `repo` scope to use this
    * endpoint.
    */
  var post: ParametersPathOwnerRepoRequestBodyContentApplicationjsonLabels
  
  /**
    * Remove all previous custom labels and set the new custom labels for a specific
    * self-hosted runner configured in a repository.
    *
    * You must authenticate using an access token with the `repo` scope to use this
    * endpoint.
    */
  var put: ParametersPathOwnerRepoRequestBodyContentApplicationjsonLabels
}
object GetPostPut {
  
  inline def apply(
    delete: ParametersPathOwnerRepoResponses70,
    get: ParametersPathOwnerRepoResponses24,
    post: ParametersPathOwnerRepoRequestBodyContentApplicationjsonLabels,
    put: ParametersPathOwnerRepoRequestBodyContentApplicationjsonLabels
  ): GetPostPut = {
    val __obj = js.Dynamic.literal(delete = delete.asInstanceOf[js.Any], get = get.asInstanceOf[js.Any], post = post.asInstanceOf[js.Any], put = put.asInstanceOf[js.Any])
    __obj.asInstanceOf[GetPostPut]
  }
  
  extension [Self <: GetPostPut](x: Self) {
    
    inline def setDelete(value: ParametersPathOwnerRepoResponses70): Self = StObject.set(x, "delete", value.asInstanceOf[js.Any])
    
    inline def setGet(value: ParametersPathOwnerRepoResponses24): Self = StObject.set(x, "get", value.asInstanceOf[js.Any])
    
    inline def setPost(value: ParametersPathOwnerRepoRequestBodyContentApplicationjsonLabels): Self = StObject.set(x, "post", value.asInstanceOf[js.Any])
    
    inline def setPut(value: ParametersPathOwnerRepoRequestBodyContentApplicationjsonLabels): Self = StObject.set(x, "put", value.asInstanceOf[js.Any])
  }
}
