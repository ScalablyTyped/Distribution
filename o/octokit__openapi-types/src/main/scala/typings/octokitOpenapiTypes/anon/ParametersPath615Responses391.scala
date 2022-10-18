package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ParametersPath615Responses391 extends StObject {
  
  var parameters: Path615
  
  var responses: `391`
}
object ParametersPath615Responses391 {
  
  inline def apply(parameters: Path615, responses: `391`): ParametersPath615Responses391 = {
    val __obj = js.Dynamic.literal(parameters = parameters.asInstanceOf[js.Any], responses = responses.asInstanceOf[js.Any])
    __obj.asInstanceOf[ParametersPath615Responses391]
  }
  
  extension [Self <: ParametersPath615Responses391](x: Self) {
    
    inline def setParameters(value: Path615): Self = StObject.set(x, "parameters", value.asInstanceOf[js.Any])
    
    inline def setResponses(value: `391`): Self = StObject.set(x, "responses", value.asInstanceOf[js.Any])
  }
}
