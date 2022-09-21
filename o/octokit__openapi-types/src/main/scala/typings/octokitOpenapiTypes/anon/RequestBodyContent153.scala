package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait RequestBodyContent153 extends StObject {
  
  var parameters: `144`
  
  var requestBody: Content153
  
  var responses: `201400`
}
object RequestBodyContent153 {
  
  inline def apply(parameters: `144`, requestBody: Content153, responses: `201400`): RequestBodyContent153 = {
    val __obj = js.Dynamic.literal(parameters = parameters.asInstanceOf[js.Any], requestBody = requestBody.asInstanceOf[js.Any], responses = responses.asInstanceOf[js.Any])
    __obj.asInstanceOf[RequestBodyContent153]
  }
  
  extension [Self <: RequestBodyContent153](x: Self) {
    
    inline def setParameters(value: `144`): Self = StObject.set(x, "parameters", value.asInstanceOf[js.Any])
    
    inline def setRequestBody(value: Content153): Self = StObject.set(x, "requestBody", value.asInstanceOf[js.Any])
    
    inline def setResponses(value: `201400`): Self = StObject.set(x, "responses", value.asInstanceOf[js.Any])
  }
}
