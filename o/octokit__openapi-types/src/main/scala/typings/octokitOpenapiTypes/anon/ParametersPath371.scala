package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ParametersPath371 extends StObject {
  
  var parameters: Path371
  
  var responses: `200Content90304`
}
object ParametersPath371 {
  
  inline def apply(parameters: Path371, responses: `200Content90304`): ParametersPath371 = {
    val __obj = js.Dynamic.literal(parameters = parameters.asInstanceOf[js.Any], responses = responses.asInstanceOf[js.Any])
    __obj.asInstanceOf[ParametersPath371]
  }
  
  extension [Self <: ParametersPath371](x: Self) {
    
    inline def setParameters(value: Path371): Self = StObject.set(x, "parameters", value.asInstanceOf[js.Any])
    
    inline def setResponses(value: `200Content90304`): Self = StObject.set(x, "responses", value.asInstanceOf[js.Any])
  }
}
