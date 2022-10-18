package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ParametersPathCommentnumberDiscussionnumberRequestBodyContentApplicationjsonBodyString extends StObject {
  
  var parameters: PathCommentnumberDiscussionnumber
  
  var requestBody: ContentApplicationjsonBodyString
  
  var responses: `200ContentApplicationjsonDiscussionurl`
}
object ParametersPathCommentnumberDiscussionnumberRequestBodyContentApplicationjsonBodyString {
  
  inline def apply(
    parameters: PathCommentnumberDiscussionnumber,
    requestBody: ContentApplicationjsonBodyString,
    responses: `200ContentApplicationjsonDiscussionurl`
  ): ParametersPathCommentnumberDiscussionnumberRequestBodyContentApplicationjsonBodyString = {
    val __obj = js.Dynamic.literal(parameters = parameters.asInstanceOf[js.Any], requestBody = requestBody.asInstanceOf[js.Any], responses = responses.asInstanceOf[js.Any])
    __obj.asInstanceOf[ParametersPathCommentnumberDiscussionnumberRequestBodyContentApplicationjsonBodyString]
  }
  
  extension [Self <: ParametersPathCommentnumberDiscussionnumberRequestBodyContentApplicationjsonBodyString](x: Self) {
    
    inline def setParameters(value: PathCommentnumberDiscussionnumber): Self = StObject.set(x, "parameters", value.asInstanceOf[js.Any])
    
    inline def setRequestBody(value: ContentApplicationjsonBodyString): Self = StObject.set(x, "requestBody", value.asInstanceOf[js.Any])
    
    inline def setResponses(value: `200ContentApplicationjsonDiscussionurl`): Self = StObject.set(x, "responses", value.asInstanceOf[js.Any])
  }
}
