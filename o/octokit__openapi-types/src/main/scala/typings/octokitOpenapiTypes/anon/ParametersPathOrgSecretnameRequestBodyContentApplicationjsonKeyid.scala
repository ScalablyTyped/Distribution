package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ParametersPathOrgSecretnameRequestBodyContentApplicationjsonKeyid extends StObject {
  
  var parameters: PathOrgSecretname
  
  var requestBody: ContentApplicationjsonKeyid
  
  var responses: `178`
}
object ParametersPathOrgSecretnameRequestBodyContentApplicationjsonKeyid {
  
  inline def apply(parameters: PathOrgSecretname, requestBody: ContentApplicationjsonKeyid, responses: `178`): ParametersPathOrgSecretnameRequestBodyContentApplicationjsonKeyid = {
    val __obj = js.Dynamic.literal(parameters = parameters.asInstanceOf[js.Any], requestBody = requestBody.asInstanceOf[js.Any], responses = responses.asInstanceOf[js.Any])
    __obj.asInstanceOf[ParametersPathOrgSecretnameRequestBodyContentApplicationjsonKeyid]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: ParametersPathOrgSecretnameRequestBodyContentApplicationjsonKeyid] (val x: Self) extends AnyVal {
    
    inline def setParameters(value: PathOrgSecretname): Self = StObject.set(x, "parameters", value.asInstanceOf[js.Any])
    
    inline def setRequestBody(value: ContentApplicationjsonKeyid): Self = StObject.set(x, "requestBody", value.asInstanceOf[js.Any])
    
    inline def setResponses(value: `178`): Self = StObject.set(x, "responses", value.asInstanceOf[js.Any])
  }
}
