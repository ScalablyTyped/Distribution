package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Responses202400403 extends StObject {
  
  var parameters: `395`
  
  var requestBody: Content125
  
  var responses: `202400403`
}
object Responses202400403 {
  
  inline def apply(parameters: `395`, requestBody: Content125, responses: `202400403`): Responses202400403 = {
    val __obj = js.Dynamic.literal(parameters = parameters.asInstanceOf[js.Any], requestBody = requestBody.asInstanceOf[js.Any], responses = responses.asInstanceOf[js.Any])
    __obj.asInstanceOf[Responses202400403]
  }
  
  extension [Self <: Responses202400403](x: Self) {
    
    inline def setParameters(value: `395`): Self = StObject.set(x, "parameters", value.asInstanceOf[js.Any])
    
    inline def setRequestBody(value: Content125): Self = StObject.set(x, "requestBody", value.asInstanceOf[js.Any])
    
    inline def setResponses(value: `202400403`): Self = StObject.set(x, "responses", value.asInstanceOf[js.Any])
  }
}
