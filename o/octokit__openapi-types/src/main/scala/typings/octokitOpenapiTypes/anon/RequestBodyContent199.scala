package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait RequestBodyContent199 extends StObject {
  
  var parameters: `144`
  
  var requestBody: Content199
  
  var responses: `201202`
}
object RequestBodyContent199 {
  
  inline def apply(parameters: `144`, requestBody: Content199, responses: `201202`): RequestBodyContent199 = {
    val __obj = js.Dynamic.literal(parameters = parameters.asInstanceOf[js.Any], requestBody = requestBody.asInstanceOf[js.Any], responses = responses.asInstanceOf[js.Any])
    __obj.asInstanceOf[RequestBodyContent199]
  }
  
  extension [Self <: RequestBodyContent199](x: Self) {
    
    inline def setParameters(value: `144`): Self = StObject.set(x, "parameters", value.asInstanceOf[js.Any])
    
    inline def setRequestBody(value: Content199): Self = StObject.set(x, "requestBody", value.asInstanceOf[js.Any])
    
    inline def setResponses(value: `201202`): Self = StObject.set(x, "responses", value.asInstanceOf[js.Any])
  }
}
