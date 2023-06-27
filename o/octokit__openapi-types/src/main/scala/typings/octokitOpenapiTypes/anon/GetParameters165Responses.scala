package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GetParameters165Responses extends StObject {
  
  /**
    * Disable vulnerability alerts
    * @description Disables dependency alerts and the dependency graph for a repository.
    * The authenticated user must have admin access to the repository. For more information,
    * see "[About security alerts for vulnerable dependencies](https://docs.github.com/articles/about-security-alerts-for-vulnerable-dependencies)".
    */
  var delete: Parameters165Responses
  
  /**
    * Check if vulnerability alerts are enabled for a repository
    * @description Shows whether dependency alerts are enabled or disabled for a repository. The authenticated user must have admin read access to the repository. For more information, see "[About security alerts for vulnerable dependencies](https://docs.github.com/articles/about-security-alerts-for-vulnerable-dependencies)".
    */
  var get: Parameters165Responses
  
  /**
    * Enable vulnerability alerts
    * @description Enables dependency alerts and the dependency graph for a repository. The authenticated user must have admin access to the repository. For more information, see "[About security alerts for vulnerable dependencies](https://docs.github.com/articles/about-security-alerts-for-vulnerable-dependencies)".
    */
  var put: Parameters165Responses
}
object GetParameters165Responses {
  
  inline def apply(delete: Parameters165Responses, get: Parameters165Responses, put: Parameters165Responses): GetParameters165Responses = {
    val __obj = js.Dynamic.literal(delete = delete.asInstanceOf[js.Any], get = get.asInstanceOf[js.Any], put = put.asInstanceOf[js.Any])
    __obj.asInstanceOf[GetParameters165Responses]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: GetParameters165Responses] (val x: Self) extends AnyVal {
    
    inline def setDelete(value: Parameters165Responses): Self = StObject.set(x, "delete", value.asInstanceOf[js.Any])
    
    inline def setGet(value: Parameters165Responses): Self = StObject.set(x, "get", value.asInstanceOf[js.Any])
    
    inline def setPut(value: Parameters165Responses): Self = StObject.set(x, "put", value.asInstanceOf[js.Any])
  }
}
