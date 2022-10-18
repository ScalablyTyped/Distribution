package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait RequestBodyContentApplicationjsonBaseroleDescription extends StObject {
  
  var parameters: `37`
  
  var requestBody: ContentApplicationjsonBaseroleDescription
  
  var responses: `201404422`
}
object RequestBodyContentApplicationjsonBaseroleDescription {
  
  inline def apply(parameters: `37`, requestBody: ContentApplicationjsonBaseroleDescription, responses: `201404422`): RequestBodyContentApplicationjsonBaseroleDescription = {
    val __obj = js.Dynamic.literal(parameters = parameters.asInstanceOf[js.Any], requestBody = requestBody.asInstanceOf[js.Any], responses = responses.asInstanceOf[js.Any])
    __obj.asInstanceOf[RequestBodyContentApplicationjsonBaseroleDescription]
  }
  
  extension [Self <: RequestBodyContentApplicationjsonBaseroleDescription](x: Self) {
    
    inline def setParameters(value: `37`): Self = StObject.set(x, "parameters", value.asInstanceOf[js.Any])
    
    inline def setRequestBody(value: ContentApplicationjsonBaseroleDescription): Self = StObject.set(x, "requestBody", value.asInstanceOf[js.Any])
    
    inline def setResponses(value: `201404422`): Self = StObject.set(x, "responses", value.asInstanceOf[js.Any])
  }
}
