package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait RequestBodyContent412 extends StObject {
  
  var parameters: `165`
  
  var requestBody: Content412
  
  var responses: `201Content411`
}
object RequestBodyContent412 {
  
  inline def apply(parameters: `165`, requestBody: Content412, responses: `201Content411`): RequestBodyContent412 = {
    val __obj = js.Dynamic.literal(parameters = parameters.asInstanceOf[js.Any], requestBody = requestBody.asInstanceOf[js.Any], responses = responses.asInstanceOf[js.Any])
    __obj.asInstanceOf[RequestBodyContent412]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: RequestBodyContent412] (val x: Self) extends AnyVal {
    
    inline def setParameters(value: `165`): Self = StObject.set(x, "parameters", value.asInstanceOf[js.Any])
    
    inline def setRequestBody(value: Content412): Self = StObject.set(x, "requestBody", value.asInstanceOf[js.Any])
    
    inline def setResponses(value: `201Content411`): Self = StObject.set(x, "responses", value.asInstanceOf[js.Any])
  }
}
