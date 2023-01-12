package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ParametersPathTeamidNumberQuery467 extends StObject {
  
  var parameters: PathTeamidNumberQuery467
  
  var responses: `200Content440Headers404Content48`
}
object ParametersPathTeamidNumberQuery467 {
  
  inline def apply(parameters: PathTeamidNumberQuery467, responses: `200Content440Headers404Content48`): ParametersPathTeamidNumberQuery467 = {
    val __obj = js.Dynamic.literal(parameters = parameters.asInstanceOf[js.Any], responses = responses.asInstanceOf[js.Any])
    __obj.asInstanceOf[ParametersPathTeamidNumberQuery467]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: ParametersPathTeamidNumberQuery467] (val x: Self) extends AnyVal {
    
    inline def setParameters(value: PathTeamidNumberQuery467): Self = StObject.set(x, "parameters", value.asInstanceOf[js.Any])
    
    inline def setResponses(value: `200Content440Headers404Content48`): Self = StObject.set(x, "responses", value.asInstanceOf[js.Any])
  }
}
