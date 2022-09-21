package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ParametersPathAlertnumberOwnerQuery451 extends StObject {
  
  var parameters: PathAlertnumberOwnerQuery451
  
  var responses: `200Content577`
}
object ParametersPathAlertnumberOwnerQuery451 {
  
  inline def apply(parameters: PathAlertnumberOwnerQuery451, responses: `200Content577`): ParametersPathAlertnumberOwnerQuery451 = {
    val __obj = js.Dynamic.literal(parameters = parameters.asInstanceOf[js.Any], responses = responses.asInstanceOf[js.Any])
    __obj.asInstanceOf[ParametersPathAlertnumberOwnerQuery451]
  }
  
  extension [Self <: ParametersPathAlertnumberOwnerQuery451](x: Self) {
    
    inline def setParameters(value: PathAlertnumberOwnerQuery451): Self = StObject.set(x, "parameters", value.asInstanceOf[js.Any])
    
    inline def setResponses(value: `200Content577`): Self = StObject.set(x, "responses", value.asInstanceOf[js.Any])
  }
}
