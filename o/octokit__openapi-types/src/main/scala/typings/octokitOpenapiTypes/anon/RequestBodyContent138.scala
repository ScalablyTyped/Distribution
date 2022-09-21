package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait RequestBodyContent138 extends StObject {
  
  var parameters: Path135
  
  var requestBody: Content138
  
  var responses: `201304401`
}
object RequestBodyContent138 {
  
  inline def apply(parameters: Path135, requestBody: Content138, responses: `201304401`): RequestBodyContent138 = {
    val __obj = js.Dynamic.literal(parameters = parameters.asInstanceOf[js.Any], requestBody = requestBody.asInstanceOf[js.Any], responses = responses.asInstanceOf[js.Any])
    __obj.asInstanceOf[RequestBodyContent138]
  }
  
  extension [Self <: RequestBodyContent138](x: Self) {
    
    inline def setParameters(value: Path135): Self = StObject.set(x, "parameters", value.asInstanceOf[js.Any])
    
    inline def setRequestBody(value: Content138): Self = StObject.set(x, "requestBody", value.asInstanceOf[js.Any])
    
    inline def setResponses(value: `201304401`): Self = StObject.set(x, "responses", value.asInstanceOf[js.Any])
  }
}
