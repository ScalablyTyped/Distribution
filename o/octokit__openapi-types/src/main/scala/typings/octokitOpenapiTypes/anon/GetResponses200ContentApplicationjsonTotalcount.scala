package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GetResponses200ContentApplicationjsonTotalcount extends StObject {
  
  /**
    * Lists all self-hosted runners configured for an enterprise.
    *
    * You must authenticate using an access token with the `manage_runners:enterprise` scope to use this endpoint.
    */
  var get: Responses200ContentApplicationjsonTotalcount
}
object GetResponses200ContentApplicationjsonTotalcount {
  
  inline def apply(get: Responses200ContentApplicationjsonTotalcount): GetResponses200ContentApplicationjsonTotalcount = {
    val __obj = js.Dynamic.literal(get = get.asInstanceOf[js.Any])
    __obj.asInstanceOf[GetResponses200ContentApplicationjsonTotalcount]
  }
  
  extension [Self <: GetResponses200ContentApplicationjsonTotalcount](x: Self) {
    
    inline def setGet(value: Responses200ContentApplicationjsonTotalcount): Self = StObject.set(x, "get", value.asInstanceOf[js.Any])
  }
}
