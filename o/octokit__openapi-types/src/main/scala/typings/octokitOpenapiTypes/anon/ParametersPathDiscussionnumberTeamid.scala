package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ParametersPathDiscussionnumberTeamid extends StObject {
  
  var parameters: PathDiscussionnumberTeamid
  
  var responses: `200Content135`
}
object ParametersPathDiscussionnumberTeamid {
  
  inline def apply(parameters: PathDiscussionnumberTeamid, responses: `200Content135`): ParametersPathDiscussionnumberTeamid = {
    val __obj = js.Dynamic.literal(parameters = parameters.asInstanceOf[js.Any], responses = responses.asInstanceOf[js.Any])
    __obj.asInstanceOf[ParametersPathDiscussionnumberTeamid]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: ParametersPathDiscussionnumberTeamid] (val x: Self) extends AnyVal {
    
    inline def setParameters(value: PathDiscussionnumberTeamid): Self = StObject.set(x, "parameters", value.asInstanceOf[js.Any])
    
    inline def setResponses(value: `200Content135`): Self = StObject.set(x, "responses", value.asInstanceOf[js.Any])
  }
}
