package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait RequestBodyContentApplicationjsonBranchString extends StObject {
  
  var parameters: `76`
  
  var requestBody: ContentApplicationjsonBranchString
  
  var responses: `200409422`
}
object RequestBodyContentApplicationjsonBranchString {
  
  inline def apply(parameters: `76`, requestBody: ContentApplicationjsonBranchString, responses: `200409422`): RequestBodyContentApplicationjsonBranchString = {
    val __obj = js.Dynamic.literal(parameters = parameters.asInstanceOf[js.Any], requestBody = requestBody.asInstanceOf[js.Any], responses = responses.asInstanceOf[js.Any])
    __obj.asInstanceOf[RequestBodyContentApplicationjsonBranchString]
  }
  
  extension [Self <: RequestBodyContentApplicationjsonBranchString](x: Self) {
    
    inline def setParameters(value: `76`): Self = StObject.set(x, "parameters", value.asInstanceOf[js.Any])
    
    inline def setRequestBody(value: ContentApplicationjsonBranchString): Self = StObject.set(x, "requestBody", value.asInstanceOf[js.Any])
    
    inline def setResponses(value: `200409422`): Self = StObject.set(x, "responses", value.asInstanceOf[js.Any])
  }
}
