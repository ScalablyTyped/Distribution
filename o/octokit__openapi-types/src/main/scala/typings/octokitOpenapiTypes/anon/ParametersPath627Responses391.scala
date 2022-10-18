package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ParametersPath627Responses391 extends StObject {
  
  var parameters: Path627
  
  var responses: `391`
}
object ParametersPath627Responses391 {
  
  inline def apply(parameters: Path627, responses: `391`): ParametersPath627Responses391 = {
    val __obj = js.Dynamic.literal(parameters = parameters.asInstanceOf[js.Any], responses = responses.asInstanceOf[js.Any])
    __obj.asInstanceOf[ParametersPath627Responses391]
  }
  
  extension [Self <: ParametersPath627Responses391](x: Self) {
    
    inline def setParameters(value: Path627): Self = StObject.set(x, "parameters", value.asInstanceOf[js.Any])
    
    inline def setResponses(value: `391`): Self = StObject.set(x, "responses", value.asInstanceOf[js.Any])
  }
}
