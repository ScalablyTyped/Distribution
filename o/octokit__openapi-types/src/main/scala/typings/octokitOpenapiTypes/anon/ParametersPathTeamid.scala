package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ParametersPathTeamid extends StObject {
  
  var parameters: PathTeamid
  
  var responses: `200Content113`
}
object ParametersPathTeamid {
  
  inline def apply(parameters: PathTeamid, responses: `200Content113`): ParametersPathTeamid = {
    val __obj = js.Dynamic.literal(parameters = parameters.asInstanceOf[js.Any], responses = responses.asInstanceOf[js.Any])
    __obj.asInstanceOf[ParametersPathTeamid]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: ParametersPathTeamid] (val x: Self) extends AnyVal {
    
    inline def setParameters(value: PathTeamid): Self = StObject.set(x, "parameters", value.asInstanceOf[js.Any])
    
    inline def setResponses(value: `200Content113`): Self = StObject.set(x, "responses", value.asInstanceOf[js.Any])
  }
}
