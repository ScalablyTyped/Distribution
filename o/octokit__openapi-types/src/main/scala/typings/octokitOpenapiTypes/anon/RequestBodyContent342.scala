package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait RequestBodyContent342 extends StObject {
  
  var parameters: `141`
  
  var requestBody: Content342
  
  var responses: `201Content343`
}
object RequestBodyContent342 {
  
  inline def apply(parameters: `141`, requestBody: Content342, responses: `201Content343`): RequestBodyContent342 = {
    val __obj = js.Dynamic.literal(parameters = parameters.asInstanceOf[js.Any], requestBody = requestBody.asInstanceOf[js.Any], responses = responses.asInstanceOf[js.Any])
    __obj.asInstanceOf[RequestBodyContent342]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: RequestBodyContent342] (val x: Self) extends AnyVal {
    
    inline def setParameters(value: `141`): Self = StObject.set(x, "parameters", value.asInstanceOf[js.Any])
    
    inline def setRequestBody(value: Content342): Self = StObject.set(x, "requestBody", value.asInstanceOf[js.Any])
    
    inline def setResponses(value: `201Content343`): Self = StObject.set(x, "responses", value.asInstanceOf[js.Any])
  }
}
