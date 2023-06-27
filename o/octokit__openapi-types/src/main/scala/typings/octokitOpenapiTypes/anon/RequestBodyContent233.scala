package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait RequestBodyContent233 extends StObject {
  
  var parameters: `165`
  
  var requestBody: Content233
  
  var responses: `200202`
}
object RequestBodyContent233 {
  
  inline def apply(parameters: `165`, requestBody: Content233, responses: `200202`): RequestBodyContent233 = {
    val __obj = js.Dynamic.literal(parameters = parameters.asInstanceOf[js.Any], requestBody = requestBody.asInstanceOf[js.Any], responses = responses.asInstanceOf[js.Any])
    __obj.asInstanceOf[RequestBodyContent233]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: RequestBodyContent233] (val x: Self) extends AnyVal {
    
    inline def setParameters(value: `165`): Self = StObject.set(x, "parameters", value.asInstanceOf[js.Any])
    
    inline def setRequestBody(value: Content233): Self = StObject.set(x, "requestBody", value.asInstanceOf[js.Any])
    
    inline def setResponses(value: `200202`): Self = StObject.set(x, "responses", value.asInstanceOf[js.Any])
  }
}
