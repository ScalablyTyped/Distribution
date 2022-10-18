package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait RequestBodyContentApplicationjsonInreplyto extends StObject {
  
  var parameters: PathPullnumber
  
  var requestBody: ContentApplicationjsonInreplyto
  
  var responses: `201ContentApplicationjsonInreplytoidHeadersLocation`
}
object RequestBodyContentApplicationjsonInreplyto {
  
  inline def apply(
    parameters: PathPullnumber,
    requestBody: ContentApplicationjsonInreplyto,
    responses: `201ContentApplicationjsonInreplytoidHeadersLocation`
  ): RequestBodyContentApplicationjsonInreplyto = {
    val __obj = js.Dynamic.literal(parameters = parameters.asInstanceOf[js.Any], requestBody = requestBody.asInstanceOf[js.Any], responses = responses.asInstanceOf[js.Any])
    __obj.asInstanceOf[RequestBodyContentApplicationjsonInreplyto]
  }
  
  extension [Self <: RequestBodyContentApplicationjsonInreplyto](x: Self) {
    
    inline def setParameters(value: PathPullnumber): Self = StObject.set(x, "parameters", value.asInstanceOf[js.Any])
    
    inline def setRequestBody(value: ContentApplicationjsonInreplyto): Self = StObject.set(x, "requestBody", value.asInstanceOf[js.Any])
    
    inline def setResponses(value: `201ContentApplicationjsonInreplytoidHeadersLocation`): Self = StObject.set(x, "responses", value.asInstanceOf[js.Any])
  }
}
