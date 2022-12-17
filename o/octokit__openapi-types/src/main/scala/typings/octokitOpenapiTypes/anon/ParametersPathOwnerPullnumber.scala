package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ParametersPathOwnerPullnumber extends StObject {
  
  var parameters: PathOwnerPullnumber
  
  var requestBody: ContentApplicationjsonBody
  
  var responses: `201Content296HeadersLocation404`
}
object ParametersPathOwnerPullnumber {
  
  inline def apply(
    parameters: PathOwnerPullnumber,
    requestBody: ContentApplicationjsonBody,
    responses: `201Content296HeadersLocation404`
  ): ParametersPathOwnerPullnumber = {
    val __obj = js.Dynamic.literal(parameters = parameters.asInstanceOf[js.Any], requestBody = requestBody.asInstanceOf[js.Any], responses = responses.asInstanceOf[js.Any])
    __obj.asInstanceOf[ParametersPathOwnerPullnumber]
  }
  
  extension [Self <: ParametersPathOwnerPullnumber](x: Self) {
    
    inline def setParameters(value: PathOwnerPullnumber): Self = StObject.set(x, "parameters", value.asInstanceOf[js.Any])
    
    inline def setRequestBody(value: ContentApplicationjsonBody): Self = StObject.set(x, "requestBody", value.asInstanceOf[js.Any])
    
    inline def setResponses(value: `201Content296HeadersLocation404`): Self = StObject.set(x, "responses", value.asInstanceOf[js.Any])
  }
}
