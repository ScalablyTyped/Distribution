package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ParametersPathAssigneeIssuenumberOwner extends StObject {
  
  var parameters: PathAssigneeIssuenumberOwner
  
  var responses: `404ContentApplicationjsonDocumentationurlMessage`
}
object ParametersPathAssigneeIssuenumberOwner {
  
  inline def apply(
    parameters: PathAssigneeIssuenumberOwner,
    responses: `404ContentApplicationjsonDocumentationurlMessage`
  ): ParametersPathAssigneeIssuenumberOwner = {
    val __obj = js.Dynamic.literal(parameters = parameters.asInstanceOf[js.Any], responses = responses.asInstanceOf[js.Any])
    __obj.asInstanceOf[ParametersPathAssigneeIssuenumberOwner]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: ParametersPathAssigneeIssuenumberOwner] (val x: Self) extends AnyVal {
    
    inline def setParameters(value: PathAssigneeIssuenumberOwner): Self = StObject.set(x, "parameters", value.asInstanceOf[js.Any])
    
    inline def setResponses(value: `404ContentApplicationjsonDocumentationurlMessage`): Self = StObject.set(x, "responses", value.asInstanceOf[js.Any])
  }
}
