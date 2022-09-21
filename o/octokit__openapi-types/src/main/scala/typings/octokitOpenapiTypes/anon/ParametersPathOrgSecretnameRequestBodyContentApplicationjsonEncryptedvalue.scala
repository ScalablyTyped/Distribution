package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ParametersPathOrgSecretnameRequestBodyContentApplicationjsonEncryptedvalue extends StObject {
  
  var parameters: PathOrgSecretname
  
  var requestBody: ContentApplicationjsonEncryptedvalue
  
  var responses: `201Content47`
}
object ParametersPathOrgSecretnameRequestBodyContentApplicationjsonEncryptedvalue {
  
  inline def apply(
    parameters: PathOrgSecretname,
    requestBody: ContentApplicationjsonEncryptedvalue,
    responses: `201Content47`
  ): ParametersPathOrgSecretnameRequestBodyContentApplicationjsonEncryptedvalue = {
    val __obj = js.Dynamic.literal(parameters = parameters.asInstanceOf[js.Any], requestBody = requestBody.asInstanceOf[js.Any], responses = responses.asInstanceOf[js.Any])
    __obj.asInstanceOf[ParametersPathOrgSecretnameRequestBodyContentApplicationjsonEncryptedvalue]
  }
  
  extension [Self <: ParametersPathOrgSecretnameRequestBodyContentApplicationjsonEncryptedvalue](x: Self) {
    
    inline def setParameters(value: PathOrgSecretname): Self = StObject.set(x, "parameters", value.asInstanceOf[js.Any])
    
    inline def setRequestBody(value: ContentApplicationjsonEncryptedvalue): Self = StObject.set(x, "requestBody", value.asInstanceOf[js.Any])
    
    inline def setResponses(value: `201Content47`): Self = StObject.set(x, "responses", value.asInstanceOf[js.Any])
  }
}
