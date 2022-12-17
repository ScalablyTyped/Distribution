package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait RequestBodyContentApplicationjsonSarif extends StObject {
  
  var parameters: `472`
  
  var requestBody: ContentApplicationjsonSarif_
  
  var responses: `404413`
}
object RequestBodyContentApplicationjsonSarif {
  
  inline def apply(parameters: `472`, requestBody: ContentApplicationjsonSarif_, responses: `404413`): RequestBodyContentApplicationjsonSarif = {
    val __obj = js.Dynamic.literal(parameters = parameters.asInstanceOf[js.Any], requestBody = requestBody.asInstanceOf[js.Any], responses = responses.asInstanceOf[js.Any])
    __obj.asInstanceOf[RequestBodyContentApplicationjsonSarif]
  }
  
  extension [Self <: RequestBodyContentApplicationjsonSarif](x: Self) {
    
    inline def setParameters(value: `472`): Self = StObject.set(x, "parameters", value.asInstanceOf[js.Any])
    
    inline def setRequestBody(value: ContentApplicationjsonSarif_): Self = StObject.set(x, "requestBody", value.asInstanceOf[js.Any])
    
    inline def setResponses(value: `404413`): Self = StObject.set(x, "responses", value.asInstanceOf[js.Any])
  }
}
