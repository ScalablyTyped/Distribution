package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait RequestBodyContent218 extends StObject {
  
  var parameters: `135`
  
  var requestBody: Content218
  
  var responses: `201ContentApplicationjsonCreatedat`
}
object RequestBodyContent218 {
  
  inline def apply(parameters: `135`, requestBody: Content218, responses: `201ContentApplicationjsonCreatedat`): RequestBodyContent218 = {
    val __obj = js.Dynamic.literal(parameters = parameters.asInstanceOf[js.Any], requestBody = requestBody.asInstanceOf[js.Any], responses = responses.asInstanceOf[js.Any])
    __obj.asInstanceOf[RequestBodyContent218]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: RequestBodyContent218] (val x: Self) extends AnyVal {
    
    inline def setParameters(value: `135`): Self = StObject.set(x, "parameters", value.asInstanceOf[js.Any])
    
    inline def setRequestBody(value: Content218): Self = StObject.set(x, "requestBody", value.asInstanceOf[js.Any])
    
    inline def setResponses(value: `201ContentApplicationjsonCreatedat`): Self = StObject.set(x, "responses", value.asInstanceOf[js.Any])
  }
}
