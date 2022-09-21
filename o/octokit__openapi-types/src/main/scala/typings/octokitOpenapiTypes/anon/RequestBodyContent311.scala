package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait RequestBodyContent311 extends StObject {
  
  var parameters: PathPullnumber
  
  var requestBody: Content311
  
  var responses: `405`
}
object RequestBodyContent311 {
  
  inline def apply(parameters: PathPullnumber, requestBody: Content311, responses: `405`): RequestBodyContent311 = {
    val __obj = js.Dynamic.literal(parameters = parameters.asInstanceOf[js.Any], requestBody = requestBody.asInstanceOf[js.Any], responses = responses.asInstanceOf[js.Any])
    __obj.asInstanceOf[RequestBodyContent311]
  }
  
  extension [Self <: RequestBodyContent311](x: Self) {
    
    inline def setParameters(value: PathPullnumber): Self = StObject.set(x, "parameters", value.asInstanceOf[js.Any])
    
    inline def setRequestBody(value: Content311): Self = StObject.set(x, "requestBody", value.asInstanceOf[js.Any])
    
    inline def setResponses(value: `405`): Self = StObject.set(x, "responses", value.asInstanceOf[js.Any])
  }
}
