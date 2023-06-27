package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait RequestBodyContent413 extends StObject {
  
  var parameters: PathGhsaid
  
  var requestBody: Content413
  
  var responses: `422Content414`
}
object RequestBodyContent413 {
  
  inline def apply(parameters: PathGhsaid, requestBody: Content413, responses: `422Content414`): RequestBodyContent413 = {
    val __obj = js.Dynamic.literal(parameters = parameters.asInstanceOf[js.Any], requestBody = requestBody.asInstanceOf[js.Any], responses = responses.asInstanceOf[js.Any])
    __obj.asInstanceOf[RequestBodyContent413]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: RequestBodyContent413] (val x: Self) extends AnyVal {
    
    inline def setParameters(value: PathGhsaid): Self = StObject.set(x, "parameters", value.asInstanceOf[js.Any])
    
    inline def setRequestBody(value: Content413): Self = StObject.set(x, "requestBody", value.asInstanceOf[js.Any])
    
    inline def setResponses(value: `422Content414`): Self = StObject.set(x, "responses", value.asInstanceOf[js.Any])
  }
}
