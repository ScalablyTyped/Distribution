package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait PostPut extends StObject {
  
  /**
    * Remove all custom labels from a self-hosted runner for an organization
    * @description Remove all custom labels from a self-hosted runner configured in an
    * organization. Returns the remaining read-only labels from the runner.
    *
    * You must authenticate using an access token with the `admin:org` scope to use this endpoint.
    */
  var delete: Responses73
  
  /**
    * List labels for a self-hosted runner for an organization
    * @description Lists all labels for a self-hosted runner configured in an organization.
    *
    * You must authenticate using an access token with the `admin:org` scope to use this endpoint.
    */
  var get: Responses72
  
  /**
    * Add custom labels to a self-hosted runner for an organization
    * @description Add custom labels to a self-hosted runner configured in an organization.
    *
    * You must authenticate using an access token with the `admin:org` scope to use this endpoint.
    */
  var post: RequestBodyContentApplicationjsonLabelsArray
  
  /**
    * Set custom labels for a self-hosted runner for an organization
    * @description Remove all previous custom labels and set the new custom labels for a specific
    * self-hosted runner configured in an organization.
    *
    * You must authenticate using an access token with the `admin:org` scope to use this endpoint.
    */
  var put: RequestBodyContentApplicationjsonLabelsArray
}
object PostPut {
  
  inline def apply(
    delete: Responses73,
    get: Responses72,
    post: RequestBodyContentApplicationjsonLabelsArray,
    put: RequestBodyContentApplicationjsonLabelsArray
  ): PostPut = {
    val __obj = js.Dynamic.literal(delete = delete.asInstanceOf[js.Any], get = get.asInstanceOf[js.Any], post = post.asInstanceOf[js.Any], put = put.asInstanceOf[js.Any])
    __obj.asInstanceOf[PostPut]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: PostPut] (val x: Self) extends AnyVal {
    
    inline def setDelete(value: Responses73): Self = StObject.set(x, "delete", value.asInstanceOf[js.Any])
    
    inline def setGet(value: Responses72): Self = StObject.set(x, "get", value.asInstanceOf[js.Any])
    
    inline def setPost(value: RequestBodyContentApplicationjsonLabelsArray): Self = StObject.set(x, "post", value.asInstanceOf[js.Any])
    
    inline def setPut(value: RequestBodyContentApplicationjsonLabelsArray): Self = StObject.set(x, "put", value.asInstanceOf[js.Any])
  }
}
