package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ParametersPath615Responses335 extends StObject {
  
  var parameters: Path615
  
  var responses: `335`
}
object ParametersPath615Responses335 {
  
  inline def apply(parameters: Path615, responses: `335`): ParametersPath615Responses335 = {
    val __obj = js.Dynamic.literal(parameters = parameters.asInstanceOf[js.Any], responses = responses.asInstanceOf[js.Any])
    __obj.asInstanceOf[ParametersPath615Responses335]
  }
  
  extension [Self <: ParametersPath615Responses335](x: Self) {
    
    inline def setParameters(value: Path615): Self = StObject.set(x, "parameters", value.asInstanceOf[js.Any])
    
    inline def setResponses(value: `335`): Self = StObject.set(x, "responses", value.asInstanceOf[js.Any])
  }
}
