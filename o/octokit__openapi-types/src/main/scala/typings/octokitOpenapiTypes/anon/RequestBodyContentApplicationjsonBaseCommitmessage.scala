package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait RequestBodyContentApplicationjsonBaseCommitmessage extends StObject {
  
  var parameters: `76`
  
  var requestBody: ContentApplicationjsonBaseCommitmessage
  
  var responses: `404409422`
}
object RequestBodyContentApplicationjsonBaseCommitmessage {
  
  inline def apply(parameters: `76`, requestBody: ContentApplicationjsonBaseCommitmessage, responses: `404409422`): RequestBodyContentApplicationjsonBaseCommitmessage = {
    val __obj = js.Dynamic.literal(parameters = parameters.asInstanceOf[js.Any], requestBody = requestBody.asInstanceOf[js.Any], responses = responses.asInstanceOf[js.Any])
    __obj.asInstanceOf[RequestBodyContentApplicationjsonBaseCommitmessage]
  }
  
  extension [Self <: RequestBodyContentApplicationjsonBaseCommitmessage](x: Self) {
    
    inline def setParameters(value: `76`): Self = StObject.set(x, "parameters", value.asInstanceOf[js.Any])
    
    inline def setRequestBody(value: ContentApplicationjsonBaseCommitmessage): Self = StObject.set(x, "requestBody", value.asInstanceOf[js.Any])
    
    inline def setResponses(value: `404409422`): Self = StObject.set(x, "responses", value.asInstanceOf[js.Any])
  }
}
