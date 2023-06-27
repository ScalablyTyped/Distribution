package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait RequestBodyContentApplicationjsonTfvcproject extends StObject {
  
  var parameters: `165`
  
  var requestBody: ContentApplicationjsonTfvcproject
  
  var responses: `404422503`
}
object RequestBodyContentApplicationjsonTfvcproject {
  
  inline def apply(parameters: `165`, requestBody: ContentApplicationjsonTfvcproject, responses: `404422503`): RequestBodyContentApplicationjsonTfvcproject = {
    val __obj = js.Dynamic.literal(parameters = parameters.asInstanceOf[js.Any], requestBody = requestBody.asInstanceOf[js.Any], responses = responses.asInstanceOf[js.Any])
    __obj.asInstanceOf[RequestBodyContentApplicationjsonTfvcproject]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: RequestBodyContentApplicationjsonTfvcproject] (val x: Self) extends AnyVal {
    
    inline def setParameters(value: `165`): Self = StObject.set(x, "parameters", value.asInstanceOf[js.Any])
    
    inline def setRequestBody(value: ContentApplicationjsonTfvcproject): Self = StObject.set(x, "requestBody", value.asInstanceOf[js.Any])
    
    inline def setResponses(value: `404422503`): Self = StObject.set(x, "responses", value.asInstanceOf[js.Any])
  }
}
