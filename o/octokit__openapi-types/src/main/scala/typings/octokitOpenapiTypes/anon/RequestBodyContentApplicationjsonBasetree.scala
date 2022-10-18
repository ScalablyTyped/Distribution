package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait RequestBodyContentApplicationjsonBasetree extends StObject {
  
  var parameters: `76`
  
  var requestBody: ContentApplicationjsonBasetree
  
  var responses: `201ContentApplicationjsonTruncated`
}
object RequestBodyContentApplicationjsonBasetree {
  
  inline def apply(
    parameters: `76`,
    requestBody: ContentApplicationjsonBasetree,
    responses: `201ContentApplicationjsonTruncated`
  ): RequestBodyContentApplicationjsonBasetree = {
    val __obj = js.Dynamic.literal(parameters = parameters.asInstanceOf[js.Any], requestBody = requestBody.asInstanceOf[js.Any], responses = responses.asInstanceOf[js.Any])
    __obj.asInstanceOf[RequestBodyContentApplicationjsonBasetree]
  }
  
  extension [Self <: RequestBodyContentApplicationjsonBasetree](x: Self) {
    
    inline def setParameters(value: `76`): Self = StObject.set(x, "parameters", value.asInstanceOf[js.Any])
    
    inline def setRequestBody(value: ContentApplicationjsonBasetree): Self = StObject.set(x, "requestBody", value.asInstanceOf[js.Any])
    
    inline def setResponses(value: `201ContentApplicationjsonTruncated`): Self = StObject.set(x, "responses", value.asInstanceOf[js.Any])
  }
}
