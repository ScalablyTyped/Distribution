package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Responses562 extends StObject {
  
  var parameters: `472`
  
  var requestBody: ContentApplicationjsonSubscribed
  
  var responses: `562`
}
object Responses562 {
  
  inline def apply(parameters: `472`, requestBody: ContentApplicationjsonSubscribed, responses: `562`): Responses562 = {
    val __obj = js.Dynamic.literal(parameters = parameters.asInstanceOf[js.Any], requestBody = requestBody.asInstanceOf[js.Any], responses = responses.asInstanceOf[js.Any])
    __obj.asInstanceOf[Responses562]
  }
  
  extension [Self <: Responses562](x: Self) {
    
    inline def setParameters(value: `472`): Self = StObject.set(x, "parameters", value.asInstanceOf[js.Any])
    
    inline def setRequestBody(value: ContentApplicationjsonSubscribed): Self = StObject.set(x, "requestBody", value.asInstanceOf[js.Any])
    
    inline def setResponses(value: `562`): Self = StObject.set(x, "responses", value.asInstanceOf[js.Any])
  }
}
