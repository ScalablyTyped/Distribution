package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait RequestBodyContent232 extends StObject {
  
  var parameters: PathEnvironmentname
  
  var requestBody: Content232
  
  var responses: `422Content55`
}
object RequestBodyContent232 {
  
  inline def apply(parameters: PathEnvironmentname, requestBody: Content232, responses: `422Content55`): RequestBodyContent232 = {
    val __obj = js.Dynamic.literal(parameters = parameters.asInstanceOf[js.Any], requestBody = requestBody.asInstanceOf[js.Any], responses = responses.asInstanceOf[js.Any])
    __obj.asInstanceOf[RequestBodyContent232]
  }
  
  extension [Self <: RequestBodyContent232](x: Self) {
    
    inline def setParameters(value: PathEnvironmentname): Self = StObject.set(x, "parameters", value.asInstanceOf[js.Any])
    
    inline def setRequestBody(value: Content232): Self = StObject.set(x, "requestBody", value.asInstanceOf[js.Any])
    
    inline def setResponses(value: `422Content55`): Self = StObject.set(x, "responses", value.asInstanceOf[js.Any])
  }
}
