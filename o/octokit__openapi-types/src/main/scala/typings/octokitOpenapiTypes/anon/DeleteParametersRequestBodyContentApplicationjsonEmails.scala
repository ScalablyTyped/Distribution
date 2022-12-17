package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DeleteParametersRequestBodyContentApplicationjsonEmails extends StObject {
  
  /** This endpoint is accessible with the `user` scope. */
  var delete: ParametersRequestBodyContentApplicationjsonEmails
  
  /** Lists all of your email addresses, and specifies which one is visible to the public. This endpoint is accessible with the `user:email` scope. */
  var get: Responses200Content358Headers
  
  /** This endpoint is accessible with the `user` scope. */
  var post: RequestBodyContentApplicationjsonEmails
}
object DeleteParametersRequestBodyContentApplicationjsonEmails {
  
  inline def apply(
    delete: ParametersRequestBodyContentApplicationjsonEmails,
    get: Responses200Content358Headers,
    post: RequestBodyContentApplicationjsonEmails
  ): DeleteParametersRequestBodyContentApplicationjsonEmails = {
    val __obj = js.Dynamic.literal(delete = delete.asInstanceOf[js.Any], get = get.asInstanceOf[js.Any], post = post.asInstanceOf[js.Any])
    __obj.asInstanceOf[DeleteParametersRequestBodyContentApplicationjsonEmails]
  }
  
  extension [Self <: DeleteParametersRequestBodyContentApplicationjsonEmails](x: Self) {
    
    inline def setDelete(value: ParametersRequestBodyContentApplicationjsonEmails): Self = StObject.set(x, "delete", value.asInstanceOf[js.Any])
    
    inline def setGet(value: Responses200Content358Headers): Self = StObject.set(x, "get", value.asInstanceOf[js.Any])
    
    inline def setPost(value: RequestBodyContentApplicationjsonEmails): Self = StObject.set(x, "post", value.asInstanceOf[js.Any])
  }
}
