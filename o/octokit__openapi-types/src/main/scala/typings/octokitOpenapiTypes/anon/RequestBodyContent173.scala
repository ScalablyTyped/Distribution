package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait RequestBodyContent173 extends StObject {
  
  var parameters: PathCheckrunid
  
  var requestBody: Content173
  
  var responses: `200Content171`
}
object RequestBodyContent173 {
  
  inline def apply(parameters: PathCheckrunid, requestBody: Content173, responses: `200Content171`): RequestBodyContent173 = {
    val __obj = js.Dynamic.literal(parameters = parameters.asInstanceOf[js.Any], requestBody = requestBody.asInstanceOf[js.Any], responses = responses.asInstanceOf[js.Any])
    __obj.asInstanceOf[RequestBodyContent173]
  }
  
  extension [Self <: RequestBodyContent173](x: Self) {
    
    inline def setParameters(value: PathCheckrunid): Self = StObject.set(x, "parameters", value.asInstanceOf[js.Any])
    
    inline def setRequestBody(value: Content173): Self = StObject.set(x, "requestBody", value.asInstanceOf[js.Any])
    
    inline def setResponses(value: `200Content171`): Self = StObject.set(x, "responses", value.asInstanceOf[js.Any])
  }
}
