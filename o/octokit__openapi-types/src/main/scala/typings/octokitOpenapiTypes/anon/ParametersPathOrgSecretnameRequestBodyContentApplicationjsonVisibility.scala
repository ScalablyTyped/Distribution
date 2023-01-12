package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ParametersPathOrgSecretnameRequestBodyContentApplicationjsonVisibility extends StObject {
  
  var parameters: PathOrgSecretname
  
  var requestBody: ContentApplicationjsonVisibility
  
  var responses: `178`
}
object ParametersPathOrgSecretnameRequestBodyContentApplicationjsonVisibility {
  
  inline def apply(parameters: PathOrgSecretname, requestBody: ContentApplicationjsonVisibility, responses: `178`): ParametersPathOrgSecretnameRequestBodyContentApplicationjsonVisibility = {
    val __obj = js.Dynamic.literal(parameters = parameters.asInstanceOf[js.Any], requestBody = requestBody.asInstanceOf[js.Any], responses = responses.asInstanceOf[js.Any])
    __obj.asInstanceOf[ParametersPathOrgSecretnameRequestBodyContentApplicationjsonVisibility]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: ParametersPathOrgSecretnameRequestBodyContentApplicationjsonVisibility] (val x: Self) extends AnyVal {
    
    inline def setParameters(value: PathOrgSecretname): Self = StObject.set(x, "parameters", value.asInstanceOf[js.Any])
    
    inline def setRequestBody(value: ContentApplicationjsonVisibility): Self = StObject.set(x, "requestBody", value.asInstanceOf[js.Any])
    
    inline def setResponses(value: `178`): Self = StObject.set(x, "responses", value.asInstanceOf[js.Any])
  }
}
