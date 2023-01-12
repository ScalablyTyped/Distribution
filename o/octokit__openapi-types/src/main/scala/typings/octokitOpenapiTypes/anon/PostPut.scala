package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait PostPut extends StObject {
  
  /**
    * Remove all custom labels from a self-hosted runner configured in an
    * enterprise. Returns the remaining read-only labels from the runner.
    *
    * You must authenticate using an access token with the `manage_runners:enterprise` scope to use this endpoint.
    */
  var delete: Responses200404422
  
  /**
    * Lists all labels for a self-hosted runner configured in an enterprise.
    *
    * You must authenticate using an access token with the `manage_runners:enterprise` scope to use this endpoint.
    */
  var get: Responses23
  
  /**
    * Add custom labels to a self-hosted runner configured in an enterprise.
    *
    * You must authenticate using an access token with the `manage_runners:enterprise` scope to use this endpoint.
    */
  var post: RequestBodyContentApplicationjsonLabels
  
  /**
    * Remove all previous custom labels and set the new custom labels for a specific
    * self-hosted runner configured in an enterprise.
    *
    * You must authenticate using an access token with the `manage_runners:enterprise` scope to use this endpoint.
    */
  var put: RequestBodyContentApplicationjsonLabels
}
object PostPut {
  
  inline def apply(
    delete: Responses200404422,
    get: Responses23,
    post: RequestBodyContentApplicationjsonLabels,
    put: RequestBodyContentApplicationjsonLabels
  ): PostPut = {
    val __obj = js.Dynamic.literal(delete = delete.asInstanceOf[js.Any], get = get.asInstanceOf[js.Any], post = post.asInstanceOf[js.Any], put = put.asInstanceOf[js.Any])
    __obj.asInstanceOf[PostPut]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: PostPut] (val x: Self) extends AnyVal {
    
    inline def setDelete(value: Responses200404422): Self = StObject.set(x, "delete", value.asInstanceOf[js.Any])
    
    inline def setGet(value: Responses23): Self = StObject.set(x, "get", value.asInstanceOf[js.Any])
    
    inline def setPost(value: RequestBodyContentApplicationjsonLabels): Self = StObject.set(x, "post", value.asInstanceOf[js.Any])
    
    inline def setPut(value: RequestBodyContentApplicationjsonLabels): Self = StObject.set(x, "put", value.asInstanceOf[js.Any])
  }
}
