package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait RequestBodyContent495 extends StObject {
  
  var parameters: PathEnvironmentnameOwner
  
  var requestBody: Content495
  
  var responses: `200Content493422Content6`
}
object RequestBodyContent495 {
  
  inline def apply(
    parameters: PathEnvironmentnameOwner,
    requestBody: Content495,
    responses: `200Content493422Content6`
  ): RequestBodyContent495 = {
    val __obj = js.Dynamic.literal(parameters = parameters.asInstanceOf[js.Any], requestBody = requestBody.asInstanceOf[js.Any], responses = responses.asInstanceOf[js.Any])
    __obj.asInstanceOf[RequestBodyContent495]
  }
  
  extension [Self <: RequestBodyContent495](x: Self) {
    
    inline def setParameters(value: PathEnvironmentnameOwner): Self = StObject.set(x, "parameters", value.asInstanceOf[js.Any])
    
    inline def setRequestBody(value: Content495): Self = StObject.set(x, "requestBody", value.asInstanceOf[js.Any])
    
    inline def setResponses(value: `200Content493422Content6`): Self = StObject.set(x, "responses", value.asInstanceOf[js.Any])
  }
}
