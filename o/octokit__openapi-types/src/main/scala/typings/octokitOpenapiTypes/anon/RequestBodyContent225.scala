package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait RequestBodyContent225 extends StObject {
  
  var parameters: PathEnvironmentname
  
  var requestBody: Content225
  
  var responses: `422Content48`
}
object RequestBodyContent225 {
  
  inline def apply(parameters: PathEnvironmentname, requestBody: Content225, responses: `422Content48`): RequestBodyContent225 = {
    val __obj = js.Dynamic.literal(parameters = parameters.asInstanceOf[js.Any], requestBody = requestBody.asInstanceOf[js.Any], responses = responses.asInstanceOf[js.Any])
    __obj.asInstanceOf[RequestBodyContent225]
  }
  
  extension [Self <: RequestBodyContent225](x: Self) {
    
    inline def setParameters(value: PathEnvironmentname): Self = StObject.set(x, "parameters", value.asInstanceOf[js.Any])
    
    inline def setRequestBody(value: Content225): Self = StObject.set(x, "requestBody", value.asInstanceOf[js.Any])
    
    inline def setResponses(value: `422Content48`): Self = StObject.set(x, "responses", value.asInstanceOf[js.Any])
  }
}
