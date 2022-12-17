package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ParametersPathUsername extends StObject {
  
  var parameters: PathUsername
  
  var responses: `404Content48`
}
object ParametersPathUsername {
  
  inline def apply(parameters: PathUsername, responses: `404Content48`): ParametersPathUsername = {
    val __obj = js.Dynamic.literal(parameters = parameters.asInstanceOf[js.Any], responses = responses.asInstanceOf[js.Any])
    __obj.asInstanceOf[ParametersPathUsername]
  }
  
  extension [Self <: ParametersPathUsername](x: Self) {
    
    inline def setParameters(value: PathUsername): Self = StObject.set(x, "parameters", value.asInstanceOf[js.Any])
    
    inline def setResponses(value: `404Content48`): Self = StObject.set(x, "responses", value.asInstanceOf[js.Any])
  }
}
