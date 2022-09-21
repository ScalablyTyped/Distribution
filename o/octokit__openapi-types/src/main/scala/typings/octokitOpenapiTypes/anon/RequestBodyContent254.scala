package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait RequestBodyContent254 extends StObject {
  
  var parameters: `144`
  
  var requestBody: Content254
  
  var responses: `253`
}
object RequestBodyContent254 {
  
  inline def apply(parameters: `144`, requestBody: Content254, responses: `253`): RequestBodyContent254 = {
    val __obj = js.Dynamic.literal(parameters = parameters.asInstanceOf[js.Any], requestBody = requestBody.asInstanceOf[js.Any], responses = responses.asInstanceOf[js.Any])
    __obj.asInstanceOf[RequestBodyContent254]
  }
  
  extension [Self <: RequestBodyContent254](x: Self) {
    
    inline def setParameters(value: `144`): Self = StObject.set(x, "parameters", value.asInstanceOf[js.Any])
    
    inline def setRequestBody(value: Content254): Self = StObject.set(x, "requestBody", value.asInstanceOf[js.Any])
    
    inline def setResponses(value: `253`): Self = StObject.set(x, "responses", value.asInstanceOf[js.Any])
  }
}
