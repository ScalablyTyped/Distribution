package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ParametersPathAuthorid extends StObject {
  
  var parameters: PathAuthorid
  
  var requestBody: ContentApplicationjson251
  
  var responses: `200Content250`
}
object ParametersPathAuthorid {
  
  inline def apply(parameters: PathAuthorid, requestBody: ContentApplicationjson251, responses: `200Content250`): ParametersPathAuthorid = {
    val __obj = js.Dynamic.literal(parameters = parameters.asInstanceOf[js.Any], requestBody = requestBody.asInstanceOf[js.Any], responses = responses.asInstanceOf[js.Any])
    __obj.asInstanceOf[ParametersPathAuthorid]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: ParametersPathAuthorid] (val x: Self) extends AnyVal {
    
    inline def setParameters(value: PathAuthorid): Self = StObject.set(x, "parameters", value.asInstanceOf[js.Any])
    
    inline def setRequestBody(value: ContentApplicationjson251): Self = StObject.set(x, "requestBody", value.asInstanceOf[js.Any])
    
    inline def setResponses(value: `200Content250`): Self = StObject.set(x, "responses", value.asInstanceOf[js.Any])
  }
}
