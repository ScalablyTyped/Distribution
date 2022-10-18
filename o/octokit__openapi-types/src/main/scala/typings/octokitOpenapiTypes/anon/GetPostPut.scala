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
  var delete: ParametersPathOwnerRepoRunneridResponses320
  
  /**
    * Lists all labels for a self-hosted runner configured in a repository.
    *
    * You must authenticate using an access token with the `repo` scope to use this
    * endpoint.
    */
  var get: ParametersPathOwnerRepoRunneridResponses261
  
  /**
    * Add custom labels to a self-hosted runner configured in a repository.
    *
    * You must authenticate using an access token with the `repo` scope to use this
    * endpoint.
    */
  var post: ParametersPathOwnerRepoRunneridRequestBodyContentApplicationjsonLabelsArray
  
  /**
    * Remove all previous custom labels and set the new custom labels for a specific
    * self-hosted runner configured in a repository.
    *
    * You must authenticate using an access token with the `repo` scope to use this
    * endpoint.
    */
  var put: ParametersPathOwnerRepoRunneridRequestBodyContentApplicationjsonLabelsArray
}
object GetPostPut {
  
  inline def apply(
    delete: ParametersPathOwnerRepoRunneridResponses320,
    get: ParametersPathOwnerRepoRunneridResponses261,
    post: ParametersPathOwnerRepoRunneridRequestBodyContentApplicationjsonLabelsArray,
    put: ParametersPathOwnerRepoRunneridRequestBodyContentApplicationjsonLabelsArray
  ): GetPostPut = {
    val __obj = js.Dynamic.literal(delete = delete.asInstanceOf[js.Any], get = get.asInstanceOf[js.Any], post = post.asInstanceOf[js.Any], put = put.asInstanceOf[js.Any])
    __obj.asInstanceOf[GetPostPut]
  }
  
  extension [Self <: GetPostPut](x: Self) {
    
    inline def setDelete(value: ParametersPathOwnerRepoRunneridResponses320): Self = StObject.set(x, "delete", value.asInstanceOf[js.Any])
    
    inline def setGet(value: ParametersPathOwnerRepoRunneridResponses261): Self = StObject.set(x, "get", value.asInstanceOf[js.Any])
    
    inline def setPost(value: ParametersPathOwnerRepoRunneridRequestBodyContentApplicationjsonLabelsArray): Self = StObject.set(x, "post", value.asInstanceOf[js.Any])
    
    inline def setPut(value: ParametersPathOwnerRepoRunneridRequestBodyContentApplicationjsonLabelsArray): Self = StObject.set(x, "put", value.asInstanceOf[js.Any])
  }
}
