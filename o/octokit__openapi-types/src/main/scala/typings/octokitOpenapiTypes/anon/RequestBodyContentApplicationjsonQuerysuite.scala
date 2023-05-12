package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait RequestBodyContentApplicationjsonQuerysuite extends StObject {
  
  var parameters: `540`
  
  var requestBody: ContentApplicationjsonQuerysuite
  
  var responses: `409503`
}
object RequestBodyContentApplicationjsonQuerysuite {
  
  inline def apply(parameters: `540`, requestBody: ContentApplicationjsonQuerysuite, responses: `409503`): RequestBodyContentApplicationjsonQuerysuite = {
    val __obj = js.Dynamic.literal(parameters = parameters.asInstanceOf[js.Any], requestBody = requestBody.asInstanceOf[js.Any], responses = responses.asInstanceOf[js.Any])
    __obj.asInstanceOf[RequestBodyContentApplicationjsonQuerysuite]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: RequestBodyContentApplicationjsonQuerysuite] (val x: Self) extends AnyVal {
    
    inline def setParameters(value: `540`): Self = StObject.set(x, "parameters", value.asInstanceOf[js.Any])
    
    inline def setRequestBody(value: ContentApplicationjsonQuerysuite): Self = StObject.set(x, "requestBody", value.asInstanceOf[js.Any])
    
    inline def setResponses(value: `409503`): Self = StObject.set(x, "responses", value.asInstanceOf[js.Any])
  }
}
