package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ParametersPath607RequestBodyContentApplicationjsonPrivate extends StObject {
  
  var parameters: Path607
  
  var requestBody: ContentApplicationjsonPrivate
  
  var responses: `201Content370`
}
object ParametersPath607RequestBodyContentApplicationjsonPrivate {
  
  inline def apply(parameters: Path607, requestBody: ContentApplicationjsonPrivate, responses: `201Content370`): ParametersPath607RequestBodyContentApplicationjsonPrivate = {
    val __obj = js.Dynamic.literal(parameters = parameters.asInstanceOf[js.Any], requestBody = requestBody.asInstanceOf[js.Any], responses = responses.asInstanceOf[js.Any])
    __obj.asInstanceOf[ParametersPath607RequestBodyContentApplicationjsonPrivate]
  }
  
  extension [Self <: ParametersPath607RequestBodyContentApplicationjsonPrivate](x: Self) {
    
    inline def setParameters(value: Path607): Self = StObject.set(x, "parameters", value.asInstanceOf[js.Any])
    
    inline def setRequestBody(value: ContentApplicationjsonPrivate): Self = StObject.set(x, "requestBody", value.asInstanceOf[js.Any])
    
    inline def setResponses(value: `201Content370`): Self = StObject.set(x, "responses", value.asInstanceOf[js.Any])
  }
}
