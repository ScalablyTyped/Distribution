package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait RequestBodyContent183 extends StObject {
  
  var parameters: PathCheckrunid
  
  var requestBody: Content183
  
  var responses: `200Content181`
}
object RequestBodyContent183 {
  
  inline def apply(parameters: PathCheckrunid, requestBody: Content183, responses: `200Content181`): RequestBodyContent183 = {
    val __obj = js.Dynamic.literal(parameters = parameters.asInstanceOf[js.Any], requestBody = requestBody.asInstanceOf[js.Any], responses = responses.asInstanceOf[js.Any])
    __obj.asInstanceOf[RequestBodyContent183]
  }
  
  extension [Self <: RequestBodyContent183](x: Self) {
    
    inline def setParameters(value: PathCheckrunid): Self = StObject.set(x, "parameters", value.asInstanceOf[js.Any])
    
    inline def setRequestBody(value: Content183): Self = StObject.set(x, "requestBody", value.asInstanceOf[js.Any])
    
    inline def setResponses(value: `200Content181`): Self = StObject.set(x, "responses", value.asInstanceOf[js.Any])
  }
}
