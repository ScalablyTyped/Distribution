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
  var delete: Responses263
  
  /**
    * Lists all labels for a self-hosted runner configured in an enterprise.
    *
    * You must authenticate using an access token with the `manage_runners:enterprise` scope to use this endpoint.
    */
  var get: Responses261
  
  /**
    * Add custom labels to a self-hosted runner configured in an enterprise.
    *
    * You must authenticate using an access token with the `manage_runners:enterprise` scope to use this endpoint.
    */
  var post: Responses262
  
  /**
    * Remove all previous custom labels and set the new custom labels for a specific
    * self-hosted runner configured in an enterprise.
    *
    * You must authenticate using an access token with the `manage_runners:enterprise` scope to use this endpoint.
    */
  var put: Responses262
}
object PostPut {
  
  inline def apply(delete: Responses263, get: Responses261, post: Responses262, put: Responses262): PostPut = {
    val __obj = js.Dynamic.literal(delete = delete.asInstanceOf[js.Any], get = get.asInstanceOf[js.Any], post = post.asInstanceOf[js.Any], put = put.asInstanceOf[js.Any])
    __obj.asInstanceOf[PostPut]
  }
  
  extension [Self <: PostPut](x: Self) {
    
    inline def setDelete(value: Responses263): Self = StObject.set(x, "delete", value.asInstanceOf[js.Any])
    
    inline def setGet(value: Responses261): Self = StObject.set(x, "get", value.asInstanceOf[js.Any])
    
    inline def setPost(value: Responses262): Self = StObject.set(x, "post", value.asInstanceOf[js.Any])
    
    inline def setPut(value: Responses262): Self = StObject.set(x, "put", value.asInstanceOf[js.Any])
  }
}
