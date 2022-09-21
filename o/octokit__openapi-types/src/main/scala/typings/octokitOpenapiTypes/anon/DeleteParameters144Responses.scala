package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DeleteParameters144Responses extends StObject {
  
  /** Disables automated security fixes for a repository. The authenticated user must have admin access to the repository. For more information, see "[Configuring automated security fixes](https://docs.github.com/en/articles/configuring-automated-security-fixes)". */
  var delete: Parameters144Responses
  
  /** Enables automated security fixes for a repository. The authenticated user must have admin access to the repository. For more information, see "[Configuring automated security fixes](https://docs.github.com/en/articles/configuring-automated-security-fixes)". */
  var put: Parameters144Responses
}
object DeleteParameters144Responses {
  
  inline def apply(delete: Parameters144Responses, put: Parameters144Responses): DeleteParameters144Responses = {
    val __obj = js.Dynamic.literal(delete = delete.asInstanceOf[js.Any], put = put.asInstanceOf[js.Any])
    __obj.asInstanceOf[DeleteParameters144Responses]
  }
  
  extension [Self <: DeleteParameters144Responses](x: Self) {
    
    inline def setDelete(value: Parameters144Responses): Self = StObject.set(x, "delete", value.asInstanceOf[js.Any])
    
    inline def setPut(value: Parameters144Responses): Self = StObject.set(x, "put", value.asInstanceOf[js.Any])
  }
}
