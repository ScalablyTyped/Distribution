package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ParametersPathTeamidNumberQuery535 extends StObject {
  
  var parameters: PathTeamidNumberQuery535
  
  var responses: `200Content508HeadersLinkString404Content36`
}
object ParametersPathTeamidNumberQuery535 {
  
  inline def apply(parameters: PathTeamidNumberQuery535, responses: `200Content508HeadersLinkString404Content36`): ParametersPathTeamidNumberQuery535 = {
    val __obj = js.Dynamic.literal(parameters = parameters.asInstanceOf[js.Any], responses = responses.asInstanceOf[js.Any])
    __obj.asInstanceOf[ParametersPathTeamidNumberQuery535]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: ParametersPathTeamidNumberQuery535] (val x: Self) extends AnyVal {
    
    inline def setParameters(value: PathTeamidNumberQuery535): Self = StObject.set(x, "parameters", value.asInstanceOf[js.Any])
    
    inline def setResponses(value: `200Content508HeadersLinkString404Content36`): Self = StObject.set(x, "responses", value.asInstanceOf[js.Any])
  }
}
