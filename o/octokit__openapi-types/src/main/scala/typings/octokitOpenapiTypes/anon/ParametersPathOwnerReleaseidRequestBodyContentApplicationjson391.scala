package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ParametersPathOwnerReleaseidRequestBodyContentApplicationjson391 extends StObject {
  
  var parameters: PathOwnerReleaseid
  
  var requestBody: ContentApplicationjson391
  
  var responses: `201ContentApplicationjsonNodeidUser`
}
object ParametersPathOwnerReleaseidRequestBodyContentApplicationjson391 {
  
  inline def apply(
    parameters: PathOwnerReleaseid,
    requestBody: ContentApplicationjson391,
    responses: `201ContentApplicationjsonNodeidUser`
  ): ParametersPathOwnerReleaseidRequestBodyContentApplicationjson391 = {
    val __obj = js.Dynamic.literal(parameters = parameters.asInstanceOf[js.Any], requestBody = requestBody.asInstanceOf[js.Any], responses = responses.asInstanceOf[js.Any])
    __obj.asInstanceOf[ParametersPathOwnerReleaseidRequestBodyContentApplicationjson391]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: ParametersPathOwnerReleaseidRequestBodyContentApplicationjson391] (val x: Self) extends AnyVal {
    
    inline def setParameters(value: PathOwnerReleaseid): Self = StObject.set(x, "parameters", value.asInstanceOf[js.Any])
    
    inline def setRequestBody(value: ContentApplicationjson391): Self = StObject.set(x, "requestBody", value.asInstanceOf[js.Any])
    
    inline def setResponses(value: `201ContentApplicationjsonNodeidUser`): Self = StObject.set(x, "responses", value.asInstanceOf[js.Any])
  }
}
