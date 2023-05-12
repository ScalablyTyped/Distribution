package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DeleteRequestBodyResponses135 extends StObject {
  
  /**
    * Delete an email address for the authenticated user
    * @description This endpoint is accessible with the `user` scope.
    */
  var delete: RequestBodyResponses135
  
  /**
    * List email addresses for the authenticated user
    * @description Lists all of your email addresses, and specifies which one is visible to the public. This endpoint is accessible with the `user:email` scope.
    */
  var get: Responses200Content382HeadersLink
  
  /**
    * Add an email address for the authenticated user
    * @description This endpoint is accessible with the `user` scope.
    */
  var post: Responses201304401403404
}
object DeleteRequestBodyResponses135 {
  
  inline def apply(
    delete: RequestBodyResponses135,
    get: Responses200Content382HeadersLink,
    post: Responses201304401403404
  ): DeleteRequestBodyResponses135 = {
    val __obj = js.Dynamic.literal(delete = delete.asInstanceOf[js.Any], get = get.asInstanceOf[js.Any], post = post.asInstanceOf[js.Any])
    __obj.asInstanceOf[DeleteRequestBodyResponses135]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: DeleteRequestBodyResponses135] (val x: Self) extends AnyVal {
    
    inline def setDelete(value: RequestBodyResponses135): Self = StObject.set(x, "delete", value.asInstanceOf[js.Any])
    
    inline def setGet(value: Responses200Content382HeadersLink): Self = StObject.set(x, "get", value.asInstanceOf[js.Any])
    
    inline def setPost(value: Responses201304401403404): Self = StObject.set(x, "post", value.asInstanceOf[js.Any])
  }
}
