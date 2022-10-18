package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait RequestBodyContentApplicationjsonMessageObject extends StObject {
  
  var parameters: `76`
  
  var requestBody: ContentApplicationjsonMessageObject
  
  var responses: `201ContentApplicationjsonMessageNodeid`
}
object RequestBodyContentApplicationjsonMessageObject {
  
  inline def apply(
    parameters: `76`,
    requestBody: ContentApplicationjsonMessageObject,
    responses: `201ContentApplicationjsonMessageNodeid`
  ): RequestBodyContentApplicationjsonMessageObject = {
    val __obj = js.Dynamic.literal(parameters = parameters.asInstanceOf[js.Any], requestBody = requestBody.asInstanceOf[js.Any], responses = responses.asInstanceOf[js.Any])
    __obj.asInstanceOf[RequestBodyContentApplicationjsonMessageObject]
  }
  
  extension [Self <: RequestBodyContentApplicationjsonMessageObject](x: Self) {
    
    inline def setParameters(value: `76`): Self = StObject.set(x, "parameters", value.asInstanceOf[js.Any])
    
    inline def setRequestBody(value: ContentApplicationjsonMessageObject): Self = StObject.set(x, "requestBody", value.asInstanceOf[js.Any])
    
    inline def setResponses(value: `201ContentApplicationjsonMessageNodeid`): Self = StObject.set(x, "responses", value.asInstanceOf[js.Any])
  }
}
