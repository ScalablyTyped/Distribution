package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait RequestBodyContentApplicationjson213 extends StObject {
  
  var parameters: `37`
  
  var requestBody: ContentApplicationjson213
  
  var responses: `200ContentApplicationjsonOrganizationurl403Content6`
}
object RequestBodyContentApplicationjson213 {
  
  inline def apply(
    parameters: `37`,
    requestBody: ContentApplicationjson213,
    responses: `200ContentApplicationjsonOrganizationurl403Content6`
  ): RequestBodyContentApplicationjson213 = {
    val __obj = js.Dynamic.literal(parameters = parameters.asInstanceOf[js.Any], requestBody = requestBody.asInstanceOf[js.Any], responses = responses.asInstanceOf[js.Any])
    __obj.asInstanceOf[RequestBodyContentApplicationjson213]
  }
  
  extension [Self <: RequestBodyContentApplicationjson213](x: Self) {
    
    inline def setParameters(value: `37`): Self = StObject.set(x, "parameters", value.asInstanceOf[js.Any])
    
    inline def setRequestBody(value: ContentApplicationjson213): Self = StObject.set(x, "requestBody", value.asInstanceOf[js.Any])
    
    inline def setResponses(value: `200ContentApplicationjsonOrganizationurl403Content6`): Self = StObject.set(x, "responses", value.asInstanceOf[js.Any])
  }
}
