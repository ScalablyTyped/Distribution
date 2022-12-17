package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ParametersPath367 extends StObject {
  
  var parameters: Path367
  
  var responses: `200Content366`
}
object ParametersPath367 {
  
  inline def apply(parameters: Path367, responses: `200Content366`): ParametersPath367 = {
    val __obj = js.Dynamic.literal(parameters = parameters.asInstanceOf[js.Any], responses = responses.asInstanceOf[js.Any])
    __obj.asInstanceOf[ParametersPath367]
  }
  
  extension [Self <: ParametersPath367](x: Self) {
    
    inline def setParameters(value: Path367): Self = StObject.set(x, "parameters", value.asInstanceOf[js.Any])
    
    inline def setResponses(value: `200Content366`): Self = StObject.set(x, "responses", value.asInstanceOf[js.Any])
  }
}
