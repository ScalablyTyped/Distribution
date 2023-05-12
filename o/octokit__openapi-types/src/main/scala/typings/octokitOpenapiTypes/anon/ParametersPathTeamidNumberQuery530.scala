package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ParametersPathTeamidNumberQuery530 extends StObject {
  
  var parameters: PathTeamidNumberQuery530
  
  var responses: `200Content529`
}
object ParametersPathTeamidNumberQuery530 {
  
  inline def apply(parameters: PathTeamidNumberQuery530, responses: `200Content529`): ParametersPathTeamidNumberQuery530 = {
    val __obj = js.Dynamic.literal(parameters = parameters.asInstanceOf[js.Any], responses = responses.asInstanceOf[js.Any])
    __obj.asInstanceOf[ParametersPathTeamidNumberQuery530]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: ParametersPathTeamidNumberQuery530] (val x: Self) extends AnyVal {
    
    inline def setParameters(value: PathTeamidNumberQuery530): Self = StObject.set(x, "parameters", value.asInstanceOf[js.Any])
    
    inline def setResponses(value: `200Content529`): Self = StObject.set(x, "responses", value.asInstanceOf[js.Any])
  }
}
