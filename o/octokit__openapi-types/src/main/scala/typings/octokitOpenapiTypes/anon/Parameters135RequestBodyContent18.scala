package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Parameters135RequestBodyContent18 extends StObject {
  
  var parameters: `135`
  
  var requestBody: Content18
  
  var responses: `409Unknown`
}
object Parameters135RequestBodyContent18 {
  
  inline def apply(parameters: `135`, requestBody: Content18, responses: `409Unknown`): Parameters135RequestBodyContent18 = {
    val __obj = js.Dynamic.literal(parameters = parameters.asInstanceOf[js.Any], requestBody = requestBody.asInstanceOf[js.Any], responses = responses.asInstanceOf[js.Any])
    __obj.asInstanceOf[Parameters135RequestBodyContent18]
  }
  
  extension [Self <: Parameters135RequestBodyContent18](x: Self) {
    
    inline def setParameters(value: `135`): Self = StObject.set(x, "parameters", value.asInstanceOf[js.Any])
    
    inline def setRequestBody(value: Content18): Self = StObject.set(x, "requestBody", value.asInstanceOf[js.Any])
    
    inline def setResponses(value: `409Unknown`): Self = StObject.set(x, "responses", value.asInstanceOf[js.Any])
  }
}
