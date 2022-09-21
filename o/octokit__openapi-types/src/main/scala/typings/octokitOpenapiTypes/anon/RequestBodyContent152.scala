package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait RequestBodyContent152 extends StObject {
  
  var parameters: PathJobid
  
  var requestBody: Content152
  
  var responses: `201Content67403`
}
object RequestBodyContent152 {
  
  inline def apply(parameters: PathJobid, requestBody: Content152, responses: `201Content67403`): RequestBodyContent152 = {
    val __obj = js.Dynamic.literal(parameters = parameters.asInstanceOf[js.Any], requestBody = requestBody.asInstanceOf[js.Any], responses = responses.asInstanceOf[js.Any])
    __obj.asInstanceOf[RequestBodyContent152]
  }
  
  extension [Self <: RequestBodyContent152](x: Self) {
    
    inline def setParameters(value: PathJobid): Self = StObject.set(x, "parameters", value.asInstanceOf[js.Any])
    
    inline def setRequestBody(value: Content152): Self = StObject.set(x, "requestBody", value.asInstanceOf[js.Any])
    
    inline def setResponses(value: `201Content67403`): Self = StObject.set(x, "responses", value.asInstanceOf[js.Any])
  }
}
