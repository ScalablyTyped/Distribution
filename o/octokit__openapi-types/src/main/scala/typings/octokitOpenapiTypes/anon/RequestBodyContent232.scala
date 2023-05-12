package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait RequestBodyContent232 extends StObject {
  
  var parameters: `141`
  
  var requestBody: Content232
  
  var responses: `201ContentApplicationjsonCreatedat`
}
object RequestBodyContent232 {
  
  inline def apply(parameters: `141`, requestBody: Content232, responses: `201ContentApplicationjsonCreatedat`): RequestBodyContent232 = {
    val __obj = js.Dynamic.literal(parameters = parameters.asInstanceOf[js.Any], requestBody = requestBody.asInstanceOf[js.Any], responses = responses.asInstanceOf[js.Any])
    __obj.asInstanceOf[RequestBodyContent232]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: RequestBodyContent232] (val x: Self) extends AnyVal {
    
    inline def setParameters(value: `141`): Self = StObject.set(x, "parameters", value.asInstanceOf[js.Any])
    
    inline def setRequestBody(value: Content232): Self = StObject.set(x, "requestBody", value.asInstanceOf[js.Any])
    
    inline def setResponses(value: `201ContentApplicationjsonCreatedat`): Self = StObject.set(x, "responses", value.asInstanceOf[js.Any])
  }
}
