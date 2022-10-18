package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait RequestBodyContentApplicationjsonColorDescriptionName extends StObject {
  
  var parameters: `76`
  
  var requestBody: ContentApplicationjsonColorDescriptionName
  
  var responses: `201ContentApplicationjsonDefaultDescription`
}
object RequestBodyContentApplicationjsonColorDescriptionName {
  
  inline def apply(
    parameters: `76`,
    requestBody: ContentApplicationjsonColorDescriptionName,
    responses: `201ContentApplicationjsonDefaultDescription`
  ): RequestBodyContentApplicationjsonColorDescriptionName = {
    val __obj = js.Dynamic.literal(parameters = parameters.asInstanceOf[js.Any], requestBody = requestBody.asInstanceOf[js.Any], responses = responses.asInstanceOf[js.Any])
    __obj.asInstanceOf[RequestBodyContentApplicationjsonColorDescriptionName]
  }
  
  extension [Self <: RequestBodyContentApplicationjsonColorDescriptionName](x: Self) {
    
    inline def setParameters(value: `76`): Self = StObject.set(x, "parameters", value.asInstanceOf[js.Any])
    
    inline def setRequestBody(value: ContentApplicationjsonColorDescriptionName): Self = StObject.set(x, "requestBody", value.asInstanceOf[js.Any])
    
    inline def setResponses(value: `201ContentApplicationjsonDefaultDescription`): Self = StObject.set(x, "responses", value.asInstanceOf[js.Any])
  }
}
