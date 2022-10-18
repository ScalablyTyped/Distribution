package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Responses201Content511 extends StObject {
  
  var parameters: `395`
  
  var requestBody: ContentApplicationjsonBasetree
  
  var responses: `201Content511`
}
object Responses201Content511 {
  
  inline def apply(parameters: `395`, requestBody: ContentApplicationjsonBasetree, responses: `201Content511`): Responses201Content511 = {
    val __obj = js.Dynamic.literal(parameters = parameters.asInstanceOf[js.Any], requestBody = requestBody.asInstanceOf[js.Any], responses = responses.asInstanceOf[js.Any])
    __obj.asInstanceOf[Responses201Content511]
  }
  
  extension [Self <: Responses201Content511](x: Self) {
    
    inline def setParameters(value: `395`): Self = StObject.set(x, "parameters", value.asInstanceOf[js.Any])
    
    inline def setRequestBody(value: ContentApplicationjsonBasetree): Self = StObject.set(x, "requestBody", value.asInstanceOf[js.Any])
    
    inline def setResponses(value: `201Content511`): Self = StObject.set(x, "responses", value.asInstanceOf[js.Any])
  }
}
