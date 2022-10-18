package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Responses201Content316 extends StObject {
  
  var parameters: `303`
  
  var requestBody: ContentApplicationjsonAllowspublicrepositoriesName
  
  var responses: `201Content316`
}
object Responses201Content316 {
  
  inline def apply(
    parameters: `303`,
    requestBody: ContentApplicationjsonAllowspublicrepositoriesName,
    responses: `201Content316`
  ): Responses201Content316 = {
    val __obj = js.Dynamic.literal(parameters = parameters.asInstanceOf[js.Any], requestBody = requestBody.asInstanceOf[js.Any], responses = responses.asInstanceOf[js.Any])
    __obj.asInstanceOf[Responses201Content316]
  }
  
  extension [Self <: Responses201Content316](x: Self) {
    
    inline def setParameters(value: `303`): Self = StObject.set(x, "parameters", value.asInstanceOf[js.Any])
    
    inline def setRequestBody(value: ContentApplicationjsonAllowspublicrepositoriesName): Self = StObject.set(x, "requestBody", value.asInstanceOf[js.Any])
    
    inline def setResponses(value: `201Content316`): Self = StObject.set(x, "responses", value.asInstanceOf[js.Any])
  }
}
