package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ParametersPath361 extends StObject {
  
  var parameters: Path361
  
  var responses: `403404Content55`
}
object ParametersPath361 {
  
  inline def apply(parameters: Path361, responses: `403404Content55`): ParametersPath361 = {
    val __obj = js.Dynamic.literal(parameters = parameters.asInstanceOf[js.Any], responses = responses.asInstanceOf[js.Any])
    __obj.asInstanceOf[ParametersPath361]
  }
  
  extension [Self <: ParametersPath361](x: Self) {
    
    inline def setParameters(value: Path361): Self = StObject.set(x, "parameters", value.asInstanceOf[js.Any])
    
    inline def setResponses(value: `403404Content55`): Self = StObject.set(x, "responses", value.asInstanceOf[js.Any])
  }
}
