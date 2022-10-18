package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Parameters418RequestBodyContent79 extends StObject {
  
  var parameters: `418`
  
  var requestBody: Content79
  
  var responses: `323`
}
object Parameters418RequestBodyContent79 {
  
  inline def apply(parameters: `418`, requestBody: Content79, responses: `323`): Parameters418RequestBodyContent79 = {
    val __obj = js.Dynamic.literal(parameters = parameters.asInstanceOf[js.Any], requestBody = requestBody.asInstanceOf[js.Any], responses = responses.asInstanceOf[js.Any])
    __obj.asInstanceOf[Parameters418RequestBodyContent79]
  }
  
  extension [Self <: Parameters418RequestBodyContent79](x: Self) {
    
    inline def setParameters(value: `418`): Self = StObject.set(x, "parameters", value.asInstanceOf[js.Any])
    
    inline def setRequestBody(value: Content79): Self = StObject.set(x, "requestBody", value.asInstanceOf[js.Any])
    
    inline def setResponses(value: `323`): Self = StObject.set(x, "responses", value.asInstanceOf[js.Any])
  }
}
