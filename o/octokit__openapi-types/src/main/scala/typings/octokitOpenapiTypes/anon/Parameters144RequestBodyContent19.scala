package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Parameters144RequestBodyContent19 extends StObject {
  
  var parameters: `144`
  
  var requestBody: Content19
  
  var responses: `409Unknown`
}
object Parameters144RequestBodyContent19 {
  
  inline def apply(parameters: `144`, requestBody: Content19, responses: `409Unknown`): Parameters144RequestBodyContent19 = {
    val __obj = js.Dynamic.literal(parameters = parameters.asInstanceOf[js.Any], requestBody = requestBody.asInstanceOf[js.Any], responses = responses.asInstanceOf[js.Any])
    __obj.asInstanceOf[Parameters144RequestBodyContent19]
  }
  
  extension [Self <: Parameters144RequestBodyContent19](x: Self) {
    
    inline def setParameters(value: `144`): Self = StObject.set(x, "parameters", value.asInstanceOf[js.Any])
    
    inline def setRequestBody(value: Content19): Self = StObject.set(x, "requestBody", value.asInstanceOf[js.Any])
    
    inline def setResponses(value: `409Unknown`): Self = StObject.set(x, "responses", value.asInstanceOf[js.Any])
  }
}
