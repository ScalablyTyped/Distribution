package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait RequestBodyContent497 extends StObject {
  
  var parameters: PathEnvironmentnameOwner
  
  var requestBody: Content497
  
  var responses: `200Content496`
}
object RequestBodyContent497 {
  
  inline def apply(parameters: PathEnvironmentnameOwner, requestBody: Content497, responses: `200Content496`): RequestBodyContent497 = {
    val __obj = js.Dynamic.literal(parameters = parameters.asInstanceOf[js.Any], requestBody = requestBody.asInstanceOf[js.Any], responses = responses.asInstanceOf[js.Any])
    __obj.asInstanceOf[RequestBodyContent497]
  }
  
  extension [Self <: RequestBodyContent497](x: Self) {
    
    inline def setParameters(value: PathEnvironmentnameOwner): Self = StObject.set(x, "parameters", value.asInstanceOf[js.Any])
    
    inline def setRequestBody(value: Content497): Self = StObject.set(x, "requestBody", value.asInstanceOf[js.Any])
    
    inline def setResponses(value: `200Content496`): Self = StObject.set(x, "responses", value.asInstanceOf[js.Any])
  }
}
