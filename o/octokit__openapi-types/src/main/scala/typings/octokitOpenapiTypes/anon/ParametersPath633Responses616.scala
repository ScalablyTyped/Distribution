package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ParametersPath633Responses616 extends StObject {
  
  var parameters: Path633
  
  var responses: `616`
}
object ParametersPath633Responses616 {
  
  inline def apply(parameters: Path633, responses: `616`): ParametersPath633Responses616 = {
    val __obj = js.Dynamic.literal(parameters = parameters.asInstanceOf[js.Any], responses = responses.asInstanceOf[js.Any])
    __obj.asInstanceOf[ParametersPath633Responses616]
  }
  
  extension [Self <: ParametersPath633Responses616](x: Self) {
    
    inline def setParameters(value: Path633): Self = StObject.set(x, "parameters", value.asInstanceOf[js.Any])
    
    inline def setResponses(value: `616`): Self = StObject.set(x, "responses", value.asInstanceOf[js.Any])
  }
}
