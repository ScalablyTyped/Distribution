package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ParametersPath325 extends StObject {
  
  var parameters: Path325
  
  var responses: `404Content6`
}
object ParametersPath325 {
  
  inline def apply(parameters: Path325, responses: `404Content6`): ParametersPath325 = {
    val __obj = js.Dynamic.literal(parameters = parameters.asInstanceOf[js.Any], responses = responses.asInstanceOf[js.Any])
    __obj.asInstanceOf[ParametersPath325]
  }
  
  extension [Self <: ParametersPath325](x: Self) {
    
    inline def setParameters(value: Path325): Self = StObject.set(x, "parameters", value.asInstanceOf[js.Any])
    
    inline def setResponses(value: `404Content6`): Self = StObject.set(x, "responses", value.asInstanceOf[js.Any])
  }
}
