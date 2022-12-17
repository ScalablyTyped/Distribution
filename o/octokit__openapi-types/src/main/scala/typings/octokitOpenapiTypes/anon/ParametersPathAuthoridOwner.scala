package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ParametersPathAuthoridOwner extends StObject {
  
  var parameters: PathAuthoridOwner
  
  var requestBody: ContentApplicationjson251
  
  var responses: `200ContentApplicationjsonImporturl`
}
object ParametersPathAuthoridOwner {
  
  inline def apply(
    parameters: PathAuthoridOwner,
    requestBody: ContentApplicationjson251,
    responses: `200ContentApplicationjsonImporturl`
  ): ParametersPathAuthoridOwner = {
    val __obj = js.Dynamic.literal(parameters = parameters.asInstanceOf[js.Any], requestBody = requestBody.asInstanceOf[js.Any], responses = responses.asInstanceOf[js.Any])
    __obj.asInstanceOf[ParametersPathAuthoridOwner]
  }
  
  extension [Self <: ParametersPathAuthoridOwner](x: Self) {
    
    inline def setParameters(value: PathAuthoridOwner): Self = StObject.set(x, "parameters", value.asInstanceOf[js.Any])
    
    inline def setRequestBody(value: ContentApplicationjson251): Self = StObject.set(x, "requestBody", value.asInstanceOf[js.Any])
    
    inline def setResponses(value: `200ContentApplicationjsonImporturl`): Self = StObject.set(x, "responses", value.asInstanceOf[js.Any])
  }
}
