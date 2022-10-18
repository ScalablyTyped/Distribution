package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ParametersPath608RequestBodyContentApplicationjsonBodyTitle extends StObject {
  
  var parameters: Path608
  
  var requestBody: ContentApplicationjsonBodyTitle
  
  var responses: `200Content370`
}
object ParametersPath608RequestBodyContentApplicationjsonBodyTitle {
  
  inline def apply(parameters: Path608, requestBody: ContentApplicationjsonBodyTitle, responses: `200Content370`): ParametersPath608RequestBodyContentApplicationjsonBodyTitle = {
    val __obj = js.Dynamic.literal(parameters = parameters.asInstanceOf[js.Any], requestBody = requestBody.asInstanceOf[js.Any], responses = responses.asInstanceOf[js.Any])
    __obj.asInstanceOf[ParametersPath608RequestBodyContentApplicationjsonBodyTitle]
  }
  
  extension [Self <: ParametersPath608RequestBodyContentApplicationjsonBodyTitle](x: Self) {
    
    inline def setParameters(value: Path608): Self = StObject.set(x, "parameters", value.asInstanceOf[js.Any])
    
    inline def setRequestBody(value: ContentApplicationjsonBodyTitle): Self = StObject.set(x, "requestBody", value.asInstanceOf[js.Any])
    
    inline def setResponses(value: `200Content370`): Self = StObject.set(x, "responses", value.asInstanceOf[js.Any])
  }
}
