package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ParametersPathAuthorid extends StObject {
  
  var parameters: PathAuthorid
  
  var requestBody: ContentApplicationjson138
  
  var responses: `200ContentApplicationjsonImporturl`
}
object ParametersPathAuthorid {
  
  inline def apply(
    parameters: PathAuthorid,
    requestBody: ContentApplicationjson138,
    responses: `200ContentApplicationjsonImporturl`
  ): ParametersPathAuthorid = {
    val __obj = js.Dynamic.literal(parameters = parameters.asInstanceOf[js.Any], requestBody = requestBody.asInstanceOf[js.Any], responses = responses.asInstanceOf[js.Any])
    __obj.asInstanceOf[ParametersPathAuthorid]
  }
  
  extension [Self <: ParametersPathAuthorid](x: Self) {
    
    inline def setParameters(value: PathAuthorid): Self = StObject.set(x, "parameters", value.asInstanceOf[js.Any])
    
    inline def setRequestBody(value: ContentApplicationjson138): Self = StObject.set(x, "requestBody", value.asInstanceOf[js.Any])
    
    inline def setResponses(value: `200ContentApplicationjsonImporturl`): Self = StObject.set(x, "responses", value.asInstanceOf[js.Any])
  }
}
