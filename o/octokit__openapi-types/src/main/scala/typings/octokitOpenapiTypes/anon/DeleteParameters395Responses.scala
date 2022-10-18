package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DeleteParameters395Responses extends StObject {
  
  /** Disables automated security fixes for a repository. The authenticated user must have admin access to the repository. For more information, see "[Configuring automated security fixes](https://docs.github.com/en/articles/configuring-automated-security-fixes)". */
  var delete: Parameters395Responses
  
  /** Enables automated security fixes for a repository. The authenticated user must have admin access to the repository. For more information, see "[Configuring automated security fixes](https://docs.github.com/en/articles/configuring-automated-security-fixes)". */
  var put: Parameters395Responses
}
object DeleteParameters395Responses {
  
  inline def apply(delete: Parameters395Responses, put: Parameters395Responses): DeleteParameters395Responses = {
    val __obj = js.Dynamic.literal(delete = delete.asInstanceOf[js.Any], put = put.asInstanceOf[js.Any])
    __obj.asInstanceOf[DeleteParameters395Responses]
  }
  
  extension [Self <: DeleteParameters395Responses](x: Self) {
    
    inline def setDelete(value: Parameters395Responses): Self = StObject.set(x, "delete", value.asInstanceOf[js.Any])
    
    inline def setPut(value: Parameters395Responses): Self = StObject.set(x, "put", value.asInstanceOf[js.Any])
  }
}
