package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait RequestBodyContentApplicationjsonContenttype extends StObject {
  
  var parameters: PathHookid
  
  var requestBody: ContentApplicationjsonContenttype
  
  var responses: `200ContentApplicationjsonSecret`
}
object RequestBodyContentApplicationjsonContenttype {
  
  inline def apply(
    parameters: PathHookid,
    requestBody: ContentApplicationjsonContenttype,
    responses: `200ContentApplicationjsonSecret`
  ): RequestBodyContentApplicationjsonContenttype = {
    val __obj = js.Dynamic.literal(parameters = parameters.asInstanceOf[js.Any], requestBody = requestBody.asInstanceOf[js.Any], responses = responses.asInstanceOf[js.Any])
    __obj.asInstanceOf[RequestBodyContentApplicationjsonContenttype]
  }
  
  extension [Self <: RequestBodyContentApplicationjsonContenttype](x: Self) {
    
    inline def setParameters(value: PathHookid): Self = StObject.set(x, "parameters", value.asInstanceOf[js.Any])
    
    inline def setRequestBody(value: ContentApplicationjsonContenttype): Self = StObject.set(x, "requestBody", value.asInstanceOf[js.Any])
    
    inline def setResponses(value: `200ContentApplicationjsonSecret`): Self = StObject.set(x, "responses", value.asInstanceOf[js.Any])
  }
}
