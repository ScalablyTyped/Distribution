package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait RequestBodyContent227 extends StObject {
  
  var parameters: PathEnvironmentname
  
  var requestBody: Content227
  
  var responses: `200Content226`
}
object RequestBodyContent227 {
  
  inline def apply(parameters: PathEnvironmentname, requestBody: Content227, responses: `200Content226`): RequestBodyContent227 = {
    val __obj = js.Dynamic.literal(parameters = parameters.asInstanceOf[js.Any], requestBody = requestBody.asInstanceOf[js.Any], responses = responses.asInstanceOf[js.Any])
    __obj.asInstanceOf[RequestBodyContent227]
  }
  
  extension [Self <: RequestBodyContent227](x: Self) {
    
    inline def setParameters(value: PathEnvironmentname): Self = StObject.set(x, "parameters", value.asInstanceOf[js.Any])
    
    inline def setRequestBody(value: Content227): Self = StObject.set(x, "requestBody", value.asInstanceOf[js.Any])
    
    inline def setResponses(value: `200Content226`): Self = StObject.set(x, "responses", value.asInstanceOf[js.Any])
  }
}
