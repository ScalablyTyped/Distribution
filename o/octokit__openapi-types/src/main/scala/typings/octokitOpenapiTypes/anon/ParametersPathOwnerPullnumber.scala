package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ParametersPathOwnerPullnumber extends StObject {
  
  var parameters: PathOwnerPullnumber
  
  var requestBody: ContentApplicationjsonBodyString
  
  var responses: `201ContentApplicationjsonInreplytoidHeadersLocation404Content6`
}
object ParametersPathOwnerPullnumber {
  
  inline def apply(
    parameters: PathOwnerPullnumber,
    requestBody: ContentApplicationjsonBodyString,
    responses: `201ContentApplicationjsonInreplytoidHeadersLocation404Content6`
  ): ParametersPathOwnerPullnumber = {
    val __obj = js.Dynamic.literal(parameters = parameters.asInstanceOf[js.Any], requestBody = requestBody.asInstanceOf[js.Any], responses = responses.asInstanceOf[js.Any])
    __obj.asInstanceOf[ParametersPathOwnerPullnumber]
  }
  
  extension [Self <: ParametersPathOwnerPullnumber](x: Self) {
    
    inline def setParameters(value: PathOwnerPullnumber): Self = StObject.set(x, "parameters", value.asInstanceOf[js.Any])
    
    inline def setRequestBody(value: ContentApplicationjsonBodyString): Self = StObject.set(x, "requestBody", value.asInstanceOf[js.Any])
    
    inline def setResponses(value: `201ContentApplicationjsonInreplytoidHeadersLocation404Content6`): Self = StObject.set(x, "responses", value.asInstanceOf[js.Any])
  }
}
