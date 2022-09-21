package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ParametersPath379 extends StObject {
  
  var parameters: Path379
  
  var responses: `200Content378`
}
object ParametersPath379 {
  
  inline def apply(parameters: Path379, responses: `200Content378`): ParametersPath379 = {
    val __obj = js.Dynamic.literal(parameters = parameters.asInstanceOf[js.Any], responses = responses.asInstanceOf[js.Any])
    __obj.asInstanceOf[ParametersPath379]
  }
  
  extension [Self <: ParametersPath379](x: Self) {
    
    inline def setParameters(value: Path379): Self = StObject.set(x, "parameters", value.asInstanceOf[js.Any])
    
    inline def setResponses(value: `200Content378`): Self = StObject.set(x, "responses", value.asInstanceOf[js.Any])
  }
}
