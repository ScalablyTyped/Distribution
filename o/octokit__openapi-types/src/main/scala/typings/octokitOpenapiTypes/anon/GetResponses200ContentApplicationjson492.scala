package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GetResponses200ContentApplicationjson492 extends StObject {
  
  /**
    * Lists the environments for a repository.
    *
    * Anyone with read access to the repository can use this endpoint. If the repository is private, you must use an access token with the `repo` scope. GitHub Apps must have the `actions:read` permission to use this endpoint.
    */
  var get: Responses200ContentApplicationjson492
}
object GetResponses200ContentApplicationjson492 {
  
  inline def apply(get: Responses200ContentApplicationjson492): GetResponses200ContentApplicationjson492 = {
    val __obj = js.Dynamic.literal(get = get.asInstanceOf[js.Any])
    __obj.asInstanceOf[GetResponses200ContentApplicationjson492]
  }
  
  extension [Self <: GetResponses200ContentApplicationjson492](x: Self) {
    
    inline def setGet(value: Responses200ContentApplicationjson492): Self = StObject.set(x, "get", value.asInstanceOf[js.Any])
  }
}
