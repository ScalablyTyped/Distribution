package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GetParameters395Responses404Unknown extends StObject {
  
  /** Disables dependency alerts and the dependency graph for a repository. The authenticated user must have admin access to the repository. For more information, see "[About security alerts for vulnerable dependencies](https://docs.github.com/en/articles/about-security-alerts-for-vulnerable-dependencies)". */
  var delete: Parameters395Responses
  
  /** Shows whether dependency alerts are enabled or disabled for a repository. The authenticated user must have admin read access to the repository. For more information, see "[About security alerts for vulnerable dependencies](https://docs.github.com/en/articles/about-security-alerts-for-vulnerable-dependencies)". */
  var get: Parameters395Responses404Unknown
  
  /** Enables dependency alerts and the dependency graph for a repository. The authenticated user must have admin access to the repository. For more information, see "[About security alerts for vulnerable dependencies](https://docs.github.com/en/articles/about-security-alerts-for-vulnerable-dependencies)". */
  var put: Parameters395Responses
}
object GetParameters395Responses404Unknown {
  
  inline def apply(delete: Parameters395Responses, get: Parameters395Responses404Unknown, put: Parameters395Responses): GetParameters395Responses404Unknown = {
    val __obj = js.Dynamic.literal(delete = delete.asInstanceOf[js.Any], get = get.asInstanceOf[js.Any], put = put.asInstanceOf[js.Any])
    __obj.asInstanceOf[GetParameters395Responses404Unknown]
  }
  
  extension [Self <: GetParameters395Responses404Unknown](x: Self) {
    
    inline def setDelete(value: Parameters395Responses): Self = StObject.set(x, "delete", value.asInstanceOf[js.Any])
    
    inline def setGet(value: Parameters395Responses404Unknown): Self = StObject.set(x, "get", value.asInstanceOf[js.Any])
    
    inline def setPut(value: Parameters395Responses): Self = StObject.set(x, "put", value.asInstanceOf[js.Any])
  }
}
