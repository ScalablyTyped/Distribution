package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GetResponses200ContentApplicationjson256 extends StObject {
  
  /**
    * Lists all self-hosted runners configured for an enterprise.
    *
    * You must authenticate using an access token with the `manage_runners:enterprise` scope to use this endpoint.
    */
  var get: Responses200ContentApplicationjson256
}
object GetResponses200ContentApplicationjson256 {
  
  inline def apply(get: Responses200ContentApplicationjson256): GetResponses200ContentApplicationjson256 = {
    val __obj = js.Dynamic.literal(get = get.asInstanceOf[js.Any])
    __obj.asInstanceOf[GetResponses200ContentApplicationjson256]
  }
  
  extension [Self <: GetResponses200ContentApplicationjson256](x: Self) {
    
    inline def setGet(value: Responses200ContentApplicationjson256): Self = StObject.set(x, "get", value.asInstanceOf[js.Any])
  }
}
