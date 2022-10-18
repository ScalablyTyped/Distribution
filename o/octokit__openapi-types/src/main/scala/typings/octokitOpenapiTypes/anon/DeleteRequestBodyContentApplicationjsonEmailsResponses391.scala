package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DeleteRequestBodyContentApplicationjsonEmailsResponses391 extends StObject {
  
  /** This endpoint is accessible with the `user` scope. */
  var delete: RequestBodyContentApplicationjsonEmailsResponses391
  
  /** Lists all of your email addresses, and specifies which one is visible to the public. This endpoint is accessible with the `user:email` scope. */
  var get: Responses200Content624Headers
  
  /** This endpoint is accessible with the `user` scope. */
  var post: Responses201Content624
}
object DeleteRequestBodyContentApplicationjsonEmailsResponses391 {
  
  inline def apply(
    delete: RequestBodyContentApplicationjsonEmailsResponses391,
    get: Responses200Content624Headers,
    post: Responses201Content624
  ): DeleteRequestBodyContentApplicationjsonEmailsResponses391 = {
    val __obj = js.Dynamic.literal(delete = delete.asInstanceOf[js.Any], get = get.asInstanceOf[js.Any], post = post.asInstanceOf[js.Any])
    __obj.asInstanceOf[DeleteRequestBodyContentApplicationjsonEmailsResponses391]
  }
  
  extension [Self <: DeleteRequestBodyContentApplicationjsonEmailsResponses391](x: Self) {
    
    inline def setDelete(value: RequestBodyContentApplicationjsonEmailsResponses391): Self = StObject.set(x, "delete", value.asInstanceOf[js.Any])
    
    inline def setGet(value: Responses200Content624Headers): Self = StObject.set(x, "get", value.asInstanceOf[js.Any])
    
    inline def setPost(value: Responses201Content624): Self = StObject.set(x, "post", value.asInstanceOf[js.Any])
  }
}
