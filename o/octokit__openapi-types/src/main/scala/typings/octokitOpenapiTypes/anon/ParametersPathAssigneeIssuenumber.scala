package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ParametersPathAssigneeIssuenumber extends StObject {
  
  var parameters: PathAssigneeIssuenumber
  
  var responses: `404Content36`
}
object ParametersPathAssigneeIssuenumber {
  
  inline def apply(parameters: PathAssigneeIssuenumber, responses: `404Content36`): ParametersPathAssigneeIssuenumber = {
    val __obj = js.Dynamic.literal(parameters = parameters.asInstanceOf[js.Any], responses = responses.asInstanceOf[js.Any])
    __obj.asInstanceOf[ParametersPathAssigneeIssuenumber]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: ParametersPathAssigneeIssuenumber] (val x: Self) extends AnyVal {
    
    inline def setParameters(value: PathAssigneeIssuenumber): Self = StObject.set(x, "parameters", value.asInstanceOf[js.Any])
    
    inline def setResponses(value: `404Content36`): Self = StObject.set(x, "responses", value.asInstanceOf[js.Any])
  }
}
