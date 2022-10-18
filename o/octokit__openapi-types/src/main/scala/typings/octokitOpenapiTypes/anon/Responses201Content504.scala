package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Responses201Content504 extends StObject {
  
  var parameters: `395`
  
  var requestBody: ContentApplicationjsonCommitterMessage
  
  var responses: `201Content504`
}
object Responses201Content504 {
  
  inline def apply(parameters: `395`, requestBody: ContentApplicationjsonCommitterMessage, responses: `201Content504`): Responses201Content504 = {
    val __obj = js.Dynamic.literal(parameters = parameters.asInstanceOf[js.Any], requestBody = requestBody.asInstanceOf[js.Any], responses = responses.asInstanceOf[js.Any])
    __obj.asInstanceOf[Responses201Content504]
  }
  
  extension [Self <: Responses201Content504](x: Self) {
    
    inline def setParameters(value: `395`): Self = StObject.set(x, "parameters", value.asInstanceOf[js.Any])
    
    inline def setRequestBody(value: ContentApplicationjsonCommitterMessage): Self = StObject.set(x, "requestBody", value.asInstanceOf[js.Any])
    
    inline def setResponses(value: `201Content504`): Self = StObject.set(x, "responses", value.asInstanceOf[js.Any])
  }
}
