package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GetParameters135Responses404Unknown extends StObject {
  
  /** Disables dependency alerts and the dependency graph for a repository. The authenticated user must have admin access to the repository. For more information, see "[About security alerts for vulnerable dependencies](https://docs.github.com/en/articles/about-security-alerts-for-vulnerable-dependencies)". */
  var delete: Parameters135Responses
  
  /** Shows whether dependency alerts are enabled or disabled for a repository. The authenticated user must have admin read access to the repository. For more information, see "[About security alerts for vulnerable dependencies](https://docs.github.com/en/articles/about-security-alerts-for-vulnerable-dependencies)". */
  var get: Parameters135Responses404Unknown
  
  /** Enables dependency alerts and the dependency graph for a repository. The authenticated user must have admin access to the repository. For more information, see "[About security alerts for vulnerable dependencies](https://docs.github.com/en/articles/about-security-alerts-for-vulnerable-dependencies)". */
  var put: Parameters135Responses
}
object GetParameters135Responses404Unknown {
  
  inline def apply(delete: Parameters135Responses, get: Parameters135Responses404Unknown, put: Parameters135Responses): GetParameters135Responses404Unknown = {
    val __obj = js.Dynamic.literal(delete = delete.asInstanceOf[js.Any], get = get.asInstanceOf[js.Any], put = put.asInstanceOf[js.Any])
    __obj.asInstanceOf[GetParameters135Responses404Unknown]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: GetParameters135Responses404Unknown] (val x: Self) extends AnyVal {
    
    inline def setDelete(value: Parameters135Responses): Self = StObject.set(x, "delete", value.asInstanceOf[js.Any])
    
    inline def setGet(value: Parameters135Responses404Unknown): Self = StObject.set(x, "get", value.asInstanceOf[js.Any])
    
    inline def setPut(value: Parameters135Responses): Self = StObject.set(x, "put", value.asInstanceOf[js.Any])
  }
}
