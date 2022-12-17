package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DeleteParameters135Responses extends StObject {
  
  /** Disables automated security fixes for a repository. The authenticated user must have admin access to the repository. For more information, see "[Configuring automated security fixes](https://docs.github.com/en/articles/configuring-automated-security-fixes)". */
  var delete: Parameters135Responses
  
  /** Enables automated security fixes for a repository. The authenticated user must have admin access to the repository. For more information, see "[Configuring automated security fixes](https://docs.github.com/en/articles/configuring-automated-security-fixes)". */
  var put: Parameters135Responses
}
object DeleteParameters135Responses {
  
  inline def apply(delete: Parameters135Responses, put: Parameters135Responses): DeleteParameters135Responses = {
    val __obj = js.Dynamic.literal(delete = delete.asInstanceOf[js.Any], put = put.asInstanceOf[js.Any])
    __obj.asInstanceOf[DeleteParameters135Responses]
  }
  
  extension [Self <: DeleteParameters135Responses](x: Self) {
    
    inline def setDelete(value: Parameters135Responses): Self = StObject.set(x, "delete", value.asInstanceOf[js.Any])
    
    inline def setPut(value: Parameters135Responses): Self = StObject.set(x, "put", value.asInstanceOf[js.Any])
  }
}
