package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait RequestBodyContent274 extends StObject {
  
  var parameters: `165`
  
  var requestBody: Content274
  
  var responses: `201ContentApplicationjsonCreatedat`
}
object RequestBodyContent274 {
  
  inline def apply(parameters: `165`, requestBody: Content274, responses: `201ContentApplicationjsonCreatedat`): RequestBodyContent274 = {
    val __obj = js.Dynamic.literal(parameters = parameters.asInstanceOf[js.Any], requestBody = requestBody.asInstanceOf[js.Any], responses = responses.asInstanceOf[js.Any])
    __obj.asInstanceOf[RequestBodyContent274]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: RequestBodyContent274] (val x: Self) extends AnyVal {
    
    inline def setParameters(value: `165`): Self = StObject.set(x, "parameters", value.asInstanceOf[js.Any])
    
    inline def setRequestBody(value: Content274): Self = StObject.set(x, "requestBody", value.asInstanceOf[js.Any])
    
    inline def setResponses(value: `201ContentApplicationjsonCreatedat`): Self = StObject.set(x, "responses", value.asInstanceOf[js.Any])
  }
}
