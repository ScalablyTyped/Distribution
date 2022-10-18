package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait RequestBodyContentApplicationjsonDueon extends StObject {
  
  var parameters: `76`
  
  var requestBody: ContentApplicationjsonDueon
  
  var responses: `201ContentApplicationjsonCreator`
}
object RequestBodyContentApplicationjsonDueon {
  
  inline def apply(
    parameters: `76`,
    requestBody: ContentApplicationjsonDueon,
    responses: `201ContentApplicationjsonCreator`
  ): RequestBodyContentApplicationjsonDueon = {
    val __obj = js.Dynamic.literal(parameters = parameters.asInstanceOf[js.Any], requestBody = requestBody.asInstanceOf[js.Any], responses = responses.asInstanceOf[js.Any])
    __obj.asInstanceOf[RequestBodyContentApplicationjsonDueon]
  }
  
  extension [Self <: RequestBodyContentApplicationjsonDueon](x: Self) {
    
    inline def setParameters(value: `76`): Self = StObject.set(x, "parameters", value.asInstanceOf[js.Any])
    
    inline def setRequestBody(value: ContentApplicationjsonDueon): Self = StObject.set(x, "requestBody", value.asInstanceOf[js.Any])
    
    inline def setResponses(value: `201ContentApplicationjsonCreator`): Self = StObject.set(x, "responses", value.asInstanceOf[js.Any])
  }
}
