package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DeleteRequestBodyContentApplicationjsonAccounturlsResponses135 extends StObject {
  
  /**
    * Delete social accounts for the authenticated user
    * @description Deletes one or more social accounts from the authenticated user's profile. This endpoint is accessible with the `user` scope.
    */
  var delete: RequestBodyContentApplicationjsonAccounturlsResponses135
  
  /**
    * List social accounts for the authenticated user
    * @description Lists all of your social accounts.
    */
  var get: Responses200Content398
  
  /**
    * Add social accounts for the authenticated user
    * @description Add one or more social accounts to the authenticated user's profile. This endpoint is accessible with the `user` scope.
    */
  var post: RequestBodyContentApplicationjsonAccounturls
}
object DeleteRequestBodyContentApplicationjsonAccounturlsResponses135 {
  
  inline def apply(
    delete: RequestBodyContentApplicationjsonAccounturlsResponses135,
    get: Responses200Content398,
    post: RequestBodyContentApplicationjsonAccounturls
  ): DeleteRequestBodyContentApplicationjsonAccounturlsResponses135 = {
    val __obj = js.Dynamic.literal(delete = delete.asInstanceOf[js.Any], get = get.asInstanceOf[js.Any], post = post.asInstanceOf[js.Any])
    __obj.asInstanceOf[DeleteRequestBodyContentApplicationjsonAccounturlsResponses135]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: DeleteRequestBodyContentApplicationjsonAccounturlsResponses135] (val x: Self) extends AnyVal {
    
    inline def setDelete(value: RequestBodyContentApplicationjsonAccounturlsResponses135): Self = StObject.set(x, "delete", value.asInstanceOf[js.Any])
    
    inline def setGet(value: Responses200Content398): Self = StObject.set(x, "get", value.asInstanceOf[js.Any])
    
    inline def setPost(value: RequestBodyContentApplicationjsonAccounturls): Self = StObject.set(x, "post", value.asInstanceOf[js.Any])
  }
}
