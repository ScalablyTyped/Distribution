package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ParametersPathCommentnumberDiscussionnumberTeamidQuery532 extends StObject {
  
  var parameters: PathCommentnumberDiscussionnumberTeamidQuery532
  
  var responses: `200Content533`
}
object ParametersPathCommentnumberDiscussionnumberTeamidQuery532 {
  
  inline def apply(parameters: PathCommentnumberDiscussionnumberTeamidQuery532, responses: `200Content533`): ParametersPathCommentnumberDiscussionnumberTeamidQuery532 = {
    val __obj = js.Dynamic.literal(parameters = parameters.asInstanceOf[js.Any], responses = responses.asInstanceOf[js.Any])
    __obj.asInstanceOf[ParametersPathCommentnumberDiscussionnumberTeamidQuery532]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: ParametersPathCommentnumberDiscussionnumberTeamidQuery532] (val x: Self) extends AnyVal {
    
    inline def setParameters(value: PathCommentnumberDiscussionnumberTeamidQuery532): Self = StObject.set(x, "parameters", value.asInstanceOf[js.Any])
    
    inline def setResponses(value: `200Content533`): Self = StObject.set(x, "responses", value.asInstanceOf[js.Any])
  }
}
