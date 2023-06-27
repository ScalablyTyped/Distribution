package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ParametersPathOrgSecretnameRequestBodyContentApplicationjsonEncryptedvalueKeyid extends StObject {
  
  var parameters: PathOrgSecretname
  
  var requestBody: ContentApplicationjsonEncryptedvalueKeyid
  
  var responses: `590`
}
object ParametersPathOrgSecretnameRequestBodyContentApplicationjsonEncryptedvalueKeyid {
  
  inline def apply(
    parameters: PathOrgSecretname,
    requestBody: ContentApplicationjsonEncryptedvalueKeyid,
    responses: `590`
  ): ParametersPathOrgSecretnameRequestBodyContentApplicationjsonEncryptedvalueKeyid = {
    val __obj = js.Dynamic.literal(parameters = parameters.asInstanceOf[js.Any], requestBody = requestBody.asInstanceOf[js.Any], responses = responses.asInstanceOf[js.Any])
    __obj.asInstanceOf[ParametersPathOrgSecretnameRequestBodyContentApplicationjsonEncryptedvalueKeyid]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: ParametersPathOrgSecretnameRequestBodyContentApplicationjsonEncryptedvalueKeyid] (val x: Self) extends AnyVal {
    
    inline def setParameters(value: PathOrgSecretname): Self = StObject.set(x, "parameters", value.asInstanceOf[js.Any])
    
    inline def setRequestBody(value: ContentApplicationjsonEncryptedvalueKeyid): Self = StObject.set(x, "requestBody", value.asInstanceOf[js.Any])
    
    inline def setResponses(value: `590`): Self = StObject.set(x, "responses", value.asInstanceOf[js.Any])
  }
}
