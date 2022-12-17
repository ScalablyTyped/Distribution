package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait RequestBodyContent229 extends StObject {
  
  var parameters: `135`
  
  var requestBody: Content229
  
  var responses: `202400`
}
object RequestBodyContent229 {
  
  inline def apply(parameters: `135`, requestBody: Content229, responses: `202400`): RequestBodyContent229 = {
    val __obj = js.Dynamic.literal(parameters = parameters.asInstanceOf[js.Any], requestBody = requestBody.asInstanceOf[js.Any], responses = responses.asInstanceOf[js.Any])
    __obj.asInstanceOf[RequestBodyContent229]
  }
  
  extension [Self <: RequestBodyContent229](x: Self) {
    
    inline def setParameters(value: `135`): Self = StObject.set(x, "parameters", value.asInstanceOf[js.Any])
    
    inline def setRequestBody(value: Content229): Self = StObject.set(x, "requestBody", value.asInstanceOf[js.Any])
    
    inline def setResponses(value: `202400`): Self = StObject.set(x, "responses", value.asInstanceOf[js.Any])
  }
}
