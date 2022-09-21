package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait RequestBodyContentApplicationjsonRefSha extends StObject {
  
  var parameters: `144`
  
  var requestBody: ContentApplicationjsonRefSha
  
  var responses: `201Content243HeadersLocation`
}
object RequestBodyContentApplicationjsonRefSha {
  
  inline def apply(
    parameters: `144`,
    requestBody: ContentApplicationjsonRefSha,
    responses: `201Content243HeadersLocation`
  ): RequestBodyContentApplicationjsonRefSha = {
    val __obj = js.Dynamic.literal(parameters = parameters.asInstanceOf[js.Any], requestBody = requestBody.asInstanceOf[js.Any], responses = responses.asInstanceOf[js.Any])
    __obj.asInstanceOf[RequestBodyContentApplicationjsonRefSha]
  }
  
  extension [Self <: RequestBodyContentApplicationjsonRefSha](x: Self) {
    
    inline def setParameters(value: `144`): Self = StObject.set(x, "parameters", value.asInstanceOf[js.Any])
    
    inline def setRequestBody(value: ContentApplicationjsonRefSha): Self = StObject.set(x, "requestBody", value.asInstanceOf[js.Any])
    
    inline def setResponses(value: `201Content243HeadersLocation`): Self = StObject.set(x, "responses", value.asInstanceOf[js.Any])
  }
}
