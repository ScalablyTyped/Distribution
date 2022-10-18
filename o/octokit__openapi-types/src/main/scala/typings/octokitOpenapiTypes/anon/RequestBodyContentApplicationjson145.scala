package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait RequestBodyContentApplicationjson145 extends StObject {
  
  var parameters: PathIssuenumber
  
  var requestBody: ContentApplicationjson145
  
  var responses: `201144`
}
object RequestBodyContentApplicationjson145 {
  
  inline def apply(parameters: PathIssuenumber, requestBody: ContentApplicationjson145, responses: `201144`): RequestBodyContentApplicationjson145 = {
    val __obj = js.Dynamic.literal(parameters = parameters.asInstanceOf[js.Any], requestBody = requestBody.asInstanceOf[js.Any], responses = responses.asInstanceOf[js.Any])
    __obj.asInstanceOf[RequestBodyContentApplicationjson145]
  }
  
  extension [Self <: RequestBodyContentApplicationjson145](x: Self) {
    
    inline def setParameters(value: PathIssuenumber): Self = StObject.set(x, "parameters", value.asInstanceOf[js.Any])
    
    inline def setRequestBody(value: ContentApplicationjson145): Self = StObject.set(x, "requestBody", value.asInstanceOf[js.Any])
    
    inline def setResponses(value: `201144`): Self = StObject.set(x, "responses", value.asInstanceOf[js.Any])
  }
}
