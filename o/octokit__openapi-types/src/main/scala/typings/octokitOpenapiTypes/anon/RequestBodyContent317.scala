package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait RequestBodyContent317 extends StObject {
  
  var parameters: PathPullnumber
  
  var requestBody: Content317
  
  var responses: `202403422`
}
object RequestBodyContent317 {
  
  inline def apply(parameters: PathPullnumber, requestBody: Content317, responses: `202403422`): RequestBodyContent317 = {
    val __obj = js.Dynamic.literal(parameters = parameters.asInstanceOf[js.Any], requestBody = requestBody.asInstanceOf[js.Any], responses = responses.asInstanceOf[js.Any])
    __obj.asInstanceOf[RequestBodyContent317]
  }
  
  extension [Self <: RequestBodyContent317](x: Self) {
    
    inline def setParameters(value: PathPullnumber): Self = StObject.set(x, "parameters", value.asInstanceOf[js.Any])
    
    inline def setRequestBody(value: Content317): Self = StObject.set(x, "requestBody", value.asInstanceOf[js.Any])
    
    inline def setResponses(value: `202403422`): Self = StObject.set(x, "responses", value.asInstanceOf[js.Any])
  }
}
