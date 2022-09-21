package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait RequestBodyContentApplicationjsonBaserole extends StObject {
  
  var parameters: PathOrg
  
  var requestBody: ContentApplicationjsonBaserole
  
  var responses: `201404`
}
object RequestBodyContentApplicationjsonBaserole {
  
  inline def apply(parameters: PathOrg, requestBody: ContentApplicationjsonBaserole, responses: `201404`): RequestBodyContentApplicationjsonBaserole = {
    val __obj = js.Dynamic.literal(parameters = parameters.asInstanceOf[js.Any], requestBody = requestBody.asInstanceOf[js.Any], responses = responses.asInstanceOf[js.Any])
    __obj.asInstanceOf[RequestBodyContentApplicationjsonBaserole]
  }
  
  extension [Self <: RequestBodyContentApplicationjsonBaserole](x: Self) {
    
    inline def setParameters(value: PathOrg): Self = StObject.set(x, "parameters", value.asInstanceOf[js.Any])
    
    inline def setRequestBody(value: ContentApplicationjsonBaserole): Self = StObject.set(x, "requestBody", value.asInstanceOf[js.Any])
    
    inline def setResponses(value: `201404`): Self = StObject.set(x, "responses", value.asInstanceOf[js.Any])
  }
}
