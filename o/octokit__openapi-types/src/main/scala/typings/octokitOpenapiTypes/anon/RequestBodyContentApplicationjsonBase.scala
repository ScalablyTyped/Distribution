package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait RequestBodyContentApplicationjsonBase extends StObject {
  
  var parameters: `135`
  
  var requestBody: ContentApplicationjsonBase
  
  var responses: `404409422`
}
object RequestBodyContentApplicationjsonBase {
  
  inline def apply(parameters: `135`, requestBody: ContentApplicationjsonBase, responses: `404409422`): RequestBodyContentApplicationjsonBase = {
    val __obj = js.Dynamic.literal(parameters = parameters.asInstanceOf[js.Any], requestBody = requestBody.asInstanceOf[js.Any], responses = responses.asInstanceOf[js.Any])
    __obj.asInstanceOf[RequestBodyContentApplicationjsonBase]
  }
  
  extension [Self <: RequestBodyContentApplicationjsonBase](x: Self) {
    
    inline def setParameters(value: `135`): Self = StObject.set(x, "parameters", value.asInstanceOf[js.Any])
    
    inline def setRequestBody(value: ContentApplicationjsonBase): Self = StObject.set(x, "requestBody", value.asInstanceOf[js.Any])
    
    inline def setResponses(value: `404409422`): Self = StObject.set(x, "responses", value.asInstanceOf[js.Any])
  }
}
