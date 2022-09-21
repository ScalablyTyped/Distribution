package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait RequestBodyContentApplicationjsonForce extends StObject {
  
  var parameters: `241`
  
  var requestBody: ContentApplicationjsonForce
  
  var responses: `200Content243422`
}
object RequestBodyContentApplicationjsonForce {
  
  inline def apply(parameters: `241`, requestBody: ContentApplicationjsonForce, responses: `200Content243422`): RequestBodyContentApplicationjsonForce = {
    val __obj = js.Dynamic.literal(parameters = parameters.asInstanceOf[js.Any], requestBody = requestBody.asInstanceOf[js.Any], responses = responses.asInstanceOf[js.Any])
    __obj.asInstanceOf[RequestBodyContentApplicationjsonForce]
  }
  
  extension [Self <: RequestBodyContentApplicationjsonForce](x: Self) {
    
    inline def setParameters(value: `241`): Self = StObject.set(x, "parameters", value.asInstanceOf[js.Any])
    
    inline def setRequestBody(value: ContentApplicationjsonForce): Self = StObject.set(x, "requestBody", value.asInstanceOf[js.Any])
    
    inline def setResponses(value: `200Content243422`): Self = StObject.set(x, "responses", value.asInstanceOf[js.Any])
  }
}
