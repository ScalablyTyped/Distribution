package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ParametersPathTeamidNumberQuery462 extends StObject {
  
  var parameters: PathTeamidNumberQuery462
  
  var responses: `200Content461`
}
object ParametersPathTeamidNumberQuery462 {
  
  inline def apply(parameters: PathTeamidNumberQuery462, responses: `200Content461`): ParametersPathTeamidNumberQuery462 = {
    val __obj = js.Dynamic.literal(parameters = parameters.asInstanceOf[js.Any], responses = responses.asInstanceOf[js.Any])
    __obj.asInstanceOf[ParametersPathTeamidNumberQuery462]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: ParametersPathTeamidNumberQuery462] (val x: Self) extends AnyVal {
    
    inline def setParameters(value: PathTeamidNumberQuery462): Self = StObject.set(x, "parameters", value.asInstanceOf[js.Any])
    
    inline def setResponses(value: `200Content461`): Self = StObject.set(x, "responses", value.asInstanceOf[js.Any])
  }
}
