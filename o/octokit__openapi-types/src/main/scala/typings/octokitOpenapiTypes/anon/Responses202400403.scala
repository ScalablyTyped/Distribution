package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Responses202400403 extends StObject {
  
  var parameters: `491`
  
  var requestBody: Content236
  
  var responses: `202400403`
}
object Responses202400403 {
  
  inline def apply(parameters: `491`, requestBody: Content236, responses: `202400403`): Responses202400403 = {
    val __obj = js.Dynamic.literal(parameters = parameters.asInstanceOf[js.Any], requestBody = requestBody.asInstanceOf[js.Any], responses = responses.asInstanceOf[js.Any])
    __obj.asInstanceOf[Responses202400403]
  }
  
  extension [Self <: Responses202400403](x: Self) {
    
    inline def setParameters(value: `491`): Self = StObject.set(x, "parameters", value.asInstanceOf[js.Any])
    
    inline def setRequestBody(value: Content236): Self = StObject.set(x, "requestBody", value.asInstanceOf[js.Any])
    
    inline def setResponses(value: `202400403`): Self = StObject.set(x, "responses", value.asInstanceOf[js.Any])
  }
}
