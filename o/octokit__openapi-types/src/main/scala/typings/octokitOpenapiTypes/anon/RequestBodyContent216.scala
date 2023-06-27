package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait RequestBodyContent216 extends StObject {
  
  var parameters: `165`
  
  var requestBody: Content216
  
  var responses: `201Content217`
}
object RequestBodyContent216 {
  
  inline def apply(parameters: `165`, requestBody: Content216, responses: `201Content217`): RequestBodyContent216 = {
    val __obj = js.Dynamic.literal(parameters = parameters.asInstanceOf[js.Any], requestBody = requestBody.asInstanceOf[js.Any], responses = responses.asInstanceOf[js.Any])
    __obj.asInstanceOf[RequestBodyContent216]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: RequestBodyContent216] (val x: Self) extends AnyVal {
    
    inline def setParameters(value: `165`): Self = StObject.set(x, "parameters", value.asInstanceOf[js.Any])
    
    inline def setRequestBody(value: Content216): Self = StObject.set(x, "requestBody", value.asInstanceOf[js.Any])
    
    inline def setResponses(value: `201Content217`): Self = StObject.set(x, "responses", value.asInstanceOf[js.Any])
  }
}
