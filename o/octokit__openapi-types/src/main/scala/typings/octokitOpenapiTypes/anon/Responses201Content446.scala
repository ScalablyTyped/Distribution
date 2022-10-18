package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Responses201Content446 extends StObject {
  
  var parameters: `395`
  
  var requestBody: Content98
  
  var responses: `201Content446`
}
object Responses201Content446 {
  
  inline def apply(parameters: `395`, requestBody: Content98, responses: `201Content446`): Responses201Content446 = {
    val __obj = js.Dynamic.literal(parameters = parameters.asInstanceOf[js.Any], requestBody = requestBody.asInstanceOf[js.Any], responses = responses.asInstanceOf[js.Any])
    __obj.asInstanceOf[Responses201Content446]
  }
  
  extension [Self <: Responses201Content446](x: Self) {
    
    inline def setParameters(value: `395`): Self = StObject.set(x, "parameters", value.asInstanceOf[js.Any])
    
    inline def setRequestBody(value: Content98): Self = StObject.set(x, "requestBody", value.asInstanceOf[js.Any])
    
    inline def setResponses(value: `201Content446`): Self = StObject.set(x, "responses", value.asInstanceOf[js.Any])
  }
}
