package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ParametersPathAlertnumberOwnerRepo extends StObject {
  
  var parameters: PathAlertnumberOwnerRepo
  
  var responses: `200Content480`
}
object ParametersPathAlertnumberOwnerRepo {
  
  inline def apply(parameters: PathAlertnumberOwnerRepo, responses: `200Content480`): ParametersPathAlertnumberOwnerRepo = {
    val __obj = js.Dynamic.literal(parameters = parameters.asInstanceOf[js.Any], responses = responses.asInstanceOf[js.Any])
    __obj.asInstanceOf[ParametersPathAlertnumberOwnerRepo]
  }
  
  extension [Self <: ParametersPathAlertnumberOwnerRepo](x: Self) {
    
    inline def setParameters(value: PathAlertnumberOwnerRepo): Self = StObject.set(x, "parameters", value.asInstanceOf[js.Any])
    
    inline def setResponses(value: `200Content480`): Self = StObject.set(x, "responses", value.asInstanceOf[js.Any])
  }
}
