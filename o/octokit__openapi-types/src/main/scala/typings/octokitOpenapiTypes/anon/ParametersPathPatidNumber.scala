package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ParametersPathPatidNumber extends StObject {
  
  var parameters: PathPatidNumber
  
  var requestBody: ContentApplicationjson58
  
  var responses: `204403`
}
object ParametersPathPatidNumber {
  
  inline def apply(parameters: PathPatidNumber, requestBody: ContentApplicationjson58, responses: `204403`): ParametersPathPatidNumber = {
    val __obj = js.Dynamic.literal(parameters = parameters.asInstanceOf[js.Any], requestBody = requestBody.asInstanceOf[js.Any], responses = responses.asInstanceOf[js.Any])
    __obj.asInstanceOf[ParametersPathPatidNumber]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: ParametersPathPatidNumber] (val x: Self) extends AnyVal {
    
    inline def setParameters(value: PathPatidNumber): Self = StObject.set(x, "parameters", value.asInstanceOf[js.Any])
    
    inline def setRequestBody(value: ContentApplicationjson58): Self = StObject.set(x, "requestBody", value.asInstanceOf[js.Any])
    
    inline def setResponses(value: `204403`): Self = StObject.set(x, "responses", value.asInstanceOf[js.Any])
  }
}
