package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ParametersPathEnvironmentnameOwner extends StObject {
  
  var parameters: PathEnvironmentnameOwner
  
  var responses: `200Content493`
}
object ParametersPathEnvironmentnameOwner {
  
  inline def apply(parameters: PathEnvironmentnameOwner, responses: `200Content493`): ParametersPathEnvironmentnameOwner = {
    val __obj = js.Dynamic.literal(parameters = parameters.asInstanceOf[js.Any], responses = responses.asInstanceOf[js.Any])
    __obj.asInstanceOf[ParametersPathEnvironmentnameOwner]
  }
  
  extension [Self <: ParametersPathEnvironmentnameOwner](x: Self) {
    
    inline def setParameters(value: PathEnvironmentnameOwner): Self = StObject.set(x, "parameters", value.asInstanceOf[js.Any])
    
    inline def setResponses(value: `200Content493`): Self = StObject.set(x, "responses", value.asInstanceOf[js.Any])
  }
}
