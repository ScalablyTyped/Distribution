package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait RequestBodyContentApplicationjsonObject extends StObject {
  
  var parameters: `144`
  
  var requestBody: ContentApplicationjsonObject
  
  var responses: `201Content244`
}
object RequestBodyContentApplicationjsonObject {
  
  inline def apply(parameters: `144`, requestBody: ContentApplicationjsonObject, responses: `201Content244`): RequestBodyContentApplicationjsonObject = {
    val __obj = js.Dynamic.literal(parameters = parameters.asInstanceOf[js.Any], requestBody = requestBody.asInstanceOf[js.Any], responses = responses.asInstanceOf[js.Any])
    __obj.asInstanceOf[RequestBodyContentApplicationjsonObject]
  }
  
  extension [Self <: RequestBodyContentApplicationjsonObject](x: Self) {
    
    inline def setParameters(value: `144`): Self = StObject.set(x, "parameters", value.asInstanceOf[js.Any])
    
    inline def setRequestBody(value: ContentApplicationjsonObject): Self = StObject.set(x, "requestBody", value.asInstanceOf[js.Any])
    
    inline def setResponses(value: `201Content244`): Self = StObject.set(x, "responses", value.asInstanceOf[js.Any])
  }
}
