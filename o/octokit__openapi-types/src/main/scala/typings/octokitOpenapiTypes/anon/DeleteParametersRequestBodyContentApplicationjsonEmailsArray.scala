package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DeleteParametersRequestBodyContentApplicationjsonEmailsArray extends StObject {
  
  /** This endpoint is accessible with the `user` scope. */
  var delete: ParametersRequestBodyContentApplicationjsonEmailsArray
  
  /** Lists all of your email addresses, and specifies which one is visible to the public. This endpoint is accessible with the `user:email` scope. */
  var get: Responses200Content371Headers
  
  /** This endpoint is accessible with the `user` scope. */
  var post: RequestBodyContentApplicationjsonEmailsArray
}
object DeleteParametersRequestBodyContentApplicationjsonEmailsArray {
  
  inline def apply(
    delete: ParametersRequestBodyContentApplicationjsonEmailsArray,
    get: Responses200Content371Headers,
    post: RequestBodyContentApplicationjsonEmailsArray
  ): DeleteParametersRequestBodyContentApplicationjsonEmailsArray = {
    val __obj = js.Dynamic.literal(delete = delete.asInstanceOf[js.Any], get = get.asInstanceOf[js.Any], post = post.asInstanceOf[js.Any])
    __obj.asInstanceOf[DeleteParametersRequestBodyContentApplicationjsonEmailsArray]
  }
  
  extension [Self <: DeleteParametersRequestBodyContentApplicationjsonEmailsArray](x: Self) {
    
    inline def setDelete(value: ParametersRequestBodyContentApplicationjsonEmailsArray): Self = StObject.set(x, "delete", value.asInstanceOf[js.Any])
    
    inline def setGet(value: Responses200Content371Headers): Self = StObject.set(x, "get", value.asInstanceOf[js.Any])
    
    inline def setPost(value: RequestBodyContentApplicationjsonEmailsArray): Self = StObject.set(x, "post", value.asInstanceOf[js.Any])
  }
}
