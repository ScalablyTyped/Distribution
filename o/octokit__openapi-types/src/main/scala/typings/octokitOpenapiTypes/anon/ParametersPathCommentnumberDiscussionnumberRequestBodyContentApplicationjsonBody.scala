package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ParametersPathCommentnumberDiscussionnumberRequestBodyContentApplicationjsonBody extends StObject {
  
  var parameters: PathCommentnumberDiscussionnumber
  
  var requestBody: ContentApplicationjsonBody
  
  var responses: `200Content117`
}
object ParametersPathCommentnumberDiscussionnumberRequestBodyContentApplicationjsonBody {
  
  inline def apply(
    parameters: PathCommentnumberDiscussionnumber,
    requestBody: ContentApplicationjsonBody,
    responses: `200Content117`
  ): ParametersPathCommentnumberDiscussionnumberRequestBodyContentApplicationjsonBody = {
    val __obj = js.Dynamic.literal(parameters = parameters.asInstanceOf[js.Any], requestBody = requestBody.asInstanceOf[js.Any], responses = responses.asInstanceOf[js.Any])
    __obj.asInstanceOf[ParametersPathCommentnumberDiscussionnumberRequestBodyContentApplicationjsonBody]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: ParametersPathCommentnumberDiscussionnumberRequestBodyContentApplicationjsonBody] (val x: Self) extends AnyVal {
    
    inline def setParameters(value: PathCommentnumberDiscussionnumber): Self = StObject.set(x, "parameters", value.asInstanceOf[js.Any])
    
    inline def setRequestBody(value: ContentApplicationjsonBody): Self = StObject.set(x, "requestBody", value.asInstanceOf[js.Any])
    
    inline def setResponses(value: `200Content117`): Self = StObject.set(x, "responses", value.asInstanceOf[js.Any])
  }
}
