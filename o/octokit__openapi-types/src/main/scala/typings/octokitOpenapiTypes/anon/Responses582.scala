package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Responses582 extends StObject {
  
  var parameters: `491`
  
  var requestBody: ContentApplicationjsonSubscribed
  
  var responses: `582`
}
object Responses582 {
  
  inline def apply(parameters: `491`, requestBody: ContentApplicationjsonSubscribed, responses: `582`): Responses582 = {
    val __obj = js.Dynamic.literal(parameters = parameters.asInstanceOf[js.Any], requestBody = requestBody.asInstanceOf[js.Any], responses = responses.asInstanceOf[js.Any])
    __obj.asInstanceOf[Responses582]
  }
  
  extension [Self <: Responses582](x: Self) {
    
    inline def setParameters(value: `491`): Self = StObject.set(x, "parameters", value.asInstanceOf[js.Any])
    
    inline def setRequestBody(value: ContentApplicationjsonSubscribed): Self = StObject.set(x, "requestBody", value.asInstanceOf[js.Any])
    
    inline def setResponses(value: `582`): Self = StObject.set(x, "responses", value.asInstanceOf[js.Any])
  }
}
