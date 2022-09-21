package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait RequestBodyContent250 extends StObject {
  
  var parameters: `144`
  
  var requestBody: Content250
  
  var responses: `201Content249`
}
object RequestBodyContent250 {
  
  inline def apply(parameters: `144`, requestBody: Content250, responses: `201Content249`): RequestBodyContent250 = {
    val __obj = js.Dynamic.literal(parameters = parameters.asInstanceOf[js.Any], requestBody = requestBody.asInstanceOf[js.Any], responses = responses.asInstanceOf[js.Any])
    __obj.asInstanceOf[RequestBodyContent250]
  }
  
  extension [Self <: RequestBodyContent250](x: Self) {
    
    inline def setParameters(value: `144`): Self = StObject.set(x, "parameters", value.asInstanceOf[js.Any])
    
    inline def setRequestBody(value: Content250): Self = StObject.set(x, "requestBody", value.asInstanceOf[js.Any])
    
    inline def setResponses(value: `201Content249`): Self = StObject.set(x, "responses", value.asInstanceOf[js.Any])
  }
}
