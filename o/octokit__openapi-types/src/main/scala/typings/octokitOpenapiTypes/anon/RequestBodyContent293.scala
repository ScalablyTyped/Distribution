package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait RequestBodyContent293 extends StObject {
  
  var parameters: `144`
  
  var requestBody: Content293
  
  var responses: `201409`
}
object RequestBodyContent293 {
  
  inline def apply(parameters: `144`, requestBody: Content293, responses: `201409`): RequestBodyContent293 = {
    val __obj = js.Dynamic.literal(parameters = parameters.asInstanceOf[js.Any], requestBody = requestBody.asInstanceOf[js.Any], responses = responses.asInstanceOf[js.Any])
    __obj.asInstanceOf[RequestBodyContent293]
  }
  
  extension [Self <: RequestBodyContent293](x: Self) {
    
    inline def setParameters(value: `144`): Self = StObject.set(x, "parameters", value.asInstanceOf[js.Any])
    
    inline def setRequestBody(value: Content293): Self = StObject.set(x, "requestBody", value.asInstanceOf[js.Any])
    
    inline def setResponses(value: `201409`): Self = StObject.set(x, "responses", value.asInstanceOf[js.Any])
  }
}
