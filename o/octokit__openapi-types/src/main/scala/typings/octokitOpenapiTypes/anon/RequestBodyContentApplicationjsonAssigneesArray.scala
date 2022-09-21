package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait RequestBodyContentApplicationjsonAssigneesArray extends StObject {
  
  var parameters: PathIssuenumber
  
  var requestBody: ContentApplicationjsonAssigneesArray
  
  var responses: `200267`
}
object RequestBodyContentApplicationjsonAssigneesArray {
  
  inline def apply(
    parameters: PathIssuenumber,
    requestBody: ContentApplicationjsonAssigneesArray,
    responses: `200267`
  ): RequestBodyContentApplicationjsonAssigneesArray = {
    val __obj = js.Dynamic.literal(parameters = parameters.asInstanceOf[js.Any], requestBody = requestBody.asInstanceOf[js.Any], responses = responses.asInstanceOf[js.Any])
    __obj.asInstanceOf[RequestBodyContentApplicationjsonAssigneesArray]
  }
  
  extension [Self <: RequestBodyContentApplicationjsonAssigneesArray](x: Self) {
    
    inline def setParameters(value: PathIssuenumber): Self = StObject.set(x, "parameters", value.asInstanceOf[js.Any])
    
    inline def setRequestBody(value: ContentApplicationjsonAssigneesArray): Self = StObject.set(x, "requestBody", value.asInstanceOf[js.Any])
    
    inline def setResponses(value: `200267`): Self = StObject.set(x, "responses", value.asInstanceOf[js.Any])
  }
}
