package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait RequestBodyContent172 extends StObject {
  
  var parameters: PathPullnumber
  
  var requestBody: Content172
  
  var responses: `405`
}
object RequestBodyContent172 {
  
  inline def apply(parameters: PathPullnumber, requestBody: Content172, responses: `405`): RequestBodyContent172 = {
    val __obj = js.Dynamic.literal(parameters = parameters.asInstanceOf[js.Any], requestBody = requestBody.asInstanceOf[js.Any], responses = responses.asInstanceOf[js.Any])
    __obj.asInstanceOf[RequestBodyContent172]
  }
  
  extension [Self <: RequestBodyContent172](x: Self) {
    
    inline def setParameters(value: PathPullnumber): Self = StObject.set(x, "parameters", value.asInstanceOf[js.Any])
    
    inline def setRequestBody(value: Content172): Self = StObject.set(x, "requestBody", value.asInstanceOf[js.Any])
    
    inline def setResponses(value: `405`): Self = StObject.set(x, "responses", value.asInstanceOf[js.Any])
  }
}
