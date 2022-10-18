package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ParametersPath273 extends StObject {
  
  var parameters: Path273
  
  var responses: `200274`
}
object ParametersPath273 {
  
  inline def apply(parameters: Path273, responses: `200274`): ParametersPath273 = {
    val __obj = js.Dynamic.literal(parameters = parameters.asInstanceOf[js.Any], responses = responses.asInstanceOf[js.Any])
    __obj.asInstanceOf[ParametersPath273]
  }
  
  extension [Self <: ParametersPath273](x: Self) {
    
    inline def setParameters(value: Path273): Self = StObject.set(x, "parameters", value.asInstanceOf[js.Any])
    
    inline def setResponses(value: `200274`): Self = StObject.set(x, "responses", value.asInstanceOf[js.Any])
  }
}
