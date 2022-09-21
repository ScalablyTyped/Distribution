package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait RequestBodyContent225 extends StObject {
  
  var parameters: `144`
  
  var requestBody: Content225
  
  var responses: `201ContentApplicationjsonCreatedat`
}
object RequestBodyContent225 {
  
  inline def apply(parameters: `144`, requestBody: Content225, responses: `201ContentApplicationjsonCreatedat`): RequestBodyContent225 = {
    val __obj = js.Dynamic.literal(parameters = parameters.asInstanceOf[js.Any], requestBody = requestBody.asInstanceOf[js.Any], responses = responses.asInstanceOf[js.Any])
    __obj.asInstanceOf[RequestBodyContent225]
  }
  
  extension [Self <: RequestBodyContent225](x: Self) {
    
    inline def setParameters(value: `144`): Self = StObject.set(x, "parameters", value.asInstanceOf[js.Any])
    
    inline def setRequestBody(value: Content225): Self = StObject.set(x, "requestBody", value.asInstanceOf[js.Any])
    
    inline def setResponses(value: `201ContentApplicationjsonCreatedat`): Self = StObject.set(x, "responses", value.asInstanceOf[js.Any])
  }
}
