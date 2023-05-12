package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait RequestBodyContent197 extends StObject {
  
  var parameters: `141`
  
  var requestBody: Content197
  
  var responses: `200202`
}
object RequestBodyContent197 {
  
  inline def apply(parameters: `141`, requestBody: Content197, responses: `200202`): RequestBodyContent197 = {
    val __obj = js.Dynamic.literal(parameters = parameters.asInstanceOf[js.Any], requestBody = requestBody.asInstanceOf[js.Any], responses = responses.asInstanceOf[js.Any])
    __obj.asInstanceOf[RequestBodyContent197]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: RequestBodyContent197] (val x: Self) extends AnyVal {
    
    inline def setParameters(value: `141`): Self = StObject.set(x, "parameters", value.asInstanceOf[js.Any])
    
    inline def setRequestBody(value: Content197): Self = StObject.set(x, "requestBody", value.asInstanceOf[js.Any])
    
    inline def setResponses(value: `200202`): Self = StObject.set(x, "responses", value.asInstanceOf[js.Any])
  }
}
