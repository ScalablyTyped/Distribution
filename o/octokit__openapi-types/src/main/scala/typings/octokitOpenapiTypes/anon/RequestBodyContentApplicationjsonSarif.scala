package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait RequestBodyContentApplicationjsonSarif extends StObject {
  
  var parameters: `540`
  
  var requestBody: ContentApplicationjsonSarif_
  
  var responses: `202ContentApplicationjson565`
}
object RequestBodyContentApplicationjsonSarif {
  
  inline def apply(
    parameters: `540`,
    requestBody: ContentApplicationjsonSarif_,
    responses: `202ContentApplicationjson565`
  ): RequestBodyContentApplicationjsonSarif = {
    val __obj = js.Dynamic.literal(parameters = parameters.asInstanceOf[js.Any], requestBody = requestBody.asInstanceOf[js.Any], responses = responses.asInstanceOf[js.Any])
    __obj.asInstanceOf[RequestBodyContentApplicationjsonSarif]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: RequestBodyContentApplicationjsonSarif] (val x: Self) extends AnyVal {
    
    inline def setParameters(value: `540`): Self = StObject.set(x, "parameters", value.asInstanceOf[js.Any])
    
    inline def setRequestBody(value: ContentApplicationjsonSarif_): Self = StObject.set(x, "requestBody", value.asInstanceOf[js.Any])
    
    inline def setResponses(value: `202ContentApplicationjson565`): Self = StObject.set(x, "responses", value.asInstanceOf[js.Any])
  }
}
