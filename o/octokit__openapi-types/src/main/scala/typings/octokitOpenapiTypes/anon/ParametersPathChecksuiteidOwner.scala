package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ParametersPathChecksuiteidOwner extends StObject {
  
  var parameters: PathChecksuiteidOwner
  
  var responses: `491`
}
object ParametersPathChecksuiteidOwner {
  
  inline def apply(parameters: PathChecksuiteidOwner, responses: `491`): ParametersPathChecksuiteidOwner = {
    val __obj = js.Dynamic.literal(parameters = parameters.asInstanceOf[js.Any], responses = responses.asInstanceOf[js.Any])
    __obj.asInstanceOf[ParametersPathChecksuiteidOwner]
  }
  
  extension [Self <: ParametersPathChecksuiteidOwner](x: Self) {
    
    inline def setParameters(value: PathChecksuiteidOwner): Self = StObject.set(x, "parameters", value.asInstanceOf[js.Any])
    
    inline def setResponses(value: `491`): Self = StObject.set(x, "responses", value.asInstanceOf[js.Any])
  }
}
