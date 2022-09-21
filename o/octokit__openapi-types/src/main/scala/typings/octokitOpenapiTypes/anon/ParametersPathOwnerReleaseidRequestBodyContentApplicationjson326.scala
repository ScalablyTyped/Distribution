package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ParametersPathOwnerReleaseidRequestBodyContentApplicationjson326 extends StObject {
  
  var parameters: PathOwnerReleaseid
  
  var requestBody: ContentApplicationjson326
  
  var responses: `201ContentApplicationjsonNodeidUser`
}
object ParametersPathOwnerReleaseidRequestBodyContentApplicationjson326 {
  
  inline def apply(
    parameters: PathOwnerReleaseid,
    requestBody: ContentApplicationjson326,
    responses: `201ContentApplicationjsonNodeidUser`
  ): ParametersPathOwnerReleaseidRequestBodyContentApplicationjson326 = {
    val __obj = js.Dynamic.literal(parameters = parameters.asInstanceOf[js.Any], requestBody = requestBody.asInstanceOf[js.Any], responses = responses.asInstanceOf[js.Any])
    __obj.asInstanceOf[ParametersPathOwnerReleaseidRequestBodyContentApplicationjson326]
  }
  
  extension [Self <: ParametersPathOwnerReleaseidRequestBodyContentApplicationjson326](x: Self) {
    
    inline def setParameters(value: PathOwnerReleaseid): Self = StObject.set(x, "parameters", value.asInstanceOf[js.Any])
    
    inline def setRequestBody(value: ContentApplicationjson326): Self = StObject.set(x, "requestBody", value.asInstanceOf[js.Any])
    
    inline def setResponses(value: `201ContentApplicationjsonNodeidUser`): Self = StObject.set(x, "responses", value.asInstanceOf[js.Any])
  }
}
