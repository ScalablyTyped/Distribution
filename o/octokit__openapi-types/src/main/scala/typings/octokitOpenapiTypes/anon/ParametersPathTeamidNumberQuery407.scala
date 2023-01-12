package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ParametersPathTeamidNumberQuery407 extends StObject {
  
  var parameters: PathTeamidNumberQuery407
  
  var responses: `466`
}
object ParametersPathTeamidNumberQuery407 {
  
  inline def apply(parameters: PathTeamidNumberQuery407, responses: `466`): ParametersPathTeamidNumberQuery407 = {
    val __obj = js.Dynamic.literal(parameters = parameters.asInstanceOf[js.Any], responses = responses.asInstanceOf[js.Any])
    __obj.asInstanceOf[ParametersPathTeamidNumberQuery407]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: ParametersPathTeamidNumberQuery407] (val x: Self) extends AnyVal {
    
    inline def setParameters(value: PathTeamidNumberQuery407): Self = StObject.set(x, "parameters", value.asInstanceOf[js.Any])
    
    inline def setResponses(value: `466`): Self = StObject.set(x, "responses", value.asInstanceOf[js.Any])
  }
}
