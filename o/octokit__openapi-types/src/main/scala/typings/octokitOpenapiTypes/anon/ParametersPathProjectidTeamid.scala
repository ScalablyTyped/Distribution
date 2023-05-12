package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ParametersPathProjectidTeamid extends StObject {
  
  var parameters: PathProjectidTeamid
  
  var responses: `200Content125`
}
object ParametersPathProjectidTeamid {
  
  inline def apply(parameters: PathProjectidTeamid, responses: `200Content125`): ParametersPathProjectidTeamid = {
    val __obj = js.Dynamic.literal(parameters = parameters.asInstanceOf[js.Any], responses = responses.asInstanceOf[js.Any])
    __obj.asInstanceOf[ParametersPathProjectidTeamid]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: ParametersPathProjectidTeamid] (val x: Self) extends AnyVal {
    
    inline def setParameters(value: PathProjectidTeamid): Self = StObject.set(x, "parameters", value.asInstanceOf[js.Any])
    
    inline def setResponses(value: `200Content125`): Self = StObject.set(x, "responses", value.asInstanceOf[js.Any])
  }
}
