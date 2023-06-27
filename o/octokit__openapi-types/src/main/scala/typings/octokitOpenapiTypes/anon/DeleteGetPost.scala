package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DeleteGetPost extends StObject {
  
  /**
    * Remove all custom labels from a self-hosted runner for a repository
    * @description Remove all custom labels from a self-hosted runner configured in a
    * repository. Returns the remaining read-only labels from the runner.
    *
    * You must authenticate using an access token with the `repo` scope to use this
    * endpoint.
    */
  var delete: ParametersPathRepoRunneridResponses73
  
  /**
    * List labels for a self-hosted runner for a repository
    * @description Lists all labels for a self-hosted runner configured in a repository.
    *
    * You must authenticate using an access token with the `repo` scope to use this
    * endpoint.
    */
  var get: ParametersPathRepoRunneridResponses72
  
  /**
    * Add custom labels to a self-hosted runner for a repository
    * @description Add custom labels to a self-hosted runner configured in a repository.
    *
    * You must authenticate using an access token with the `repo` scope to use this
    * endpoint.
    */
  var post: Responses200404422
  
  /**
    * Set custom labels for a self-hosted runner for a repository
    * @description Remove all previous custom labels and set the new custom labels for a specific
    * self-hosted runner configured in a repository.
    *
    * You must authenticate using an access token with the `repo` scope to use this
    * endpoint.
    */
  var put: Responses200404422
}
object DeleteGetPost {
  
  inline def apply(
    delete: ParametersPathRepoRunneridResponses73,
    get: ParametersPathRepoRunneridResponses72,
    post: Responses200404422,
    put: Responses200404422
  ): DeleteGetPost = {
    val __obj = js.Dynamic.literal(delete = delete.asInstanceOf[js.Any], get = get.asInstanceOf[js.Any], post = post.asInstanceOf[js.Any], put = put.asInstanceOf[js.Any])
    __obj.asInstanceOf[DeleteGetPost]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: DeleteGetPost] (val x: Self) extends AnyVal {
    
    inline def setDelete(value: ParametersPathRepoRunneridResponses73): Self = StObject.set(x, "delete", value.asInstanceOf[js.Any])
    
    inline def setGet(value: ParametersPathRepoRunneridResponses72): Self = StObject.set(x, "get", value.asInstanceOf[js.Any])
    
    inline def setPost(value: Responses200404422): Self = StObject.set(x, "post", value.asInstanceOf[js.Any])
    
    inline def setPut(value: Responses200404422): Self = StObject.set(x, "put", value.asInstanceOf[js.Any])
  }
}
