package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ParametersPathSecretnameStringRequestBodyContentApplicationjsonEncryptedvalueString extends StObject {
  
  var parameters: PathSecretnameString
  
  var requestBody: ContentApplicationjsonEncryptedvalueString
  
  var responses: `590`
}
object ParametersPathSecretnameStringRequestBodyContentApplicationjsonEncryptedvalueString {
  
  inline def apply(
    parameters: PathSecretnameString,
    requestBody: ContentApplicationjsonEncryptedvalueString,
    responses: `590`
  ): ParametersPathSecretnameStringRequestBodyContentApplicationjsonEncryptedvalueString = {
    val __obj = js.Dynamic.literal(parameters = parameters.asInstanceOf[js.Any], requestBody = requestBody.asInstanceOf[js.Any], responses = responses.asInstanceOf[js.Any])
    __obj.asInstanceOf[ParametersPathSecretnameStringRequestBodyContentApplicationjsonEncryptedvalueString]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: ParametersPathSecretnameStringRequestBodyContentApplicationjsonEncryptedvalueString] (val x: Self) extends AnyVal {
    
    inline def setParameters(value: PathSecretnameString): Self = StObject.set(x, "parameters", value.asInstanceOf[js.Any])
    
    inline def setRequestBody(value: ContentApplicationjsonEncryptedvalueString): Self = StObject.set(x, "requestBody", value.asInstanceOf[js.Any])
    
    inline def setResponses(value: `590`): Self = StObject.set(x, "responses", value.asInstanceOf[js.Any])
  }
}
