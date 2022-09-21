package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ParametersPath383 extends StObject {
  
  var parameters: Path383
  
  var responses: `200Content98304`
}
object ParametersPath383 {
  
  inline def apply(parameters: Path383, responses: `200Content98304`): ParametersPath383 = {
    val __obj = js.Dynamic.literal(parameters = parameters.asInstanceOf[js.Any], responses = responses.asInstanceOf[js.Any])
    __obj.asInstanceOf[ParametersPath383]
  }
  
  extension [Self <: ParametersPath383](x: Self) {
    
    inline def setParameters(value: Path383): Self = StObject.set(x, "parameters", value.asInstanceOf[js.Any])
    
    inline def setResponses(value: `200Content98304`): Self = StObject.set(x, "responses", value.asInstanceOf[js.Any])
  }
}
