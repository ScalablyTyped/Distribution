package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Responses201Content591 extends StObject {
  
  var parameters: `395`
  
  var requestBody: ContentApplicationjsonPatternString
  
  var responses: `201Content591`
}
object Responses201Content591 {
  
  inline def apply(parameters: `395`, requestBody: ContentApplicationjsonPatternString, responses: `201Content591`): Responses201Content591 = {
    val __obj = js.Dynamic.literal(parameters = parameters.asInstanceOf[js.Any], requestBody = requestBody.asInstanceOf[js.Any], responses = responses.asInstanceOf[js.Any])
    __obj.asInstanceOf[Responses201Content591]
  }
  
  extension [Self <: Responses201Content591](x: Self) {
    
    inline def setParameters(value: `395`): Self = StObject.set(x, "parameters", value.asInstanceOf[js.Any])
    
    inline def setRequestBody(value: ContentApplicationjsonPatternString): Self = StObject.set(x, "requestBody", value.asInstanceOf[js.Any])
    
    inline def setResponses(value: `201Content591`): Self = StObject.set(x, "responses", value.asInstanceOf[js.Any])
  }
}
