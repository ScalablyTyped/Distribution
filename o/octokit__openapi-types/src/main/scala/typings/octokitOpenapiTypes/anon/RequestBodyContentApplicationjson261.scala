package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait RequestBodyContentApplicationjson261 extends StObject {
  
  var parameters: PathIssuenumber
  
  var requestBody: ContentApplicationjson261
  
  var responses: `201260`
}
object RequestBodyContentApplicationjson261 {
  
  inline def apply(parameters: PathIssuenumber, requestBody: ContentApplicationjson261, responses: `201260`): RequestBodyContentApplicationjson261 = {
    val __obj = js.Dynamic.literal(parameters = parameters.asInstanceOf[js.Any], requestBody = requestBody.asInstanceOf[js.Any], responses = responses.asInstanceOf[js.Any])
    __obj.asInstanceOf[RequestBodyContentApplicationjson261]
  }
  
  extension [Self <: RequestBodyContentApplicationjson261](x: Self) {
    
    inline def setParameters(value: PathIssuenumber): Self = StObject.set(x, "parameters", value.asInstanceOf[js.Any])
    
    inline def setRequestBody(value: ContentApplicationjson261): Self = StObject.set(x, "requestBody", value.asInstanceOf[js.Any])
    
    inline def setResponses(value: `201260`): Self = StObject.set(x, "responses", value.asInstanceOf[js.Any])
  }
}
