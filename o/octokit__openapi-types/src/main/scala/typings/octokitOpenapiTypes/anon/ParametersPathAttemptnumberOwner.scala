package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ParametersPathAttemptnumberOwner extends StObject {
  
  var parameters: PathAttemptnumberOwner
  
  var responses: `200Content417`
}
object ParametersPathAttemptnumberOwner {
  
  inline def apply(parameters: PathAttemptnumberOwner, responses: `200Content417`): ParametersPathAttemptnumberOwner = {
    val __obj = js.Dynamic.literal(parameters = parameters.asInstanceOf[js.Any], responses = responses.asInstanceOf[js.Any])
    __obj.asInstanceOf[ParametersPathAttemptnumberOwner]
  }
  
  extension [Self <: ParametersPathAttemptnumberOwner](x: Self) {
    
    inline def setParameters(value: PathAttemptnumberOwner): Self = StObject.set(x, "parameters", value.asInstanceOf[js.Any])
    
    inline def setResponses(value: `200Content417`): Self = StObject.set(x, "responses", value.asInstanceOf[js.Any])
  }
}
