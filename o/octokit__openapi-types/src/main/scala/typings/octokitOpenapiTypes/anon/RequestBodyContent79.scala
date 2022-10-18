package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait RequestBodyContent79 extends StObject {
  
  var parameters: PathJobid
  
  var requestBody: Content79
  
  var responses: `201Content4403Content6`
}
object RequestBodyContent79 {
  
  inline def apply(parameters: PathJobid, requestBody: Content79, responses: `201Content4403Content6`): RequestBodyContent79 = {
    val __obj = js.Dynamic.literal(parameters = parameters.asInstanceOf[js.Any], requestBody = requestBody.asInstanceOf[js.Any], responses = responses.asInstanceOf[js.Any])
    __obj.asInstanceOf[RequestBodyContent79]
  }
  
  extension [Self <: RequestBodyContent79](x: Self) {
    
    inline def setParameters(value: PathJobid): Self = StObject.set(x, "parameters", value.asInstanceOf[js.Any])
    
    inline def setRequestBody(value: Content79): Self = StObject.set(x, "requestBody", value.asInstanceOf[js.Any])
    
    inline def setResponses(value: `201Content4403Content6`): Self = StObject.set(x, "responses", value.asInstanceOf[js.Any])
  }
}
