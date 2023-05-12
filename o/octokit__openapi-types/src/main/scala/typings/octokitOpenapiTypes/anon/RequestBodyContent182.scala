package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait RequestBodyContent182 extends StObject {
  
  var parameters: `141`
  
  var requestBody: Content182
  
  var responses: `201Content183`
}
object RequestBodyContent182 {
  
  inline def apply(parameters: `141`, requestBody: Content182, responses: `201Content183`): RequestBodyContent182 = {
    val __obj = js.Dynamic.literal(parameters = parameters.asInstanceOf[js.Any], requestBody = requestBody.asInstanceOf[js.Any], responses = responses.asInstanceOf[js.Any])
    __obj.asInstanceOf[RequestBodyContent182]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: RequestBodyContent182] (val x: Self) extends AnyVal {
    
    inline def setParameters(value: `141`): Self = StObject.set(x, "parameters", value.asInstanceOf[js.Any])
    
    inline def setRequestBody(value: Content182): Self = StObject.set(x, "requestBody", value.asInstanceOf[js.Any])
    
    inline def setResponses(value: `201Content183`): Self = StObject.set(x, "responses", value.asInstanceOf[js.Any])
  }
}
