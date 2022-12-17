package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait RequestBodyContentApplicationjsonBaserole extends StObject {
  
  var parameters: `57`
  
  var requestBody: ContentApplicationjsonBaserole
  
  var responses: `201404422`
}
object RequestBodyContentApplicationjsonBaserole {
  
  inline def apply(parameters: `57`, requestBody: ContentApplicationjsonBaserole, responses: `201404422`): RequestBodyContentApplicationjsonBaserole = {
    val __obj = js.Dynamic.literal(parameters = parameters.asInstanceOf[js.Any], requestBody = requestBody.asInstanceOf[js.Any], responses = responses.asInstanceOf[js.Any])
    __obj.asInstanceOf[RequestBodyContentApplicationjsonBaserole]
  }
  
  extension [Self <: RequestBodyContentApplicationjsonBaserole](x: Self) {
    
    inline def setParameters(value: `57`): Self = StObject.set(x, "parameters", value.asInstanceOf[js.Any])
    
    inline def setRequestBody(value: ContentApplicationjsonBaserole): Self = StObject.set(x, "requestBody", value.asInstanceOf[js.Any])
    
    inline def setResponses(value: `201404422`): Self = StObject.set(x, "responses", value.asInstanceOf[js.Any])
  }
}
