package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ParametersPathOwnerReleaseidRequestBodyContentApplicationjson321 extends StObject {
  
  var parameters: PathOwnerReleaseid
  
  var requestBody: ContentApplicationjson321
  
  var responses: `201ContentApplicationjsonNodeidUser`
}
object ParametersPathOwnerReleaseidRequestBodyContentApplicationjson321 {
  
  inline def apply(
    parameters: PathOwnerReleaseid,
    requestBody: ContentApplicationjson321,
    responses: `201ContentApplicationjsonNodeidUser`
  ): ParametersPathOwnerReleaseidRequestBodyContentApplicationjson321 = {
    val __obj = js.Dynamic.literal(parameters = parameters.asInstanceOf[js.Any], requestBody = requestBody.asInstanceOf[js.Any], responses = responses.asInstanceOf[js.Any])
    __obj.asInstanceOf[ParametersPathOwnerReleaseidRequestBodyContentApplicationjson321]
  }
  
  extension [Self <: ParametersPathOwnerReleaseidRequestBodyContentApplicationjson321](x: Self) {
    
    inline def setParameters(value: PathOwnerReleaseid): Self = StObject.set(x, "parameters", value.asInstanceOf[js.Any])
    
    inline def setRequestBody(value: ContentApplicationjson321): Self = StObject.set(x, "requestBody", value.asInstanceOf[js.Any])
    
    inline def setResponses(value: `201ContentApplicationjsonNodeidUser`): Self = StObject.set(x, "responses", value.asInstanceOf[js.Any])
  }
}
