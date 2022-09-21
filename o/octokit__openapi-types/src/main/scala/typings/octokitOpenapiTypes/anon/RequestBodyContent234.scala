package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait RequestBodyContent234 extends StObject {
  
  var parameters: PathEnvironmentname
  
  var requestBody: Content234
  
  var responses: `200Content233`
}
object RequestBodyContent234 {
  
  inline def apply(parameters: PathEnvironmentname, requestBody: Content234, responses: `200Content233`): RequestBodyContent234 = {
    val __obj = js.Dynamic.literal(parameters = parameters.asInstanceOf[js.Any], requestBody = requestBody.asInstanceOf[js.Any], responses = responses.asInstanceOf[js.Any])
    __obj.asInstanceOf[RequestBodyContent234]
  }
  
  extension [Self <: RequestBodyContent234](x: Self) {
    
    inline def setParameters(value: PathEnvironmentname): Self = StObject.set(x, "parameters", value.asInstanceOf[js.Any])
    
    inline def setRequestBody(value: Content234): Self = StObject.set(x, "requestBody", value.asInstanceOf[js.Any])
    
    inline def setResponses(value: `200Content233`): Self = StObject.set(x, "responses", value.asInstanceOf[js.Any])
  }
}
