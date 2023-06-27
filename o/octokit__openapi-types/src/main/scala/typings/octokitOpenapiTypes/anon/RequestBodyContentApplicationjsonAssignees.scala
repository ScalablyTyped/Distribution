package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait RequestBodyContentApplicationjsonAssignees extends StObject {
  
  var parameters: `165`
  
  var requestBody: ContentApplicationjsonAssignees
  
  var responses: `410422`
}
object RequestBodyContentApplicationjsonAssignees {
  
  inline def apply(parameters: `165`, requestBody: ContentApplicationjsonAssignees, responses: `410422`): RequestBodyContentApplicationjsonAssignees = {
    val __obj = js.Dynamic.literal(parameters = parameters.asInstanceOf[js.Any], requestBody = requestBody.asInstanceOf[js.Any], responses = responses.asInstanceOf[js.Any])
    __obj.asInstanceOf[RequestBodyContentApplicationjsonAssignees]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: RequestBodyContentApplicationjsonAssignees] (val x: Self) extends AnyVal {
    
    inline def setParameters(value: `165`): Self = StObject.set(x, "parameters", value.asInstanceOf[js.Any])
    
    inline def setRequestBody(value: ContentApplicationjsonAssignees): Self = StObject.set(x, "requestBody", value.asInstanceOf[js.Any])
    
    inline def setResponses(value: `410422`): Self = StObject.set(x, "responses", value.asInstanceOf[js.Any])
  }
}
