package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait RequestBodyContent80 extends StObject {
  
  var parameters: `57`
  
  var requestBody: Content80
  
  var responses: `200Content79`
}
object RequestBodyContent80 {
  
  inline def apply(parameters: `57`, requestBody: Content80, responses: `200Content79`): RequestBodyContent80 = {
    val __obj = js.Dynamic.literal(parameters = parameters.asInstanceOf[js.Any], requestBody = requestBody.asInstanceOf[js.Any], responses = responses.asInstanceOf[js.Any])
    __obj.asInstanceOf[RequestBodyContent80]
  }
  
  extension [Self <: RequestBodyContent80](x: Self) {
    
    inline def setParameters(value: `57`): Self = StObject.set(x, "parameters", value.asInstanceOf[js.Any])
    
    inline def setRequestBody(value: Content80): Self = StObject.set(x, "requestBody", value.asInstanceOf[js.Any])
    
    inline def setResponses(value: `200Content79`): Self = StObject.set(x, "responses", value.asInstanceOf[js.Any])
  }
}
