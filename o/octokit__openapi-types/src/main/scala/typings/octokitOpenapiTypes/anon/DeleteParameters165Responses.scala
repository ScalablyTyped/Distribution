package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DeleteParameters165Responses extends StObject {
  
  /**
    * Disable automated security fixes
    * @description Disables automated security fixes for a repository. The authenticated user must have admin access to the repository. For more information, see "[Configuring automated security fixes](https://docs.github.com/articles/configuring-automated-security-fixes)".
    */
  var delete: Parameters165Responses
  
  /**
    * Enable automated security fixes
    * @description Enables automated security fixes for a repository. The authenticated user must have admin access to the repository. For more information, see "[Configuring automated security fixes](https://docs.github.com/articles/configuring-automated-security-fixes)".
    */
  var put: Parameters165Responses
}
object DeleteParameters165Responses {
  
  inline def apply(delete: Parameters165Responses, put: Parameters165Responses): DeleteParameters165Responses = {
    val __obj = js.Dynamic.literal(delete = delete.asInstanceOf[js.Any], put = put.asInstanceOf[js.Any])
    __obj.asInstanceOf[DeleteParameters165Responses]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: DeleteParameters165Responses] (val x: Self) extends AnyVal {
    
    inline def setDelete(value: Parameters165Responses): Self = StObject.set(x, "delete", value.asInstanceOf[js.Any])
    
    inline def setPut(value: Parameters165Responses): Self = StObject.set(x, "put", value.asInstanceOf[js.Any])
  }
}
