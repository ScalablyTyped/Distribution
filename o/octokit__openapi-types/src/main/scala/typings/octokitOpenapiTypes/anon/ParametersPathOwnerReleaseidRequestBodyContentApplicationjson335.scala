package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ParametersPathOwnerReleaseidRequestBodyContentApplicationjson335 extends StObject {
  
  var parameters: PathOwnerReleaseid
  
  var requestBody: ContentApplicationjson335
  
  var responses: `201ContentApplicationjsonNodeidUser`
}
object ParametersPathOwnerReleaseidRequestBodyContentApplicationjson335 {
  
  inline def apply(
    parameters: PathOwnerReleaseid,
    requestBody: ContentApplicationjson335,
    responses: `201ContentApplicationjsonNodeidUser`
  ): ParametersPathOwnerReleaseidRequestBodyContentApplicationjson335 = {
    val __obj = js.Dynamic.literal(parameters = parameters.asInstanceOf[js.Any], requestBody = requestBody.asInstanceOf[js.Any], responses = responses.asInstanceOf[js.Any])
    __obj.asInstanceOf[ParametersPathOwnerReleaseidRequestBodyContentApplicationjson335]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: ParametersPathOwnerReleaseidRequestBodyContentApplicationjson335] (val x: Self) extends AnyVal {
    
    inline def setParameters(value: PathOwnerReleaseid): Self = StObject.set(x, "parameters", value.asInstanceOf[js.Any])
    
    inline def setRequestBody(value: ContentApplicationjson335): Self = StObject.set(x, "requestBody", value.asInstanceOf[js.Any])
    
    inline def setResponses(value: `201ContentApplicationjsonNodeidUser`): Self = StObject.set(x, "responses", value.asInstanceOf[js.Any])
  }
}
