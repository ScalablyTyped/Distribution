package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ParametersPath126Responses55 extends StObject {
  
  var parameters: Path126
  
  var responses: `55`
}
object ParametersPath126Responses55 {
  
  inline def apply(parameters: Path126, responses: `55`): ParametersPath126Responses55 = {
    val __obj = js.Dynamic.literal(parameters = parameters.asInstanceOf[js.Any], responses = responses.asInstanceOf[js.Any])
    __obj.asInstanceOf[ParametersPath126Responses55]
  }
  
  extension [Self <: ParametersPath126Responses55](x: Self) {
    
    inline def setParameters(value: Path126): Self = StObject.set(x, "parameters", value.asInstanceOf[js.Any])
    
    inline def setResponses(value: `55`): Self = StObject.set(x, "responses", value.asInstanceOf[js.Any])
  }
}
