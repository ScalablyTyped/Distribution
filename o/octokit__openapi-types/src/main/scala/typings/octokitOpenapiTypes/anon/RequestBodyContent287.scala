package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait RequestBodyContent287 extends StObject {
  
  var parameters: `135`
  
  var requestBody: Content287
  
  var responses: `201409`
}
object RequestBodyContent287 {
  
  inline def apply(parameters: `135`, requestBody: Content287, responses: `201409`): RequestBodyContent287 = {
    val __obj = js.Dynamic.literal(parameters = parameters.asInstanceOf[js.Any], requestBody = requestBody.asInstanceOf[js.Any], responses = responses.asInstanceOf[js.Any])
    __obj.asInstanceOf[RequestBodyContent287]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: RequestBodyContent287] (val x: Self) extends AnyVal {
    
    inline def setParameters(value: `135`): Self = StObject.set(x, "parameters", value.asInstanceOf[js.Any])
    
    inline def setRequestBody(value: Content287): Self = StObject.set(x, "requestBody", value.asInstanceOf[js.Any])
    
    inline def setResponses(value: `201409`): Self = StObject.set(x, "responses", value.asInstanceOf[js.Any])
  }
}
