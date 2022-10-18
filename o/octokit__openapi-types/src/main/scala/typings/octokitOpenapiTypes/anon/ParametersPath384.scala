package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ParametersPath384 extends StObject {
  
  var parameters: Path384
  
  var responses: `200Content385`
}
object ParametersPath384 {
  
  inline def apply(parameters: Path384, responses: `200Content385`): ParametersPath384 = {
    val __obj = js.Dynamic.literal(parameters = parameters.asInstanceOf[js.Any], responses = responses.asInstanceOf[js.Any])
    __obj.asInstanceOf[ParametersPath384]
  }
  
  extension [Self <: ParametersPath384](x: Self) {
    
    inline def setParameters(value: Path384): Self = StObject.set(x, "parameters", value.asInstanceOf[js.Any])
    
    inline def setResponses(value: `200Content385`): Self = StObject.set(x, "responses", value.asInstanceOf[js.Any])
  }
}
