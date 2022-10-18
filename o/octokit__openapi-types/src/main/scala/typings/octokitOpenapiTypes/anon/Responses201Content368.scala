package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Responses201Content368 extends StObject {
  
  var parameters: `303`
  
  var requestBody: ContentApplicationjsonMaintainers
  
  var responses: `201Content368`
}
object Responses201Content368 {
  
  inline def apply(parameters: `303`, requestBody: ContentApplicationjsonMaintainers, responses: `201Content368`): Responses201Content368 = {
    val __obj = js.Dynamic.literal(parameters = parameters.asInstanceOf[js.Any], requestBody = requestBody.asInstanceOf[js.Any], responses = responses.asInstanceOf[js.Any])
    __obj.asInstanceOf[Responses201Content368]
  }
  
  extension [Self <: Responses201Content368](x: Self) {
    
    inline def setParameters(value: `303`): Self = StObject.set(x, "parameters", value.asInstanceOf[js.Any])
    
    inline def setRequestBody(value: ContentApplicationjsonMaintainers): Self = StObject.set(x, "requestBody", value.asInstanceOf[js.Any])
    
    inline def setResponses(value: `201Content368`): Self = StObject.set(x, "responses", value.asInstanceOf[js.Any])
  }
}
