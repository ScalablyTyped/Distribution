package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait RequestBodyContentApplicationjsonCompany extends StObject {
  
  var parameters: `37`
  
  var requestBody: ContentApplicationjsonCompany
  
  var responses: `200409`
}
object RequestBodyContentApplicationjsonCompany {
  
  inline def apply(parameters: `37`, requestBody: ContentApplicationjsonCompany, responses: `200409`): RequestBodyContentApplicationjsonCompany = {
    val __obj = js.Dynamic.literal(parameters = parameters.asInstanceOf[js.Any], requestBody = requestBody.asInstanceOf[js.Any], responses = responses.asInstanceOf[js.Any])
    __obj.asInstanceOf[RequestBodyContentApplicationjsonCompany]
  }
  
  extension [Self <: RequestBodyContentApplicationjsonCompany](x: Self) {
    
    inline def setParameters(value: `37`): Self = StObject.set(x, "parameters", value.asInstanceOf[js.Any])
    
    inline def setRequestBody(value: ContentApplicationjsonCompany): Self = StObject.set(x, "requestBody", value.asInstanceOf[js.Any])
    
    inline def setResponses(value: `200409`): Self = StObject.set(x, "responses", value.asInstanceOf[js.Any])
  }
}
