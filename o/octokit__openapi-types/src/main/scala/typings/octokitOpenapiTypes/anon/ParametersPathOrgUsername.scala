package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ParametersPathOrgUsername extends StObject {
  
  var parameters: PathOrgUsername
  
  var responses: `200Content28`
}
object ParametersPathOrgUsername {
  
  inline def apply(parameters: PathOrgUsername, responses: `200Content28`): ParametersPathOrgUsername = {
    val __obj = js.Dynamic.literal(parameters = parameters.asInstanceOf[js.Any], responses = responses.asInstanceOf[js.Any])
    __obj.asInstanceOf[ParametersPathOrgUsername]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: ParametersPathOrgUsername] (val x: Self) extends AnyVal {
    
    inline def setParameters(value: PathOrgUsername): Self = StObject.set(x, "parameters", value.asInstanceOf[js.Any])
    
    inline def setResponses(value: `200Content28`): Self = StObject.set(x, "responses", value.asInstanceOf[js.Any])
  }
}
