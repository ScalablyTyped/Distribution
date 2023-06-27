package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DeleteRequestBodyContentApplicationjsonAccounturlsResponses158 extends StObject {
  
  /**
    * Delete social accounts for the authenticated user
    * @description Deletes one or more social accounts from the authenticated user's profile. This endpoint is accessible with the `user` scope.
    */
  var delete: RequestBodyContentApplicationjsonAccounturlsResponses158
  
  /**
    * List social accounts for the authenticated user
    * @description Lists all of your social accounts.
    */
  var get: Responses200Content476
  
  /**
    * Add social accounts for the authenticated user
    * @description Add one or more social accounts to the authenticated user's profile. This endpoint is accessible with the `user` scope.
    */
  var post: RequestBodyContentApplicationjsonAccounturls
}
object DeleteRequestBodyContentApplicationjsonAccounturlsResponses158 {
  
  inline def apply(
    delete: RequestBodyContentApplicationjsonAccounturlsResponses158,
    get: Responses200Content476,
    post: RequestBodyContentApplicationjsonAccounturls
  ): DeleteRequestBodyContentApplicationjsonAccounturlsResponses158 = {
    val __obj = js.Dynamic.literal(delete = delete.asInstanceOf[js.Any], get = get.asInstanceOf[js.Any], post = post.asInstanceOf[js.Any])
    __obj.asInstanceOf[DeleteRequestBodyContentApplicationjsonAccounturlsResponses158]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: DeleteRequestBodyContentApplicationjsonAccounturlsResponses158] (val x: Self) extends AnyVal {
    
    inline def setDelete(value: RequestBodyContentApplicationjsonAccounturlsResponses158): Self = StObject.set(x, "delete", value.asInstanceOf[js.Any])
    
    inline def setGet(value: Responses200Content476): Self = StObject.set(x, "get", value.asInstanceOf[js.Any])
    
    inline def setPost(value: RequestBodyContentApplicationjsonAccounturls): Self = StObject.set(x, "post", value.asInstanceOf[js.Any])
  }
}
