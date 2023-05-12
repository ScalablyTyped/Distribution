package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait RequestBodyContent344 extends StObject {
  
  var parameters: `141`
  
  var requestBody: Content344
  
  var responses: `201Content343`
}
object RequestBodyContent344 {
  
  inline def apply(parameters: `141`, requestBody: Content344, responses: `201Content343`): RequestBodyContent344 = {
    val __obj = js.Dynamic.literal(parameters = parameters.asInstanceOf[js.Any], requestBody = requestBody.asInstanceOf[js.Any], responses = responses.asInstanceOf[js.Any])
    __obj.asInstanceOf[RequestBodyContent344]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: RequestBodyContent344] (val x: Self) extends AnyVal {
    
    inline def setParameters(value: `141`): Self = StObject.set(x, "parameters", value.asInstanceOf[js.Any])
    
    inline def setRequestBody(value: Content344): Self = StObject.set(x, "requestBody", value.asInstanceOf[js.Any])
    
    inline def setResponses(value: `201Content343`): Self = StObject.set(x, "responses", value.asInstanceOf[js.Any])
  }
}
