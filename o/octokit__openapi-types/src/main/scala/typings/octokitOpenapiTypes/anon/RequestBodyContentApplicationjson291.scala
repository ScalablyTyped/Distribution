package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait RequestBodyContentApplicationjson291 extends StObject {
  
  var parameters: `144`
  
  var requestBody: ContentApplicationjson291
  
  var responses: `202205`
}
object RequestBodyContentApplicationjson291 {
  
  inline def apply(parameters: `144`, requestBody: ContentApplicationjson291, responses: `202205`): RequestBodyContentApplicationjson291 = {
    val __obj = js.Dynamic.literal(parameters = parameters.asInstanceOf[js.Any], requestBody = requestBody.asInstanceOf[js.Any], responses = responses.asInstanceOf[js.Any])
    __obj.asInstanceOf[RequestBodyContentApplicationjson291]
  }
  
  extension [Self <: RequestBodyContentApplicationjson291](x: Self) {
    
    inline def setParameters(value: `144`): Self = StObject.set(x, "parameters", value.asInstanceOf[js.Any])
    
    inline def setRequestBody(value: ContentApplicationjson291): Self = StObject.set(x, "requestBody", value.asInstanceOf[js.Any])
    
    inline def setResponses(value: `202205`): Self = StObject.set(x, "responses", value.asInstanceOf[js.Any])
  }
}
