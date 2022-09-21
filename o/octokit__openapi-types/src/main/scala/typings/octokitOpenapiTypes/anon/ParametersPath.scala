package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ParametersPath extends StObject {
  
  var parameters: Path
  
  var responses: `201Content417`
}
object ParametersPath {
  
  inline def apply(parameters: Path, responses: `201Content417`): ParametersPath = {
    val __obj = js.Dynamic.literal(parameters = parameters.asInstanceOf[js.Any], responses = responses.asInstanceOf[js.Any])
    __obj.asInstanceOf[ParametersPath]
  }
  
  extension [Self <: ParametersPath](x: Self) {
    
    inline def setParameters(value: Path): Self = StObject.set(x, "parameters", value.asInstanceOf[js.Any])
    
    inline def setResponses(value: `201Content417`): Self = StObject.set(x, "responses", value.asInstanceOf[js.Any])
  }
}
