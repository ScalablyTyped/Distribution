package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait RequestBodyContent207 extends StObject {
  
  var parameters: `141`
  
  var requestBody: Content207
  
  var responses: `201202`
}
object RequestBodyContent207 {
  
  inline def apply(parameters: `141`, requestBody: Content207, responses: `201202`): RequestBodyContent207 = {
    val __obj = js.Dynamic.literal(parameters = parameters.asInstanceOf[js.Any], requestBody = requestBody.asInstanceOf[js.Any], responses = responses.asInstanceOf[js.Any])
    __obj.asInstanceOf[RequestBodyContent207]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: RequestBodyContent207] (val x: Self) extends AnyVal {
    
    inline def setParameters(value: `141`): Self = StObject.set(x, "parameters", value.asInstanceOf[js.Any])
    
    inline def setRequestBody(value: Content207): Self = StObject.set(x, "requestBody", value.asInstanceOf[js.Any])
    
    inline def setResponses(value: `201202`): Self = StObject.set(x, "responses", value.asInstanceOf[js.Any])
  }
}
