package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait RequestBodyContent345 extends StObject {
  
  var parameters: PathGhsaid
  
  var requestBody: Content345
  
  var responses: `422Content346`
}
object RequestBodyContent345 {
  
  inline def apply(parameters: PathGhsaid, requestBody: Content345, responses: `422Content346`): RequestBodyContent345 = {
    val __obj = js.Dynamic.literal(parameters = parameters.asInstanceOf[js.Any], requestBody = requestBody.asInstanceOf[js.Any], responses = responses.asInstanceOf[js.Any])
    __obj.asInstanceOf[RequestBodyContent345]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: RequestBodyContent345] (val x: Self) extends AnyVal {
    
    inline def setParameters(value: PathGhsaid): Self = StObject.set(x, "parameters", value.asInstanceOf[js.Any])
    
    inline def setRequestBody(value: Content345): Self = StObject.set(x, "requestBody", value.asInstanceOf[js.Any])
    
    inline def setResponses(value: `422Content346`): Self = StObject.set(x, "responses", value.asInstanceOf[js.Any])
  }
}
