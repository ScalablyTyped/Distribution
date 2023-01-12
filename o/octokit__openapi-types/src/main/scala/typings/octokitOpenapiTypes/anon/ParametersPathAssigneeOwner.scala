package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ParametersPathAssigneeOwner extends StObject {
  
  var parameters: PathAssigneeOwner
  
  var responses: `404ContentApplicationjsonDocumentationurlMessage`
}
object ParametersPathAssigneeOwner {
  
  inline def apply(parameters: PathAssigneeOwner, responses: `404ContentApplicationjsonDocumentationurlMessage`): ParametersPathAssigneeOwner = {
    val __obj = js.Dynamic.literal(parameters = parameters.asInstanceOf[js.Any], responses = responses.asInstanceOf[js.Any])
    __obj.asInstanceOf[ParametersPathAssigneeOwner]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: ParametersPathAssigneeOwner] (val x: Self) extends AnyVal {
    
    inline def setParameters(value: PathAssigneeOwner): Self = StObject.set(x, "parameters", value.asInstanceOf[js.Any])
    
    inline def setResponses(value: `404ContentApplicationjsonDocumentationurlMessage`): Self = StObject.set(x, "responses", value.asInstanceOf[js.Any])
  }
}
