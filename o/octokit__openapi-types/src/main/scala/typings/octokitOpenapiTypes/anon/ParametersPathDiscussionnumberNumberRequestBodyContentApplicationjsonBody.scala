package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ParametersPathDiscussionnumberNumberRequestBodyContentApplicationjsonBody extends StObject {
  
  var parameters: PathDiscussionnumberNumber
  
  var requestBody: ContentApplicationjsonBody
  
  var responses: `201ContentApplicationjsonLasteditedat`
}
object ParametersPathDiscussionnumberNumberRequestBodyContentApplicationjsonBody {
  
  inline def apply(
    parameters: PathDiscussionnumberNumber,
    requestBody: ContentApplicationjsonBody,
    responses: `201ContentApplicationjsonLasteditedat`
  ): ParametersPathDiscussionnumberNumberRequestBodyContentApplicationjsonBody = {
    val __obj = js.Dynamic.literal(parameters = parameters.asInstanceOf[js.Any], requestBody = requestBody.asInstanceOf[js.Any], responses = responses.asInstanceOf[js.Any])
    __obj.asInstanceOf[ParametersPathDiscussionnumberNumberRequestBodyContentApplicationjsonBody]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: ParametersPathDiscussionnumberNumberRequestBodyContentApplicationjsonBody] (val x: Self) extends AnyVal {
    
    inline def setParameters(value: PathDiscussionnumberNumber): Self = StObject.set(x, "parameters", value.asInstanceOf[js.Any])
    
    inline def setRequestBody(value: ContentApplicationjsonBody): Self = StObject.set(x, "requestBody", value.asInstanceOf[js.Any])
    
    inline def setResponses(value: `201ContentApplicationjsonLasteditedat`): Self = StObject.set(x, "responses", value.asInstanceOf[js.Any])
  }
}
