package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait RequestBodyContent486 extends StObject {
  
  var parameters: `395`
  
  var requestBody: Content486
  
  var responses: `201ContentApplicationjsonResult`
}
object RequestBodyContent486 {
  
  inline def apply(parameters: `395`, requestBody: Content486, responses: `201ContentApplicationjsonResult`): RequestBodyContent486 = {
    val __obj = js.Dynamic.literal(parameters = parameters.asInstanceOf[js.Any], requestBody = requestBody.asInstanceOf[js.Any], responses = responses.asInstanceOf[js.Any])
    __obj.asInstanceOf[RequestBodyContent486]
  }
  
  extension [Self <: RequestBodyContent486](x: Self) {
    
    inline def setParameters(value: `395`): Self = StObject.set(x, "parameters", value.asInstanceOf[js.Any])
    
    inline def setRequestBody(value: Content486): Self = StObject.set(x, "requestBody", value.asInstanceOf[js.Any])
    
    inline def setResponses(value: `201ContentApplicationjsonResult`): Self = StObject.set(x, "responses", value.asInstanceOf[js.Any])
  }
}
